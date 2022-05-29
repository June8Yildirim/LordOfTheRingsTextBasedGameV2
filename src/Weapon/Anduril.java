package Weapon;

import java.util.ArrayList;
import java.util.List;

public class Anduril implements IWeapon{
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Anduril() {
        this.weaponName = "Anduril";
        this.weaponDamage =25;
        weapons = new ArrayList<>();
        this.weaponDesc = "Millenia following the destruction of the sword Narsil, its shards were eventually inherited by Aragorn. Toward the end of the Third Age, Aragorn brought the remnants of Narsil to the Elves of Rivendell. They successfully reforge them to create the enchanted blade Andúril.";  }
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
    public String toString(){
        return this.weaponName+"'s: "+"\nSingle Damage: "+this.weaponDamage;
    }
}
