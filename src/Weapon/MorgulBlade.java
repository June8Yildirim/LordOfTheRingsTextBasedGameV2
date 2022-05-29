package Weapon;

import java.util.ArrayList;
import java.util.List;

public class MorgulBlade implements IWeapon{
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;

    public MorgulBlade() {
        this.weaponName = "MorgulBlade";
        this.weaponDamage = 25;
        weapons = new ArrayList<>();
        this.weaponDesc = "Unlike most weapons on this list, the Morgul-blades are not known for their durability. In the first film, following an attack by Sauron’s Nazgûl, Frodo gets hurt by one, however, after the fact, the blade breaks.";
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
