package data.character;

/**
 * All perks in the game
 */
public enum Perk {
    ACTION_BOY("Action Boy (or Girl)",
            "Your character knows how to make the most out of every moment. For each rank of this perk, the character gets an additional Action Point each combat turn.",
            2,
            "Agility 5",
            12),

    ADRENALINE_RUSH("Adrenaline Rush",
            "You have a fear of death that allows you to fight harder when you are wounded. When your character's HP drop below 50% of their maximum, your character gains a +1 Strength bonus, but cannot go above the racial maximum.",
            1,
            "Strength 1-9",
            6),

    ANIMAL_FRIEND("Animal Friend",
            "Your character spends a lot of time with animals. A LOT of time. Animals will not attack one of their friends, unless the animal is threatened or attacked first.",
            1,
            "5 Intelligence, 25% Outdoorsman",
            9),

    AWARENESS("Awareness",
            "You know exactly what is going on in combat. This perk gives you more information when you examine a critter. You can see their exact number of hit points and the weapon they are armed with, if any.",
            1,
            "Perception 5",
            3),

    BEND_THE_RULES("Bend the Rules",
            "With this perk, the next time your character gets to choose a perk, they can ignore all restrictions except for race. You rule!",
            1,
            "Luck 6",
            16),

    BETTER_CRITICALS("Better Criticals",
            "Your shots somehow hurt more than usual. The critical hits you cause in combat are more devastating. When you do a critical hit that does not kill outright, your hit does 150% normal damage (in addition to any damage bonuses already gained). In addition, your chance to cause damage to a limb is increased by 50%. If you critically hit for 40 points of damage, for instance, you would instead deal a whopping 60 points. OUCH! Mutants cannot choose this perk.",
            1,
            "Perception 6, Luck 6, Agility 4",
            9, new Race[]{Race.HALF_MUTANT, Race.SUPER_MUTANT}),

    BLUFF_MASTER("Bluff Master",
            "You are the king or queen of smooth talking. Whenever you are caught stealing, your character can automatically talk his or her way out of the situation.",
            1,
            "Charisma 3",
            8),

    BONE_HEAD("Bone Head",
            "You have a very thick skull, just like your mother always told you. With the first rank of this perk, you get a 50% chance to avoid being knocked unconscious. With the second rank, that chance increases to 75%.  ",
            2,
            "Strength 7",
            7),

    BONSAI("Bonsai",
            "Through careful nurturing, you have a small fruit tree growing out of your head. Now you have a steady supply of fruit! Only Ghouls can choose this perk.",
            1,
            "Outdoorsman 50%, Science 40%",
            12, new Race[]{Race.DEATHCLAW, Race.DOG, Race.HALF_MUTANT, Race.HUMAN, Race.ROBOT, Race.SUPER_MUTANT}),

    BONUS_HTH_ATTACKS("Bonus HtH Attacks",
            "Your character has watched Jackie Chan and Bruce Lee and managed to learn a thing or two. Your character can make more hand-to-hand or melee style attacks per combat turn with this perk. The AP cost to use a HtH or Melee attack is reduced by 1.",
            1,
            "Agility 6",
            15),

    BONUS_HTH_DAMAGE("Bonus HtH Damage",
            "You have learned a special technique to deal more damage with your fists and melee weapons. Your character gains a +2 bonus to Melee Damage for each level of this perk.",
            3,
            "Agility 6, Strength 6",
            3),

    BONUS_MOVE("Bonus Move",
            "You have learned to take longer strides in combat. For each level of this perk, your character can move 2 more hexes in combat. The first two hexes a character moves do no cost any APs.",
            2,
            "Agility 5",
            6),

    BONUS_RANGED_DAMAGE("Bonus Ranged Damage",
            "You know just where to hit to make it hurt more. Every bullet that successfully hits the target does +2 damage for each rank of this perk. Deathclaws and Dogs cannot choose this perk.",
            2,
            "Agility 6, Luck 6",
            6, new Race[]{Race.DEATHCLAW, Race.DOG}),

    BONUS_RATE_OF_FIRE("Bonus Rate of Fire",
            "Your trigger finger is a little faster than normal. Each ranged weapon attack costs one less AP to perform. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Agility 7, Intelligence 6, Perception 6",
            15, new Race[]{Race.DEATHCLAW, Race.DOG}),

