package br.com.apiparacadastrodecliente.http.v1;

import br.com.apiparacadastrodecliente.entity.Cliente;
import br.com.apiparacadastrodecliente.mapper.ClienteMapper;
import br.com.apiparacadastrodecliente.service.ClienteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j
@RequestMapping(path = "/api/v1/cliente")
@CrossOrigin
public class ClienteController {

    @Autowired
    private ClienteService service;
    private final ClienteMapper mapper;


    //verificar no video esse construtor
    public ClienteController(ClienteMapper mapper) {
        this.mapper = mapper;
    }

    @PostMapping
    public ResponseEntity<Cliente> salvar(@RequestBody Cliente cliente) {
        Cliente clienteSalvo = service.salvar(cliente);
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalvo);
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodos() {
        List<Cliente> clientes = service.listarTodos();
        return ResponseEntity.status(HttpStatus.OK).body(clientes);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Void> deletar(@PathVariable Integer id) {

        service.deletar(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @PutMapping("/update-por-cliente/{cliente}")
    public ResponseEntity<Cliente> alteracao(@RequestBody Cliente cliente) {
        Cliente clienteSalvo = service.salvar(cliente);
        return ResponseEntity.status(HttpStatus.OK).body(clienteSalvo);
    }
}
