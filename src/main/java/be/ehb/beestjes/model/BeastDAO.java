package be.ehb.beestjes.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.HashSet;

@Repository
public class BeastDAO {

    HashSet<Beast> pets = new HashSet<>();

    public BeastDAO() {
        pets.add(new Beast("Fifi", "Poedel"));
        pets.add(new Beast("Tyson", "Boxer"));
        pets.add(new Beast("Samson", "lapjeskat"));
    }

    public HashSet<Beast> getPets() {
        return pets;
    }

    public void setPets(HashSet<Beast> pets) {
        this.pets = pets;
    }
}
