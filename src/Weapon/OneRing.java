package Weapon;

import java.util.ArrayList;
import java.util.List;
import static Weapon.WeaponBase.wrapText;

public class OneRing implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public OneRing() {
        this.weaponName = "One Ring";
        this.weaponDamage = 22;
        this.weaponDesc = wrapText("The Ring was a simple gold band which revealed the inscription “One Ring to rule them all, One Ring to find them, One Ring to bring them all and in the darkness bind them” when cast into fire. Created by Sauron in the fires of Mount Doom, the One Ring enhanced the wielder's power and gave them control over all the other Rings of Power, with the exception of the Elven rings. While it was made by and for Sauron, it's believed that a powerful being like Gandalf or Galadriel could possibly use the ring. If the bearer was mortal, they would turn invisible and enter the Wraith-world. Prolonged exposure to the Ring could cause its owner to become irritable, paranoid, and even evil, though some beings were less susceptible to the Ring's influence. If wielded by someone other than Sauron, it also had the power to turn the bearer into a wraith-like creature like the Ringwraiths. History: The One Ring was destroyed when Gollum bit the Ring off of Frodo’s finger, taking part of the Hobbit’s digit along with it. In his glee, Gollum fell off the cliff at the Crack of Mount Doom and he and the Ring were consumed by the fire.");
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
