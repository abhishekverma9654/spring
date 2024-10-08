package com.practice.spring.service.party;

import com.practice.spring.model.Party;
import com.practice.spring.repository.PartyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.practice.spring.base.constants.ModelConstants.PARTY_ID;
import static com.practice.spring.base.constants.ParameterConstants.MESSAGE;

@Service()
public class PartyServices {

    @Autowired
    PartyRepository partyRepository;

    public List<Party> getAllParties() {
        return partyRepository.findAll();
    }

    public Party getPartyById(String id) {
        return partyRepository.findById(id).orElse(null);
    }

    public Map<String, Object> saveParty(Party party) {
        Map<String, Object> response = new HashMap<>();
        partyRepository.save(party);
        response.put(PARTY_ID, party.getPartyId());
        response.put(MESSAGE, "Created party Successfully");
        return response;
    }

    public Map<String, Object> updateParty(String id, Party party) {
        Map<String, Object> response = new HashMap<>();

        Party existingParty = partyRepository.findById(id).orElse(null);
        if (existingParty != null) {

            // Setting values for update
            existingParty.setDescription(party.getDescription());
            partyRepository.save(existingParty);

            response.put(PARTY_ID, existingParty.getPartyId());
            response.put(MESSAGE, "Updated party Successfully");
        }
        return response;
    }

    public Map<String, Object> deleteParty(String id) {
        Map<String, Object> response = new HashMap<>();
        Party party = partyRepository.findById(id).orElse(null);
        if (party != null) {
            partyRepository.delete(party);
            response.put(MESSAGE, "Deleted party Successfully");
        } else {
            response.put(MESSAGE, "Party not found");
        }
        response.put(PARTY_ID, id);
        return response;
    }
}
