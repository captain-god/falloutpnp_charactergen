package data.character;

/**
 * Quick Enum of all the Statistics (SPECIAL) in the game.
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

    Statistic(int i) {
        this.index = i;
    }

}