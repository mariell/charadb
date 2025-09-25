package me.mariell.charadb.controller;

import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import me.mariell.charadb.api.TeamsApi;
import me.mariell.charadb.models.Team;
import me.mariell.charadb.models.TeamCreateRequest;
import me.mariell.charadb.models.TeamUpdateRequest;
import me.mariell.charadb.service.CharadbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Controller
public class TeamsController implements TeamsApi {
    //TODO: Implement this class. You can create more methods as needed!

    private final CharadbService appService;

    @Autowired
    public TeamsController(CharadbService appService){
        this.appService = appService;
    }

    public ResponseEntity<Team> createTeam(TeamCreateRequest teamCreateRequest) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
   
    public ResponseEntity<Void> deleteTeam(Long teamId) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }
   
    public ResponseEntity<List<Team>> getTeams() throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Team> updateTeam( Long teamId, TeamUpdateRequest teamUpdateRequest) throws Exception {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
