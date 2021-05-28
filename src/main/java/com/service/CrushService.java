package com.service;

import com.data.dto.CrushDTO;
import com.data.entity.Crush;

import java.util.List;
import java.util.Optional;

public interface CrushService {

    Optional<Crush> getById(Integer id);
    void save(Crush crush);
    void update(Integer id, Crush crush);
    void delete(Integer id);
    Integer addFromDTO(CrushDTO dto);
    List<Crush> findAll();
}
