package estudospoo;

public class Carro {
    public String nome;
    public String cor;
    public float peso;
    public int velocidade;

    public Carro(int velocidade, int tempo){
        this.movimentar(velocidade);
        this.frear(tempo);
    }

    public void movimentar(int velocidade){
        System.out.println("O carro está em movimento à " + velocidade + " km/h.");
    }

    public void frear(int tempo){
        System.out.println("O carro parou em " + tempo + " segundos.");
    }

}
