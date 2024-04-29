package com.example.demo.controller;

import com.example.demo.model.AbstractEntity;
import com.example.demo.service.EntityService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EntityController {

    private final EntityService service;

    @GetMapping("/api/entities")
    public List<AbstractEntity> getEntities() {
        return service.fetchEntities();
    }
}
