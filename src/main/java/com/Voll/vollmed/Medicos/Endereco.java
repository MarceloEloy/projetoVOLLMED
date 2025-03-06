package com.Voll.vollmed.Medicos;

import com.Voll.vollmed.DTO.DadosEnderecos;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Endereco {
    private String logradouro,
    bairro,  cep,
    cidade,uf,
     complemento,  numero;

    public Endereco(DadosEnderecos endereco) {
        this.logradouro = endereco.logradouro();
                this.bairro = endereco.bairro();
                this.cep = endereco.cep();
                this.cidade = endereco.cidade();
                this.uf = endereco.uf();
                this.complemento = endereco.complemento();
                this.numero = endereco.numero();
    }
}
