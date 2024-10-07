package se.deved;

public class Main {
    public static void main(String[] args) {
        Player player = new Player();

        // Utan abstraction
        // player.level += 5;
        // player.experience += 10;

        // Med abstraction
        player.addExperience(5);

        BankAccount account = new BankAccount();
        // Utan abstraction
        // account.balance += 5;
        // SEND MAIL

        // Med abstraction
        account.deposit(5);

        BigInventory bigInventory = new BigInventory();

        addSomeItems(bigInventory);
        addSomeItems(new SmallInventory());
    }

    public static void addSomeItems(Inventory inventory) {
        inventory.addItem("Boll");
        inventory.addItem("Tandkräm");
    }

    // OOP
    // Flexibilitet
    // Objekt ska ansvara för sig själva
    // Användbarhet

    // 1. Abstraction
    // 2. Encapsulation
    // 3. Inheritance
    // 4. Polymorphism
}