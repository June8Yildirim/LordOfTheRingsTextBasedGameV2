package Weapon;

import java.util.ArrayList;
import java.util.List;

public class Knife implements IWeapon{
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Knife() {
        this.weaponName = "Knife";
        this.weaponDamage =8;
        this.weaponDesc = "Knife";
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
    }     @Override
    public String toString(){
        return this.weaponName+"'s: "+"\nSingle Damage: "+this.weaponDamage;
    }

}
