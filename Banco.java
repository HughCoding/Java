public class Banco {
    int numero;
    String nome;
    double saldo;
    double limite;

    void Sacar(double v){
        if (v > saldo){
            System.out.println("Operação inválida. Saldo insuficiente.");
        } else {
            saldo = saldo - v;
            System.out.println("Operação finalizada!");
        }
    }
    void Depositar(double v){
        if(v < 0){
            System.out.println("Operação inválida. Não é possível depositar um valor negativo.");
        } else {
            saldo += v;
            System.out.println("Depósito realizado com sucesso!");
        }
    }
}