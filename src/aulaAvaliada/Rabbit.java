package aulaaval;

public class Rabbit extends Animal{
    
    private boolean shortFur;
    
    public Rabbit(String nome, int peso, int idade, boolean shortFur,String SponsorName) {
        super(nome, peso, idade, SponsorName);
        this.shortFur = true; //mudar depois
    }

    public boolean isShortFur() {
        return shortFur;
    }

    public void setShortFur(boolean shortFur) {
        this.shortFur = shortFur;
    }

    @Override
    public String toString() {
        if (shortFur == true) {
            return "Rabbit [tipo de pelo=" + "é curto" + ", nome=" + getNome() + ", peso=" + getPeso() + ", idade=" + getIdade() + ", animalId=" + getId() + "]";
        }else{
            return "Rabbit [tipo de pelo=" + "é longo" + ", nome=" + getNome() + ", peso=" + getPeso() + ", idade=" + getIdade() + ", animalId=" + getId() + "]";}
    }


}
