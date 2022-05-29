package Weapon;

import java.util.ArrayList;
import java.util.List;

public class Sword implements IWeapon{
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public Sword() {
        this.weaponName = "Sword";
        this.weaponDamage = 10;
        this.weaponDesc = "A regular Sword";
        this.weapons = new ArrayList<>();
    }

    @Override
    public String getName() {
        return "Sword";
    }

    @Override
    public String getWeaponDescription() {
        return "It's regular middle earth sword.";
    }

    @Override
    public int getDamage() {
        return this.weaponDamage;
    }

    @Override
    public List<IWeapon> getWeapons() {
        return null;
    }

    @Override
    public String toString(){
        return this.weaponName+"'s: "+"\nSingle Damage: "+this.weaponDamage;
    }

}
