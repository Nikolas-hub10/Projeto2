package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Participante;
import com.senac.projeto2.service.ParticipanteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
@Tag(name = "Patrocinador", description = "API para gerenciamento dos participantes do sistema")
public class ParticipanteController {

    private final ParticipanteService participanteService;

    public ParticipanteController(ParticipanteService participanteService){
        this.participanteService = participanteService;
    }

    @GetMapping("/listar")
    @Operation(summary = "Listar todos os participantes do sistema")
    public ResponseEntity<List<Participante>> listar(){
        return ResponseEntity.ok(participanteService.listarParticipantes());
    }

    @GetMapping("/listarPorId/{Patrocinador}")
    @Operation(summary = "Listar participante pelo seu ID")
    public ResponseEntity<Participante> listarPatrocinadorService(@PathVariable("idPatrocinador") Integer idParticipante){
        Participante participante = participanteService.listarParticipantesPorId(idParticipante);
        if (participante == null) {
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(participante);
        }


    }
    @PostMapping("/criar")
    @Operation(summary = "Cria um novo participante")
    public String criar() {
        return "Participante Criado com sucesso!";
    }

    @PutMapping("/atualizar")
    @Operation(summary = "Atualiza um participante existente")
    public String atualizar() {
        return "Participante atualizado com sucesso!";
    }

    @DeleteMapping("/apagar")
    @Operation(summary = "Apaga um participante")
    public String apagar() {
        return "Participante apagado com sucesso!";
    }
}

