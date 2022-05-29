import Enemy.IEnemy;
import Heros.IHero;
import Places.IPlace;
import Weapon.IWeapon;
import Weapon.OneRing;

import java.util.Random;

public class EncounterEnemy {
    public  IHero currentHero;
    public  IWeapon currentWeapon;
    public  IEnemy currentEnemy;
    public  IPlace currentPlace;
    public static IWeapon heroPrimaryWeapon;
    public static IWeapon enemyPrimaryWeapon;
    Random random = new Random();
    public EncounterEnemy(IHero currentHero, IWeapon currentWeapon, IEnemy currentEnemy, IPlace currentPlace) {
        this.currentHero = currentHero;
        this.currentWeapon = currentWeapon;
        this.currentEnemy = currentEnemy;
        this.currentPlace = currentPlace;
        getEnemyWeapon();
//        heroPrimaryWeapon = currentHero.getHerosInventory().get(0);
    }
    public void encounterFight(){

        int conditionalEffect = random.nextInt(10);
        //enemy's is to starting point Hp
        int enemyHP = currentEnemy.getEnemyHp();
        System.out.println("Do you want to change your current weapon?" +
                "\n(1) Yes." +
                "\n(2) No.");
        int weaponChange = GameStart.readInt(2);
        if (weaponChange != 1) {
            int dmgTookEnemy = 0;
            //Enemy taken damage by the Hero,and Hero's damage capacity, Hero's weapon and place difficulties this damage.
            if (currentEnemy.getEnemyInventory().contains("OneRing")) {
                OneRing oneRing =  new OneRing();
                 dmgTookEnemy = currentEnemy.getEnemyHp()* (oneRing.getDamage() / 10) - conditionalEffect - ((currentEnemy.getEnemyHp() + currentPlace.getDifficulties()) - (currentHero.getHeroDamage() + heroPrimaryWeapon.getDamage() + currentPlace.getDifficulties()));
            }else{
                dmgTookEnemy = currentEnemy.getEnemyHp()  - conditionalEffect - ((currentEnemy.getEnemyHp() + currentPlace.getDifficulties()) - (currentHero.getHeroDamage() + heroPrimaryWeapon.getDamage() + currentPlace.getDifficulties()));
            }
            //Hero taken damage by the Enemy and, Enemy damage capacity and place difficulties this damage
            int dmgTookHero =0;
            if(currentHero.getHerosInventory().contains("OneRing")) {
                OneRing oneRing =  new OneRing();
                dmgTookHero= currentHero.getHeroHp() * (oneRing.getDamage() /10 ) - conditionalEffect - ((currentHero.getHeroHp() + currentPlace.getDifficulties()) - (currentEnemy.getEnemyDamage() + currentEnemy.getEnemyInventory().get(0).getDamage()+ currentPlace.getDifficulties()));
            }else{
                dmgTookHero= currentHero.getHeroHp() - conditionalEffect - ((currentHero.getHeroHp() + currentPlace.getDifficulties()) - (currentEnemy.getEnemyDamage() + currentPlace.getDifficulties()));

            }
            System.out.println(currentHero.getHeroName()+ " took " + dmgTookHero + " damage by " + currentEnemy.getEnemyName());
            System.out.println("Enemy took " + dmgTookEnemy + " damage by " + currentHero.getHeroName());

            //setting current enemy's Hp's
            currentEnemy.setEnemyHp(currentEnemy.getEnemyHp() - dmgTookEnemy);

            //Setting current an hero's Hp's
            currentHero.setHeroHp(currentHero.getHeroHp() - dmgTookHero);

            //If hero's Hp less than 0, hero is died.
            if (currentHero.getHeroHp() <= 0) {
                GameStart.playerDied();
            }//If enemy's HP is less than 0, Enemy was defeated.
            else if (currentEnemy.getEnemyHp() <= 0) {
                GameStart.printHeading("You defeated " + currentEnemy.getEnemyName() + "!\nYou earned " + enemyHP / 10 + " XP from your defeated enemy.");
                currentHero.setHeroHp(currentHero.getHeroHp() + enemyHP / 10);
                //setting Hero's current Hp after fighting current enemy.
                if (currentHero.getHeroHp() > currentHero.getHeroMaxHp()) {
                    currentHero.setHeroHp(currentHero.getHeroMaxHp());
                }
                GameStart.printHeading("(1) Do you want to fight again.\nDon't forget! You need more Hp for a powerful enemy.\n(2) I want to keep continue on my journey.");
                int isFightingAgain = GameStart.readInt(2);
                if (isFightingAgain == 1) {
                    GameStart.battle();
                } else {
                    //finishing battle loop.
                   GameStart.isRunning = false;
                }
            }
        } else {
            getHeroPrimaryWeapon();
        }
    }

    public  void  getEnemyWeapon(){
        int sizeWeaponList = currentEnemy.getEnemyInventory().size();
     Random random = new Random();
     int rdWeapon = random.nextInt(sizeWeaponList);
     enemyPrimaryWeapon = currentEnemy.getEnemyInventory().get(rdWeapon);
        System.out.println("Enemy's primary weapon is "+ enemyPrimaryWeapon);
    }

    public void getHeroPrimaryWeapon(){
        int count =1;
        for (IWeapon weapon : currentPlace.getWeapons()){
            System.out.println(count++ +". "+weapon);
        }
        GameStart.printHeading("Please select your primary weapon from your inventory.");
        int choice = GameStart.readInt(currentPlace.getWeapons().size());
        currentHero.getHerosInventory().add(currentPlace.getWeapons().get(choice));
        heroPrimaryWeapon = currentPlace.getWeapons().get(choice);
        System.out.println("Your primary weapon is "+ heroPrimaryWeapon);
        for (IWeapon weapon : currentPlace.getWeapons()){
            System.out.println(count++ +". "+weapon);
        }
        encounterFight();

    }

    //Hero choice to suing potion option for the healing himself will be using potion.
    public  void usePotion() {
        GameStart.printHeading("Use potion for the healing himself!");
        Random random = new Random();
        boolean doesExist = random.nextInt(2) == 1;
        if (doesExist){
            System.out.println("You found a potion, and you can put it in your inventory or can use it.");
            int potion = random.nextInt(20);
            this.currentHero.setHeroHp(potion);
        }

    }

    //If hero thinks cannot defeat this enemy, can use run away option, however while hero is trying to run away, might takes damage(s).
    public  void runAway() {
        int runAwayChance = random.nextInt(20) + 1;
        if (runAwayChance <= currentEnemy.getEnemyHp() / 10) {
            GameStart.printHeading("You ran away from the " + currentEnemy.getEnemyName());
        } else {
            GameStart.printHeading("You didn't manage to run away from the " + currentEnemy.getEnemyName());
            currentHero.setHeroHp(currentHero.getHeroHp() - runAwayChance);
            GameStart.printHeading("You took" + runAwayChance + " damage(s) while you were trying to run away");
            if (currentHero.getHeroHp() <= 0) {
                GameStart.printHeading("After this attempt you took too much damage,\n");
                GameStart.playerDied();
            }
        }

    }
}
