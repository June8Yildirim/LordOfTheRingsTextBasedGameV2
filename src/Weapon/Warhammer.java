package Weapon;

import Enemy.IEnemy;

import java.util.ArrayList;
import java.util.List;
import static Weapon.WeaponBase.wrapText;

public class Warhammer implements IWeapon {
    private String weaponName;
    private int weaponDamage;
    private String weaponDesc;
    List<IWeapon> weapons;
    List<IEnemy> enemies;

    public Warhammer() {
        this.weaponName = "Warhammer";
        this.weaponDamage =30;
        weapons = new ArrayList<>();
        enemies = new ArrayList<>();
        this.weaponDesc = wrapText("The dark lord Morgoth (originally known as Melkor) is quite possibly one of the strongest antagonists in the history of Tolkien’s Legendarium. He is the primordial source of all evil in the world and was responsible for corrupting the Maiar, leading to the birth of the Balrogs.");
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
    public String toString(){
        return this.weaponName+"'s: "+"\nSingle Damage: "+this.weaponDamage;
    }
}
