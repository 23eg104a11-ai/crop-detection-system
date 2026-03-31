package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin
public class CropController {

    @GetMapping("/")
    public String home() {
        return "Backend is running 🚀";
    }

    @PostMapping("/predict")
    public String predict(@RequestParam("file") MultipartFile file) {
        return "Crop Detected 🌾";
    }
}