    BRACING("Bracing",
            "You know how to brace large weapons while you are standing. When applicable, you get a bonus for using a tripod just by holding a weapon in your hands. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Strength 7, Big Guns 80%",
            4, new Race[]{Race.DEATHCLAW, Race.DOG}),

    BREAK_THE_RULES("Break the Rules",
            "When you choose this perk, you may choose any perk next time, regardless of requirements or race.",
            1,
            "Luck 6",
            20),

    BROWN_NOSER("Brown Noser",
            "You’ve learned how to suck up to your superiors. You get +1 Charisma for reaction roles when dealing with authority figures for each rank of this perk. Dogs and Deathclaws cannot brownnose.",
            2,
            "Charisma 5, Intelligence 6",
            2, new Race[]{Race.DEATHCLAW, Race.DOG}),

    BRUTISH_HULK("Brutish Hulk",
            "With this perk, you gain double the normal hit points when you go up a level. Only Deathclaws can choose this perk.",
            1,
            "Strength 7, Endurance 5",
            8, new Race[]{Race.GHOUL, Race.DOG, Race.HALF_MUTANT, Race.HUMAN, Race.ROBOT, Race.SUPER_MUTANT}),

    CANCEROUS_GROWTH("Cancerous Growth",
            "The radiation has mutated you so badly that you thrive in the wastes. You gain a +2 bonus to your healing rate, and can regenerate a crippled limb in 48 hours. Only Ghouls can choose this perk.",
            1,
            "Strength < 7",
            6, new Race[]{Race.DEATHCLAW, Race.DOG, Race.HALF_MUTANT, Race.HUMAN, Race.ROBOT, Race.SUPER_MUTANT}),

    CAUTIOUS_NATURE("Cautious Nature",
            "Your character has learned to be wary of the world around him. His Perception is increased by +3 when determining where he begins in random encounters.",
            1,
            "Perception 6",
            3),

    COMPREHENSION("Comprehension",
            "Looks like all those study skills courses paid off. With this perk, your character gains 50% to the number of skill points earned when reading educational books. Books that normally give you 10 skill points now give you 15. Dogs cannot choose this perk.",
            1,
            "Intelligence 6",
            3, new Race[]{Race.DOG}),

    CRAZY_BOMBER("Crazy Bomber",
            "Your luck with explosives is legendary. Characters with this perk who fail to set an explosive properly will know immediately, and that explosive will not go off or detonate – it will be reset, so the Bomber can try again. Dogs and Deathclaws cannot choose this perk.",
            1,
            "Traps 60%, Intelligence 6",
            9, new Race[]{Race.DEATHCLAW, Race.DOG}),

    CULT_OF_PERSONALITY("Cult of Personality",
            "Everybody likes your character. EVERYBODY. Instead of getting a negative modifier for the \"wrong\" kind of karma, you get a positive modifier. Bad people like good characters, and good people like bad characters. Good still likes good and bad still likes bad. Go figure.",
            1,
            "Charisma 10",
            12),

    DEATH_SENSE("Death Sense",
            "Your senses are very well developed. You gain a +2 bonus to Perception in the dark, and penalties for light levels are reduced by 50%. You also gain a 25% bonus to detecting enemies who are sneaking around. Only Deathclaws can choose this perk.",
            1,
            "Intelligence 5",
            4, new Race[]{Race.GHOUL, Race.DOG, Race.HALF_MUTANT, Race.HUMAN, Race.ROBOT, Race.SUPER_MUTANT}),

    DEMOLITION_EXPERT("Demolition Expert",
            "Your character has learned how to handle explosives like a pro. For characters that like to blow things up, there is nothing better than this perk. Explosives set by this character do 50% more damage and will always detonate on time. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Agility 4, Traps 90%",
            9, new Race[]{Race.DEATHCLAW, Race.DOG}),

    DIE_HARD("Die Hard",
            "You won’t go down without a fight! When your hit points drop below 20% of your maximum, you get an additional 10% Damage Resistance to all types of damage.",
            1,
            "First Aid 40%, Endurance 6",
            2),

