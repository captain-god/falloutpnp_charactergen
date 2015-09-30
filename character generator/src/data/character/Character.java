package data.character;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Character Class:
 * Character class contains all things about the character that you'd need to play the game.
 * This version is quite crude. Beware.
 */
public class Character {
    /**
     * Enum for all possible genders in the game.
     * Not worth putting into another file, as it's basically only used here.
     */
    public enum Gender {
        MALE, FEMALE, OTHER, NONE
        ;
        @Override
        public String toString(){
            char[] c = name().toLowerCase().toCharArray();
            c[0] = java.lang.Character.toUpperCase(c[0]);
            return new String(c);
        }
    }

    //Class Attribtues
    //Some attributes are defaulted to prevent nulls and to give the generator some "replace me" text.
    ///Required Input
    private String name = "Bad Company";
    private String backstory = "I was born; a shotgun in my hands";
    private Gender gender = Gender.FEMALE;
    private int XP = 0;
    private int karma = 0;
    private int caps = 0;
    private int age = 15;
    private int[] SPECIAL = new int[]{5,5,5,5,5,5,5};
    private Race race = Race.HUMAN;
    private ArrayList<Trait> traits = new ArrayList<>(2);
    private ArrayList<Skill> tagSkills = new ArrayList<>();
    private HashMap<Skill, Integer> skills = new HashMap<>();
    private ArrayList<Perk> perks = new ArrayList<>();

    //the rest is calculated from input
    /**
     * Quickie-Character generator - takes all the required information and makes a character from that.
     * all other values to be assigned by setters.
     * Namely for testing purposes and rapid-character generation.
     * @param name The character's Name
     * @param SPECIAL The array of character statistics. Indexes = Statistic.STATISTICNAME.index, FYI.
     */
    public Character(String name, int[] SPECIAL) {
        this.name = name;
        this.SPECIAL = SPECIAL;
        calculateSkillScores();
    }

    /**
     * Full Character Generator
     * @param name the characters name
     * @param backstory The character's backstory
     * @param gender The character's Gender
     * @param XP The amount of XP the character has
     * @param karma The Character's karma
     * @param caps How many caps the character has
     * @param age Character's Age
     * @param SPECIAL The array of numbers representing the character's SPECIAL
     * @param race The character's Race
     * @param traits The list of Traits the character has (3, unless the character has a perk or trait noting otherwise)
     * @param tagSkills The tagged skills the character has
     * @param skills The hashmap of Skills, Values
     * @param perks The list of perks
     */
    public Character(String name, String backstory, Gender gender, int XP, int karma, int caps, int age, int[] SPECIAL,
                     Race race, ArrayList<Trait> traits, ArrayList<Skill> tagSkills, HashMap<Skill, Integer> skills,
                     ArrayList<Perk> perks) {
        this.name = name;
        this.backstory = backstory;
        this.gender = gender;
        this.XP = XP;
        this.karma = karma;
        this.caps = caps;
        this.age = age;
        this.SPECIAL = SPECIAL;
        this.race = race;
        this.traits = traits;
        this.tagSkills = tagSkills;
        this.skills = skills;
        this.perks = perks;
    }

