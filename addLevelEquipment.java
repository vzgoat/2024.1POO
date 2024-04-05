import java.util.Scanner;

class Character {
    String name;
    int level;
    int experience;
    Equipment equipment;

    public Character(String name, Equipment equipment) {
        this.name = name;
        this.level = 1;
        this.experience = 0;
        this.equipment = equipment;
    }

    public void levelUp(int experienceGained) {
        this.experience += experienceGained;
        if (this.experience >= 100) {
            this.level++;
            this.experience -= 100;
            this.equipment.levelUp();
            System.out.println("Congratulations, " + this.name + "! You have reached level " + this.level + ".");
        }
    }

    public void displayStatus() {
        System.out.println("Name: " + this.name);
        System.out.println("Level: " + this.level);
        System.out.println("Experience: " + this.experience + "/100");
        this.equipment.displayStatus();
    }
}

class Equipment {
    String name;
    int level;

    public Equipment(String name) {
        this.name = name;
        this.level = 1;
    }

    public void levelUp() {
        this.level++;
        System.out.println("The equipment " + this.name + " has reached level " + this.level + ".");
    }

    public void displayStatus() {
        System.out.println("Equipment: " + this.name);
        System.out.println("Equipment Level: " + this.level);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the character's name:");
        String characterName = scanner.nextLine();

        System.out.println("Enter the equipment's name:");
        String equipmentName = scanner.nextLine();

        Equipment equipment = new Equipment(equipmentName);
        Character character = new Character(characterName, equipment);

        character.displayStatus();

        // Simulating leveling up
        character.levelUp(25);
        character.displayStatus();

        character.levelUp(75);
        character.displayStatus();

        scanner.close();
    }
}
