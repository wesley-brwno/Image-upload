package com.demoproject.imageupload.service;

import com.demoproject.imageupload.model.Image;
import com.demoproject.imageupload.repository.ImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImageServiceImpl implements ImageService {
    
    @Autowired
    private ImageRepository repository;
    
    @Override
    public Image create(Image image) {
        return repository.save(image);
    }

    @Override
    public List<Image> viewAll() {
        return repository.findAll();
    }

    @Override
    public Image viewById(Long id) {
        return repository.findById(id).get();
    }
}
