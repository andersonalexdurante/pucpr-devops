package com.pucpr.devops.configs;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "PUCPR DevOps",
                description = "Disciplina de DevOps",
                version = "1.0"
        )
)
public class OpenApiConfig {
    public void openApiConfiguration() {
        // Additional customizations if needed
    }
}