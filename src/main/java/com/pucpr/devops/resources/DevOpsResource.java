package com.pucpr.devops.resources;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevOpsResource {
    @GetMapping("v1")
    @ResponseStatus(HttpStatus.OK)
    public String primeiroResource() {
        return "Aplicação PUCPR DevOps";
    }
}
