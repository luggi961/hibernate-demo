package com.example.demo.repository;

import com.example.demo.model.AbstractEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AbstractEntityRepository extends CrudRepository<AbstractEntity, Long> {

}
