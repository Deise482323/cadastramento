package br.com.apiparacadastrodecliente.service;

import br.com.apiparacadastrodecliente.entity.Cliente;
import br.com.apiparacadastrodecliente.exeption.ClienteNaoEncontradoException;
import br.com.apiparacadastrodecliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Cliente salvar(Cliente cliente) {

        return repository.save(cliente);
    }

    public List<Cliente> listarTodos() {
        return repository.findAll();
    }

    public void deletar(Integer id) {
        repository.deleteById(id);
    }

    public void alteracao (Cliente cliente) {

        Optional<Cliente> res = repository.findById(cliente.getId());
        if (res.isPresent()) {
            Cliente clienteCd = res.get();
            clienteCd.setId(cliente.getId());
            clienteCd.setNome(cliente.getNome());
            clienteCd.setDataCadastro(cliente.getDataCadastro());


            repository.save(clienteCd);
        } else {
            throw new ClienteNaoEncontradoException();
        }
    }


}