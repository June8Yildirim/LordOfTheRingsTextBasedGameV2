package Heros;

import Weapon.IWeapon;
import Weapon.Sword;
import Weapon.WeaponBase;
import java.util.ArrayList;
import java.util.List;
import static Heros.HeroBase.wrapText;

public class Mitrahdir implements IHero {

    private String heroName;
    private HeroBase.HeroName type;
    private int heroHp;
    private int heroMaxHp;
    private int heroDamage;
    private String heroDesc;
    private List<IWeapon> heroWeapons;

    public Mitrahdir() {
        type = HeroBase.HeroName.MITHRANDIR;
        this.heroName = "Mithrandir";
        this.heroDamage = 90;
        this.heroHp = 16;
        this.heroDesc = wrapText("Gandalf is also known as Mithrandir (i.e. \"grey wanderer\") and Olyrin, a name given to him in Valinor. In \"The Silmarillion\" wisest of the Maiar was Olyrin who dwelt in Lyrien. His ways took him often to the house of Nienna, and of her he learned pity and compassion. This gives grounds to believe that Gandalf and Olyrin was one and the same person.");
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

    @Override
    public String toString(){
        return this.heroName+"'s \nHp: "+this.heroHp+"\nSingle Damage: "+this.heroDamage;
    }


}
