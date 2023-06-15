package com.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.trust.model.Empresa;
import com.trust.service.EmpresaService;

@RestController
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;
    @PostMapping
    public void registrarEmpresa(@RequestBody Empresa empresa) {
         empresaService.save(empresa);
    }


    @GetMapping("/ultimos-registros")
    public List<Empresa> obtenerUltimosRegistros() {
        return empresaService.findLast3Registers();
    }

}

