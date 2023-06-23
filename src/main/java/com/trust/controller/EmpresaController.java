package com.trust.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.trust.model.Empresa;
import com.trust.service.EmpresaService;

@Controller
@RequestMapping("/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService empresaService;
    @GetMapping("/ultimos-registros")
    public String obtenerUltimosRegistros(Model model) {
        List<Empresa> lista = empresaService.findLast3Registers();
        model.addAttribute("lista", lista);
        return "ultimos-registros";
    }
    
    @GetMapping("/registro")
    public String mostrarFormulario(Model model) {
        Empresa empresa = new Empresa();
        model.addAttribute("empresa", empresa);
        return "registrar";
    }
    
    @PostMapping("/registro/save")
    public String guardarEmpresa(@ModelAttribute("empresa") Empresa empresa) {
        empresaService.save(empresa);
        return "redirect:/empresas/registro";
    }
}
