package enumdesign;

import java.util.ArrayList;
import java.util.List;

public class Trabalhador {

    private String name;
    private NivelTrabalho nivel;
    private Double salarioBase;

    private Departamento departamento;
    private List<ContratoHora> contrat = new ArrayList<>();

    public Trabalhador() {
    }

    public Trabalhador(String name, NivelTrabalho nivel, Double salarioBase, Departamento departamento) {
        this.name = name;
        this.nivel = nivel;
        this.salarioBase = salarioBase;
        this.departamento = departamento;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NivelTrabalho getNivel() {
        return nivel;
    }

    public void setNivel(NivelTrabalho nivel) {
        this.nivel = nivel;
    }

    public Double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(Double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }

    public List<ContratoHora> getContratos() {
        return contrat;
    }


    public void adicionarContrato(ContratoHora contr) {
        contrat.add(contr);
    }

    public void removerContrato(ContratoHora contr) {
        contrat.remove(contr);
    }


}
