package Heros;

import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Hero implements IHero{

    private String name;
    private int hp;
    private int maxHp;
    private int damage;
    private String desc;
    private List<IWeapon> weapons;

    public Hero(HeroBase.HeroName type, String name, int hp, int damage) {
        this.hp = hp;
        this.name = name;
        this.maxHp = hp + 15;
        this.damage = damage;
        this.weapons = new ArrayList<>();
    }
    @Override
    public String getHeroName() {
        return null;
    }

    @Override
    public int getHeroHp() {
        return 0;
    }

    @Override
    public int getHeroMaxHp() {
        return 0;
    }

    @Override
    public int getHeroDamage() {
        return 0;
    }

    @Override
    public void setHeroHp(int hp) {

    }

    @Override
    public void setHeroDamage(int damage) {

    }

    @Override
    public String getHeroDescription() {
        return null;
    }

    @Override
    public List<IWeapon> getHerosInventory() {
        return this.weapons;
    }
    @Override
    public void heroInfo(IWeapon primaryWeapon) {
        System.out.println("=====================================");
        int count = 0;
        for (IWeapon weapon: this.getHerosInventory()){
            System.out.println(count++ +". "+weapon);
        }
        System.out.println("=====================================");
        System.out.println("Name of Hero: " + this.getHeroName() +", " +
                "\nand his Primary Weapon is: "+ primaryWeapon+". "+
                "\nHero's Hp: " + this.getHeroHp() + "." +
                "\nHero's Max-Hp: " + this.getHeroMaxHp() + "." +
                "\nHero's make a damage : " + this.getHeroDamage() + ".");
        System.out.println("=====================================");
        System.out.println(this.getHeroDescription());
        System.out.println("=====================================");
    }

}
