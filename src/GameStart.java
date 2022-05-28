
import Enemy.*;
import Heros.IHero;
import Heros.HeroBase;
import Places.IPlace;
import Places.Moria;
import Places.PlaceBase;
import Weapon.IWeapon;
import Weapon.WeaponBase;


import java.util.*;

public class GameStart {
    public static IHero currentHero;
    public static IHero secondaryHero;
    public static IWeapon currentWeapon;
    public static IEnemy currentEnemy;
    public static IPlace currentPlace;
    public static Scanner sc = new Scanner(System.in);
    public static boolean isRunning = true;
    public static boolean isFighting = true;
    public static Random random = new Random();
    public static String weaponDesc="";
//    public static Weapons weaponObject;
//    public static ArrayList<Weapons> weaponsList = new ArrayList<>();
//    public static CreatingObjects objects = new CreatingObjects();


    //Print necessary String
    public static void printHeading(String title) {
        printSeparator(30);
        System.out.println(title);
        printSeparator(30);
//        System.out.println(" ");
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
        return currentHero;
    }



    //Creating random weapon
    public static void createWeapon() {
        WeaponBase weapon = new WeaponBase();
        currentWeapon =weapon.createWeapon(1);

    }

    //    Creating an enemy
    public static IEnemy createEnemy() {
        EnemyBase enemyBase = new EnemyBase();
        int rd = random.nextInt(10)+1;
        return currentEnemy = enemyBase.createEnemy(rd);
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
                "\n(6) Move next room" +
                "\n(7) Exit");
    }

    public static void gameLoop() {
        while (isRunning) {
            showMenu();
            int input = readInt(7);
            switch (input) {
                case 0:
                    showMenu();
                    break;
                case 1:
                    heroInfo();
                    break;
                case 2:
                    enemyInfo();
                    break;
                case 3:
                    weaponInfo();
                    break;
                case 4:
                    placeInfo();
                    break;
                case 5:
                    move();
                    break;
                    case 6:
                    move();
                    break;
                case 7:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
            printHeading("Select the one of the option.");
        }
    }
//
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
        switch (placeName) {
            case "Shire":
                for (String place : currentPlace.getExits().keySet()) {
                    if (moveTo.equals("MORIA")){
                        createPlace("Moria");
                        System.out.println("You are moving at " + currentPlace.getName());
                        printSeparator(20);
                        break;
                    }else if (moveTo.equals("RIVENDELL")){
                        createPlace("Rivendell");
                        System.out.println("You are moving at " + currentPlace.getName());
                        printSeparator(20);
                        break;
                    }
                }
                break;
            case "Moria":
                for (IPlace place : currentPlace.getConnections()){
                if (place.equals(PlaceBase.PLACENAME.SHIRE)) {
                    createPlace("Shire");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (place.equals(PlaceBase.PLACENAME.ISENGARD)) {
                    createPlace("Isengard");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (place.equals(PlaceBase.PLACENAME.HELMSDEEP)) {
                    createPlace("Helms Deep");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }}
                break;
            case "Helms Deep":
                for (IPlace place : currentPlace.getConnections())
                if (place.equals(PlaceBase.PLACENAME.RIVENDELL)) {
                    createPlace("Rivendel");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (place.equals(PlaceBase.PLACENAME.ISENGARD)) {
                    createPlace("Isengard");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (place.equals(PlaceBase.PLACENAME.MINASTRITH)) {
                    createPlace("Minastrith");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                break;
            case "Isengard":
            case "Rivendel":
                for (IPlace place : currentPlace.getConnections()){
                if (place.equals(PlaceBase.PLACENAME.HELMSDEEP)) {
                    createPlace("Helms Deep");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (place.equals(PlaceBase.PLACENAME.MORIA)) {
                    createPlace("Moria");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                }
                break;
            case "Minastrith":
                for (IPlace place : currentPlace.getConnections()) {
                    if (place.equals(PlaceBase.PLACENAME.MINASTRITH)) {
                    createPlace("Minastrith");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                }
                break;
        }

    }

    //Random encounter for the player and player take a decision
    public static void randomEncounter() {
        printHeading("What do you want about an enemy? Choice one of the following options." +
                "\n(1). Go to battle." +
                "\n(2). Take a rest." +
                "\n(3). Grab a new Weapon." +
                "\n(4). Look Hero's the weapon inventory.");
//User will select one of the option for the next movement.
        int encounter = readInt(3);
        //calling respective methods
        switch (encounter) {
            case 1 -> battle();
            case 2 -> takeRest();
            case 3 -> addWeaponsInInventory();
            case 4 -> lookInventory();
        }
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

    public static void listWeapons() {
        System.out.println("Which weapon do you want to grab?");
        int lengthOfWeaponsList = currentPlace.getWeapons().size();
        for (int i=0;i<lengthOfWeaponsList;i++){
            System.out.println(i+1+". "+ currentWeapon.getWeapons().get(i));
        }
        System.out.println("Enter position to add, or enter 0 to exit.");
        int posToAdd=readInt(3)-1;
        if (posToAdd != -1){
//            currentHero.addWeaponToInventoryList(posToAdd);
//            currentPlace.getWeapons().remove(posToAdd);
        }
    }

    public static void addWeaponsInInventory() {
        listWeapons();
        //Getting user weapon decision. Hero can take only 2 weapons.
    }

    public static void takeRest() {
        printHeading("take a rest");
    }

    public static void battle() {
//        currentEnemy= objects.createEnemy();
        while (isFighting) {
            printHeading("Your enemy is " + currentEnemy.getEnemyName() + "\nEnemy's hp: " + currentEnemy.getEnemyHp() + "\nEnemy's max damage capacity: " + currentEnemy.getEnemyDamage());
            printHeading("Your hero's name: " + currentHero.getHeroName() + "\nYour hero's hp: " + currentHero.getHeroHp() + "\nHero's max damage capacity: " + currentHero.getHeroDamage());
            printHeading("Hero's current weapon is " + currentWeapon.getName() + "\nThe weapon damage capacity : " + currentWeapon.getDamage());
            printHeading("Your fighting location is :" + currentPlace.getName() + "\nThe place difficulty is : " + currentPlace.getDifficulties());
            printSeparator(20);
            System.out.println("What's your decision about this enemy." +
                    "\nWhile you were taking to decision, you must be wise and  careful." +
                    "\n(1) Fight,\n(2) Change weapon\n(3) Use Potion for healing,\n(4) Run away.\n(5) Call another Hero for the help.");
            printSeparator(20);
            int battleDecision = readInt(5);
            switch (battleDecision) {
                case 1 -> fight();
                case 2 -> changeWeapon();
                case 3 -> usePotion();
                case 4 -> runAway();
                case 5 -> callAnotherHero();
            }
        }
    }


    // fighting for the current enemy.
    public static void fight() {
        int conditionalEffect = random.nextInt(10);
        //enemy's is to starting point Hp
        int enemyHP = currentEnemy.getEnemyHp();
        System.out.println("Do you want to change your current weapon?\n(1) Yes.\n(2) No.");
        int weaponChange = readInt(2);
        if (weaponChange != 1) {
            //Enemy taken damage by the Hero,and Hero's damage capacity, Hero's weapon and place difficulties this damage.
            int dmgTookEnemy = currentEnemy.getEnemyHp() - conditionalEffect - ((currentEnemy.getEnemyHp() + currentPlace.getDifficulties()) - (currentHero.getHeroDamage() + currentWeapon.getDamage() + currentPlace.getDifficulties()));

            //Hero taken damage by the Enemy and, Enemy damage capacity and place difficulties this damage
            int dmgTookHero = currentHero.getHeroHp() - conditionalEffect - ((currentHero.getHeroHp() + currentPlace.getDifficulties()) - (currentEnemy.getEnemyDamage() + currentPlace.getDifficulties()));

            System.out.println("You took " + dmgTookHero + " damage by " + currentEnemy.getEnemyName());
            System.out.println("Enemy took " + dmgTookEnemy + " damage by " + currentHero.getHeroName());

            //setting current enemy's Hp's
            currentEnemy.setEnemyHp(currentEnemy.getEnemyHp() - dmgTookEnemy);

            //Setting current an hero's Hp's
            currentHero.setHeroHp(currentHero.getHeroHp() - dmgTookHero);

            //If hero's Hp less than 0, hero is died.
            if (currentHero.getHeroHp() <= 0) {
                playerDied();
            }//If enemy's HP is less than 0, Enemy was defeated.
            else if (currentEnemy.getEnemyHp() <= 0) {
                printHeading("You defeated " + currentEnemy.getEnemyName() + "!\nYou earned " + enemyHP / 10 + " XP from your defeated enemy.");
                currentHero.setHeroHp(currentHero.getHeroHp() + enemyHP / 10);
                //setting Hero's current Hp after fighting current enemy.
                if (currentHero.getHeroHp() > currentHero.getHeroMaxHp()) {
                    currentHero.setHeroHp(currentHero.getHeroMaxHp());
                }
                printHeading("(1) Do you want to fight again.\nDon't forget! You need more Hp for a powerful enemy.\n(2) I want to keep continue on my journey.");
                int isFightingAgain = readInt(2);
                if (isFightingAgain == 1) {
                    battle();
                } else {
                    //finishing battle loop.
                    isFighting = false;
                }
            }
        } else {
            changeWeapon();
        }
    }

    //Change hero's weapon in his inventory
    public static void changeWeapon() {
        System.out.println("Your current weapon is " + currentWeapon.getName());
        System.out.println("Currently you are " + currentPlace.getName() + "." +
                "\nIn your location there is/(are) some weapons.");
        //Doesn't finish yet Look very closely.
        System.out.println("(1). ");


    }

    //Hero choice to suing potion option for the healing himself will be using potion.
    public static void usePotion() {
        printHeading("Use potion for the healing himself!");

    }

    //If hero thinks cannot defeat this enemy, can use run away option, however while hero is trying to run away, might takes damage(s).
    public static void runAway() {
        int runAwayChance = random.nextInt(20) + 1;
        if (runAwayChance <= currentEnemy.getEnemyHp() / 10) {
            printHeading("You ran away from the " + currentEnemy.getEnemyName());
        } else {
            printHeading("You didn't manage to run away from the " + currentEnemy.getEnemyName());
            currentHero.setHeroHp(currentHero.getHeroHp() - runAwayChance);
            printHeading("You took" + runAwayChance + " damage(s) while you were trying to run away");
            if (currentHero.getHeroHp() <= 0) {
                printHeading("After this attempt you took too much damage,\n");
                playerDied();
            }
        }

    }

    // if any condition player's dead, game will be exit.Game exiting point.
    public static void playerDied() {
        printHeading("You died!");
        printHeading("You had " + currentHero.getHeroHp() + " on your journey. Try to earn more next time.");
        System.out.println("Thank you!!!");
        isRunning = false;
    }


    //Getting weapon's info
    public static void weaponInfo() {
        printSeparator(20);
        System.out.println("Name of weapon is : " + currentWeapon.getName() + "." +
                "\nWeapon damage is : " + currentWeapon.getDamage());
        printSeparator(20);
    }

    //Getting hero's info
    public static void heroInfo() {
        printSeparator(30);
        System.out.println("Name of Hero: " + currentHero.getHeroName() +
                "\nHero's Hp: " + currentHero.getHeroHp() + "." +
                "\nHero's Max-Hp: " + currentHero.getHeroMaxHp() + "." +
                "\nHero's make a damage : " + currentHero.getHeroDamage() + ".");
        printSeparator(20);
        System.out.println(currentHero.getHeroDescription());
        printSeparator(30);
    }

    //Getting enemy's info
    public static void enemyInfo() {
        printSeparator(30);
        System.out.println("Name of Enemy: " + currentEnemy.getEnemyName() +
                "\nHero's Hp: " + currentEnemy.getEnemyHp() + "." +
                "\nHero's make a damage : " + currentEnemy.getEnemyDamage() + ".");
        printSeparator(20);
        System.out.println(currentEnemy.getEnemyDesc());
        printSeparator(30);
    }

    //Getting place info
    public static void placeInfo() {
        printSeparator(20);
        System.out.println("Name of place is : " + currentPlace.getName() + "." +
                "\nDifficulties is : " + currentPlace.getDifficulties());
        printSeparator(20);
        System.out.println(currentPlace.getDescription());
        printSeparator(20);
    }

    //the gaming starting point
    public static void gameStartingPoint() {
        printHeading("Hello we are starting a new game. This game basic RPG game." +
                "\nPlease read info and follow the guidelines...");
        createHero();
        createPlace("Shire");
        createWeapon();
        createEnemy();
        System.out.println(currentPlace.getExits().get(2));
       gameLoop();
    }


}
