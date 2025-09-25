package me.mariell.charadb.repository;

import me.mariell.charadb.repository.jpamodels.JpaTeam;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<JpaTeam, Long> {
    //TODO: Create this entity
}
