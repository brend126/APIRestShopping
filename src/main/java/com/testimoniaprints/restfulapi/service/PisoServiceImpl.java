package com.testimoniaprints.restfulapi.service;

import com.testimoniaprints.restfulapi.entity.Piso;
import com.testimoniaprints.restfulapi.repository.PisoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class PisoServiceImpl implements PisoService{

    @Autowired
    PisoRepository pisoRepository;

    @Override
    public List<Piso> findAllPiso() {
        return pisoRepository.findAll();
    }

    @Override
    public Piso savePiso(Piso piso) {
        return pisoRepository.save(piso);
    }

    @Override
    public Piso updatePiso(Long id, Piso piso) {
        Piso pisoDb = pisoRepository.findById(id).get();
        if (Objects.nonNull(piso.getNombre()) && !"".equalsIgnoreCase(piso.getNombre())){
            pisoDb.setNombre(piso.getNombre());
        }
        if (Objects.nonNull(piso.getEncargado()) && !"".equalsIgnoreCase(String.valueOf(piso.getEncargado()))){
            pisoDb.setEncargado(piso.getEncargado());
        }

        return pisoRepository.save(pisoDb);
    }

    @Override
    public void deletePiso(Long id) {
        pisoRepository.deleteById(id);
    }
}


