/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.udesc.ceavi.eso.dsw.prova1JulioVinicius.control;

import br.udesc.ceavi.eso.dsw.prova1JulioVinicius.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author user
 */
public interface ClienteRep extends JpaRepository<Cliente, Long>{
    
}
