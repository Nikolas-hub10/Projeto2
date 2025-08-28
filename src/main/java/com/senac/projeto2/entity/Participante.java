package com.senac.projeto2.entity;

import jakarta.persistence.*;

import java.io.File;
import java.util.List;

@Entity
@Table(name="participante")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="participante_id")
    private int participanteId;
    @Column(name="participante_nome", nullable = false, length = 300)
    private String participanteNome;
    @Column(name = "participante_email", nullable = false, length = 45)
    private String partipanteEmail;
    @Column(name = "participante_identificacao", nullable = false, length = 45)
    private String participanteIdentificacao;
    @Column(name = "participante_endereco", nullable = false, length = 300)
    private String participanteEndereco;
    @Column(name = "participante_foto_perfil")
    private File participanteFoto;
    @Column(name= "partucipante_status", nullable = false, length = 11)
    private int participanteStatus;

    @OneToMany(mappedBy = "participante")
    private List<Inscricao> inscricoes;

    public int getParticipanteId() {
        return participanteId;
    }

    public void setParticipanteId(int participanteId) {
        this.participanteId = participanteId;
    }

    public String getParticipanteNome() {
        return participanteNome;
    }

    public void setParticipanteNome(String participanteNome) {
        this.participanteNome = participanteNome;
    }

    public String getPartipanteEmail() {
        return partipanteEmail;
    }

    public void setPartipanteEmail(String partipanteEmail) {
        this.partipanteEmail = partipanteEmail;
    }

    public String getParticipanteIdentificacao() {
        return participanteIdentificacao;
    }

    public void setParticipanteIdentificacao(String participanteIdentificacao) {
        this.participanteIdentificacao = participanteIdentificacao;
    }

    public String getParticipanteEndereco() {
        return participanteEndereco;
    }

    public void setParticipanteEndereco(String participanteEndereco) {
        this.participanteEndereco = participanteEndereco;
    }

    public File getParticipanteFoto() {
        return participanteFoto;
    }

    public void setParticipanteFoto(File participanteFoto) {
        this.participanteFoto = participanteFoto;
    }

    public int getParticipanteStatus() {
        return participanteStatus;
    }

    public void setParticipanteStatus(int participanteStatus) {
        this.participanteStatus = participanteStatus;
    }
}
