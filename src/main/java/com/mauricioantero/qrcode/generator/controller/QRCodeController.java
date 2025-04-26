package com.mauricioantero.qrcode.generator.controller;

import com.mauricioantero.qrcode.generator.dto.QRCodeGenerateResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/qrcode")
public class QRCodeController {
    @PostMapping
    public ResponseEntity<QRCodeGenerateResponse> generate() {
        return null;
    }
}
