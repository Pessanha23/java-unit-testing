package enumdesign;

import org.junit.Assert;
import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Month;

public class AppTesteTrabalho {

    @Test
    public void teste_1() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        BancoDeDadosTrabalho banco = new BancoDeDadosTrabalho();
        Trabalhador trab = new Trabalhador("Alex", NivelTrabalho.Plenor, 1200.00, new Departamento("Design"));
        String resultado = String.valueOf(trab.getNivel());
        String expectativa = "Plenor";

        Assert.assertEquals(expectativa, resultado);
    }

    @Test
    public void teste_2() throws ParseException {
        BancoDeDadosTrabalho banco = new BancoDeDadosTrabalho();
        Trabalhador trab = new Trabalhador("Alex", NivelTrabalho.Plenor, 1200.0, new Departamento("Design"));

        String resultado = trab.getName();
        String expectativa = "Alex";

        Assert.assertEquals(expectativa, resultado);
    }

    @Test
    public void teste_3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        BancoDeDadosTrabalho banco = new BancoDeDadosTrabalho();
        Trabalhador trab = new Trabalhador("Alex", NivelTrabalho.Plenor, 1200.0, new Departamento("Design"));


        ContratoHora contrat = new ContratoHora(sdf.parse("20/08/2018"), 50.0, 20);
        ContratoHora contrat2 = new ContratoHora(sdf.parse("13/06/2018"), 30.0, 18);
        ContratoHora contrat3 = new ContratoHora(sdf.parse("25/08/2018"), 80.0, 10);


        trab.adicionarContrato(contrat);
        trab.adicionarContrato(contrat2);
        trab.adicionarContrato(contrat3);

        banco.adicionar2(trab);

        String resultado = banco.impirimitudo(2018, Month.AUGUST);
        String expectativa = "Nome: " + "Alex" + '\n' +
                "Departamento: " + "Design" + '\n' +
                "Income for 08/2018: " + "3000.0";

        String expectativa2 = """
                Nome: Alex
                Departamento: Design
                Income for 08/2018: 3000.0
                
                """;
        Assert.assertEquals(expectativa2, resultado);
    }

    @Test
    public void teste_4() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        BancoDeDadosTrabalho banco = new BancoDeDadosTrabalho();
        Trabalhador trab = new Trabalhador("Alex", NivelTrabalho.Plenor, 1200.0, new Departamento("Design"));
        Trabalhador trab2 = new Trabalhador("Felipe", NivelTrabalho.Senior, 5500.0, new Departamento("Financeiro"));
        Trabalhador trab3 = new Trabalhador("Diega", NivelTrabalho.Junior, 200.0, new Departamento("Almoxarifado"));
        Trabalhador trab4 = new Trabalhador("Matheus", NivelTrabalho.Senior, 8000.0, new Departamento("O Pardal"));

        ContratoHora contrat = new ContratoHora(sdf.parse("20/08/2018"), 50.0, 20);
        ContratoHora contrat2 = new ContratoHora(sdf.parse("13/06/2018"), 30.0, 18);
        ContratoHora contrat3 = new ContratoHora(sdf.parse("25/08/2018"), 80.0, 10);

        trab.adicionarContrato(contrat);
        trab.adicionarContrato(contrat2);
        trab.adicionarContrato(contrat3);

        ContratoHora contrat4 = new ContratoHora(sdf.parse("20/08/2018"), 70.0, 20);
        ContratoHora contrat5 = new ContratoHora(sdf.parse("13/06/2018"), 10.0, 18);
        ContratoHora contrat6 = new ContratoHora(sdf.parse("25/08/2018"), 70.0, 10);

        trab2.adicionarContrato(contrat4);
        trab2.adicionarContrato(contrat5);
        trab2.adicionarContrato(contrat6);

        ContratoHora contrat7 = new ContratoHora(sdf.parse("20/10/2020"), 90.0, 20);
        ContratoHora contrat8 = new ContratoHora(sdf.parse("13/08/2018"), 50.0, 18);
        ContratoHora contrat9 = new ContratoHora(sdf.parse("25/10/2020"), 90.0, 10);

        trab3.adicionarContrato(contrat7);
        trab3.adicionarContrato(contrat8);
        trab3.adicionarContrato(contrat9);

        ContratoHora contrat10 = new ContratoHora(sdf.parse("20/10/2020"), 90.0, 20);
        ContratoHora contrat11 = new ContratoHora(sdf.parse("13/08/2018"), 200.0, 10);
        ContratoHora contrat12 = new ContratoHora(sdf.parse("25/10/2020"), 90.0, 10);

        trab4.adicionarContrato(contrat10);
        trab4.adicionarContrato(contrat11);
        trab4.adicionarContrato(contrat12);

        banco.adicionar2(trab);
        banco.adicionar2(trab2);
        banco.adicionar2(trab3);
        banco.adicionar2(trab4);

        String resultado = banco.impirimitudo(2018, Month.AUGUST);

        String expectativa2 = """
               Nome: Alex
               Departamento: Design
               Income for 08/2018: 3000.0
               
               Nome: Felipe
               Departamento: Financeiro
               Income for 08/2018: 7600.0
               
               Nome: Diega
               Departamento: Almoxarifado
               Income for 08/2018: 1100.0
               
               Nome: Matheus
               Departamento: O Pardal
               Income for 08/2018: 10000.0
               
               """;

        Assert.assertEquals(expectativa2, resultado);
    }
}
