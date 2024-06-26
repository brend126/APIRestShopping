package com.testimoniaprints.restfulapi.service;

import com.testimoniaprints.restfulapi.entity.Piso;

import java.util.List;

public interface PisoService {
    List<Piso> findAllPiso();
    Piso savePiso(Piso piso);
    Piso updatePiso(Long id, Piso piso);
    void deletePiso(Long id);
}
