package com.pucpr.devops.resources;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsResource {
    @GetMapping("v1")
    @ResponseStatus(HttpStatus.OK)
    @Operation(summary = "Primeiro Resource")
    public String primeiroResource() {
        return "Aplicação PUCPR DevOps";
    }
}
