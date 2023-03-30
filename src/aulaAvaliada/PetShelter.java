package aulaaval;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class PetShelter implements IPetShelter {

    private String shelterName;
    List<Animal> animal = new ArrayList<>();

    public PetShelter(String shelterName) {
        this.shelterName = shelterName;
    }

    @Override
    public void addAnimal(Animal animal) {
        this.animal.add(animal);
    }

    @Override
    public void removeAnimal(Animal animal) {
        this.animal.remove(animal);
        
    }

    @Override
    public Animal searchForAnimal(String name) {
        Optional<Animal> animal = this.animal.stream().filter(a -> a.getNome().equals(name)).findFirst();
        if (animal.isPresent()) {
            return animal.get();
        }
        return null;
        
    }

    @Override
    public boolean sponsorAnimal(int animalId, String SponsorName) {
        
        for (Animal animal : this.animal) {
            if (animal.getId() == animalId) {
                animal.setSponsorName(SponsorName);
                return true;
            }
        }
        return false;
    }

    @Override
    public void listAllAnimals() {
        
        for (Animal animal : this.animal) {
            System.out.println(animal);
        }
    }

    public String getShelterName() {
        return shelterName;
    }

    public void setShelterName(String shelterName) {
        this.shelterName = shelterName;
    }



}
