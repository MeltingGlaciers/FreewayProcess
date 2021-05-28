package com.service;

import com.data.entity.Crush;
import com.data.entity.Freeway;

import java.util.List;
import java.util.Optional;

public interface CrushService {

    Optional<Crush> getById(Integer id);
    void save(Crush crush);
    void update(Integer id, Crush crush);
    void delete(Integer id);
    List<Freeway> findAll();
}
