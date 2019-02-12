package factory;

public class Eggs implements Product {

    private final int pieces;
    private final ExpireDate expireDate;

    public Eggs(int pieces, ExpireDate expireDate) {
        this.pieces = pieces;
        this.expireDate = expireDate;
    }

    public void showExpireDate() {
        System.out.println("Expire date: " + expireDate.getDay()+ "." + expireDate.getMonth() + "." + expireDate.getYear());
    }

    public void showAmount() {
        System.out.println("Amount of eggs left: " + pieces);
    }

    public int getPieces() {
        return pieces;
    }

    public ExpireDate getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return "factory.factory.Eggs";
    }
}
