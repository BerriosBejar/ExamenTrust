package com.trust.service;

import java.util.List;

import com.trust.model.Empresa;

public interface EmpresaService {
    Empresa save(Empresa empresa);
   
    List<Empresa> findLast3Registers();


}
