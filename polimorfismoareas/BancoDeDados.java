package polimorfismoareas;

import java.util.ArrayList;
import java.util.List;

public class BancoDeDados {

    private List<Shape> list = new ArrayList<>();

    public Double adicionar (Color color, Double width, Double height, Double radius, char opcao) {

        double resultado = 0;

        if (opcao == 'r') {
            Rectangle rec = new Rectangle(color, width, height);
            list.add(rec);
            resultado = rec.area();
        } else {
            Circle circ = new Circle(color,radius);
            list.add(circ);
            resultado = circ.area();
        }
        return resultado;
    }

    public String imprimiTudo(){
        String vazia = "";
        for (Shape shape : list) {
            vazia = vazia.concat(String.valueOf(shape.area()));
        }
        return vazia;
    }
}
