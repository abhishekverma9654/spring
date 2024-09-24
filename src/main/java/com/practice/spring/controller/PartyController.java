package com.practice.spring.controller;

import com.practice.spring.model.Party;
import com.practice.spring.service.party.PartyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.practice.spring.base.BaseConstants.basePath;

@RestController
@RequestMapping(value = basePath+"/parties")
public class PartyController {

    @Autowired
    private PartyServices partyService;

    @GetMapping()
    public List<Party> getAllParties() {
        return partyService.getAllParties();
    }

    @GetMapping("/{id}")
    public Party getPartyById(@PathVariable Long id) {
        return partyService.getPartyById(id);
    }

    @PostMapping()
    public Party createParty(@RequestBody Party party) {
        return partyService.saveParty(party);
    }
}
