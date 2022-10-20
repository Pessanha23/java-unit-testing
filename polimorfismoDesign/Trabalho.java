package polimorfismoDesign;

public class Trabalho {

    private NivelTrabalho nivel;
    private String name;
    private Double salarioBase;

    public Trabalho() {
    }

    public Trabalho(NivelTrabalho nivel, String name, Double salarioBase) {
        this.nivel = nivel;
        this.name = name;
        this.salarioBase = salarioBase;
    }

}
