import java.math.BigDecimal;

public class DiscountCalculation {

    //move methods to class -> command design pattern
    public BigDecimal calculateWithNoDiscount(Product product, Integer numberOfThisProductInBasket) {
        return product.getPrice().multiply(BigDecimal.valueOf(numberOfThisProductInBasket));
    }

    public BigDecimal calculateDollDiscount(Product product, Integer numberOfThisProductInBasket) {
        int discountFactor = numberOfThisProductInBasket / 3;
        return product.getPrice().multiply(BigDecimal.valueOf(numberOfThisProductInBasket - discountFactor));
    }

}
