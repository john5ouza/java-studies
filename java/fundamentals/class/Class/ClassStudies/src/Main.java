public class Main {
    public static void main(String[] args) throws Exception {
       
        /*  
        Clients c001 = new Clients();
        c001.firstName = "John";
        c001.age = 29;

        Clients c002 = new Clients();
        c002.firstName = "Ytalo";
        c002.age = 30;

        Clients c003 = new Clients();
        c003.firstName = "John Souza";
        c003.age = 30;

        c003.newAccount();
        */

        //ENCAPSULATION, GET AND SET CONCEPT
        Car car = new Car("BMW", "X6", 2024, 125_000);

        car.setMarca("AUDI");
        car.setModelo("A3");
        car.setAno(2015);


        System.out.println("marca: " + car.getMarca()); 
        System.out.println("modelo: " + car.getModelo()); 
        System.out.println("ano: " + car.getAno());
        System.out.println("valor: $" + car.getValor());   
        System.out.println("o valor de venda do carro é: $" + car.valorVenda());     
    }
}
