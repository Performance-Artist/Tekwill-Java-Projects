public class DiscountBill extends GroceryBill {
    private boolean preferred;

    public DiscountBill(String employee, boolean preferred) {
        super(employee);
        this.preferred = preferred;
    }

    public int getDiscountCount() {
        if(preferred) {
            int count = 0;
            for (Item item : items) {
                if(item.getDiscount() != 0) {
                    count++;
                }
            }
            return count;
        } else {
            return 0;
        }
    }
}