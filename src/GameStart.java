
import Enemy.*;
import Heros.IHero;
import Heros.HeroBase;
import Places.IPlace;
import Places.PlaceBase;
import Weapon.IWeapon;
import Weapon.WeaponBase;


import java.util.*;

public class GameStart {
    public static IHero currentHero;
    public static IHero secondaryHero;
    public static IWeapon primaryWeapon;
    public static IWeapon currentWeapon;
    public static IEnemy currentEnemy;
    public static IPlace currentPlace;
    public static Scanner sc = new Scanner(System.in);
    public static boolean isRunning = true;
    public static boolean isFighting = true;
    public static Random random = new Random();


    //Print necessary String
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
    }

    // method to print a separator with length
    public static void printSeparator(int n) {
        for (int i = 0; i < n; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    //Getting information from the user
    public static int readInt(int userChoice) {
        int input;
        do {
            System.out.print("---> ");
            try {
                input = Integer.parseInt(sc.next());
            } catch (Exception e) {
                input = -1;
                System.out.print("Please enter an integer!");
            }
        } while (input < 1 || input > userChoice);
        return input;
    }

    //Creating an Hero
    public static IHero createHero() {
        printSeparator(30);
        System.out.println("Choice your hero?" +
                "\n(1) Mithrandir" +
                "\n(2) Gimli" +
                "\n(3) Legolas" +
                "\n(4) Frodo" +
                "\n(5) Aragorn" +
                "\n(6) Strider" +
                "\n(7) Gandalf the Gray" +
                "\n(8) Gandalf the White" +
                "\n(9) Elrond" +
                "\n(10) Galadriel");
        int selectedHero = readInt(10);
        HeroBase hero = new HeroBase();
        currentHero = hero.createHero(selectedHero);
        System.out.println("Your hero's is " + currentHero.getHeroName());

        GameStart.printSeparator(20);
        createWeapon();
        primaryWeapon = currentWeapon;
        currentHero.getHerosInventory().add(primaryWeapon);
        System.out.println("Primary weapon is :" + primaryWeapon);
        System.out.println("Current weapon is :" + currentHero.getHerosInventory().toString());
        return currentHero;
    }



    //Creating random weapon
    public static void createWeapon() {
        WeaponBase weapon = new WeaponBase();
        currentWeapon =weapon.createWeapon(1);
    }

    //    Creating an enemy
    public static IEnemy createEnemy() {
        int randomEnemy = random.nextInt(currentPlace.getEnemies().size());
        return currentEnemy = currentPlace.getEnemies().get(randomEnemy);
    }

    //Creating place list
    public static IPlace createPlace(String placeName) {
        PlaceBase placeBase = new PlaceBase();
        return currentPlace = placeBase.createPlace(placeName);
    }

    public static void showMenu() {
        printSeparator(30);
        System.out.println("Menu" +
                "\n(0) Show menu" +
                "\n(1) Hero info" +
                "\n(2) Enemy info" +
                "\n(3) Weapon info" +
                "\n(4) Place Info" +
                "\n(5) Move next room" +
                "\n(6) Random Encounter" +
                "\n(7) Exit");
    }

    public static void gameLoop() {
        while (isRunning) {
            showMenu();
            int input = readInt(7);
            switch (input) {
                case 0 -> showMenu();
                case 1 -> currentHero.heroInfo(primaryWeapon);
                case 2 -> System.out.println(currentEnemy.toString());
                case 3 -> System.out.println(currentWeapon.toString());
                case 4 -> System.out.println(currentPlace.toString());
                case 5 -> move();
                case 6 -> randomEncounter();
                case 7 -> isRunning = false;
                default -> System.out.println("Invalid Entry");
            }
            printHeading("Select the one of the option.");
        }
    }

    private static String getNextLocationName(int choice){
        Set<String> entry = currentPlace.getExits().keySet();
        return  entry.toArray()[choice].toString();
    }

    //Player moving on place to another
    public static void move() {
        System.out.println("Your current place is " + currentPlace.getName());
        //Before moving to the another location dealing an enemy.

//        randomEncounter();

        //Displaying possible moving location
        for (String exit : currentPlace.getExits().keySet()) {
            System.out.println("Possible location to move " + exit);
        }
        System.out.println("Enter place to move");
        int choice = readInt(currentPlace.getExits().size())-1;
        String moveTo = getNextLocationName(choice);
        String placeName = currentPlace.getName();

        MoveToPlace moveToPlace  = new MoveToPlace(currentPlace,placeName,moveTo);
        moveToPlace.move();
        System.out.println("The current place is  "+currentPlace.getName());
    }

    //Random encounter for the player and player take a decision
    public static void randomEncounter() {
        printHeading("What do you want about an enemy? Choice one of the following options." +
                "\n(1). Go to battle." +
                "\n(2). Take a rest." +
                "\n(3). Grab a new Weapon." +
                "\n(4).Change a primary weapon." +
                "\n(5). Look Hero's the weapon inventory.");
        //User will select one of the option for the next movement.
        int encounter = readInt(4);
        //calling respective methods
        switch (encounter) {
            case 1 -> battle();
            case 2 -> takeRest();
            case 3 -> addWeaponsInInventory();
            case 4 -> changePrimaryWeapon();
            case 5 -> lookInventory();
        }
    }

    public static void changePrimaryWeapon(){
        System.out.println("Your primary weapon is "+ primaryWeapon);
        int count =1;
        printHeading("Your weapon inventory list are. Select one of the weapon");
         for (IWeapon weapon : currentHero.getHerosInventory()){
             System.out.println(weapon);
         }
         int choice = readInt(currentHero.getHerosInventory().size())-1;
         primaryWeapon = currentHero.getHerosInventory().get(choice);
        System.out.println("Your primary weapon is "+ primaryWeapon);
    }
    public static void lookInventory() {
        for (int i = 0; i < currentHero.getHerosInventory().size(); i++) {
            System.out.println(i + 1 + ". weapon " + currentHero.getHerosInventory().get(i));
        }
    }

    public static void callAnotherHero() {
        System.out.println("Which want to call help?");
        secondaryHero = createHero();
    }

    public static void addWeaponsInInventory() {
        //Getting user weapon decision. Hero can take only 2 weapons.
        System.out.println("Which weapon do you want to grab?");
        int count =1;
        for (IWeapon weapon : currentPlace.getWeapons()){
            System.out.println(count++ +". "+weapon.getName());
        }
        System.out.println("Enter position to add, or enter 0 to exit.");
        int posToAdd=readInt(currentPlace.getWeapons().size())-1;
        currentHero.getHerosInventory().add(currentPlace.getWeapons().get(posToAdd));
        currentPlace.getWeapons().remove(posToAdd);

        for (IWeapon weapon : currentHero.getHerosInventory()){
            System.out.println(weapon);
        }
    }

    public static void takeRest() {
        printHeading("take a rest");
    }

    public static void battle() {
//        currentEnemy= objects.createEnemy();
        EncounterEnemy encounter = new EncounterEnemy(currentHero,currentWeapon,currentEnemy,currentPlace);
        encounter.encounterFight();
        while (isFighting) {

            System.out.println("What's your decision about this enemy." +
                    "\nWhile you were taking to decision, you must be wise and  careful." +
                    "\n(1) Fight,\n(2) Change weapon\n(3) Use Potion for healing,\n(4) Run away.\n(5) Call another Hero for the help.");
            printSeparator(20);
            int battleDecision = readInt(5);
            displayHealthConditions();
            switch (battleDecision) {
                case 1 -> encounter.encounterFight();
                case 2 -> encounter.getHeroPrimaryWeapon();
                case 3 -> encounter.usePotion();
                case 4 -> encounter.runAway();
                case 5 -> callAnotherHero();
                case 6-> displayHealthConditions();
            }
        }
    }

    public static void displayHealthConditions(){
        printHeading("Your enemy is " + currentEnemy.getEnemyName() + "\nEnemy's hp: " + currentEnemy.getEnemyHp() + "\nEnemy's max damage capacity: " + currentEnemy.getEnemyDamage());
        printHeading("Your hero's name: " + currentHero.getHeroName() + "\nYour hero's hp: " + currentHero.getHeroHp() + "\nHero's max damage capacity: " + currentHero.getHeroDamage());
        printHeading("Hero's current weapon is " + currentWeapon.getName() + "\nThe weapon damage capacity : " + currentWeapon.getDamage());
        printHeading("Your fighting location is :" + currentPlace.getName() + "\nThe place difficulty is : " + currentPlace.getDifficulties());
        printSeparator(20);
    }

    // if any condition player's dead, game will be exit.Game exiting point.
    public static void playerDied() {
        printHeading("You died!");
        printHeading("You had " + currentHero.getHeroHp() + " on your journey. Try to earn more next time.");
        System.out.println("Thank you!!!");
        isRunning = false;
    }

    //the gaming starting point
    public static void gameStartingPoint() {
        printHeading("Hello we are starting a new game. This game basic RPG game." +
                "\nPlease read info and follow the guidelines...");
        createHero();
        createPlace("Shire");

        createEnemy();
        System.out.println(currentPlace.getExits());
       gameLoop();
    }
}
