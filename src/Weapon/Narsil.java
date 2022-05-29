package Weapon;

import java.util.ArrayList;
import java.util.List;

public class Narsil implements IWeapon{
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Narsil() {
        this.weaponName = "Narsil";
        this.weaponDamage =17;
        this.weaponDesc = " Reforged from the shards of Isildur’s sword, Narsil, Andúril bears the inscription, \"I am Andúril, who was Narsil, the sword of Elendil. Let the thralls of Mordor flee me." +
                "History: After Isildur used the broken Narsil to cut the Ring off Sauron’s finger, the sword’s shards were housed in Rivendell. They were reforged years later for Isildur’s heir, Aragorn, who repeatedly flashed the sword to establish his identity as the rightful king of Gondor.";
        weapons = new ArrayList<>();
    }

    @Override
    public String getName() {
        return this.weaponName;
    }
    @Override
    public String getWeaponDescription() {
        return this.weaponDesc;}


    @Override
    public int getDamage() {
        return this.weaponDamage;
    }

    @Override
    public List<IWeapon> getWeapons() {
        return this.weapons;
    }     @Override
    public String toString(){
        return this.weaponName+"'s: "+"\nSingle Damage: "+this.weaponDamage;
    }
}
