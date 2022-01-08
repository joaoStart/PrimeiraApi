package com.joao.myfirstapi.controller;

import com.joao.myfirstapi.handlerException.RestResponseEntityExceptionHandler;
import com.joao.myfirstapi.model.Cliente;
import com.joao.myfirstapi.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> buscarTodos(){
        return clienteService.buscarTodosClientes();
    }

    @GetMapping("/{id}")
    public Cliente buscarPorId(@PathVariable("id") Long id){
        return clienteService.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastrar(@RequestBody Cliente cliente){
        return clienteService.cadastrar(cliente);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable("id") Long id){
        clienteService.DeletarPorId(id);
    }
}

