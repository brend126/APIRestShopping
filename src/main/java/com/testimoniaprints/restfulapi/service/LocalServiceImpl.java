package com.testimoniaprints.restfulapi.service;

import com.testimoniaprints.restfulapi.entity.Local;
import com.testimoniaprints.restfulapi.repository.LocalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class LocalServiceImpl implements LocalService{

    @Autowired
    LocalRepository localRepository;

    @Override
    public List<Local> findAllLocals() {
        return localRepository.findAll();
    }

    @Override
    public Local saveLocal(Local local) {
        return localRepository.save(local);
    }

    @Override
    public Local updateLocal(Long id, Local local) {
        Local localDb = localRepository.findById(id).get();

        if (Objects.nonNull(local.getNombre()) && !"".equalsIgnoreCase(local.getNombre())){
            localDb.setNombre(local.getNombre());
        }

        if (Objects.nonNull(local.getCategoria()) && !"".equalsIgnoreCase(local.getCategoria())){
            localDb.setCategoria(local.getCategoria());
        }

        if (Objects.nonNull(local.getNombrePropietario()) && !"".equalsIgnoreCase(local.getNombrePropietario())){
            localDb.setNombrePropietario(local.getNombrePropietario());
        }
        if (Objects.nonNull(local.getPiso()) && !"".equalsIgnoreCase(String.valueOf(local.getPiso()))){
            localDb.setPiso(local.getPiso());
        }
        return localRepository.save(localDb);

    }

    @Override
    public void deleteLocal(Long id) {
        localRepository.deleteById(id);
    }
}
