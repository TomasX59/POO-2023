package aulaaval;

public class Animal {

    private String nome;
    private String SponsorName;
    private boolean isAdopted;
    private int peso;
    private int idade;
    private int animalId=1001;
    private static int lastId = 1000;

    public Animal(String nome, int peso, int idade) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.animalId= animalId++;
    }

    public Animal(String nome, int peso, int idade, String SponsorName) {
        this.nome = nome;
        this.peso = peso;
        this.idade = idade;
        this.SponsorName = SponsorName;
        this.animalId= animalId++;
        this.animalId = lastId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getId() {
        return animalId;
    }

    public void setId(int animalId) {
        this.animalId = animalId;
    }

    public String getSponsorName() {
        return SponsorName;
    }

    public void setSponsorName(String SponsorName) {
        this.SponsorName = SponsorName;
    }
 
    public boolean isIsAdopted() {
        return isAdopted;
    }

    public void setIsAdopted(boolean isAdopted) {
        this.isAdopted = isAdopted;
    }



    
}
