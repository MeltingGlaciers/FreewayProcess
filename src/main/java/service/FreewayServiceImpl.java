package service;

import data.dao.FreewayRepository;
import data.entity.Freeway;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FreewayServiceImpl implements FreewayService{

    @Autowired
    private FreewayRepository repository;

    @Override
    public Optional<Freeway> getById(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void save(Freeway freeway) {
        repository.save(freeway);
    }

    @Override
    public void update(Integer id, Freeway freeway) {
        Freeway updated = repository.findById(id).orElse(null);
        if (updated!=null){

            updated.setLength(freeway.getLength());
            repository.save(updated);

        }
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Freeway> findAll() {
        return repository.findAll();
    }
}
