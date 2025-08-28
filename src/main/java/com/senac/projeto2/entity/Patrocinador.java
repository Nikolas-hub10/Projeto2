package com.senac.projeto2.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="patrocinador")
public class Patrocinador  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="patrocinador_id")
    private int id;
    @Column(name="patrocinador_nome", nullable = false, length = 100)
    private String patrocinadorNome;
    @Column(name = "patrocinador_represetante", nullable = false , length = 50)
    private String patrocinadorRepresetante;
    @Column(name = "patrocinador_status", nullable = false)
    private int patrocinadorStatus;


    @ManyToMany(mappedBy = "patrocinadores")
    @JsonIgnore // Essencial para evitar loops infinitos
    private Set<Jogo> jogos;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatrocinadorNome() {
        return patrocinadorNome;
    }

    public void setPatrocinadorNome(String patrocinadorNome) {
        this.patrocinadorNome = patrocinadorNome;
    }

    public String getPatrocinadorRepresetante() {
        return patrocinadorRepresetante;
    }

    public void setPatrocinadorRepresetante(String patrocinadorRepresetante) {
        this.patrocinadorRepresetante = patrocinadorRepresetante;
    }

    public int getPatrocinadorStatus() {
        return patrocinadorStatus;
    }

    public void setPatrocinadorStatus(int patrocinadorStatus) {
        this.patrocinadorStatus = patrocinadorStatus;
    }


}
