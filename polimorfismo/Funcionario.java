package polimorfismo;

public class Funcionario {

    private String nome;
    private Integer horas;
    private Double valorPorHoras;

    public Funcionario() {
    }

    public Funcionario(String nome, Integer horas, Double valorPorHoras) {
        this.nome = nome;
        this.horas = horas;
        this.valorPorHoras = valorPorHoras;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double pagamento() {
        return horas * valorPorHoras;
    }

}
