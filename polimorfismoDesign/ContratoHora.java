package polimorfismoDesign;

import java.util.Date;

public class ContratoHora extends Trabalho{

    private Date date;
    private Double valorHora;
    private Integer hora;

    public ContratoHora() {
    }

    public ContratoHora(NivelTrabalho nivel, String name, Double salarioBase, Date date, Double valorHora, Integer hora) {
        super(nivel, name, salarioBase);
        this.date = date;
        this.valorHora = valorHora;
        this.hora = hora;
    }

    public double valorTotal() {
        return hora * valorHora;
    }
}
