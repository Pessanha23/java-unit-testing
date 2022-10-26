package enumdesign;

import java.util.Date;

public class ContratoHora {

    private Date date;
    private Double valorHora;
    private Integer hora;

    public ContratoHora() {
    }

    public ContratoHora(Date date, Double valorHora, Integer hora) {
        this.date = date;
        this.valorHora = valorHora;
        this.hora = hora;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double valorTotal() {
        return hora * valorHora;
    }
}
