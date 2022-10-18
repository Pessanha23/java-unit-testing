package produtopolimorfismo;

public class ProdutoInternacional extends Produto {

    private Double customsFee;

    public ProdutoInternacional(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public ProdutoInternacional() {
    }

    public Double totalPrice() {
        return getPrice() + customsFee;
    }

    @Override
    public String priceTag() {
        return getName()
                + " $ "
                + String.format("%.2f", totalPrice())
                + " (Customs fee: $ "
                + String.format("%.2f", customsFee)
                + ")";
    }
}
