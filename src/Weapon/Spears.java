package Weapon;

import java.util.ArrayList;
import java.util.List;

public class Spears implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Spears() {
        this.weaponName = "Spear";
        this.weaponDamage = 0;
        weapons = new ArrayList<>();
        this.weaponDesc = "Spears were common in Middle-earth. The Vanyar were famous for their spears. The Rangers of the Grey Company bore spears in the Battle of the Pelennor Fields. ";
    }

    @Override
    public String getName() {
        return "Spear";
    }

    @Override
    public String getWeaponDescription() {
        return this.weaponDesc;
    }

    @Override
    public int getDamage() {
        return 0;
    }

    @Override
    public List<IWeapon> getWeapons() {
        return this.weapons;
    }

    @Override
    public String toString() {
        return this.weaponName + "'s: " + "\nSingle Damage: " + this.weaponDamage;
    }
}
