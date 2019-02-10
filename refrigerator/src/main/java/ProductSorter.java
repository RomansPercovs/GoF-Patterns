import java.util.Map;

public abstract class ProductSorter {

    public Map<Products, Product> sortProducts(final Map<Products, Product> products){
        System.out.println("Sorting by date");
        System.out.println("Sorting order: " + getSortRule());
        return sort(products);
    }

    abstract Map<Products, Product> sort(final Map<Products, Product> input);

    abstract String getSortRule();
}
