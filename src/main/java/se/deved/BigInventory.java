package se.deved;

public class BigInventory extends Inventory {

    String[] items = new String[100];

    @Override
    public void addItem(String item) {
        items[0] = item;
    }

}
