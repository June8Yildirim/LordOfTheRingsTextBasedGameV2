package Weapon;

import java.util.ArrayList;
import java.util.List;

public class Axe implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Axe() {
        this.weaponName = "Axe";
        this.weaponDamage = 13;
        weapons = new ArrayList<>();
        this.weaponDesc = "In the books, Gimli is described as wielding a single axe, but in Peter Jackson’s films, Gimli wields several axes, including a bearded axe, throwing axes, and a double-bladed axe." +
                "History: Gimli obtained his large double-bladed axe while traveling through the Mines of Moria. It’s believed that the axe belonged to his father’s cousin, Balin. Gimli is very attached to his axes.";
    }


    @Override
    public String getName() {
        return this.weaponName;
    }

    @Override
    public String getWeaponDescription() {
        return this.weaponDesc;
    }

    @Override
    public int getDamage() {
        return this.weaponDamage;
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
