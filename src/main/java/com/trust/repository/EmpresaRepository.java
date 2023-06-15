package com.trust.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trust.model.Empresa;

public interface EmpresaRepository extends JpaRepository<Empresa, Long> {
    List<Empresa> findTop3ByOrderByIdEmpresaDesc();

}
