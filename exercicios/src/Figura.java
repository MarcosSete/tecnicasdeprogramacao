
public abstract  class Figura {


    private String cor;

    public Figura () {

    }

    public Figura (String cor){
        super();
        this.cor = cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){

        return cor;
    }

    @Override
    public String toString(){
        return "figura [cor = " + cor + "]";
    }

    public abstract double area();
}