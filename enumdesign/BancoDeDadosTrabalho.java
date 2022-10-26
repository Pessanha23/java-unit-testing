package enumdesign;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.*;

public class BancoDeDadosTrabalho {

    private List<Trabalhador> trabalhadores = new ArrayList<>();


    public String adicionar2(Trabalhador trabalhador) {
        trabalhadores.add(trabalhador);

        return "Sucesso Adicionado";
    }

    public String impirimitudo(int periodoAno, Month mes) throws ParseException {
        String nome = "";
        String departamento = "";
        double tudo = 0;
        double tudao = 0;

            for (Trabalhador trabalhadore : trabalhadores) {
                for (int i = 0; i < trabalhadore.getContratos().size(); i++) {
                    ContratoHora contratoHora1 = trabalhadore.getContratos().get(i);
                    double receba = contratoHora1.valorTotal();

                    //Data padrão
                    LocalDate localDate = contratoHora1.getDate().toInstant()
                            .atZone(ZoneId.systemDefault())
                            .toLocalDate();
                    // Padrão melhor, visivelmente para outra pessoa visualizar e operar seu código referente as datas
                    int ano = localDate.getYear();
                    Month mes2 = localDate.getMonth();

                    if (ano == periodoAno && mes2 == mes) {
                        tudo += receba;
                    }
                }

                tudao = trabalhadore.getSalarioBase() + tudo;
                Departamento departamento1 = trabalhadore.getDepartamento();
                String nome1 = departamento1.getNome();

                nome += "Nome: " + trabalhadore.getName() + '\n'
                        + "Departamento: " + nome1 + '\n'
                        + "Income for 08/2018: " + tudao + '\n'
                        + '\n';
                // reset  variavel tudo
                tudo = 0;
            }
            return nome;

    }

}
