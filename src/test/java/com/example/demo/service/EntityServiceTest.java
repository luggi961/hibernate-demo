package com.example.demo.service;

import com.example.demo.model.AbstractEntity;
import jakarta.annotation.Resource;
import jakarta.persistence.EntityManager;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.jdbc.Sql;
import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
@Sql(scripts = "classpath:init-tests.sql", executionPhase = Sql.ExecutionPhase.BEFORE_TEST_METHOD)
@Testcontainers
class EntityServiceTest {

    @Container
    @ServiceConnection
    public static PostgreSQLContainer postgreSQLContainer = new PostgreSQLContainer("postgres:11.1")
            .withDatabaseName("integration-tests-db")
            .withUsername("sa")
            .withPassword("sa");

    @Resource
    private EntityManager entityManager;

    private EntityService entityService;

    @BeforeEach
    public void setup() {
        entityService = new EntityService(entityManager);
    }

    @Test
    void testFetchEntities() {
        List<AbstractEntity> entities = entityService.fetchEntities();
        Assertions.assertEquals(1, entities.size());
    }

}
