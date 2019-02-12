package decorator;

public class OmletteWithMeatDecorator extends OmletteDecorator {

    public OmletteWithMeatDecorator(Omlette omlette) {
        super(omlette);
    }

    @Override
    public String make(){
        return omlette.make() + addHam();
    }

    private String addHam() {
        return " + 5 slices of ham";
    }
}