    public void setSkills(HashMap<Skill, Integer> skills) {
        this.skills = skills;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Perk> getPerks() {
        return perks;
    }

    public void setPerks(ArrayList<Perk> perks) {
        this.perks = perks;
    }

    public void addPerk(Perk toAdd){
        this.perks.add(toAdd);
    }
    public String getBackstory() {
        return backstory;
    }

    public void setBackstory(String backstory) {
        this.backstory = backstory;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getXP() {
        return XP;
    }

    public void setXP(int XP) {
        this.XP = XP;
    }

    public int getKarma() {
        return karma;
    }

    public void setKarma(int karma) {
        this.karma = karma;
    }

    public int[] getSPECIAL() {
        return SPECIAL;
    }

    public void setSPECIAL(int[] SPECIAL) {
        this.SPECIAL = SPECIAL;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public List<Trait> getTraits() {
        return traits;
    }

    public void setTraits(ArrayList<Trait> traits) {
        this.traits = traits;
    }

    public void addTrait(Trait toAdd){
        if (traits.size() < 2){
            this.traits.add(toAdd);
        }
    }

    public List<Skill> getTagSkills() {
        return tagSkills;
    }

    public void setTagSkills(ArrayList<Skill> tagSkills) {
        this.tagSkills = tagSkills;
    }

    public HashMap<Skill, Integer> getSkills(){
        return skills;
    }

    public void setCaps(int caps){
        this.caps = caps;
    }

    public int getCaps(){
        return caps;
    }

    public boolean isValidCharacter(){
        boolean isValid = true;

        //perform some checks here

        return isValid;
    }

    public void calculateSkillScores(){
        for(Skill s : Skill.values()){
            int multiplier = (s.getSecondaryStat() != null) ? this.SPECIAL[s.getPrimaryStat().index] + this.SPECIAL[s.getSecondaryStat().index] : this.SPECIAL[s.getPrimaryStat().index] ;
            int skillScore = s.getBase() + (s.getMultiplier() * (multiplier)) + (tagSkills.contains(s) ? 20:0);

            skills.put(s, skillScore);
        }
        calculateSkillScoresPostTraits();
        calculateSkillScoresPostPerks();
    }

    private void calculateSkillScoresPostTraits() {

    }

    private void calculateSkillScoresPostPerks() {

    }

    public int calculateSkillPoints(){
        return 5 + (2 * SPECIAL[Statistic.INTELLIGENCE.index]);
    }

    public int calculateSkillCost(int score){
        if (score > 200) return 6;
        else if (score <= 200 && score > 175) return 5;
        else if (score <= 175 && score > 150) return 4;
        else if (score <= 150 && score > 125) return 3;
        else if (score <= 125 && score > 100) return 2;
        else return 1;
    }

    public int calculateHitPoints(){
        //calculate hp for any race
        int hp = 15 + (SPECIAL[Statistic.STRENGTH.index] + (2 * SPECIAL[Statistic.ENDURANCE.index]));
        //add bonus if deathclaw or super mutant
        hp = hp + ((this.race == Race.DEATHCLAW || this.race == Race.SUPER_MUTANT)? 2 * calculateLevel():0);
        //add bonus for each level
        hp = hp + (3 + (this.SPECIAL[Statistic.ENDURANCE.index]/2) * calculateLevel());
        return hp;
    }

    public int calculateLevel(){
        if (XP == 0) return 1; //dont check; they're level 1.
        double threshold = 0;
        double tempXP = XP; //it has a rounding error if you don't make it a double.
        for (int i = 1; i < XP;i++){
            if (tempXP / ((threshold == 0)?1:threshold) <= 1.0){
                return i;
            }
            threshold = threshold + (i * 1000);
        }
        return -1; //if this is reached, I've done something wrong.
    }

    public int calculateArmorClass(){
        int ac = SPECIAL[Statistic.AGILITY.index];
        ac += (traits.contains(Trait.VAT_SKIN)?10:0);
        if (traits.contains(Trait.KAMIKAZE)){
            return 0;
        }
        return ac;
    }

    public int calculateActionPoints(){
        int ap = 0;
        switch (SPECIAL[Statistic.AGILITY.index]){
            case 1:
                ap += 5;
            case 2:
            case 3:
                ap += 6;
            case 4:
            case 5:
                ap += 7;
            case 6:
            case 7:
                ap += 8;
            case 8:
            case 9:
                ap += 9;
            case 10:
                ap += 10;
            default:
                ap += 10;
        }
        if (traits.contains(Trait.BRUISER)){
            ap -= 2;
        }
        return ap;
    }

    public int calculateCarryWeight(){
        if (traits.contains(Trait.SMALL_FRAME)){
            return 25 + (15 * SPECIAL[Statistic.STRENGTH.index]);
        }
        return 25 + (25 * SPECIAL[Statistic.STRENGTH.index]);
    }

    public int calculateMeleeDamage(){
        int damage;
        if (SPECIAL[Statistic.STRENGTH.index] < 7) damage = 1;
        else {
            damage = SPECIAL[Statistic.STRENGTH.index] - 5;
        }
        damage += ((race == Race.DEATHCLAW)?5:0);
        damage += (traits.contains(Trait.HEAVY_HANDED)?4:0);
        damage -= (traits.contains(Trait.DOMESTICATED)?-2:0);
        return damage;
    }

    public int calculatePoisonResistance(){
        int pResist = 5 * SPECIAL[Statistic.ENDURANCE.index];
        if (traits.contains(Trait.FAST_METABOLISM)){
            pResist = 0;
        }
        if (race == Race.GHOUL) pResist += 30;
        else if (race == Race.SUPER_MUTANT) pResist += 20;
        else if (race == Race.HALF_MUTANT) pResist += 15;
        else if (race == Race.ROBOT) pResist = -1;

        return pResist;
    }

    public int calculateRadiationResistance(){
        int radResist = 2 * SPECIAL[Statistic.ENDURANCE.index];
        if (race == Race.GHOUL) radResist += 80;
        else if (race == Race.SUPER_MUTANT) radResist += 50;
        else if (race == Race.HALF_MUTANT) radResist += 15;
        else if (race == Race.ROBOT) radResist = -1;

        return radResist;
    }

    public int[] calculateGasResistance(){
        int gas[] = new int[]{0,0};
        if (race == Race.DEATHCLAW) gas[1] = 40;
        else if (race == Race.ROBOT) {
            gas[0] = -1;
            gas[1] = -1;
        }

        return gas;
    }

    public int calculateElectricalDamageResistance(){
        int elecDamage = 0;
        if (race == Race.HUMAN) elecDamage = 30;
        else if (race == Race.DOG) elecDamage = 50;
        else if (race == Race.ROBOT) elecDamage = 40;
        else if (race == Race.SUPER_MUTANT) elecDamage = 25;

        return elecDamage;
    }

    public int calculateDamageResistance(){
        int damResistance = 0;
        if (race == Race.ROBOT || race == Race.DEATHCLAW) damResistance = 40;
        else if (race == Race.SUPER_MUTANT) damResistance = 25;
        return damResistance;
    }

    public int calculateSequence(){
        return 2 * SPECIAL[Statistic.PERCEPTION.index];
    }

    public int calculateHealingRate(){
        int hr = 0;
        if (SPECIAL[Statistic.ENDURANCE.index] < 6) {
            hr += 1;
        }
        else if (SPECIAL[Statistic.ENDURANCE.index] < 9 && SPECIAL[Statistic.ENDURANCE.index] >= 6 ){
            hr += 2;
        }
        else if (SPECIAL[Statistic.ENDURANCE.index] >= 9 ) {
            hr += 3;
        }
        else if (race == Race.ROBOT) return 0;
        if (traits.contains(Trait.FAST_METABOLISM)){
            hr += 2;
        }
        return hr;
    }

    public int calculateCritChance(){
        return SPECIAL[Statistic.LUCK.index];
    }

    @Override
    public String toString(){

        String header = String.format("%-21s \nLevel %-2s %s %s\nCaps: %-23s\nXP: %-7s | HP: %-3s | AP: %-2s\nCrit Chance:%-2s | Sequence: %s\nHealing Rate: %s\n",
                name, calculateLevel(),race.getName(),((gender==Gender.MALE || gender == Gender.FEMALE)?gender.toString():""),
                caps, XP, calculateHitPoints(), calculateActionPoints(), calculateCritChance(), calculateSequence(),calculateHealingRate());

        String special = "=SPECIAL======================\n";
        for (Statistic s: Statistic.values()){
            special = special + String.format("%-3s: %-23s||\n",s.toString().substring(0, 3),SPECIAL[s.index]);
            //include logic to check for enhancements from armor or gear
        }

        calculateSkillScores(); //recalculate
        String skillset = "=SKILLS=======================\n(* TAGGED SKILLS)           ||\n";
        for (HashMap.Entry<Skill, Integer> entry : skills.entrySet()){
            skillset = skillset + String.format("%-19s %3s%-5s||\n",entry.getKey().getName(), entry.getValue(),(tagSkills.contains(entry.getKey()) ? "(*)" : ""));
        }

        String resistances = "=RESISTANCES==================\n";
        resistances = String.format("%sAC :%-8s|| DAM:%-9s||\nPOISON:%-5s|| GAS:%s/%-7s||\nElectric:%-3s|| RAD:%-9s||\n",
                resistances,calculateArmorClass(),calculateDamageResistance(),calculatePoisonResistance(),
                calculateGasResistance()[0],calculateGasResistance()[1], calculateElectricalDamageResistance(), calculateRadiationResistance());

        String inventory = "=INVENTORY====================\n";
        inventory = inventory + "(Carrying Weight = " + calculateCarryWeight() + ")\n";
        inventory = inventory + "===AMMUNITION===\n";
        //for items in inventory do this thing
        inventory = inventory + "===WEAPONS======\n";
        //for items in inventory do this thing
        inventory = inventory + "===AID==========\n";
        //for items in inventory do this thing
        inventory = inventory + "===CLOTHING=====\n";
        //for items in inventory do this thing
        inventory = inventory + "===MISC=========\n";
        //for items in inventory do this thing

        String trait = "=TRAITS=======================\n";
        for (Trait t : traits){
            trait = String.format("%s%-28s\n  %s\n",trait,t.name,t.getShortHandDesc());
        }

        String perk = "=PERKS========================\n";
        for (Perk p : perks){
            perk = String.format("%s%s\n",perk,p.getName());
        }
        return String.format("%s%s%s%s%s%s%s",header, special, skillset, resistances, inventory, trait, perk).toUpperCase();
    }
}