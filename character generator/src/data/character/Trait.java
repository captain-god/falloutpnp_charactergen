package data.character;

/**
 * The Traits in Game.
 */
public enum Trait {
    FAST_METABOLISM("Fast Metabolism",
            "Your metabolic rate is twice normal. This means that you are much less resistant to radiation and poison, but your body heals faster. You get a 2 point bonus to Healing Rate, but your Radiation and Poison Resistance start at 0% (racial modifiers are added later). Robots cannot choose this trait.",
            "+2 Healing rate; 0% base RAD/POISON resistance", new Race[]{Race.ROBOT}),

    BRUISER("Bruiser",
            "A little slower, but a little bigger. You may not hit as often, but they will feel it when you do! Your total action points are lowered, but your Strength is increased. You get a 2 point bonus to Strength, but loose 2 Action Points.",
            "+2 STR, -2 AP"),

    SMALL_FRAME("Small Frame",
            "You are not quite as big as everyone else, but that never slowed you down. You can't carry as much, but you are more agile. You get a 1 point bonus to Agility, but your Carry Weight is only 15 lbs X Strength.",
            "+1 AGI, Carry Weight reduced"),

    ONE_HANDER("One-Hander",
            "One of your hands is very dominant. You excel with single-handed weapons, but two-handed weapons cause a problem. You have a 40% penalty to hit with two-handed weapons, but get a 20% bonus to hit with weapons that only require one hand. Animals cannot choose this trait.",
            "-40% to 2-Handed weapons, +20% to 1-handed weapons", new Race[]{Race.DEATHCLAW, Race.DOG} ),

    FINESSE("Finesse",
            "Your attacks show a lot of finesse. You don't do as much damage, but you cause more critical hits. All of your attacks lose 30% of their damage (after reductions are made for Damage Resistance, etc.) but you gain a 10% bonus to Critical Chance.",
            "-30% damage, +10% Crit"),

    KAMIKAZE("Kamikaze",
            "By not paying attention to any threats, you can act a lot faster in a turn. This lowers your Armor Class to just what you are wearing, but you sequence much faster in a combat turn. You have no natural Armor Class (Armor Class is 12 therefore 0 regardless of Agility). You must wear armor to get an Armor Class. Your sequence gets a 5 point bonus.",
            "AC = Just armor, +5 Sequence"),

    HEAVY_HANDED("Heavy Handed",
            "You swing harder, not better. Your attacks are very brutal, but lack finesse. You rarely cause a good critical hit, but you always do more melee damage. You get a 4 point bonus to Melee Damage, but your critical hits do 30% less damage, and are 30% less likely to cripple a limb or cause unconsciousness. ",
            "+4 Melee Damage, -30% Crit Damage, -30% to cripple limbs"),

    FAST_SHOT("Fast Shot",
            "You don't have time for a targeted attack, because you attack faster than normal people. It costs you one less action point to use a weapon. You cannot perform targeted shots, but all weapons take one less action point to use. Note that the Fast Shot trait has no effect on HtH or Melee attacks. Animals cannot choose this trait.",
            "-1AP per shot, Cannot target shots", new Race[]{Race.DEATHCLAW, Race.DOG}),

    BLOODY_MESS("Bloody Mess",
            "By some strange twist of fate, people around you die violently. You always see the worst way a person can die. This does not mean you kill them any faster or slower, but when they do die, it will be dramatic. Just how dramatic is up to the Gamemaster.",
            "Everything dies horribly"),

    JINXED("Jinxed",
            "The good thing is that everyone around you has more critical failures in combat. The bad thing is: so do you! If you, a member of your party, or a non-player character have a failure in combat, there is a greater likelihood the failure will be upgraded (downgraded?) to a critical failure. Critical failures are bad: weapons explode, you may hit the wrong target, you could lose part of your turn, or any number of bad things. Failures are 50% more likely to become critical failures around the character or anyone else in combat.",
            "50% chance to turn failure to critical failure to all around you"),

    GOOD_NATURED("Good Natured",
            "You studied less-combative skills as you were growing up. Your combat skills start at a lower level, but First Aid, Doctor, Speech, and Barter are substantially improved. Those skills get a 20% bonus. You get a 10% penalty to starting combat skills (Small Guns, Big Guns, Energy Weapons, Unarmed, and Melee Weapons). This is a one-time bonus. Animals and robots cannot choose this trait.",
            "+20% First Aid, Doctor, Speech, Barter; -10% Small Guns, Big Guns, Energy Weapons, Unarmed, and Melee Weapons",  new Race[]{Race.DEATHCLAW, Race.DOG, Race.ROBOT}),

