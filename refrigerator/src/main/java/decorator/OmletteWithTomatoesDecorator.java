package decorator;

public class OmletteWithTomatoesDecorator extends OmletteDecorator {

    public OmletteWithTomatoesDecorator(Omlette omlette) {
        super(omlette);
    }

    @Override
    public String make(){
        return omlette.make() + addTomatoes();
    }

    private String addTomatoes() {
        return " + add 2 tomatoes";
    }
}
