package factory;

public class Ham implements Product {

    private final int slices;
    private final ExpireDate expireDate;

    public Ham(int slices, ExpireDate expireDate) {
        this.slices = slices;
        this.expireDate = expireDate;
    }

    public void showExpireDate() {
        System.out.println("Expire date: " + expireDate.getDay()+ "." + expireDate.getMonth() + "." + expireDate.getYear());
    }

    public void showAmount() {
        System.out.println("Ham slices left: " + slices);
    }

    public int getSlices() {
        return slices;
    }

    public ExpireDate getExpireDate() {
        return expireDate;
    }

    @Override
    public String toString() {
        return "Ham";
    }
}
