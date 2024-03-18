package heranca;

public class Onibus extends Veiculo {
    private int assentos;

    public Onibus(String placa,int ano, int assentos){
        super(placa,ano);
        this.assentos = assentos;

    }

    public void setAssentos(int assentos){
        this.assentos=assentos;
    }

    public int getAssentos(){
        return assentos;
    }

    @Override
    public String toString(){
        return "Ônibus{" + "Placa=" + super.getPlaca() + ",ano=" + super.getAno() + ",assentos=" + assentos +"}";
    }
}
