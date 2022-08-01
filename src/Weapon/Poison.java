package Weapon;

import java.util.ArrayList;
import java.util.List;
import static Weapon.WeaponBase.wrapText;

public class Poison implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Poison() {
        this.weaponName = "Poison";
        this.weaponDamage = 21;
        weapons = new ArrayList<>();
        this.weaponDesc = "Poison";
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
