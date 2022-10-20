package polimorfismocontribuinte;

public class PessoaJuridica extends Contribuinte{
    private Integer numeroFuncionario;

    public PessoaJuridica() {
    }

    public PessoaJuridica(String name, Double rendaAnual, Integer numeroFuncionario) {
        super(name, rendaAnual);
        this.numeroFuncionario = numeroFuncionario;
    }

    @Override
    public double renda() {
        double rendajuridica = 0;
        if (numeroFuncionario > 10) {
            rendajuridica = getRendaAnual() * 0.14;
        }
        if (numeroFuncionario < 10) {
            rendajuridica = getRendaAnual() * 0.16;
        }

        return rendajuridica;
    }
}
