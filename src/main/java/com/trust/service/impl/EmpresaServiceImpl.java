package com.trust.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trust.model.Empresa;
import com.trust.repository.EmpresaRepository;
import com.trust.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService{
    @Autowired
    private EmpresaRepository empresaRepository;
    public Empresa save(Empresa empresa){
      return  empresaRepository.save(empresa);
    }   
   
    public List<Empresa> findLast3Registers(){
        return empresaRepository.findTop3ByOrderByIdEmpresaDesc();
    }
}