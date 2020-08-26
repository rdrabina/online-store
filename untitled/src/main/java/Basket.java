import java.util.*;

public class Basket {

    private Map<Product, Integer> products = new HashMap<>();

    public void addProductToBasket(Product product) {
        Integer numberOfProductsInBasket = products.get(product);

        if (Objects.isNull(numberOfProductsInBasket)) {
            numberOfProductsInBasket = 0;
        }

        products.put(product, ++numberOfProductsInBasket);
    }

    public Map<Product, Integer> getProducts() {
        return products;
    }
}
