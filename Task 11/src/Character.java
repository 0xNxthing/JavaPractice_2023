import java.util.HashMap;
import java.util.Map;

public class Character implements Cloneable{
    private String name;
    private String type;
    private Map<String, Integer> attributes;

    public Character(String name, String type) {
        this.name = name;
        this.type = type;
        this.attributes = new HashMap<>();
    }

    public void setAttribute(String attributeName, int value) {
        attributes.put(attributeName, value);
    }

    public void displayCharacter() {
        System.out.println("Имя: " + name);
        System.out.println("Тип: " + type);
        System.out.println("Характеристики:");
        for (Map.Entry<String, Integer> entry : attributes.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public Character clone() {
        try {
            Character clone = (Character) super.clone();
            clone.attributes = new HashMap<>(this.attributes);
            return clone;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }
}
