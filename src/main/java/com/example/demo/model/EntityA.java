package com.example.demo.model;

import io.hypersistence.utils.hibernate.type.json.JsonType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class EntityA extends AbstractEntity {

    @Column(columnDefinition = "jsonb")
    //@JdbcTypeCode(SqlTypes.JSON)
    @Type(JsonType.class)
    private DtoA entity_data;

}
