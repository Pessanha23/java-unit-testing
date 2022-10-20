package polimorfismoareas;

import org.junit.Assert;
import org.junit.Test;

public class AppTesteArea {


    @Test
    public void a() {
        Assert.assertTrue(true);
    }

    @Test
    public void teste_1() {
        BancoDeDados banco = new BancoDeDados();
        Double resultado = banco.adicionar(Color.BLACK, 4.0, 5.0, null, 'r');
        Double expectativa = 20.00;

        Assert.assertEquals(20.00, resultado, 0);
    }

    @Test
    public void test_2() {
        BancoDeDados banco = new BancoDeDados();
        Double resultado = banco.adicionar(Color.RED, null, null, 3.0, 'c');
        Double expectativa = 28.274333882308138;
        Assert.assertEquals(28.274333882308138, resultado, 0);
    }

    @Test
    public void teste_3() {
        BancoDeDados banco = new BancoDeDados();
        Double resultado = banco.adicionar(Color.RED, null, null, 3.0, 'c');
        String resultado2 = banco.imprimiTudo();
        String expectativa = "28.274333882308138";

        Assert.assertEquals(expectativa,resultado2);
    }
    @Test
    public void teste_4(){
        BancoDeDados banco = new BancoDeDados();
        Double resultado = banco.adicionar(Color.BLACK, 4.0, 5.0, null, 'r');
        String resultado2 = banco.imprimiTudo();
        String expectativa = "20.0";

        Assert.assertEquals(expectativa,resultado2);
    }
}
