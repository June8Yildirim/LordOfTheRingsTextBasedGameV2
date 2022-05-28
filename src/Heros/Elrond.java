package Heros;

import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Elrond implements IHero {
    private String heroName;
    private int heroHp;
    private HeroBase.HeroName type;
    private int heroMaxHp;
    private int heroDamage;
    private String heroDesc;
    private List<IWeapon> heroWeapons;

    public Elrond() {
        type= HeroBase.HeroName.ELROND;
        this.heroName = "Elrond";
        this.heroDamage = 24;
        this.heroHp = 115;
        this.heroWeapons = new ArrayList<>();
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
        return "Ruler of the Rivendell elves and Arwen’s father. Though Elrond is sympathetic to the goals of the fellowship, his primary concern is the safety of his elf subjects. The elves face a choice: they can leave Middle-earth for immortal life, or they can delay their departure and contribute to the fight against Sauron. Elrond has a low opinion of men, as he was with Isildur when the king failed to destroy the ring of power. For this reason and because of his concerns about Arwen’s life, he is reluctant to aid in the fight against Sauron. Eventually, he commits himself to the ancient alliance of men and elves, sends an army to defend Rohan, and reforges Isildur’s sword for Aragorn.";
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
