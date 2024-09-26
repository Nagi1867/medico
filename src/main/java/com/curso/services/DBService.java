package com.curso.services;

import com.curso.domains.Medico;
import com.curso.domains.enums.Status;
import com.curso.repositories.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

@Service
public class DBService {
    @Autowired
    private MedicoRepository medicoRepo;


    public void initDB() {
        Medico paciente1 = new Medico (0, "Maicon", Date.from(Instant.now()), new BigDecimal("2000"), Status.ATIVO);

        medicoRepo.save(paciente1);
    }
}
