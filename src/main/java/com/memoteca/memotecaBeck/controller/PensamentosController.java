package com.memoteca.memotecaBeck.controller;

import com.memoteca.memotecaBeck.model.Pensamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.memoteca.memotecaBeck.service.PensamentosService;

import java.util.List;

@RestController
@RequestMapping("/api")

public class PensamentosController {

    @Autowired
    private PensamentosService pensamentosService;

    @GetMapping("/listar")
    public List<Pensamentos> lista(){
        List<Pensamentos> lista = pensamentosService.listar();
        return lista;
    }

    @PostMapping
    public Pensamentos inserir(@RequestBody Pensamentos pensamentos){
        return pensamentosService.inserir(pensamentos);
    }

    @PutMapping
    public Pensamentos atualizar(@RequestBody Pensamentos pensamentos){
        return pensamentosService.editar(pensamentos);
    }

    @DeleteMapping("/{id}")
    public boolean deletar(@PathVariable Integer id){
        return pensamentosService.deletar(id);
    }

}
