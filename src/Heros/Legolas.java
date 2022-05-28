package Heros;

import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Legolas  implements IHero{
    private String heroName;
    private HeroBase.HeroName type;
    private int heroHp;
    private int heroMaxHp;
    private int heroDamage;
    private String heroDesc;
    private List<IWeapon> heroWeapons;

    public Legolas() {
        type = HeroBase.HeroName.LEGOLAS;
        this.heroName = "Legolas";
        this.heroDamage = 12;
        this.heroHp = 80;
        heroWeapons = new ArrayList<>();
    }

    @Override
    public String getHeroName() {
        return this.heroName;
    }

    @Override
    public int getHeroHp() {
        return this.heroHp ;
    }

    @Override
    public int getHeroMaxHp() {
        return this.heroMaxHp;
    }

    @Override
    public int getHeroDamage() {
        return this.heroDamage;
    }

    @Override
    public void setHeroHp(int hp) {this.heroHp = hp;
    }

    @Override
    public void setHeroDamage(int damage) {
        this.heroDamage =damage;
    }
    @Override
    public String getHeroDescription() {
        return "A boyish elf. Thanks to Legolas’s skill with a bow and arrow, his kill number is consistently higher than Gimli’s. Like his dwarf friend, he is a brave and loyal member of the fellowship of the ring.";
    }

    @Override
    public List<IWeapon> getHerosInventory() {
        return this.heroWeapons;
    }

    @Override
    public void addWeaponToInventoryList(IWeapon weapon) {
        heroWeapons.add(weapon);
    }

    @Override
    public void removeWeaponToInventoryList(IWeapon weapon) {
        heroWeapons.remove(weapon);
    }
}
