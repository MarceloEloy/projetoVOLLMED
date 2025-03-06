package com.Voll.vollmed.Medicos;

import com.Voll.vollmed.DTO.DadosEnderecos;
import com.Voll.vollmed.DTO.DadosMedicos;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@Entity
@Table(name = "medico")
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Medico {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @NotNull
    @Column(nullable = false)
    private String nome, email, crm;
    @Embedded
    private Endereco endereco;
    @Column(nullable = false)
    private Especialidade especialidade;

    public Medico(DadosMedicos dados) {
        this.nome = dados.nome();
        this.crm = dados.crm();
        this.email = dados.email();
        this.endereco = new Endereco(dados.endereco());
        this.especialidade = dados.especialidade();
    }
}
