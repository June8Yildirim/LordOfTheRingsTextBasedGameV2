package Heros;

import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Galadriel implements IHero{
    private WeaponBase WeaponBase;
    private String heroName;
    private HeroBase.HeroName type;
    private int heroHp;
    private int heroMaxHp;
    private int heroDamage;
    private String heroDesc;
    private List<IWeapon> heroWeapons;

    public Galadriel() {
        type = HeroBase.HeroName.GALADRIEL;
        this.heroName = "Galadriel";
        this.heroDamage = 25;
        this.heroHp = 120;
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
        return "An elf queen known as the Lady of the Woods. Galadriel is the leader of the Sylvan elves. She offers spiritual aid to Frodo, giving counsel and encouraging him during the dark moments of his quest. She gives him a star of light that proves essential to Frodo when he is betrayed by Gollum and trapped in the spider Shelob’s webs.";
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
