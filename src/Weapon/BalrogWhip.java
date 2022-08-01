package Weapon;

import java.util.ArrayList;
import java.util.List;
import static Weapon.WeaponBase.wrapText;

public class BalrogWhip implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public BalrogWhip() {
        this.weaponName = "BalrogWhip";
        this.weaponDamage = 21;
        weapons = new ArrayList<>();
        this.weaponDesc = wrapText("Among the many monsters lurking within the bowels of Middle-earth, none are more terrifying than the Balrog. Even a single Balrog was powerful enough to drive out the Dwarves living in Khazad-dûm and slay their ruler Durin.");
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
