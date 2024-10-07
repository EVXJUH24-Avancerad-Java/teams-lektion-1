package se.deved;

public class Player {

    // Encapsulation
    private int level = 1;
    private int experience = 0;

    public void addExperience(int xp) {
        this.experience += xp;
        if (this.experience >= 10) {
            this.level++;
            this.experience = 0;
        }
    }
}
