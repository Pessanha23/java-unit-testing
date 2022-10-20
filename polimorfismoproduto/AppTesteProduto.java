package polimorfismoproduto;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

public  class AppTesteProduto {

    @Test
    public void a() {
        Assert.assertTrue(true);
    }
    @Test
    public void teste_1() {

        BancoDeDados banco = new BancoDeDados();
        String resultado = banco.adicionar("Tablet",300.0,'i',20.00,null);
        String expectativa = "Sucesso Internacional";

        Assert.assertEquals(expectativa,resultado);
    }

    @Test
    public void teste_2() {
        Locale.setDefault(Locale.US);

        BancoDeDados banco = new BancoDeDados();
        String resultado = banco.adicionar("Tablet",300.0,'i',20.00,null);
        String resultado2 = banco.imprimirTudo();
        String expectativa = "Tablet $ 320.00 (Customs fee: $ 20.00)";

        Assert.assertEquals(expectativa, resultado2);
    }
    @Test
    public void teste_3 () {

    }
}

