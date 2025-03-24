public class Main {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("Carlos", "313.122.233-21");
        Carro c1 = new Carro("BMW", m1, 200);

        System.out.println(c1);

    }
}
