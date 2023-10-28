package com.demoproject.imageupload.service;

import com.demoproject.imageupload.model.Image;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImageService {
    Image create (Image image);
    List<Image> viewAll();
    Image viewById(Long id);
}
