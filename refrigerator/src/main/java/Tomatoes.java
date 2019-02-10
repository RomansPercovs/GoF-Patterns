public class Tomatoes implements Product {

    private final int pieces;
    private final ExpireDate expireDate;

    public Tomatoes(int pieces, ExpireDate expireDate) {
        this.pieces = pieces;
        this.expireDate = expireDate;
    }


    public void showExpireDate() {
        System.out.println("Expire date: " + expireDate.getDay()+ "." + expireDate.getMonth() + "." + expireDate.getYear());
    }

    public void showAmount() {
        System.out.println("Tomatoes left: " + pieces);
    }

    public int getPieces() {
        return pieces;
    }

    public ExpireDate getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return "Tomatoes";
    }
}
