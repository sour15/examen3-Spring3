package com.example.examen3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/v1/files")
public class FileUploadController {


        private static final List<String> VALID_EXTENSIONS = Arrays.asList("pdf", "png", "docx");

        @PostMapping("/upload-multiple")
        public ResponseEntity<String> uploadMultipleFiles(@RequestParam("files") MultipartFile[] files) {
            if (files.length != 3) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                        .body("Debe subir exactamente 3 archivos.");
            }

            for (MultipartFile file : files) {
                String fileExtension = getFileExtension(file.getOriginalFilename());
                if (!VALID_EXTENSIONS.contains(fileExtension)) {
                    return ResponseEntity.status(HttpStatus.BAD_REQUEST)
                            .body("El archivo " + file.getOriginalFilename() + " tiene una extensión no permitida.");
                }
            }

            return ResponseEntity.ok("Todos los archivos han sido validados correctamente.");
        }

        private String getFileExtension(String fileName) {
            if (fileName != null && fileName.contains(".")) {
                return fileName.substring(fileName.lastIndexOf(".") + 1).toLowerCase();
            }
            return "";
        }
    }

