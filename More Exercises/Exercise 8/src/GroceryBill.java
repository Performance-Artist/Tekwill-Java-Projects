public class GroceryBill {
    private String employee;
    protected Item[] items = new Item[1000];
    private int lastItemAdded = 0;

    public GroceryBill(String employee) {
        this.employee = employee;
    }

    public void add(Item item) {
        items[lastItemAdded] = item;
        lastItemAdded++;
    }

    public double getTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice();
        }
        return total;
    }

    public void printRecipe() {
        for (Item item : items) {
            System.out.println(item.getName());
        }
    }
}