    CHEM_RELIANT("Chem Reliant",
            "You are more easily addicted to chems. Your chance to be addicted is twice normal, but you recover in half the time from their ill effects. Robots cannot choose this trait.",
            "Half recovery time from chems, twice as likely to become addicted",  new Race[]{Race.ROBOT}),

    CHEM_RESISTANT("Chem Resistant",
            "Chems only effect you half as long as normal, but your chance to be addicted is only 50% the normal amount. Robots cannot choose this trait.",
            "Half chem effect length, half addiction chance", new Race[]{Race.ROBOT}),

    NIGHT_PERSON("Night Person",
            "As a night-time person, you are more awake when the sun goes down. Your Intelligence and Perception are improved at night but are dulled during the day. You get a 1 point penalty to these Statistics from 0601 to 1800, and a 1 point bonus to these Stats from 1801 to 0600. Robots cannot choose this trait. Note that the bonus cannot take IN and PE above the character’s racial maximum or below the character’s racial minimum.",
            "+1 INT & PER from 18:01-06:00; -1 INT & PER from 6:01-18:00", new Race[]{Race.ROBOT}),

    SKILLED("Skilled",
            "Since you spend more time improving your skills than a normal person, you gain more skill points. The tradeoff is that you do not gain as many extra abilities. You will gain a perk at one level higher than normal. For example, if you normally gained a perk every 4 levels, you would now gain a perk every 5 levels. You will get an additional 5 skill points per new experience level, and a one-time bonus of +10% to your skills when you begin the game. Animals and robots cannot choose this trait.",
            "+10% to all skills, +5 Skill points per level; Perk Every n Levels +1", new Race[]{Race.ROBOT, Race.DOG, Race.DEATHCLAW}),

    GIFTED("Gifted",
            "You have more innate abilities than most, so you have not spent as much time honing your skills. Your statistics are better than the average person, but your skills are lacking. All Stats get a 1- point bonus, but all skills get a 10% penalty and you receive 5 less Skill Points per level. Robots cannot choose this trait.",
            "All Stats +1; All skills -10%, -5 skill points per level", new Race[]{Race.ROBOT}),

    SEX_APPEAL("Sex Appeal",
            "This trait increases your chances of having a good reaction with members of the opposite sex. Unfortunately, this trait tends to annoy members of your own sex. Jealous twits. When interacting with members of the opposite sex, you gain a 1 point bonus to Charisma for reactions only. When making Speech and Barter rolls, you gain a 40% bonus for each. When interacting with members of the same sex, you have a 1 point penalty to Charisma for reactions only and have a 40% penalty to both Speech and Barter rolls. Only humans can choose this trait. ",
            "+1 CHA for reactions, +40% Speech and Barter for Opposite Sex; -1 CHA & -40% Speech and Barter for Same Sex", new Race[]{Race.ROBOT, Race.DOG, Race.DEATHCLAW, Race.GHOUL, Race.HALF_MUTANT, Race.SUPER_MUTANT}),

    GLOWING_ONE("Glowing One",
            "Extreme radiation exposure has left you glowing in the dark. Your glow eliminates modifiers from light in combat for both you and your enemies. In addition, you gain a +50% bonus to Radiation Resistance, but everyone around you takes 10 rads per hour. Only Ghouls can choose this trait.",
            "+50% Rad Resist, Removes Light modifiers in combat; +10 rads to all around you", new Race[]{Race.ROBOT, Race.DOG, Race.DEATHCLAW, Race.HUMAN, Race.HALF_MUTANT, Race.SUPER_MUTANT}),

    TECH_WIZARD("Tech Wizard",
            "You spent your formative years hunched over a bench learning all about the way things work. The trouble is that you’ve ruined your eyes! You get a +15% bonus to Science, Repair, and Lockpick skills, but you lose 1 Perception. Deathclaws and Dogs cannot choose this trait.",
            "+15% Science, Repair, Lockpick; -1 PER", new Race[]{Race.DEATHCLAW, Race.DOG}),

    FEAR_THE_REAPER("Fear the Reaper",
            "You have cheated death! You gain perks as if you were a human, but you are now on death’s short list. This means that once a month, you must roll against Luck or else drop dead. Only Ghouls can choose this trait.",
            "Human Perk Rate; Once a month, roll to survive", new Race[]{Race.ROBOT, Race.DOG, Race.DEATHCLAW, Race.HUMAN, Race.HALF_MUTANT, Race.SUPER_MUTANT}),

