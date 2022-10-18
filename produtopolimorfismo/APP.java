package produtopolimorfismo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class APP {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto> list = new ArrayList<>();
        System.out.println("Enter the number of products: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1) + "data:");
            sc.nextLine();
            System.out.println("Common, used or imported (c/u/i)?");
            char opcao = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            if (opcao == 'i') {
                System.out.println("Customs fee: ");
                double custo = sc.nextDouble();
                ProdutoInternacional prod = new ProdutoInternacional(name, price, custo);
                list.add(prod);
            }
            if (opcao == 'u'){
                System.out.println("Manufacture date (DD/MM/YYYY): ");
                Date data = sdf.parse(sc.next());
                ProdutoUsado prod = new ProdutoUsado(name, price, data);
                list.add(prod);
            }
            if (opcao == 'c'){
                Produto prod = new Produto(name, price);
                list.add(prod);
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Produto prod : list) {
            System.out.println(prod.priceTag());
        }

        sc.close();
    }
}
