package polimorfismoDesign;

public class Departamento extends Trabalho{

    private String name;

    public Departamento() {
    }

    public Departamento(NivelTrabalho nivel, String name, Double salarioBase, String name1) {
        super(nivel, name, salarioBase);
        this.name = name1;
    }
}
