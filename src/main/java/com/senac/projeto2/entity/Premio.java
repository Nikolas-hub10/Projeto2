package com.senac.projeto2.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "premio")
public class Premio {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="premio_id")
    private int id;
    @Column(name="premio_descricao", nullable = false, length = 300)
    private String descricao;
    @Column(name="premio_ordem_premiacao", nullable = false, length = 11)
    private int ordemPremiacao;
    @Column(name="premio_categoria", nullable = false, length = 11)
    private int premioCategoria;
    @Column(name="premio_status", nullable = false, length = 11)
    private int premioStatus;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getOrdemPremiacao() {
        return ordemPremiacao;
    }

    public void setOrdemPremiacao(int ordemPremiacao) {
        this.ordemPremiacao = ordemPremiacao;
    }

    public int getPremioCategoria() {
        return premioCategoria;
    }

    public void setPremioCategoria(int premioCategoria) {
        this.premioCategoria = premioCategoria;
    }

    public int getPremioStatus() {
        return premioStatus;
    }

    public void setPremioStatus(int premioStatus) {
        this.premioStatus = premioStatus;
    }
}
