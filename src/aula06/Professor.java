package aula06;

import aula05.DateYMD;
public class Professor extends Pessoa {
    private String cat;
    private String dep;
    private DateYMD DataContr;
    
    public Professor(String name, int cc, DateYMD DataNasc,DateYMD DataContr, String cat, String dep){
        super(name, cc, DataNasc);
        this.cat = cat;
        this.dep = dep;
        this.DataContr = new DateYMD(DataContr.getDay(), DataContr.getMonth(), DataContr.getYear());

    }


    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getDep() {
        return dep;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }


    @Override
    public String toString() {
        return "Professor [Data Contratacao = " + DataContr + ", Categoria = " + cat + ", Departamento = " + dep + "]";
    }

    
}
