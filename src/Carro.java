public class Carro {
    private String modelo;
    private Motorista motorista;
    private Motor motor;

    private static int contadorMotorista = 0;

    public Carro(String modelo, Motorista motorista, int motor) {
        this.modelo = modelo;
        this.motorista = motorista;
        this.motor = new Motor(200, "Gasolina");
    }

    public String getModelo(){
        return modelo;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public Motor getMotor(){
        return motor;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    public static int getContadorMotorista() {
        return contadorMotorista;
    }
    @Override
    public String toString(){
        return "Modelo: " + modelo + "\nMotorista: " + motorista.getNome() + " | " +  "CNH: " + motorista.getCnh() + "\nPotencia: " + motor.getPotencia() + "CV" + " \nTipo: " + motor.getTipoCombustivel();
    }
}

