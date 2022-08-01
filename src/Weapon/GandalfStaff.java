package Weapon;

import java.util.ArrayList;
import java.util.List;
import static Weapon.WeaponBase.wrapText;

public class GandalfStaff implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public GandalfStaff() {
        this.weaponName = "Gandalf Staff";
        this.weaponDamage = 18;
        this.weaponDesc = wrapText("Gandalf had two staffs. The first was made of gnarled wood and cradled a jewel at the top that would light up. His second staff was white with a slightly more geometric design. History: When he returned from the dead, Galadriel gave Gandalf a new white staff. In the films, his white staff was shattered by the Witch King in Minas Tirith.");
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
