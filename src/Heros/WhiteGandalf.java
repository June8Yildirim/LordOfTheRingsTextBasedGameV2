package Heros;

import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class WhiteGandalf implements IHero{
    private String heroName;
    private HeroBase.HeroName type;
    private int heroHp;
    private int heroMaxHp;
    private int heroDamage;
    private String heroDesc;
    private List<IWeapon> heroWeapons;

    public WhiteGandalf() {
        type = HeroBase.HeroName.WHITEGANDALF;
        this.heroName = "Gandalf the White";
        this.heroDamage = 110;
        this.heroHp = 21;
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
        return "Gandalf the gray was named fighting after the BALROG, Gandalf the white, and he became master of the wizards council.";
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
