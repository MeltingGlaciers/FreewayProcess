package data.dao;

import data.entity.Freeway;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FreewayRepository extends JpaRepository<Freeway, Integer> {

}
