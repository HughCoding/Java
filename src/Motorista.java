class Motorista {
    private String nome;
    private String cnh;

    public Motorista(String nome, String cnh){
        this.nome = nome;
        this.cnh = cnh;
    }
    public String getNome(){
        return  nome;
    }
    public String getCnh(){
        return  cnh;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnh(String cnh){
        if(cnh.matches("\\d{3}\\.\\d{3}-\\d{2}")) {
            this.cnh = cnh;
        }
        System.out.println("Cnh inválida");
    }
    @Override
    public String toString(){
        return "Nome: " + nome + ", CNH: " + cnh;

    }
}



