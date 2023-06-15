package com.trust.service;

import java.util.List;

import com.trust.model.Empresa;

public interface EmpresaService {
    void save(Empresa empresa);
   
    List<Empresa> findLast3Registers();


}
