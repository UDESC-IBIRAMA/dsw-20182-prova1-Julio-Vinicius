/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.eso.dsw.prova1JulioVinicius.control;

import br.udesc.ceavi.eso.dsw.prova1JulioVinicius.model.Cliente;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClientesResource {
    
    @Autowired
        private ClienteRep clientes;
    
    @GetMapping("/{id}")
    public Optional<Cliente> buscar(@PathVariable Long id){
      return clientes.findById(id);
    }
    
    @PostMapping
    public void salvar(Cliente cli){
        clientes.save(cli);
        
    }
    
    @GetMapping
    public List<Cliente> bucarTodos(){
    return clientes.findAll();
        
    }
    @PutMapping("/{id}")
    public void editar(@PathVariable Long id, Cliente cli){
        
        clientes.save(cli);
    }
    
    @DeleteMapping
    public void excluir(){
        clientes.deleteAll();
    }
    
}
