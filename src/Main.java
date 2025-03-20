public class Main {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("Carlos", "313.122.233-21");

        Motor motor1 = new Motor(300, "Aditivada");

        Carro c1 = new Carro("BMW", m1, motor1);

        System.out.println(c1);

    }
}