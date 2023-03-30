package aula06;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Conjunto {
    private int[] vetor;
    private int size;
    
    public Conjunto() {
        this.vetor = new int[10];
        this.size = 0;
    }

    public void insert(int n){
        
        if (!this.contains(n)) {
            if (this.size == this.vetor.length) {
                this.vetor = Arrays.copyOf(this.vetor, this.vetor.length * 2);
            }
            this.vetor[this.size] = n;
            this.size++;
        }
    }

    public boolean contains(int n) {
        for (int i = 0; i < this.size; i++) {
            if (this.vetor[i] == n) {
                return true;
            }
        }
        return false;
    }

    public void remove(int n) {
        if (this.contains(n)) {
            int[] temp = new int[this.vetor.length];
            int j = 0;
            for (int i = 0; i < this.size; i++) {
                if (this.vetor[i] != n) {
                    temp[j] = this.vetor[i];
                    j++;
                }
            }
            this.vetor = temp;
            this.size--;
        }
    }

    public void empty() {
        this.vetor = new int[10];
        this.size = 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < this.size; i++) {           
            sb.append(vetor[i] + " ");

        }
        return sb.toString();
    }

    public int size() {
        return this.size;
    }

    
    public Conjunto combine(Conjunto add) {
        Conjunto temp = new Conjunto();
        for (int i = 0; i < this.size; i++) {
            temp.insert(this.vetor[i]);
        }
        for (int i = 0; i < add.size; i++) {
            temp.insert(add.vetor[i]);
        }
        return temp;
    }

    public Conjunto subtract(Conjunto diff) {
        Conjunto temp = new Conjunto();
        for (int i = 0; i < this.size; i++) {
            temp.insert(this.vetor[i]);
        }
        for (int i = 0; i < diff.size; i++) {
            temp.remove(diff.vetor[i]);
        }
        return temp;
    
    }

    public Conjunto intersect(Conjunto inter) {
        Conjunto temp = new Conjunto();
        for (int i = 0; i < this.size; i++) {
            if (inter.contains(this.vetor[i])) {
                temp.insert(this.vetor[i]);
            }
        }
        return temp;
    }





}
