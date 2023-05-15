public class Car {
    
    //PARÂMETROS PRIVADOS -> SÓ PODE SER ACESSADO PELA CLASSE "CAR".
    private String marca;
    private String modelo;
    private int ano;
    private double valor;

    //CONSTRUCTOR
    Car(String marca, String modelo, int ano, double valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    
    public double valorVenda() {
        double valorFinal = (valor * 0.1) + valor;
        return valorFinal;
    }


    public String getMarca() {
        return marca;
    }
    public String getModelo() {
        return modelo;
    }
    public int getAno() {
        return ano;
    }
    public double getValor(){
        return valor;
    }
    

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

}
