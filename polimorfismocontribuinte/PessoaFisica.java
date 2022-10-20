package polimorfismocontribuinte;

public class PessoaFisica extends Contribuinte{
    private Double gastosSaude;


    public PessoaFisica() {
    }

    public PessoaFisica(String name, Double rendaAnual, Double gastosSaude) {
        super(name, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    @Override
    public double renda() {
        double rendafisica = 0;
        if (getRendaAnual() < 20000 && gastosSaude > 0) {
            rendafisica = (getRendaAnual() * 0.15) - (gastosSaude * 0.5);
        }
        if (getRendaAnual() >= 20000) {
            rendafisica = (getRendaAnual() * 0.25) - (gastosSaude * 0.5);
        }
        return rendafisica;
    }
}
