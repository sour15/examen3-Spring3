package com.example.examen3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/v1/files")
public class SingleFileUploadController {

    private static final long MAX_FILE_SIZE = 25 * 1024 * 1024; // 25MB

    @PostMapping("/upload-single")
    public ResponseEntity<String> uploadSingleFile(@RequestParam("file") MultipartFile file) {
        if (file.getSize() > MAX_FILE_SIZE) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                    .body("El archivo excede el tamaño máximo permitido de 25MB.");
        }

        return ResponseEntity.ok("Archivo subido exitosamente.");
    }
}
