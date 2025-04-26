# QR Code Generator

Generates a QR Code image from input text.
The image is stored in the given AWS S3 bucket.

### Tech stack

- Java
- Spring Boot
- Google ZXing
- Docker
- AWS S3

### Running locally

1. Create `.env` file at project root
2. Fill in `AWS_ACCESS_KEY_ID`, `AWS_SECRET_ACCESS_KEY` and `AWS_SESSION_TOKEN` to the `.env` file
3. Fill in the `AWS_REGION` and `AWS_S3_BUCKET` values to the `Dockerfile`
4. Build the application using Docker with the command `docker build -t qrcode-generator:1.0 . `
5. Run the application with `docker run --env-file .env -p 8080:8080 qrcode-generator:1.0`
6. Make requests and get your QR Code

![QRCODE](https://github.com/user-attachments/assets/982804ca-f133-4f30-8754-2e29ee101d99)