    DIVINE_FAVOR("Divine Favor",
            "A higher power has taken a liking to you. Anytime a roll fails, you have the option of re-rolling, but you must accept the results of the re-roll (you cannot re-roll a re-roll). You can only invoke your higher power once in a 24- hour period.",
            1,
            "Charisma 8",
            14),

    DODGER("Dodger",
            "Your character has developed into a slippery little rat. This perk will lower your character's chances to be hit in combat. Armor class increases by +5 for each rank.",
            2,
            "Agility 6",
            9),

    DRIVING_CITY_STYLE("Driving City Style",
            "Your character has picked up some aggressive driving techniques. She gets a onetime 30% bonus to Pilot skill, and any rolls against stats made while behind the wheel get a +2 bonus. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Perception 6, Agility 5",
            9, new Race[]{Race.DEATHCLAW, Race.DOG}),

    DRUNKEN_MASTER("Drunken Master",
            "As a “child of the bottle,” you fight better when you are drunk. You receive a 20% bonus to your Unarmed skill when under the influence of alcohol.",
            1,
            "Unarmed 60%",
            3),

    EARLIER_SEQUENCE("Earlier Sequence",
            "Your character will be more likely to move before other characters and critters in combat with this perk. Each rank of this perk increases a character's Sequence by +2.",
            3,
            "Perception 6",
            3),

    EDUCATED("Educated",
            "Every rank of this perk will add +2 skill points when your character gains a level.",
            3,
            "Intelligence 6",
            6),

    EMPATHY("Empathy",
            "You get a better idea of what to say to an NPC with this perk. The GM must warn you when dialogue will be interpreted the wrong way.",
            1,
            "Perception 7, Intelligence 5",
            6),

    EXPLORER("Explorer",
            "This perk will make it more likely that your character will find those strange and interesting encounters and items. It is up to the GM to decide what those items and encounters are.",
            1,
            "Requirements",
            9),

    FASTER_HEALING("Faster Healing",
            "Characters with faster healing just plain heal faster. For each rank of this perk, your character gains a +2 to the Healing Rate statistic.",
            3,
            "Endurance 6",
            3),

    FLEXIBLE("Flexible",
            "Years of exercise have made you very supple. It only takes you 1 AP to change your stance in combat.",
            1,
            "Sneak 60%, Agility 6",
            4),

    FLOWER_CHILD("Flower Child",
            "With this perk, you are much less likely to be addicted to chems (50% less likely, actually) and suffer ½ the withdrawal time as a normal person.",
            1,
            "5 Endurance",
            9),

    FORTUNE_FINDER("Fortune Finder",
            "Random encounters yield more money. Of course, you have to take it off the cold, dead bodies of your opponents. How much money is up to the GM.",
            1,
            "Luck 8",
            6),

    GAIN_AGILITY("Gain Agility",
            "Increases your Agility by +1 permanently.",
            1,
            "Agility below racial max",
            12),

    GAIN_CHARISMA("Gain Charisma",
            "Increases your Charisma by +1 permanently.",
            1,
            "Charisma below racial max",
            12),

    GAIN_ENDURANCE("Gain Endurance",
            "Increases your Endurance by +1 permanently.",
            1,
            "Endurance below racial max",
            12),

    GAIN_INTELLIGENCE("Gain Intelligence",
            "Increases your Intelligence by +1 permanently.",
            1,
            "Intelligence below racial max",
            12),

    GAIN_LUCK("Gain Luck",
            "Increases your Luck by +1 permanently.",
            1,
            "Luck below racial max",
            12),

    GAIN_PERCEPTION("Gain Perception",
            "Increases your Perception by +1 permanently.",
            1,
            "Perception below racial max",
            12),

    GAIN_STRENGTH("Gain Strength",
            "Increases your Strength by +1 permanently.",
            1,
            "Strength below racial max",
            12),

    GAMBLER("Gambler",
            "This perk adds a one-time +20% to the Gambling skill.",
            1,
            "Gambling 50",
            6),

    GHOST("Ghost",
            "In areas of darkness, or at night, characters with this perk gain +20% to their Sneak skill.",
            1,
            "Sneak 60%",
            6),

    GUNNER("Gunner",
            "You have become an expert at firing from a moving vehicle. You do not suffer the normal 10% penalty when firing from a vehicle in motion.",
            1,
            "Small Guns 40%, Agility 6",
            3),

