package template;

import factory.Products;
import factory.Product;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.stream.Collectors.toMap;

public class AscendingProductSorter extends ProductSorter {
    Map<Products, Product> sort(Map<Products, Product> input) {
        return input.entrySet()
                .stream()
                .sorted(Map.Entry.<Products, Product>comparingByValue(outerComparator))
                .collect(toMap(Map.Entry::getKey, Map.Entry::getValue, (o1, o2) -> o1, LinkedHashMap::new));
    }

    private Comparator<Product> outerComparator = (o1, o2) -> {
        if(getLocalDate(o1).isAfter(getLocalDate(o2))){
            return 1;
        }else if(getLocalDate(o1).isBefore(getLocalDate(o2))){
            return -1;
        }else{
            return getLocalDate(o1).compareTo(getLocalDate(o2));
        }
    };

    private LocalDate getLocalDate(Product o1) {
        return o1.getExpireDate().getLocalDate();
    }

    String getSortRule() {
        return "Ascending";
    }
}
