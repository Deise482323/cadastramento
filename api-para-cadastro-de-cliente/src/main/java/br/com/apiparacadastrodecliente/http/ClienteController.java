package br.com.apiparacadastrodecliente.http;

import br.com.apiparacadastrodecliente.entity.Cliente;
import br.com.apiparacadastrodecliente.http.dto.ClienteDTO;
import br.com.apiparacadastrodecliente.repository.ClienteRepository;
import br.com.apiparacadastrodecliente.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@Slf4j
@RequestMapping(path = "/api/v1/cliente")
@CrossOrigin
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void salvar(@RequestBody Cliente contato) {
        service.salvar(contato);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<Cliente> finAll() {
        return service.findAll();
    }


    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(Integer id) {
        service.deleteById(id);
    }



}
