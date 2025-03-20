public class Motor {
    private int potencia;
    private String tipoCombustivel;

    public Motor(int potencia, String tipoCombustivel) {
        this.potencia = potencia;
        this.tipoCombustivel = tipoCombustivel;
    }

    public int getPotencia() {
        return potencia;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public String toString(){
        return "Motor Potência: " + potencia + " Tipo de Combustível: " + tipoCombustivel;

    }
}