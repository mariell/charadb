package me.mariell.charadb.service;

import me.mariell.charadb.models.*;
import me.mariell.charadb.models.Character;
import me.mariell.charadb.repository.CharacterRepository;
import me.mariell.charadb.repository.TeamRepository;
import me.mariell.charadb.repository.jpamodels.JpaCharacter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CharadbService {
    //TODO: Implement this class. You can create more methods and classes as needed!
    private final CharacterRepository characterRepo;
    private final TeamRepository teamRepo;

    @Autowired
    public CharadbService(CharacterRepository characterRepo, TeamRepository teamRepo){
        this.characterRepo = characterRepo;
        this.teamRepo = teamRepo;
    }
    public Character createCharacter(CharacterCreateRequest characterCreateRequest) {
        return null;
    }

    public void deleteCharacter(String characterId) {

    }

    public Character getCharacter(String characterId) {
        Optional<JpaCharacter> character = this.characterRepo.findById(characterId);
        if (character.isPresent()){
            return null;
        }else{
            //TODO: return an error
            return null;
        }
    }

}
