package com.example.demo.service;

import com.example.demo.model.AbstractEntity;
import jakarta.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import lombok.val;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EntityService {

    private final EntityManager entityManager;

    public List<AbstractEntity> fetchEntities() {
        val query = entityManager.createNativeQuery("SELECT * FROM abstract_entity", AbstractEntity.class);
        return query.getResultList();
    }
}
