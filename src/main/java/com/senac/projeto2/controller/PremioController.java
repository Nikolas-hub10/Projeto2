package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Premio;
import com.senac.projeto2.service.PremioService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/premio")
@Tag(name="Premio", description="API para gerenciamento dos premios do sistema")

public class PremioController {

    public PremioController(PremioService premioService) {
        this.premioService = premioService;
    }

    private final PremioService premioService;


    @GetMapping("/listar")
    @Operation(summary = "Listar premios do sistema")
    public ResponseEntity<List<Premio>> listar(){
        return ResponseEntity.ok(premioService.listarPremios());
    }

    @GetMapping("/listarPremioPorId/{idPremio}")
    @Operation(summary = "Listar premios do sistema pelo id do premio")
    public ResponseEntity<Premio> listarPremioPorId(@PathVariable("idPremio") Integer idPremio){
        Premio premio = premioService.listarPremioPorId(idPremio);
        if (premio == null) {
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(premio);
        }

    }

    @PostMapping("/criar")
    public String criar(){
        return "Premio Criado com sucesso!";
    }

    @PutMapping("/atualizar")
    public String atualizar(){
        return  "Premio atualizado com sucesso!";
    }

    @DeleteMapping("/apagar")
    public String apagar(){
        return "Premio apagado com sucesso!";
    }


}
