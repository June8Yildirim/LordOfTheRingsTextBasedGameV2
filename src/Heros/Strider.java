package Heros;

import Weapon.IWeapon;
import Weapon.Sword;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class Strider implements IHero {

    private String heroName;
    private HeroBase.HeroName type;
    private int heroHp;
    private int heroMaxHp;
    private int heroDamage;
    private String heroDesc;
    private List<IWeapon> heroWeapons;

    public Strider() {
        type = HeroBase.HeroName.STRIDER;
        this.heroName = "Strider";
        this.heroDamage = 13;
        this.heroHp = 80;
        this.heroDesc = "The ring-bearer and protagonist of the trilogy. A young hobbit, Frodo is chosen by the wizard Gandalf to return the ring to Mordor. The ring offers terrible temptation to anyone who comes near it, and though Frodo on occasion succumbs to its power, he generally shows remarkable strength before its siren call. However, when it comes time to drop the ring into Mount Doom, he is unable to simply let the ring go. Only because the ring is torn loose in Frodo’s struggle with Gollum does it fall into the fiery pit of lava below, which suggests that Frodo is a very fallible hero. Unlike the three other hobbits, Sam, Merry, and Pippin, Frodo is unable to readjust to life in the Shire upon his return. In this way, he resembles his uncle Bilbo, a former owner of the ring who is forever restless. The ring has a great effect on Frodo, changing him from an ordinary hobbit of exceptional qualities into someone extraordinary. He becomes a legend and eventually leaves the land of living mortals for immortal life with the elves. Despite Frodo’s success in returning the ring to Mordor, in some ways he is the least memorable character in the trilogy. In three epic films full of battles, he is a reserved, physically small, and ineffective fighter.";
        heroWeapons = new ArrayList<>();
    }

    @Override
    public String getHeroName() {
        return this.heroName;
    }

    @Override
    public int getHeroHp() {
        return this.heroHp;
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
    public void setHeroHp(int hp) {
        if (this.heroDamage + hp > this.heroMaxHp) {
            this.heroDamage = this.heroMaxHp;
        } else {
            this.heroHp = hp;
        }
    }

    @Override
    public void setHeroDamage(int damage) {
        this.heroDamage = damage;
    }

    @Override
    public String getHeroDescription() {
        return this.heroDesc;
    }

    @Override
    public List<IWeapon> getHerosInventory() {
         return this.heroWeapons;
    }
    @Override
    public String toString(){
        return this.heroName+"'s \nHp: "+this.heroHp+"\nSingle Damage: "+this.heroDamage;
    }


}
