package aulaaval;

public interface IPetShelter {
    public void addAnimal(Animal animal);
    public void removeAnimal(Animal animal);
    public Animal searchForAnimal(String name);
    public boolean sponsorAnimal(int animalId, String SponsorName);
    public void listAllAnimals();
}