package me.mariell.charadb.repository;

import me.mariell.charadb.repository.jpamodels.JpaCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<JpaCharacter, String> {
    //TODO: Create methods as needed
}
