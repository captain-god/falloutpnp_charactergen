package data.character;

/**
 * Created by doug on 9/4/2015.
 */
public enum Perk {
    YES("YES", "OH MY GOD", "+99 Luck");


    String name;
    String description;
    String shorthand;

    Perk(String name, String desc, String shorthand){
        this.name = name;
        this.description = desc;
        this.shorthand = shorthand;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getShorthand() {
        return shorthand;
    }

}
