package com.testimoniaprints.restfulapi.service;

import com.testimoniaprints.restfulapi.entity.Local;

import java.util.List;

public interface LocalService {
    List<Local> findAllLocals();
    Local saveLocal(Local local);
    Local updateLocal(Long id, Local local);
    void deleteLocal(Long id);
}
