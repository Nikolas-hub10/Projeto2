package com.senac.projeto2.controller;


import com.senac.projeto2.entity.Jogo;

import com.senac.projeto2.service.JogoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/jogo")
@Tag(name="Jogo", description = "API para gerenciamento dos jogos do sistema")
public class JogoController {

private final JogoService jogoService;

public JogoController(JogoService jogoService) {
this.jogoService = jogoService;
    }


    @GetMapping("/Listar")
    @Operation(summary = "Listar jogos do sistema")
    public ResponseEntity<List<Jogo>> listar(){ return ResponseEntity.ok(jogoService.listarJogos()); }

    @GetMapping("/listarPorIdJogo/{idJogo}")
    @Operation(summary = "Listar jogos do sistema pelo id da categoria")
    public ResponseEntity<Jogo> listarPorIdJogo(@PathVariable("IdJogo") Integer idJogo){
        Jogo jogo = jogoService.listarJogoPorId(idJogo);
        if (jogo == null){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(jogo);
        }
    }
    @PostMapping("/criar")
    public String criar(){ return "Usuario Criado com sucesso!";}

    @PutMapping("/atualizar")
    public String atualizar() { return "Usuario atualizado com sucesso!";}

    @DeleteMapping("/apagar")
    public String apagar(){ return "Usuario apagado com sucesso!";}
}