    VAT_SKIN("Vat Skin",
            "Other people find you hideous to behold and disgusting to smell after your \"dip\" in the FEV vats. The good news is that you gain a +10 bonus to your Armor Class thanks to your extra-tough skin. The bad news is that everyone within ten hexes of your location, friend and foe, suffers a 1-point penalty to Perception (you are unaffected). Only Mutants can choose this trait.",
            "+10AC; -1 PER to all around", new Race[]{Race.ROBOT, Race.DOG, Race.DEATHCLAW, Race.HUMAN, Race.HALF_MUTANT, Race.GHOUL}),

    HAM_FISTED("Ham Fisted",
            "Genetic engineering – or dumb luck – has endowed you with huge hands. You get a \"free\" tag skill in Unarmed, but you suffer a -20% penalty to Small Guns, First Aid, Doctor, Repair, Science, and Lockpick Skills (these numbers cannot go below 0%). Only Mutants can choose this trait.",
            "+25% Unarmed; -20% Small Guns, First Aid, Doctor, Repair, Science, and Lockpick", new Race[]{Race.ROBOT, Race.DOG, Race.DEATHCLAW, Race.HUMAN, Race.HALF_MUTANT, Race.GHOUL}),

    DOMESTICATED("Domesticated",
            "You have undergone extensive house training and have developed an above-average Intelligence. Your INT is raised by 1, and can even go above your racial maximum, but you get a –2 penalty to Melee Damage. Only Deathclaws and Dogs can choose this trait.",
            "+1 INT; -2 Melee Damage", new Race[]{Race.ROBOT, Race.SUPER_MUTANT, Race.HUMAN, Race.HALF_MUTANT, Race.GHOUL}),

    RABID("Rabid",
            "You are a half-crazed, feral killing machine. You are not affected by crippled limbs (blindness still affects you normally), and every time you kill an opponent in combat, you get 5 more APs that round. Chems, including stimpaks, have no effect on you. Only Deathclaws and Dogs can choose this trait.",
            "+5 AP per kill (that round), no effect from crippled limbs; no effect from chems", new Race[]{Race.ROBOT, Race.SUPER_MUTANT, Race.HUMAN, Race.HALF_MUTANT, Race.GHOUL}),

    TIGHT_NUTS("Tight Nuts",
            "This robot was built to take the knocks. You get double the base Damage Resistance to any attack, but you gain only half the Hit Points back from repairs. Only Robots can choose this trait.",
            "Double Damage Resistance; Half HP from repairs", new Race[]{Race.GHOUL, Race.DOG, Race.DEATHCLAW, Race.HUMAN, Race.HALF_MUTANT, Race.SUPER_MUTANT}),

    TARGETING_COMPUTER("Targeting Computer",
            "You have been programmed with an onboard targeting computer. All attacks cost 1 extra AP to perform, but you can always add +15% to your chance to-hit. Only Robots can choose this trait.",
            "+15% Chance-to-hit; +1 AP per attack",  new Race[]{Race.GHOUL, Race.DOG, Race.DEATHCLAW, Race.HUMAN, Race.HALF_MUTANT, Race.SUPER_MUTANT}),

    EMP_SHIELDING("EMP Shielding",
            "You have a dedicated EMP shielding system. It takes you 2 AP to move 1 hex because of your heavy equipment, but you have a 30% Resistance to all forms of EMP attack. Only Robots can choose this trait.",
            "+30% EMP resistance; +2AP per move",  new Race[]{Race.GHOUL, Race.DOG, Race.DEATHCLAW, Race.HUMAN, Race.HALF_MUTANT, Race.SUPER_MUTANT}),

    BETA_SOFTWARE("Beta Software",
            "You have been equipped with an experimental operating system and peripherals. You get 1 extra Tag Skill, but whenever using ANY tag skill, you must roll against Luck or suffer an automatic failure and, in combat, a loss of all APs for that round. Only Robots can choose this trait.",
            "+1 Tag Skill; Luck Roll to fail when using a Tag Skill",  new Race[]{Race.GHOUL, Race.DOG, Race.DEATHCLAW, Race.HUMAN, Race.HALF_MUTANT, Race.SUPER_MUTANT});

    String name;
    String description;
    String shortHandDesc;
    Race[] raceRestrict;

    Trait(String name, String description, String shortHand) {
        this.name = name;
        this.description = description;
        this.raceRestrict = null;
        this.shortHandDesc = shortHand;
    }

    Trait(String name, String description, String shortHand, Race[] restrictions) {
        this.name = name;
        this.description = description;
        this.raceRestrict = restrictions;
        this.shortHandDesc = shortHand;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getShortHandDesc() {
        return shortHandDesc;
    }

    public Race[] getRaceRestrict() {
        return raceRestrict;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
