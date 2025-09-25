package me.mariell.charadb.repository.jpamodels;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
public class JpaCharacter {
    @Id
    String name;
    //TODO: Create this entity
}
