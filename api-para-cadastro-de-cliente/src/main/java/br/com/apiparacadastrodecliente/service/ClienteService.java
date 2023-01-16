package br.com.apiparacadastrodecliente.service;

import br.com.apiparacadastrodecliente.entity.Cliente;
import br.com.apiparacadastrodecliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public void salvar(Cliente contato) {
        repository.save(contato);
    }

    public List<Cliente> findAll() {
        return repository.findAll();
    }

    public void deleteById(Integer id) {
        repository.deleteById(id);
    }

    public void atualizar(Integer id, Cliente contato) {

    }
}


//    public void atualizar(Long id, Condominio morador) {
//        Optional<Condominio> res = repository.findById(id);
//        if (res.isPresent()) {
//            Condominio moradorDb = res.get();
//            moradorDb.setMorador(morador.getMorador());
//            moradorDb.setApartamento(morador.getApartamento());
//            moradorDb.setTorre(morador.getTorre());
//            moradorDb.setAndar(morador.getAndar());
//
//            repository.save(moradorDb);
//        } else {
//            throw new CondominioNaoEncontradoException();
//        }
//    }
