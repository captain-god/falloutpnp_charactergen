package data.character;

/**
 * Perks in the game. God fucking help me.
 */
public enum Perk {
    ACTION_BOY("Action Boy (or Girl)", "Your character knows how to make the most out of every moment. For each rank of this perk, the character gets an additional Action Point each combat turn.",
            2, "", "+1AP")

    ;
    String name;
    String description;
    String shorthand;
    String requirements;
    int ranks;

    Perk(String name, String desc, int ranks, String requirements, String shorthand){
        this.name = name;
        this.description = desc;
        this.ranks = ranks;
        this.shorthand = shorthand;
        this.requirements = requirements;
    }

    public String getRequirements() {
        return requirements;
    }

    public int getRanks() {
        return ranks;
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

    @Override
    public String toString(){
        return this.name;
    }
}
