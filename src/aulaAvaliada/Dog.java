package aulaaval;

public class Dog extends Animal {

    private String breed;

    public Dog(String nome, int peso, int idade, String breed, String SponsorName) {
        super(nome, peso, idade, SponsorName);
        this.breed = breed;
        
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog [breed=" + breed + ", nome=" + getNome() + ", peso=" + getPeso() + ", idade=" + getIdade() + ", animalId=" + getId() + "]";
    }

    
    
}
