import java.math.BigDecimal;
import java.util.Map;
import java.util.Objects;

public class ShoppingService {

    public Basket addProductToBasket(Basket basket, Product product) {
        basket.addProductToBasket(product);

        return basket;
    }

    public BigDecimal calculatePrice(Basket basket) {
        if (Objects.isNull(basket)) {
            return BigDecimal.valueOf(0);
        }

        Map<Product, Integer> products = basket.getProducts();
        return products.keySet().stream()
                .map(product -> product.getDiscountCommand().execute(key, products.get(key))
                .reduce(BigDecimal.ZERO, BigDecimal::add);

//        return basket.getProducts()
//                .stream()
//                .map(Product::getPrice)
//                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }

//    private BigDecimal getPrice

}
