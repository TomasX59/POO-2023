package aulaaval;

public class Bird extends Animal{

    private boolean isDiurnal;
    public Bird(String nome, int peso, int idade, boolean isDiurnal, String SponsorName) {
        super(nome, peso, idade, SponsorName);
        this.isDiurnal = true; //mudar depois    
    }
    public boolean isDiurnal() {
        return isDiurnal;
    }
    public void setDiurnal(boolean isDiurnal) {
        this.isDiurnal = isDiurnal;
    }
    @Override
    public String toString() {
        if (isDiurnal == true) {
            return "Bird [isDiurnal=" + "é diurno" + ", nome=" + getNome() + ", peso=" + getPeso() + ", idade=" + getIdade() + ", animalId=" + getId() + "]";
        }else{
            return "Bird [isDiurnal=" + "é noturno" + ", nome=" + getNome() + ", peso=" + getPeso() + ", idade=" + getIdade() + ", animalId=" + getId() + "]";}


    }

    
    
}
