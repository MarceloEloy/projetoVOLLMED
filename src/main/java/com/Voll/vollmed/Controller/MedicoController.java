package com.Voll.vollmed.Controller;


import com.Voll.vollmed.DTO.DadosMedicos;
import com.Voll.vollmed.Medicos.Medico;
import com.Voll.vollmed.Medicos.MedicoRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/Medico")
public class MedicoController {
    @Autowired
    private MedicoRepository medicoRepository;
    @PostMapping
    public void cadastrar(@RequestBody @Valid DadosMedicos dados){
        Medico medico = new Medico(dados);
        this.medicoRepository.save(medico);
        System.out.println("POST REALIZADO!");
    }
}
