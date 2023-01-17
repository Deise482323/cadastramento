package br.com.apiparacadastrodecliente.mapper;

import br.com.apiparacadastrodecliente.entity.Cliente;
import br.com.apiparacadastrodecliente.http.dto.ClienteDTO;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ClienteMapper {

    private final ModelMapper mapper;

    public static ClienteDTO toCliente (ClienteDTO clienteDTO){
        Cliente clienteCd = new Cliente();
        clienteCd.setNome(clienteDTO.getNome());
        clienteCd.setDataCadastro(clienteDTO.getDataCadastro());
        return  clienteDTO;
    }
}