    HARMLESS("Harmless",
            "Your character's innocent demeanor makes stealing from people a little easier. This perk grants a +20% bonus to Steal. Deathclaws cannot choose this perk.",
            1,
            "Steal 50%, Karma > 49",
            6),

    HEALER("Healer",
            "Each rank of this perk will increase the number of Hit Points healed by the use of First Aid or Doctor skills by 4-10 points (1d6 +4). The second rank adds +8-20 (2 X (1d6 +4)).",
            2,
            "Perception 7, Agility 6, Intelligence 5, First Aid 40%",
            3),

    HEAVE_HO("Heave Ho!",
            "For purposes of determining the maximum range of thrown weapons only, this perk will increase Strength by +2 for each rank.",
            3,
            "Requirements",
            6),

    HERE_AND_NOW("Here and Now",
            "With this perk, your character immediately gains enough experience points to go up to the next level. If a character chose this perk at level 9, they would gain enough experience points to go to level 10, placing them at a total of 45,001 experience points.",
            1,
            "Requirements",
            9),

    HIDE_OF_SCARS("Hide of Scars",
            "Your battle-weary flesh has hardened into an armor of its own. You gain +15% to all resistances except for fire. Only Deathclaws can choose this perk.",
            2,
            "Endurance 6",
            10, new Race[]{Race.GHOUL, Race.DOG, Race.HALF_MUTANT, Race.HUMAN, Race.ROBOT, Race.SUPER_MUTANT}),

    HIT_THE_DECK("Hit the Deck!",
            "You react very quickly to the sound of an explosive coming your way. You only take half damage from ranged explosive weapons by increasing your Explosive DR by 50%. This includes damage from concussion and shrapnel.",
            1,
            "Agility 6",
            4),

    HTH_EVADE("HtH Evade",
            "If your character is not carrying any weapons in either hand, at the end of a combat turn, the character gains 3 points of AC instead of the normal 1 for each unused Action Point.",
            1,
            "Unarmed 75%",
            12),

    KAMA_SUTRA_MASTER("Kama Sutra Master",
            "This perk confers great stamina and skill when doing the dirty.",
            1,
            "Endurance 5, Agility 5",
            3),

    KARMA_BEACON("Karma Beacon",
            "Your Karma ran over someone's Dogma. Karma is doubled for the purposes of reaction.",
            1,
            "Charisma 6",
            9),

    LEADFOOT("Leadfoot",
            "Your reflexes have developed to make you a very fast driver. Of course, that doesn’t necessarily mean you are any safer. Characters with this perk can make a vehicle go 25% faster than the vehicle’s maximum speed.",
            1,
            "Pilot 60%, Perception 6, Agility 6",
            3),

    LEADER("Leader",
            "You have some natural leadership abilities and have managed to cultivate them. Any party member within 10 hexes of you gains +1 to their Agility, up to their racial max, and +5 to their Armor Class. You do not get these benefits – that’s the price of being a leader.",
            1,
            "Charisma 6",
            4),

    LIFEGIVER("Lifegiver",
            "Every time your character gains a level, he or she gains an additional 4 HP for each level of this perk. With two ranks, that's +8 HP per level!",
            2,
            "Endurance 4",
            12),

    LIGHT_STEP("Light Step",
            "Characters with this perk are much less likely to set off traps. For purposes of triggering a trap, they gain a +4 bonus to Agility.",
            1,
            "Agility 5, Luck 5",
            9),

    LIVING_ANATOMY("Living Anatomy",
            "This perk confers a +10% bonus to Doctor. Since characters with this perk have greater knowledge of anatomy, they also do +5 points of damage with every attack to living creatures.",
            1,
            "Doctor 60%",
            12),

    LONER("Loner",
            "You always were a little different, but now you’ve learned how to use those differences to your advantage. Characters with this perk gain +10% to all skill rolls when at least 10 hexes away from all of the other members of the party.",
            1,
            "Outdoorsman 50%, Charisma < 5",
            4),

    MASTER_THIEF("Master Thief",
            "This perk gives a one-time bonus of 15 points to both the Lockpick and Steal skills. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Lockpick 50%, Steal 50%",
            12, new Race[]{Race.DEATHCLAW, Race.DOG}),

