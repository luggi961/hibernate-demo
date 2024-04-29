This repository demonstrates a bug introduced in Hibernate 6. The mapping of jsonb of different types in a class inheritance hierarchy does no longer work.

## Stack trace:

```
Servlet.service() for servlet [dispatcherServlet] in context with path [] threw exception [Request processing failed: java.lang.IllegalArgumentException: Could not deserialize string to java type: JsonJavaType(com.example.demo.model.DtoB)] with root cause

com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException: Unrecognized field "id" (class com.example.demo.model.DtoB), not marked as ignorable (one known property: "testB"])
 at [Source: (String)"{"id": 999, "testA": "Test Test"}"; line: 1, column: 11] (through reference chain: com.example.demo.model.DtoB["id"])
```
