package produtopolimorfismo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BancoDeDados {

    private List<Produto> produtos = new ArrayList<>();

    public String adicionar(Produto produto) {
        produtos.add(produto);

        return "Adicionado";
    }

    public String adicionar(String name, double price, char opcao, double custo, Date data) {
        String resultado = "";

        if (opcao == 'i') {
            ProdutoInternacional prod = new ProdutoInternacional(name, price, custo);
            produtos.add(prod);
            resultado = "Sucesso Internacional";
        }
        if (opcao == 'u') {
            ProdutoUsado prod = new ProdutoUsado(name, price, data);
            produtos.add(prod);
            resultado = "Sucesso Usado";
        }
        if (opcao == 'c') {
            Produto prod = new Produto(name, price);
            produtos.add(prod);
            resultado = "Sucesso Comum";
        }
        return resultado;
    }

    public String imprimirTudo() {
        String vazia = "";
        for (Produto produto : produtos) {
           vazia = vazia.concat(produto.priceTag()) ;
        }
        return vazia;
    }
}
