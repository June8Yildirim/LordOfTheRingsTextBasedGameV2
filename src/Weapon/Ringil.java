package Weapon;

import java.util.ArrayList;
import java.util.List;
import static Weapon.WeaponBase.wrapText;

public class Ringil implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Ringil() {
        this.weaponName = "Ringil";
        this.weaponDamage = 14;
        weapons = new ArrayList<>();
        this.weaponDesc = wrapText("Although it's never appeared in either The Lord Of The Rings or The Hobbit trilogies, the books depict Ringil as possibly one of the most powerful Elven blades ever created. Its wielder was Fingolfin, one of the high kings of Noldor.");
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
