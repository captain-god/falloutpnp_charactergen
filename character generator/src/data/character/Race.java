package data.character;

/**
 * I Spend so much goddamn time trying to make my things modular that I forget to actually make them:
 * this is going to be the raw, rigid version of this class. Hard-coded, ugly, but working.
 */

public enum Race {
    HUMAN("Human",
            "Your basic human. Two arms, two legs, two eyes. You and me. \n" +
                    "Humans gain no bonuses or penalties to their basic statistics, except a 30% resistance to electricity, and gain a perk every 3 levels. \n" +
                    "Humans weigh anywhere from 110 to 280 pounds, and stand around 1.5 to 2.5 meters tall.",
            new int[][]{new int[]{1,1,1,1,1,1,1}, new int[]{10,10,10,10,10,10,10}},
            3),
    GHOUL("Ghoul",
            "When the bombs hit, some people were irrevocably changed (and not just the ones who were atomized at ground zero, either). Ghouls are humans who were alive when the bomb went off, and the radiation altered them at a cellular level. \nGhouls enjoy an extremely slow cellular mitosis rate, rendering them essentially immune to the effects of old age. The radiation also changed their outward appearance, forever marking them as outsiders. Their skin hangs off their bones, sometimes in shreds, and sunken eyes peer out from skulls twisted and burned by radiation, giving these unfortunate people their name. Their skin can be anywhere from pale white to dirt brown in color, with green and yellow the most common. When they do have hair remaining, it usually does not grow. Some ghouls were inexplicably merged with plant species, and have shrubs and moss growing out of various parts of their bodies. \nIt might have twisted their bodies, but the radiation did not affect their minds, and they are forced to live as misshapen outcasts, fully aware of the society they were once part of, but also aware they can never rejoin it. For this reason, many ghouls have formed settlements of their own, or live in settlements with humans and mutants who do not mind their appearance. \nUnlike their mythic namesakes, ghouls do not eat human flesh. They do, however, require a small amount of radiation to survive, and for this reason, one can often find a population of ghouls around a leaky nuclear reactor or an impact crater from the war. \nGhouls age very slowly, and their lifespan is a whopping 300 years past when they were exposed to the radiation. Their unnaturally long lifespan does not mean that they can't be killed by other means, however, and ghouls are just as vulnerable to disease, falls, and bullets as everyone else. \nGhouls usually weight anywhere from 80 to 160 pounds, and stand anywhere from 1.5 to 2.5 meters tall. Whether or not ghouls can reproduce is a subject open to scientific debate. Ghouls have a natural 80% Radiation Resistance bonus along with a 30% Poison Resistance bonus. Ghouls gain a perk every 4 levels. Luckily, Ghouls can wear any kind of armor that normal humans can wear.",
            new int[][]{new int[]{1,4,1,1,2,1,5}, new int[]{8,13,10,10,10,6,12}},
            4),
    SUPER_MUTANT("Super Mutant",
            "Super mutants (or just mutants, as they prefer to call themselves) are not the product of \"natural\" aftereffects from the war, but a race created by one person, the insane overseer of a particular Vault who wanted to create a master race. Using biological research from a prewar military installation, he developed the Forced Evolutionary Virus (FEV) and began performing experiments on people. Many died before he achieved the desired results. After \"dipping\" the person in a vat containing the FEV virus, they would emerge and undergo an intense physiological change. They grew much stronger and more intelligent, as well as growing in height and stature. Armies of Super-Mutants were once slaves to this Master and his dream to \"dip\" every human on the planet, but the Master was eventually killed and the mutants freed (although to hear them tell it, the Master was more of a Messiah than a madman). \n" +
                    "Like ghouls, mutants age very slowly, but not as slowly as their cousins. Mutants are generally huge, easily reaching 2.8 to 3 meters in height, weigh up to 350 pounds, and come either male or female. Their skin is usually a greenish yellow color, and various bunions and growths cover their bodies. They have hair in all the usual places, but it usually grows slowly (a result of the slowed cellular mitosis from the FEV virus). Although sterile for a long time after the \"dipping,\" mutants can eventually have children, among themselves or a half-mutant, half-human hybrid. \n" +
                    "Unfortunately, like ghouls, mutants are largely outcast from human society. Many of them prefer it this way, looking on human society as diseased or inferior because of the prejudice and corruption that still exist. Mutants were once part of what they see as an attempt to finally unite humanity and overcome humankind's weaknesses, and it is rumored that vats of the FEV virus still exist, and a mutant society is at work attempting to achieve this goal, even after the Master's death. \n" +
                    "Mutants enjoy a 50% Radiation Resistance bonus and a 20% Poison Resistance bonus, and gain a perk every 4 levels. They gain an additional 2 hit points per level. Mutants cannot easily use small arms; when using a weapon that requires a roll on the small guns skill, mutants make the roll as if their Perception were two points lower. Mutants gain a 25% bonus to their Damage Resistance for all types of attacks, too. \n" +
                    "Mutants can easily live 200 years beyond when they were \"dipped.\" Mutants born of a mutant-mutant union mature at the same rate a human does, and generally live around 250 years. \n" +
                    "Mutants cannot wear armor designed for humans; they just don't make it their size. Someone in that vast wasteland might, however.",
            new int[][]{new int[]{5,1,4,1,1,1,1}, new int[]{13,11,11,7,11,8,10}},
            4),
    HALF_MUTANT("Half Mutant",
            "Where there is a will, there is a way. \n" +
                    "Half-mutants (or halfies) are the product of a union between mutant and undipped human. They do not enjoy as many of the abilities as full mutants, but neither are they as outcast; many of them can pass for tall, ugly humans. They live a little longer than normal, and are a little more spry than their mutant parents. There are not too many halfies in the world, and a halfie is sure to have an interesting story or two to tell. \n" +
                    "Halfies gain 15% bonuses to their Radiation and Poison Resistance, and gain a perk every 3 levels. Halfies can wear normal human armor (although it might be a little tight) and can often live to the ripe old age of 150 years. They stand about 2 meters tall and weight from 150 to 300 pounds",
            new int[][]{new int[]{3,1,2,1,1,1,1}, new int[]{12,10,11,10,10,8,10}},
            3),
    DEATHCLAW("Deathclaw",
            "Deathclaws are a race of semi-intelligent, enormous, mutated lizards. They walk on two legs, stand more than two meters tall in adulthood, and have scaly skin ranging from brownish-green to light yellow. Their heads are abnormally large and have horns growing out of them, suggesting lizard DNA and human DNA might have been stirred together in the evolutionary soup at some point after the War. Some tribes of Deathclaws in the Midwestern and Eastern United States have developed patches of fur, adapting to the more extreme climate conditions found there. \n" +
                    "Deathclaws live in tribes of anywhere from 25 to 100 individuals, and spend most of their time protecting the egglaying females and hunting. They can communicate quite effectively with each other, and can use simple battle plans. Some Deathclaws are intelligent enough to learn the nuances of human language, although they cannot actually \"speak\" as we do – they simply imitate human speech in much the same way a parrot does, except their “voice” is often deep, gravelly, and is prone to affecting strange accents. \n" +
                    "Deathclaws get their name from the footlong bony claws growing from their \"fingers\" This means that they always have a built-in melee weapon; it also means they cannot use any other weapons besides their claws, ever. In addition, Deathclaws cannot use armor; no one makes protection for giant lizards. \n" +
                    "Deathclaws are some of the most hated, feared, and misunderstood creatures in the wastes – when walking among humans, an appropriate disguise, such as a loose-fitting robe with a cowl to cover the head, is an absolute necessity. Most people will simply attack a Deathclaw on sight, or attempt to run away as fast as possible. \n" +
                    "Deathclaws gain a perk every 4 levels, and gain 2 extra hit points per level. They stand about 3 meters tall, and 10 weigh up to 400 pounds. In addition, they enjoy a +5 melee damage bonus, a 0/40 Gas Resist, and have a 40% Resistance to Normal, Fire, and Explosion damage with a Damage Threshold of 4 for each of those damage types. Deathclaws only live for 15 years, and reach maturity (adventuring age) at around 4 years.",
            new int[][]{new int[]{6,4,1,1,1,6,1}, new int[]{14,12,13,3,4,16,10}},
            4),
    DOG("Dog",
            "Dogs are four-legged, furry, slobbering beasts. Extremely good-natured and even-tempered, they are usually loyal to one human master or a group of humans, who in return shower the dog with love, affection, food, and milkbones. \n" +
                    "Dogs in Fallout are no different than their real-world counterparts. They can stand anywhere from 60cm to 1.5 m at the shoulders, and walk on all fours. Most are covered with hair, ranging in color from white to brownish-tan to black, and usually a combination of anything in between. \n" +
                    "Since dogs have no opposable thumbs, they cannot use weapons or tools of any kind, and they cannot communicate except by barking, wagging their tails, and pointing with their snouts. Dogs cannot use armor unless it is specially made for them, and they cannot carry items unless someone creates a device that allows them to. Even then, they cannot pick anything up on their own, except with their mouth. For these reasons, dogs are very difficult to role-play well, and the GM and players should take this into consideration before allowing a player to create a dog character. \n" +
                    "Dogs gain perks every 2 levels, and live between 10 and 15 years. They gain no other bonuses. Dogs can weight anywhere from 30 pounds to 150 pounds. They also get an innate 50% bonus to Electricity Resistance. It’s a dog's life.",
            new int[][]{new int[]{1,4,1,1,1,1,1}, new int[]{7,14,6,5,3,15,10}},
            2),
    ROBOT("Robot",
            "Before the War, several companies and research facilities were manufacturing humanoid-robots. These machines weren't artificial intelligences per se, but had incredibly fast supercomputers that allowed them to \"reason\" on the same level as many humans (and, in some cases, to reason better than their creators). \n" +
                    "Robots are very rare in the Fallout universe, and should only be played as characters if it fits the plot of the campaign. They almost always come from high-tech areas or installations, and are usually only part of an adventuring party associated with high-technology (in other words, tribals usually don't keep robots).\n" +
                    "Robots can communicate with humans using memorized speech patterns, and even have some of their own unique Traits. Many people in the wastes will find speaking robots to be more of a sideshow curiosity than an actual being, and will not deal with one unless it is part of a larger group; they simply do not recognize the robot as a sentient creature - and whether or not a robot is sentient is open to debate. \n" +
                    "Robots stand approximately 2 meters tall, but can vary in size from 1 meter to 3 meters, and usually weight from 300-400 pounds. They are made of metal and silicon, and are usually a white, light tan, or light grey in color. Robots cannot wear armor, but they can use weapons and tools. Robots require some regular maintenance, which they can perform themselves if not incapacitated. \n" +
                    "A robot must have someone roll a successful Repair and Science skill while examining it for 12 hours at least once a month. If this maintenance is not preformed, the robot begins taking 1d10 points of damage every 24 hours beyond the deadline for the repairs. Robots take damage as normal, but they do not heal hit points back over time (see Healing, below). Instead, robots must be repaired. A successful use of the Science skill on a robot will act like a successful use of the First Aid skill on a flesh-and-bone character, healing 1d10 hit points. In addition, if the robot has a crippled limb or another medical malady such as blindness, it takes a successful roll against Repair to \"heal\" that body part. For more details, see Healing, below. Robots are immune to the effects of radiation, poison, gas attacks, and chems. \n" +
                    "Robots never gain perks. They enjoy a 40% Damage Resistance to all kinds of attacks, but unfortunately are affected by EMP (pulse) weapons. Robots don't have a \"lifespan\" per se, but each unit has a battery that generally lasts anywhere from 75 to 150 years. Of course, that battery can be replaced, effectively allowing the robot to continue operating forever, so long as it continues to get a fresh power supply",
            new int[][]{new int[]{7,7,7,1,1,1,5}, new int[]{12,12,12,1,12,12,5}},
            999),
    ;
    private String name; //what the race is called
    private String description; //description from the book
    private int[][] SPECIAL; //[min][max] SPECIAL stat a player can have as that race
    private int perkRate; //however many levels between perks

    Race(String name, String description, int[][] SPECIAL, int perkRate) {
        this.name = name;
        this.description = description;
        this.SPECIAL = SPECIAL;
        this.perkRate = perkRate;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int[][] getSPECIAL() {
        return SPECIAL;
    }

    public int getPerkRate() {
        return perkRate;
    }

    @Override
    public String toString(){
        return this.name;
    }
}
