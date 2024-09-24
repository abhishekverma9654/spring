package com.practice.spring.service.party;

import com.practice.spring.model.Party;
import com.practice.spring.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class PartyServices {

    @Autowired
    PartyRepository partyRepository;

    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }
}
