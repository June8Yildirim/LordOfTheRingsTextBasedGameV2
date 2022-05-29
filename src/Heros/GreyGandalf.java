package Heros;

import Weapon.IWeapon;
import Weapon.Sword;
import Weapon.WeaponBase;

import java.util.ArrayList;
import java.util.List;

public class GreyGandalf implements IHero {

    private String heroName;
    private HeroBase.HeroName type;
    private int heroHp;
    private int heroMaxHp;
    private int heroDamage;
    private String heroDesc;
    private List<IWeapon> heroWeapons;


    public GreyGandalf() {
        type = HeroBase.HeroName.GREYGANDALF;
        this.heroName = "Gandalf the Gray";
        this.heroDamage = 110;
        this.heroHp = 20;
        this.heroDesc = "A grandfatherly wizard. Gandalf is the first to understand the dangers that Bilbo’s ring poses, and his knowledge sets the whole trilogy in motion. Gandalf selects quiet Frodo to carry the ring and the bumbling Sam to be Frodo’s protector, and these hobbits seem unlikely choices for such a dangerous mission. Here and elsewhere, Gandalf exhibits a remarkable wisdom and insight into hobbits and men alike, and he seems to see potential and ability where others do not. Gandalf is affable, slow, and deliberate, but he is also a skilled fighter. His battles with Saruman and in the mines of Moria are heroic, and the Moria fight in particular provides the others in the fellowship with a model for the sacrifice their quest may require of them. The others assume Gandalf has died in this battle, but he returns, transformed from a gray wizard into a white one. Gandalf is often playful, but he is also deeply concerned about the fate of Middle-earth and always prepared to fight for its safety. At the end of the trilogy, he leaves with Bilbo, Frodo, and the elves for immortal life. Though this wizard seems human, he has always been a little different and a little better than any man could possibly be.";
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