    MASTER_TRADER("Master Trader",
            "This perk confers a one-time 30% bonus to your Barter skill. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Charisma 7, Barter 60%",
            9, new Race[]{Race.DEATHCLAW, Race.DOG}),

    MEDIC("Medic",
            "This perk gives a one-time bonus of 10% to First Aid and Doctor.",
            1,
            "First Aid OR Doctor 40%",
            12),

    MENTAL_BLOCK("Mental Block",
            "Mental Block is the ability to tune out any outside mental interference. You must have learned this talent from a passing guru, or from a really late night at the bar. For purposes of determining range in combat AND finding traps ONLY, your character’s Perception is raised by 1, up to the racial maximum.",
            1,
            "Requirements",
            15),

    MORE_CRITICALS("More Criticals",
            "Characters with this perk cause more critical hits in combat. Each rank adds +5% to the Critical Chance statistic. Mutants cannot choose this perk.",
            3,
            "Luck 6",
            6, new Race[]{Race.HALF_MUTANT, Race.SUPER_MUTANT}),

    MR_FIXIT("Mr. (or Ms.) Fixit",
            "This perk gives a one-time bonus of 10% to both the Repair and Science skills. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Repair 40% OR Science 40%",
            12, new Race[]{Race.DEATHCLAW, Race.DOG}),

    MUTATE("Mutate!",
            "Picking this perk will also make you select one of your current Traits to remove. You then get a chance to pick another Trait. Weird, eh?",
            1,
            "Requirements",
            9),

    MYSTERIOUS_STRANGER("Mysterious Stranger",
            "When you select this perk, there is a chance (30% + (2 X LK)) that your character will gain a temporary ally, but only in random encounters. The GM will choose that ally.",
            1,
            "Luck 4",
            9),

    NEGOTIATOR("Negotiator",
            "This perk gives a one-time bonus of 10% to Speech and Barter. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Barter 50%, Speech 50%",
            6, new Race[]{Race.DEATHCLAW, Race.DOG}),

    NIGHT_VISION("Night Vision",
            "Your character can see better in darkness when you select this perk. Negative modifiers for dark conditions are reduced by 50%. Must be all the carrots you ate..",
            1,
            "Perception 6",
            3),

    PACK_RAT("Pack Rat",
            "Each rank of this Perk adds +10 lbs. to your character's Carry Weight statistic.",
            2,
            "Requirements",
            6),

    PATHFINDER("Pathfinder",
            "This perk reduces travel time by 25%. You just have a knack for finding those old trails and roads.",
            1,
            "Endurance 6, Outdoorsman 60%",
            6),

    PICKPOCKET("Pickpocket",
            "Characters with this perk gain a 25% bonus to their Steal skill for the purposes of stealing from other characters or NPCs. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Agility 8, Steal 80%",
            15, new Race[]{Race.DEATHCLAW, Race.DOG}),

    PRESENCE("Presence",
            "You gain a +1 bonus to your Charisma for reaction rolls for each rank of this perk.",
            3,
            "Charisma 6",
            6),

    PSYCHOTIC("Psychotic",
            "Your body has adapted to the use of the stimulant Psycho. Positive effects of Psycho are doubled, and the addiction rate for this drug is halved. Only mutants and half-mutants can choose this perk.",
            1,
            "Endurance 5",
            8, new Race[]{Race.DEATHCLAW, Race.DOG, Race.GHOUL, Race.HUMAN, Race.ROBOT}),

    PYROMANIAC("Pyromaniac",
            "This perk will make your character do horrible things with fire - to other people. He or she does +5 points of damage with fire-based weapons such as flamethrowers, molotov cocktails, napalm, and so forth.",
            1,
            "Big Guns 75%",
            9),

    QUICK_POCKETS("Quick Pockets",
            "It only takes two action points instead of four to swap equipment in combat.",
            1,
            "Agility 5",
            3),

    QUICK_RECOVERY("Quick Recovery",
            "It only costs you one AP to stand up after being knocked down.",
            1,
            "Agility 5",
            6),

    RAD_CHILD("Rad Child",
            "You do not take damage from radiation – in fact, it heals you. You gain an extra +5 to your Healing Rate when in a source of radiation that gives out 10 or more rads an hour. Only Ghouls can choose this perk.",
            1,
            "Endurance 6",
            3, new Race[]{Race.DEATHCLAW, Race.DOG, Race.HALF_MUTANT, Race.HUMAN, Race.ROBOT, Race.SUPER_MUTANT}),

