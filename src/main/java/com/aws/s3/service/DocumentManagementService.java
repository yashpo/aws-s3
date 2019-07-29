package com.aws.s3.service;

import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface DocumentManagementService {
    void uploadMultipleFiles(List<MultipartFile> multipartFiles);
}
