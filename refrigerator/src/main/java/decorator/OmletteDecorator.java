package decorator;

public abstract class OmletteDecorator implements Omlette {

    protected Omlette omlette;

    public OmletteDecorator(Omlette omlette) {
        this.omlette = omlette;
    }

    @Override
    public String make() {
        return omlette.make();
    }
}