    RAD_RESISTANCE("Rad Resistance",
            "Each rank of this perk increases the Radiation Resistance of your character by 15%.",
            2,
            "Endurance 6, Intelligence 4",
            6),

    RANGER("Ranger",
            "This perk adds +15% to Outdoorsman. It also makes finding those special encounters and items a little easier.",
            1,
            "Perception 6",
            6),

    ROAD_WARRIOR("Road Warrior",
            "Mad Max doesn’t have a thing on you. You have learned how to drive and shoot at the same time. You do not suffer any penalties when driving vehicles and making attacks at the same time. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Pilot 60%, Intelligence 6",
            12, new Race[]{Race.DEATHCLAW, Race.DOG}),

    SALESMAN("Salesman",
            "Your character becomes a better salesman with this perk. +20% to the Barter skill. Deathclaws and Dogs cannot be salesmen.",
            1,
            "Barter 50%",
            6, new Race[]{Race.DEATHCLAW, Race.DOG}),

    SCOUT("Scout",
            "Your character can see further in the wilderness. Maps are easier to read. It is up to the GM to determine exactly how this works. Special encounters and items are a little easier to find with this skill as well.",
            1,
            "Perception 7",
            3),

    SCROUNGER("Scrounger",
            "You can find more ammo than the normal post-nuclear survivor. You always find double the normal ammunition in random encounters.",
            1,
            "Luck 8",
            9),

    SHARPSHOOTER("Sharpshooter",
            "With each rank of this perk, Perception increases by +2 for the purposes of determining the modifiers for range in combat.",
            1,
            "Perception 7, Intelligence 6",
            9),

    SILENT_DEATH("Silent Death",
            "While sneaking successfully, characters with this perk do double damage using HtH or melee attacks if they can hit their opponent in the back (backstab!)",
            1,
            "Agility 10, Sneak 80%, Unarmed 80%",
            18),

    SILENT_RUNNING("Silent Running",
            "This perk allows characters to run and sneak at the same time.",
            1,
            "Agility 6, Sneak 50%",
            6),

    SLAYER("Slayer",
            "The slayer walks the earth! In HtH or melee combat, characters with this Perk do a critical hit with a successful roll against Luck!",
            1,
            "Agility 8, Strength 8, Unarmed 80%",
            24),

    SMOOTH_TALKER("Smooth Talker",
            "Each rank of this perk will increase your Intelligence by +1 for rolls against that Stat when attempting to smooth-talk NPCs. Dogs cannot choose this perk, since dogs cannot talk.",
            3,
            "Intelligence 4",
            3, new Race[]{Race.DOG}),

    SNAKEATER("Snakeater",
            "This perk adds +25% to Poison Resistance.",
            1,
            "Endurance 3",
            6),

    SNIPER("Sniper",
            "When using a ranged weapon, your character will do a critical hit with successful roll against Luck and this perk. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Agility 8, Perception 8, Small Guns 80%",
            24, new Race[]{Race.DEATHCLAW, Race.DOG}),

    SPEAKER("Speaker",
            "This perk gives a one-time bonus of 20% to the Speech skill. Deathclaws and Dogs cannot choose this perk.",
            1,
            "Speech 50%",
            9, new Race[]{Race.DEATHCLAW, Race.DOG}),

    STAT("Stat!",
            "You can heal people must faster than the usual wasteland doctor in combat. When attempting to help a fallen comrade, it only takes 5 APs to use your skill.",
            1,
            "First Aid 75%, Doctor 50%, Agility 6",
            3),

    STEADY_ARM("Steady Arm",
            "Due to your massive size, burst attacks cost 1 less AP. Only mutants can choose this perk.",
            1,
            "Strength 6",
            4, new Race[]{Race.DEATHCLAW, Race.DOG, Race.GHOUL, Race.HUMAN, Race.ROBOT}),

    STONEWALL("Stonewall",
            "If your character is about to be knocked down in combat, he can roll a percentile dice and has a 50% chance to avoid that fate.",
            1,
            "Strength 6",
            3),

    STRONG_BACK("Strong Back",
            "Each Rank of this perk increases Carry Weight by 50 lbs.",
            2,
            "Strength 6, Endurance 6",
            3),

