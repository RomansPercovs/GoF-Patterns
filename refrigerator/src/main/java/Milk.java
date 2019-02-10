public class Milk implements Product {

    private final int litres;
    private final ExpireDate expireDate;

    public Milk(int litres, ExpireDate expireDate) {
        this.litres = litres;
        this.expireDate = expireDate;
    }

    public void showExpireDate() {
        System.out.println("Expire date: " + expireDate.getDay()+ "." + expireDate.getMonth() + "." + expireDate.getYear());
    }

    public void showAmount() {
        System.out.println("Litres of milk left: " + litres);
    }

    public int getLitres() {
        return litres;
    }

    public ExpireDate getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return "Milk";
    }
}
