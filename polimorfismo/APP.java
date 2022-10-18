package polimorfismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class APP {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Funcionario> list = new ArrayList<>();

        System.out.println("Entre com a quantidade de funcionarios? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("FUNCIONARIO #" + (i + 1));
            sc.nextLine();
            System.out.println("Prestador de Servico? (y/n)");
            String opcao = sc.nextLine();

            System.out.println();
            System.out.println("Nome: ");
            String nome = sc.nextLine();
            System.out.println("Horas: ");
            int horas = sc.nextInt();
            System.out.println("Valor por hora: ");
            double extra = sc.nextDouble();

            if ("y".equalsIgnoreCase(opcao)) {
                System.out.println("VALOR ADICIONAL: ");
                double amais = sc.nextDouble();
                Funcionario func = new PrestadorDeServico(nome, horas, extra, amais);
                list.add(func);
            } else {
                Funcionario func = new Funcionario(nome, horas, extra);
                list.add(func);
            }
        }

        System.out.println();
        System.out.println("PAGAMENTOS: ");
        for (Funcionario func : list) {
            System.out.println(func.getNome() + " -$ " + String.format("%.2f", func.pagamento()));
        }

        sc.close();
    }
}
