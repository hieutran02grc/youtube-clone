package com.programming.hieuxuog.youtubeClone.service;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {
    String uploadFile(MultipartFile file);
}