    STUNT_DEVIL("Stunt Devil",
            "You know how to bounce when you hit the ground! You take 25% less damage from falling and from vehicle wrecks. In addition, you get a 10% bonus to your Pilot skill. Alas, there are no stunt dogs in the Fallout universe.",
            2,
            "Strength 6, Endurance 6, Agility 6",
            6, new Race[]{Race.DOG}),

    SURVIVALIST("Survivalist",
            "Gain a +25% bonus to the Outdoorsman skill with this perk.",
            3,
            "Endurance 6, Intelligence 6, Outdoorsman 40%",
            3),

    SWIFT_LEARNER("Swift Learner",
            "Each rank of this perk adds an additional 5% (round up) to your character's experience points when he earns them. For example, Jack's character Garfield kills a Rad Rat (50 XP). He would earn 53 XP instead of the normal 50 at the first rank of this perk.",
            3,
            "Intelligence 4",
            3),

    TAG("Tag!",
            "Pick an additional Tag Skill.",
            1,
            "Requirements",
            12),

    TALON_OF_FEAR("Talon of Fear",
            "Venom has seeped into your claws. All of your unarmed attacks carry a Type B poison. Only Deathclaws can choose this perk.",
            1,
            "Unarmed 60%, Strength 6",
            12, new Race[]{Race.GHOUL, Race.DOG, Race.HALF_MUTANT, Race.HUMAN, Race.ROBOT, Race.SUPER_MUTANT}),

    TEAM_PLAYER("Team Player",
            "You have learned the basic skills of teamwork and sharing. Good for you! Whenever all members of the party are within 10 hexes of your character, he or she gains +10% to all skills.",
            1,
            "Charisma 4",
            12),

    THIEF("Thief",
            "This perk confers a one-time bonus of +10% to Sneak, Lockpick, Steal, and Traps. Dogs and Deathclaws cannot choose this perk.",
            1,
            "Requirements",
            3, new Race[]{Race.DEATHCLAW, Race.DOG}),

    TOUGH_HIDE("Tough Hide",
            "Exposure to radiation and the harsh wastes has hardened you against the elements. You gain +15 to your Armor Class and a +10% bonus to all resistances. Only mutants can choose this perk.",
            2,
            "Endurance < 8",
            12, new Race[]{Race.DEATHCLAW, Race.DOG, Race.GHOUL, Race.HUMAN, Race.ROBOT}),

    TOUGHNESS("Toughness",
            "This perk confers a +10% to Damage Resistance to all types of damage.",
            1,
            "Endurance 6, Luck 6",
            3),

    TUNNEL_RAT("Tunnel Rat",
            "You crawl like a baby. Well, you crawl like a very fast baby. You can move at your normal rate (1 AP per hex) while crouching or prone.",
            1,
            "Sneak 60%, Agility 6",
            4),

    WAY_OF_THE_FRUIT("Way of the Fruit",
            "You have learned about the mystical healing effects of eating fruit. For 24 hours after eating a piece of fruit, your character gains +1 to Perception and Agility. Deathclaws and Dogs cannot grasp the mysteries of the fruit.",
            1,
            "Charisma 6",
            6, new Race[]{Race.DEATHCLAW, Race.DOG}),

    WEAPON_HANDLING("Weapon Handling",
            "This perk adds +3 Strength for the purposes of strength requirements for handling and firing weapons.",
            1,
            "Agility 5",
            2),;
    String name;
    String description;
    String requirements;
    int levelRequirement;
    int ranks;
    Race[] raceRestrict;

    Perk(String name, String desc, int ranks, String requirements, int levelRequirement) {
        this.name = name;
        this.description = desc;
        this.ranks = ranks;
        this.requirements = requirements;
        this.levelRequirement = levelRequirement;
    }

    Perk(String name, String desc, int ranks, String requirements, int levelRequirement, Race[] raceRestrict) {
        this.name = name;
        this.description = desc;
        this.ranks = ranks;
        this.requirements = requirements;
        this.levelRequirement = levelRequirement;
        this.raceRestrict = raceRestrict;
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

    public int getLevelRequirement() {
        return levelRequirement;
    }

    public Race[] getRaceRestrict() {
        return raceRestrict;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
