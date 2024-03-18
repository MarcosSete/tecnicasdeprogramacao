package heranca;

public class Caminhao extends Veiculo{
    private int eixos;

    public Caminhao(String placa,int ano,int eixos){
        super(placa,ano);
        this.eixos = eixos;
    }

    public void setEixos(int eixos){
        this.eixos = eixos;
    }

    public int getEixos(){
        return eixos;
    }
    @Override
    public String toString(){
        return "Caminhão{" + "Placa=" + super.getPlaca() + ",ano=" + super.getAno() + ",eixos=" + eixos + "}";
    }
}
