package Weapon;

import java.util.ArrayList;
import java.util.List;
import static Weapon.WeaponBase.wrapText;

public class BlackArrow implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public BlackArrow() {
        this.weaponName = "BlackArrow";
        this.weaponDamage = 17;
        weapons = new ArrayList<>();
        this.weaponDesc = wrapText("The Black Arrow plays an important role in The Hobbit: The Desolation of Smaug. Even though it is only good for one use, the sole purpose of this heirloom to the house of Girion is to destroy dragons - more specifically, to end Smaug the Golden's life.");
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
