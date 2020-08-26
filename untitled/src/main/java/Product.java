import java.math.BigDecimal;
import java.util.Objects;

public final class Product {

    private final String name;
    private final BigDecimal price;
    private final DiscountCommand discountCommand;

    public BigDecimal getPrice() {
        return price;
    }

    public Product(String name, BigDecimal price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name) &&
                Objects.equals(price, product.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

}
