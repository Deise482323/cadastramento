package br.com.apiparacadastrodecliente.repository;

import br.com.apiparacadastrodecliente.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository <Cliente, Integer> {
}
