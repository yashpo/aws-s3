package com.aws.s3.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.aws.s3.service.DocumentManagementService;

import java.util.List;

@RestController
public class DocumentController {

    @Autowired
    private DocumentManagementService documentManagementService;

    @PostMapping("${app.endpoint.uploadFiles}")
    public void uploadMultipleFiles(@ModelAttribute List<MultipartFile> files) {
        documentManagementService.uploadMultipleFiles(files);
    }
}