package com.memoteca.memotecaBeck.service;

import com.memoteca.memotecaBeck.model.Pensamentos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.memoteca.memotecaBeck.repository.PensamentosRepository;

import java.util.List;

@Service
public class PensamentosService {

    @Autowired
    private PensamentosRepository pensamentosRepository;

    public List<Pensamentos> listar(){
        return pensamentosRepository.findAll();
    }

    public Pensamentos inserir(Pensamentos pensamentos){
        return pensamentosRepository.save(pensamentos);
    }

    public Pensamentos editar(Pensamentos atualizarPensamentos){
        return pensamentosRepository.save(atualizarPensamentos);
    }

    public boolean deletar(Integer id){
        this.pensamentosRepository.deleteById(id.longValue());
        return true;
    }

}
