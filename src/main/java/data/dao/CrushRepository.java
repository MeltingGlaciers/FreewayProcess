package data.dao;

import data.entity.Crush;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CrushRepository extends JpaRepository<Crush, Integer> {

}
