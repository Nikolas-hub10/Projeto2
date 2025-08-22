package com.senac.projeto2.service;

import com.senac.projeto2.entity.Patrocinador;
import com.senac.projeto2.repository.PatrocinadorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

// A anotação @Service é essencial para que o Spring identifique esta classe
// como um bean de serviço e a possa injetar no controller.
@Service
public class PatrocinadorService {
    private final PatrocinadorRepository patrocinadorRepository;

    // O Spring irá injetar automaticamente o PatrocinadorRepository aqui.
    public PatrocinadorService(PatrocinadorRepository patrocinadorRepository) {
        this.patrocinadorRepository = patrocinadorRepository;
    }

    public List<Patrocinador> listarPatrocinadores() {
        return this.patrocinadorRepository.findAll();
    }

    public Patrocinador listarPatrocinadorPorId(int idPatrocinador) {
        // findById retorna um Optional, .orElse(null) retorna o objeto ou null se não for encontrado.
        return this.patrocinadorRepository.findById(idPatrocinador).orElse(null);
    }
}
