package polimorfismocontribuinte;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDadosContribuinte {


    List<Contribuinte> list = new ArrayList<>();

    public String adicionar(String name, Double rendaAnual, Double gastosSaude, Integer numeroFuncionario, char opcao) {
        String resultado = "";

        if (opcao == 'i') {
            PessoaFisica fisica = new PessoaFisica(name, rendaAnual, gastosSaude);
            list.add(fisica);
            resultado = "SUCESSO FISICA";
        } else {
            PessoaJuridica pj = new PessoaJuridica(name, rendaAnual, numeroFuncionario);
            list.add(pj);
            resultado = "SUCESSO JURIDICA";
        }
            return resultado;
    }

    public String imprimiTudo() {
        String vazia = "";
        double total = 0;
        for (Contribuinte contribuinte : list) {
            vazia += contribuinte.getName() + ": $ "  + String.format("%.2f",contribuinte.renda()) + '\n';
        }
        for (Contribuinte contribuinte : list) {
            total += contribuinte.renda();
        }

        return  "TAXES PAID:" + '\n' +
                vazia + '\n' +
                "TOTAL DAS RENDAS: " + total;
    }
}

