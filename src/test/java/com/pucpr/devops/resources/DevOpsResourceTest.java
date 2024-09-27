package com.pucpr.devops.resources;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DevOpsResourceTest {

    private DevOpsResource devOpsResource = new DevOpsResource();

    @Test
    void testaResource() {
        String retorno = devOpsResource.primeiroResource();
        assertEquals("Aplicação PUCPR DevOps", retorno);
    }

}