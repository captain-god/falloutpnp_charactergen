package brain;

import data.character.*;
import data.character.Character;

import java.util.ArrayList;

/**
 * The brains of the operation.
 */
public class Main {
    public static void main (String[] args){
        /**
         * Check through the passed args to see if they want to launch the console version
         */
        for(String arg : args){
            if (arg.equalsIgnoreCase("consoleui")){
                //new ConsoleCharacterBuilder();
            }
            else {
                //new Launcher();
            }
        }

        Character jimmy = new Character("Jimmy Baker",new int[]{5,5,8,5,5,9,5}); //should be okay.

        ArrayList<Skill> tags = new ArrayList<Skill>();
        tags.add(Skill.BARTER);
        tags.add(Skill.BIG_GUNS);
        tags.add(Skill.SNEAK);

        jimmy.setTagSkills(tags);
        jimmy.setXP(15000);
        jimmy.setGender(Character.Gender.MALE);
        jimmy.setRace(Race.ROBOT);
        jimmy.addTrait(Trait.BLOODY_MESS);
        jimmy.addTrait(Trait.CHEM_RESISTANT);
        jimmy.addPerk(Perk.YES);

        System.out.println(jimmy.toString());
    }
}
