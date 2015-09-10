package data.character;

/**
 * I wish Enums would enumerate. But that would be too much, wouldn't it?
 */
public enum Statistic {
    STRENGTH(0),
    PERCEPTION(1),
    ENDURANCE(2),
    CHARISMA(3),
    INTELLIGENCE(4),
    AGILITY(5),
    LUCK(6);

    int index;

    Statistic(int i){
        this.index = i;
    }
}