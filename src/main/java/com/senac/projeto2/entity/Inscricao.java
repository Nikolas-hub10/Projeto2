package com.senac.projeto2.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "inscricao")
public class Inscricao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inscricao_id")
    private int inscricaoId;
    @Column(name = "inscricacao_data")
    private LocalDateTime inscricaoData;
    @Column(name = "inscricacao_status")
    private int inscricaoStatus;

    @ManyToOne
    @JoinColumn(name = "participante_id", nullable = false)
    @JsonIgnore
    private Jogo jogo;

    public int getInscricaoId() {
        return inscricaoId;
    }

    public void setInscricaoId(int inscricaoId) {
        this.inscricaoId = inscricaoId;
    }

    public LocalDateTime getInscricaoData() {
        return inscricaoData;
    }

    public void setInscricaoData(LocalDateTime inscricaoData) {
        this.inscricaoData = inscricaoData;
    }

    public int getInscricaoStatus() {
        return inscricaoStatus;
    }

    public void setInscricaoStatus(int inscricaoStatus) {
        this.inscricaoStatus = inscricaoStatus;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}
