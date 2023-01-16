package br.com.apiparacadastrodecliente.http.dto;

import br.com.apiparacadastrodecliente.entity.Cliente;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.LinkedHashMap;
import java.util.Map;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private Integer id;
    private String Nome;
    private String DataCadastro;
    private String tipo;
    private String texto;

}
