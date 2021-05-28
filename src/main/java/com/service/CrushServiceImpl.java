package com.service;

import com.data.dao.CrushRepository;
import com.data.entity.Crush;
import com.data.entity.Freeway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CrushServiceImpl implements CrushService{

    @Autowired
    private CrushRepository repository;

    @Override
    public Optional<Crush> getById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(Crush crush) {
        repository.save(crush);
    }

    @Override
    public void update(Integer id, Crush crush) {
        Crush updated = repository.findById(id).orElse(null);
        if (updated!=null){
            updated.setDate(crush.getDate());
        }
    }

    @Override
    public void delete(Integer id) {

    }

    @Override
    public List<Freeway> findAll() {
        return null;
    }
}
