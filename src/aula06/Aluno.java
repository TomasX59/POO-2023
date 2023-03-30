package aula06;

import aula05.DateYMD;

public class Aluno extends Pessoa {

    private int nmec=100;
    private DateYMD dataInsc;
    private static int lastNMEC = 99;

    public Aluno(String nome, int cc, DateYMD dataNasc) {
        super(nome, cc, dataNasc);
        this.nmec = nmec++;
        this.dataInsc = new DateYMD(0,0,0);
    }

    public Aluno(String nome, int cc, DateYMD dataNasc, DateYMD dataInsc) {
        this(nome, cc, dataNasc);
        this.dataInsc = new DateYMD(dataInsc.getDay(), dataInsc.getMonth(), dataInsc.getYear());
        lastNMEC++;
        this.nmec = lastNMEC;

    }

    @Override
    public String toString() {
        return "Aluno [Nome = " + name + ", cc = " + cc +", Data Nascimento = " + DataNasc +", Data Inscricao =" + dataInsc + ", NMec = "+ nmec +  "]";   
    }
    
    public int getNMec() {
        return nmec;
    }

    public void setNMec(int nmec) {
        this.nmec = nmec;
    }

    public DateYMD getDataInsc() {
        return dataInsc;
    }

    public void setDataInsc(DateYMD dataInsc) {
        this.dataInsc = dataInsc;
    }
    
}
