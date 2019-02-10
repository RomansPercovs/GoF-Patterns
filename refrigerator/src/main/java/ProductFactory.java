import java.util.HashMap;
import java.util.Map;

public class ProductFactory {

    private Map<Products, Product> products = new HashMap<>();

    // Flyweight
    public Map<Products, Product> getFlyweight(final Products product, final int amount, final int expireYear, final int expireMonth,
                                      final int expireDay) {
        switch (product) {
            case MILK:
                if(products.containsKey(Products.MILK)) {
                    products.get(Products.MILK);
                }else{
                    products.put(Products.MILK, createMilk(amount, expireYear, expireMonth, expireDay));
                }
                break;
            case EGGS:
                if(products.containsKey(Products.EGGS)) {
                    products.get(Products.EGGS);
                }else{
                    products.put(Products.EGGS, createEggs(amount, expireYear, expireMonth, expireDay));
                }
                break;
            case HAM:
                if(products.containsKey(Products.HAM)) {
                    products.get(Products.HAM);
                }else{
                    products.put(Products.HAM, createHam(amount, expireYear, expireMonth, expireDay));
                }
                break;
            case TOMATOES:
                if(products.containsKey(Products.TOMATOES)) {
                    products.get(Products.TOMATOES);
                }else{
                    products.put(Products.TOMATOES, createTomatoes(amount, expireYear, expireMonth, expireDay));
                }
                break;
            default:
                System.out.println("Refrigerator already contains" + product);
        }
        return products;
    }

    public Map<Products, Product> getProducts() {
        return products;
    }

    private Product createMilk(final int litres, final int expireYear, final int expireMonth, final int expireDay) {
        return new Milk(litres, new ExpireDate(expireYear,expireMonth,expireDay));
    }

    private Product createEggs(final int amount, final int expireYear, final int expireMonth, final int expireDay) {
        return new Eggs(amount, new ExpireDate(expireYear,expireMonth,expireDay));
    }

    private Product createHam(final int slices, final int expireYear, final int expireMonth, final int expireDay) {
        return new Ham(slices, new ExpireDate(expireYear,expireMonth,expireDay));
    }

    private Product createTomatoes(final int amount, final int expireYear, final int expireMonth, final int expireDay) {
        return new Tomatoes(amount, new ExpireDate(expireYear,expireMonth,expireDay));
    }
}
