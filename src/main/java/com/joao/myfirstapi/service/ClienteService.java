package com.joao.myfirstapi.service;

import com.joao.myfirstapi.model.Cliente;
import com.joao.myfirstapi.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> buscarTodosClientes(){
        return clienteRepository.findAll();
    }

    public Cliente buscarPorId(Long id){
        return clienteRepository.findById(id).get();
    }

    public Cliente cadastrar(Cliente cliente){
        return clienteRepository.save(cliente);
    }

    public void DeletarPorId(Long id){
        clienteRepository.deleteById(id);
    }
}
