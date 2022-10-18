package pardalheranca;

public class Fusca extends Carro {


    public Fusca(Double litro) {
        super(litro);
    }

    @Override
    public void acelerar() {
        if (litro < 1) {
            System.out.println("TANQUE VAZIO");
        }
        if (litro >= 1) {
            litro = litro - 1;
        }
    }
}
