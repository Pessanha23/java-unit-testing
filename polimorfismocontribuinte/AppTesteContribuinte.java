package polimorfismocontribuinte;

import org.junit.Assert;
import org.junit.Test;

public class AppTesteContribuinte {

    @Test
    public void teste_1() {
       BancoDeDadosContribuinte banco = new BancoDeDadosContribuinte();
       String resultado = banco.adicionar("Alex", 50000.0, 2000.0, null, 'i');
       String expectativa = "SUCESSO FISICA";

        Assert.assertEquals(expectativa, resultado);
    }
        // Duvida sobre adicionar mais de um ou dois nesse teste e validar
    @Test
    public void teste_2() {
        BancoDeDadosContribuinte banco = new BancoDeDadosContribuinte();
        String resultado = banco.adicionar("SoftTech", 400000.0, null,25,'c');
        String expectativa = "SUCESSO JURIDICA";

        Assert.assertEquals(expectativa,resultado);
    }
    @Test
    public void teste_3() {
        BancoDeDadosContribuinte banco = new BancoDeDadosContribuinte();
        String personagem1 = banco.adicionar("Alex", 50000.0, 2000.0, null, 'i');
        String personagem2 = banco.adicionar("SoftTech", 400000.0, null,25,'c');
        String personagem3 = banco.adicionar("Bob", 120000.0, 1000.0,null,'i');
        String resultado = banco.imprimiTudo();
        String expectativa = "TAXES PAID:\n" +
                "Alex: $ 11500,00\n" +
                "SoftTech: $ 56000,00\n" +
                "Bob: $ 29500,00\n" +
                "\n" +
                "TOTAL DAS RENDAS: 97000.0";

        Assert.assertEquals(expectativa,resultado);
    }
}
