package decorator;

import decorator.Omlette;

public class SimpleOmlette implements Omlette {

    @Override
    public String make() {
        return "factory.factory.Milk and 3 eggs";
    }
}
