package heranca;

public class Ferrari extends Carro {


    public Ferrari(Double litro) {
        super(litro);
    }

    @Override
    public void acelerar() {
        super.acelerar();
        if (litro < 5) {
            System.out.println("CARRO COM TANQUE VAZIO");
        }
        if (litro >= 5) {
            litro = litro - 5;
        }
    }
}
