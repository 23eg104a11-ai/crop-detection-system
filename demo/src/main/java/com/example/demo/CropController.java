package com.example.demo;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@CrossOrigin(origins = "*") // allows frontend to connect
public class CropController {

    // Home API (test backend)
    @GetMapping("/")
    public String home() {
        return "Backend is working 🚀";
    }

    // Predict API
    @PostMapping("/predict")
    public String predict(@RequestParam("file") MultipartFile file) {

        // Get uploaded file name
        String fileName = file.getOriginalFilename();

        if (fileName != null) {
            fileName = fileName.toLowerCase();

            // Simple logic (for demo)
            if (fileName.contains("wheat")) {
                return "Crop Detected: Wheat 🌾";
            }
        }

        // Default response
        return "Crop Detected: Wheat 🌾"; // you can keep fixed output
    }
}