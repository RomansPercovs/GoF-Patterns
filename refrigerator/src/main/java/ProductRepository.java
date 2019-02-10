import java.util.Map;

public class ProductRepository implements Aggregate{

    private Map<Products, Product> listOfProducts;

    ProductRepository(Map<Products, Product> products) {
        this.listOfProducts = products;
    }

    @Override
    public Iterator getIterator() {
        return new ProductMakeIterator();
    }

    private class ProductMakeIterator implements Iterator{

        private final Object[] arrayOfProducts = listOfProducts.values().toArray();
        private int index = 0;

        @Override
        public boolean hasNext() {
            if(index < arrayOfProducts.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return arrayOfProducts[index++];
        }
    }
}
