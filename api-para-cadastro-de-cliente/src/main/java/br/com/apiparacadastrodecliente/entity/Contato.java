package br.com.apiparacadastrodecliente.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contato {

    private Integer id;
    private String tipo;
    private String texto;
}
