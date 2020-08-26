import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        ShoppingService shoppingService = new ShoppingService();
        Basket basket = new Basket();
        Product product1 = new Product("Car", BigDecimal.valueOf(3.50));
        Product product2 = new Product("Doll", BigDecimal.valueOf(20.00));

        shoppingService.addProductToBasket(basket, product1);
        shoppingService.addProductToBasket(basket, product1);
        shoppingService.addProductToBasket(basket, product1);
        shoppingService.addProductToBasket(basket, product2);
        shoppingService.addProductToBasket(basket, product2);
        shoppingService.addProductToBasket(basket, product2);
        shoppingService.addProductToBasket(basket, product2);
//        shoppingService.addProductToBasket(basket, null);

        BigDecimal bigDecimal = shoppingService.calculatePrice(basket);
        System.out.println(bigDecimal);
    }

}
