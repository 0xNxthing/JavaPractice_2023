// Реализуйте систему на основании паттерна "Прототип" управления игровыми персонажами, позволяющую клонировать персонажей с разными характеристиками.

public class Main {
    public static void main(String[] args) {
        Character warriorPrototype = new Character("Воин", "Ближний");
        warriorPrototype.setAttribute("Сила", 10);
        warriorPrototype.setAttribute("Броня", 5);

        Character warrior1 = warriorPrototype.clone();
        warrior1.setAttribute("Сила", 12);

        Character warrior2 = warriorPrototype.clone();
        warrior2.setAttribute("Броня", 8);

        System.out.println("Персонаж 1:");
        warrior1.displayCharacter();

        System.out.println("\nПерсонаж 2:");
        warrior2.displayCharacter();
    }
}