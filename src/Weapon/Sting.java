package Weapon;

import java.util.ArrayList;
import java.util.List;
import static Weapon.WeaponBase.wrapText;

public class Sting implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Sting() {
        this.weaponName = "Sting";
        this.weaponDamage = 11;
        this.weaponDesc = wrapText("Sting was an Elven short sword that glowed blue whenever Orcs or goblins were near. It is similar in make to Glamdring, Gandalf’s sword. After the Quest for Erebor, Bilbo had the sword engraved with the words, “Sting is my name; I am the spider's bane. History: Sting was found by Bilbo in the trolls’ cave along with Glamdring and Orcrist. Bilbo then gave his sword to his nephew, Frodo, to aid him in his quest to destroy the One Ring. Once Sauron was defeated, Frodo gave the sword to his good friend Sam.");
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
