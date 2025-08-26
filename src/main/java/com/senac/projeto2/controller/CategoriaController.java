package com.senac.projeto2.controller;

import com.senac.projeto2.entity.Categoria;
import com.senac.projeto2.service.CategoriaService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/categoria")
@Tag(name="Categoria", description = "API para gerenciamento das categorias do sistema")
public class CategoriaController {

    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaService categoriaService) {
        this.categoriaService = categoriaService;
    }


    @GetMapping("/Listar")
    @Operation(summary = "Listar categorias do sistema")
    public ResponseEntity<List<Categoria>> listar(){ return ResponseEntity.ok(categoriaService.listarCategorias()); }

    @GetMapping("/listarPorIdCategoria/{idCategoria}")
    @Operation(summary = "Listar usuarios do sistema pelo id da categoria")
    public ResponseEntity<Categoria> listarPorIdCategoria(@PathVariable("IdCategoria") Integer idCategoria){
        Categoria categoria = categoriaService.listarCategoriaPorId(idCategoria);
        if (categoria == null){
            return ResponseEntity.noContent().build();
        }else{
            return ResponseEntity.ok(categoria);
        }
    }
    @PostMapping("/criar")
    public String criar(){ return "Usuario Criado com sucesso!";}

    @PutMapping("/atualizar")
    public String atualizar() { return "Usuario atualizado com sucesso!";}

    @DeleteMapping("/apagar")
    public String apagar(){ return "Usuario apagado com sucesso!";}
}
