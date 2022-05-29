package Weapon;

import java.util.ArrayList;
import java.util.List;

public class Orcrist implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Orcrist() {
        this.weaponName = "Orchrist";
        this.weaponDamage = 13;
        this.weaponDesc = "Made by the Elves of Gondolin, Orcrist was forged along with its sister blade, Glamdring. Like Glamdring and Sting, it would glow blue whenever enemies were near." +
                "History: Orcrist was a legendary sword, known to have slain hundreds of goblins in its time.";
        weapons = new ArrayList<>();
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
