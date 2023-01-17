package br.com.apiparacadastrodecliente.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Data
@Entity
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Contato {
    @Id
    private Integer id;
    private String tipo;
    private String texto;

    @ManyToOne
    private Cliente cliente;
}
