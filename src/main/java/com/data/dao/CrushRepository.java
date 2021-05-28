package com.data.dao;

import com.data.entity.Crush;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrushRepository extends JpaRepository<Crush, Integer> {

}
