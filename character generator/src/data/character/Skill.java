package data.character;

/**
 * The reason I chose to make this enum basically into a struct is because
 * everything on here is true no matter what, and it's going to be referenced a lot.
 * I basically wanted a struct.
 */

public enum Skill {
    SMALL_GUNS("Small Guns", 5, 4, Statistic.AGILITY),
    BIG_GUNS("Big Guns", 0, 2, Statistic.AGILITY),
    ENERGY_WEAPONS("Energy Weapons", 0, 2, Statistic.AGILITY),
    UNARMED("Unarmed", 30, 2, Statistic.AGILITY, Statistic.STRENGTH),
    MELEE_WEAPONS("Melee Weapons", 20, 2, Statistic.AGILITY, Statistic.STRENGTH),
    THROWING("Throwing", 0, 4, Statistic.AGILITY),
    FIRST_AID("First Aid", 0, 2, Statistic.PERCEPTION, Statistic.ENDURANCE),
    DOCTOR("Doctor", 5, 1, Statistic.INTELLIGENCE, Statistic.PERCEPTION),
    SNEAK("Sneak", 5, 3, Statistic.AGILITY),
    LOCKPICK("Lockpick", 10, 1, Statistic.AGILITY, Statistic.PERCEPTION),
    STEAL("Steal", 0, 3, Statistic.AGILITY),
    TRAPS("Traps", 10, 1, Statistic.AGILITY, Statistic.PERCEPTION),
    SCIENCE("Science", 0, 4, Statistic.INTELLIGENCE),
    REPAIR("Repair", 0, 3, Statistic.INTELLIGENCE),
    PILOT("Pilot", 0, 2, Statistic.AGILITY, Statistic.PERCEPTION),
    SPEECH("Speech", 0, 5, Statistic.CHARISMA),
    BARTER("Barter", 0, 4, Statistic.CHARISMA),
    GAMBLING("Gambling", 0, 5, Statistic.LUCK),
    OUTDOORSMAN("Outdoorsman", 0, 2, Statistic.ENDURANCE, Statistic.INTELLIGENCE);

    String commonName;
    int base;
    int multiplier;
    Statistic primaryStat;
    Statistic secondaryStat = null;

    Skill(String commonName, int base, int multiplier, Statistic primaryStat) {
        this.commonName = commonName;
        this.base = base;
        this.multiplier = multiplier;
        this.primaryStat = primaryStat;
    }

    Skill(String commonName, int base, int multiplier, Statistic primaryStat, Statistic secondaryStat) {
        this.commonName = commonName;
        this.base = base;
        this.multiplier = multiplier;
        this.primaryStat = primaryStat;
        this.secondaryStat = secondaryStat;
    }

    public String getCommonName() {
        return commonName;
    }

    public int getBase() {
        return base;
    }

    public int getMultiplier() {
        return multiplier;
    }

    public Statistic getPrimaryStat() {
        return primaryStat;
    }

    public Statistic getSecondaryStat() {
        return secondaryStat;
    }
}
