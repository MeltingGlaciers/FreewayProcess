package com.service;


import com.data.entity.Freeway;

import java.util.List;
import java.util.Optional;

public interface FreewayService {

    Optional<Freeway> getById(Integer id);
    void save(Freeway freeway);
    void update(Integer id, Freeway freeway);
    void delete(Integer id);
    void addFromDto(Integer length);
    List<Freeway> findAll();

}
