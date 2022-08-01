package Heros;

import Weapon.IWeapon;
import java.util.ArrayList;
import java.util.List;
import static Heros.HeroBase.wrapText;

public class Aragorn implements IHero {
    private String heroName;
    private int heroHp;
    private HeroBase.HeroName type;
    private int heroMaxHp;
    private int heroDamage;
    private String heroDesc;
    private List<IWeapon> heroWeapons;

    public Aragorn() {
        this.type = HeroBase.HeroName.ARAGORN;
        this.heroName = "Aragorn";
        this.heroDamage = 18;
        this.heroHp = 90;
        this.heroDesc = wrapText("The heir to the throne of Gondor. Though Aragorn is the rightful king of Gondor, he travels under an assumed identity at the beginning of the trilogy: he is a ranger, known as Strider. The fact that he is not upon the throne reveals the weak state of the kingdoms of men. As the trilogy proceeds, Aragorn shows himself to be a noble leader with a pure heart. He is relatively unaffected by desire for the ring and routinely throws himself in harm’s way to ensure the fellowship’s survival. In love with the elf princess Arwen, he fights for her survival and for the successful return of the ring to Mordor. He becomes increasingly comfortable asserting his royal identity, but only when he addresses the men of the mountain in The Return of the King does he actually declare himself king of Gondor. By the time he is crowned king at the end of the final film, he has proven himself to be a worthy leader.");
        this.heroWeapons = new ArrayList<>();
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
    public String toString() {
        return this.heroName + "'s \nHp: " + this.heroHp + "\nSingle Damage: " + this.heroDamage;
    }

    @Override
    public void heroInfo(IWeapon primaryWeapon) {
        System.out.println("=====================================");
        int count = 1;
        System.out.println("Hero's Weapons");
        for (IWeapon weapon : this.getHerosInventory()) {
            System.out.println(count++ + ". " + weapon);
        }
        System.out.println("=====================================");
        System.out.println("Name of Hero: " + this.getHeroName() + ", " +
                "\nand his Primary Weapon is: " + primaryWeapon + ". " +
                "\nHero's Hp: " + this.getHeroHp() + "." +
                "\nHero's Max-Hp: " + this.getHeroMaxHp() + "." +
                "\nHero's make a damage : " + this.getHeroDamage() + ".");
        System.out.println("=====================================");
        System.out.println(this.getHeroDescription());
        System.out.println("=====================================");
    }

}
