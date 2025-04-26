package com.mauricioantero.qrcode.generator.controller;

import com.mauricioantero.qrcode.generator.dto.QRCodeGenerateRequest;
import com.mauricioantero.qrcode.generator.dto.QRCodeGenerateResponse;
import com.mauricioantero.qrcode.generator.services.QRCodeGeneratorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QRCodeController {

    private final QRCodeGeneratorService qrCodeGeneratorService;

    public QRCodeController(QRCodeGeneratorService qrCodeService) {
        this.qrCodeGeneratorService = qrCodeService;
    }

    @PostMapping
    public ResponseEntity<QRCodeGenerateResponse> generate(@RequestBody QRCodeGenerateRequest request) {
        try {
            QRCodeGenerateResponse response = this.qrCodeGeneratorService.generateAndUploadQRCode(request.text());
            return ResponseEntity.ok(response);
        } catch (Exception e) {
            System.out.println(e);
            return ResponseEntity.internalServerError().build();
        }
    }
}
