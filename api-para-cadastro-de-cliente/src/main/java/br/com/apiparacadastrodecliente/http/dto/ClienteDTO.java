package br.com.apiparacadastrodecliente.http.dto;

import lombok.*;

@Getter
@Setter
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

    private String Nome;
    private String DataCadastro;
    private String tipo;
    private String texto;

}
