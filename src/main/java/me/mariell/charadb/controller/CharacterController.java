package me.mariell.charadb.controller;

import me.mariell.charadb.api.CharactersApi;
import me.mariell.charadb.models.*;
import me.mariell.charadb.models.Character;
import me.mariell.charadb.service.CharadbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
public class CharacterController implements CharactersApi {
    //TODO: Implement this class. You can create more methods as needed!

    private final CharadbService appService;

    @Autowired
    public CharacterController(CharadbService appService){
        this.appService = appService;
    }

    public ResponseEntity<Character> createCharacter(CharacterCreateRequest characterCreateRequest) throws Exception {
        Character character = appService.createCharacter(characterCreateRequest);
        return new ResponseEntity<>(character, HttpStatus.CREATED);
    }

    public ResponseEntity<Void> deleteCharacter(String characterId) throws Exception {
        appService.deleteCharacter(characterId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<Character> getCharacterById(String characterId) throws Exception {
        Character character = appService.getCharacter(characterId);
        return new ResponseEntity<>(character, HttpStatus.OK);
    }

    public ResponseEntity<List<Character>> getCharacters(Element element, WeaponType weapon, Rarity rarity) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Character> updateCharacter(String characterId,CharacterUpdateRequest characterUpdateRequest) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
