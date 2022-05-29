package Weapon;

import java.util.ArrayList;
import java.util.List;

public class Glamdring implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Glamdring() {
        this.weaponName = "Glandring";
        this.weaponDamage = 13;
        this.weaponDesc = " Glamdring had a Rune inscription and would glow blue in the presence of Orcs." +
                "History: Made by the High Elves in the West, Gandalf found Glamdring in the trolls’ cave as he and Thorin’s company were making their way to the Misty Mountains.";
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
