package com.practice.spring.controller;

import com.practice.spring.model.Party;
import com.practice.spring.service.party.PartyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import static com.practice.spring.base.constants.PathConstants.PARTIES;
import static com.practice.spring.base.constants.PathConstants.BASE_PATH;

@RestController
@RequestMapping(value = BASE_PATH+PARTIES)
public class PartyController {

    @Autowired
    private PartyServices partyService;

    @GetMapping()
    public List<Party> getAllParties() {
        return partyService.getAllParties();
    }

    @GetMapping("/{id}")
    public Party getPartyById(@PathVariable String id) {
        return partyService.getPartyById(id);
    }

    @PostMapping()
    public Map<String, Object> createParty(@RequestBody Party party) {
        return partyService.saveParty(party);
    }

    @PutMapping("/{id}")
    public Map<String, Object> updateParty(@PathVariable String id, @RequestBody Party party) {
        return partyService.updateParty(id, party);
    }

    @DeleteMapping("/{id}")
    public Map<String, Object> deleteParty(@PathVariable String id) {
        return partyService.deleteParty(id);
    }
}
