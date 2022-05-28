package Weapon;

import java.util.ArrayList;
import java.util.List;

public class Elfbow implements IWeapon{
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Elfbow() {
        this.weaponName = "Elf Bow";
        this.weaponDamage =10;
        weapons = new ArrayList<>();
    }


    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getWeaponDescription() {
        return " Legolas wielded two bows during the War of the Ring. The first was from his home of Mirkwood. The second was gifted to him by Galadriel and was longer and stouter than his first bow. It was six feet long and crafted with the silver-grey wood of a Mallorn tree. His second bow was also faster as its string had a strand of Galadriel’s hair entwined around it.\n" +
                "\nHistory: In addition to taking down many Orcs, Goblins, and Uruk-hai, Legolas used his second bow to strike down one of the Fell Beasts as it flew over the River Anduin.";
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public List<IWeapon> getWeapons() {
        return this.weapons;
    }
}
