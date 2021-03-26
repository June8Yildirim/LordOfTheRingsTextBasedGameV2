

import Enemy.Enemy;
import Heros.Heros;
import Places.Place;
import Weapon.Weapons;

import java.util.Random;
import java.util.Scanner;

public class GameStart {
    public static Heros currentHero;
    public static Heros secondaryHero;
    public static Weapons currentWeapon;
    public static Enemy currentEnemy;
    public static Place currentPlace;
    public static Scanner sc = new Scanner(System.in);
    public static boolean isRunning = true;
    public static boolean isFighting = true;
    public static Random random = new Random();
    public static String weaponDesc="";
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
    public static Heros createHero() {
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
        int input = readInt(10);
        switch (input) {
            case 1:
                currentHero = new Heros(Heros.HerosName.GREYGANDALF, "Gandalf the Gray", 100, 20);
                break;
            case 2:
                currentHero = new Heros(Heros.HerosName.GIMLI, "Gimli", 70, 8);
                break;
            case 3:
                currentHero = new Heros(Heros.HerosName.LEGOLAS, "Legolas", 80, 12);
                break;
            case 4:
                currentHero = new Heros(Heros.HerosName.FRODO, "Frodo", 40, 5);
                break;
            case 5:
                currentHero = new Heros(Heros.HerosName.ARAGORN, "Aragorn", 90, 18);
                break;
            case 6:
                currentHero = new Heros(Heros.HerosName.STRIDER, "Strider", 80, 13);
                break;
            case 7:
                currentHero = new Heros(Heros.HerosName.MITHRANDIR, "Mithrandir", 90, 16);
                break;
            case 8:
                currentHero = new Heros(Heros.HerosName.WHITEGANDALF, "Gandalf the White", 110, 22);
                break;
            case 9:
                currentHero = new Heros(Heros.HerosName.GALADRIEL, "Galadriel", 120, 25);
                break;
            case 10:
                currentHero = new Heros(Heros.HerosName.ELROND, "Elrond", 115, 24);
                break;
            default:
                System.out.println("Invalid Entry");

        }

        System.out.println("Your hero's is " + currentHero.getName());
        GameStart.printSeparator(20);
//        currentWeapon.createWeaponsList();
        return currentHero;
    }

    //Creating random weapon
    public static void createWeapon(Weapons.WeaponName weaponName) {
        weaponDesc = currentWeapon.getWeaponDescription(weaponName);
        currentWeapon.setUpWeapons(weaponName);

    }

    //    Creating an enemy
    public static Enemy createEnemy(String enemyName) {
        switch (enemyName) {
            case "Orch":
                currentEnemy = new Enemy(Enemy.EnemyNames.ORCH, "Orch", 8, 30, 1);
                break;
            case "Gollum":
                currentEnemy = new Enemy(Enemy.EnemyNames.GOLLUM, "Gollum", 10, 40, 2);
                break;
            case "Troll":
                currentEnemy = new Enemy(Enemy.EnemyNames.TROLL, "Troll", 12, 50, 3);
                break;
            case "Saruman":
                currentEnemy = new Enemy(Enemy.EnemyNames.SARUMAN, "Saruman", 20, 120, 7);
                break;
            case "Sauron":
                currentEnemy = new Enemy(Enemy.EnemyNames.SAURON, "Sauron", 25, 140, 20);
                break;
            case "Goblin":
                currentEnemy = new Enemy(Enemy.EnemyNames.GOBLIN, "Goblin", 11, 45, 2);
                break;
            case "Balrog":
                currentEnemy = new Enemy(Enemy.EnemyNames.BALROG, "Balrog", 16, 80, 5);
                break;
            case "Angmar":
                currentEnemy = new Enemy(Enemy.EnemyNames.ANGMAR, "Angmar", 23, 130, 12);
                break;
            case "Shelop":
                currentEnemy = new Enemy(Enemy.EnemyNames.SHELOB, "Shelop", 13, 90, 7);
                break;
            case "Uruk-Hai":
                currentEnemy = new Enemy(Enemy.EnemyNames.URUKHAI, "Uruk-Hai", 15, 85, 6);
                break;
            case "Nazgul":
                currentEnemy = new Enemy(Enemy.EnemyNames.NAZGUL, "Nazgul", 19, 100, 8);
                break;
            default:
                System.out.println("Invalid Entry");

        }
        return currentEnemy;
    }

    //Creating place list
    public static Place createPlace(String placeName) {
        switch (placeName) {
            case "Shire":
                currentPlace = new Place(Place.placeName.SHIRE, "Shire", 5);
                break;
            case "Moria":
                currentPlace = new Place(Place.placeName.MORIA, "Moria", 10);
                break;
            case "Helms Deep":
                currentPlace = new Place(Place.placeName.HELMSDEEP, "Helms Deep", 13);
                break;
            case "Isengard":
                currentPlace = new Place(Place.placeName.ISENGARD, "Isengard", 8);
                break;
            case "Rivendel":
                currentPlace = new Place(Place.placeName.RIVENDELL, "Rivendel", 6);
                break;
            case "Minastrith":
                currentPlace = new Place(Place.placeName.MINASTRITH, "Minastrith", 15);
                break;
            default:
                System.out.println("Invalid entry!");
        }
        System.out.println("You are currently at the " + currentPlace.getName());
        return currentPlace;

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
                "\n(8) Exit");
    }

    public static void gameLoop() {
        while (isRunning) {
            showMenu();
            int input = readInt(6);
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
                case 8:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid Entry");
            }
            printHeading("Select the one of the option.");
        }
    }

    //Player moving on place to another
    public static void move() {
        System.out.println("Your current place is " + currentPlace.getName());
        //Before moving to the another location dealing an enemy.
        randomEncounter();
        //Displaying possible moving location
        for (int i = 0; i < currentPlace.findConnection().length; i++) {
            System.out.println(i + 1 + ". possible location to move " + currentPlace.findConnection()[i]);
        }
        System.out.println("Enter place to move");
        int placeToMove = readInt(6) - 1;
        String placeName = currentPlace.getName();
        switch (placeName) {
            case "Shire":
                if (currentPlace.findConnection()[placeToMove].equals(Place.placeName.MORIA)) {
                    createPlace("Moria");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                break;
            case "Moria":
                if (currentPlace.findConnection()[placeToMove] == Place.placeName.SHIRE) {
                    createPlace("Shire");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.ISENGARD) {
                    createPlace("Isengard");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.HELMSDEEP) {
                    createPlace("Helms Deep");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                break;
            case "Helms Deep":
                if (currentPlace.findConnection()[placeToMove] == Place.placeName.RIVENDELL) {
                    createPlace("Rivendel");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.ISENGARD) {
                    createPlace("Isengard");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.MINASTRITH) {
                    createPlace("Minastrith");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                break;
            case "Isengard":
            case "Rivendel":
                if (currentPlace.findConnection()[placeToMove] == Place.placeName.HELMSDEEP) {
                    createPlace("Helms Deep");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                } else if (currentPlace.findConnection()[placeToMove] == Place.placeName.MORIA) {
                    createPlace("Moria");
                    System.out.println("You are moving at " + currentPlace.getName());
                    printSeparator(20);
                }
                break;
            case "Minastrith":
                createPlace("Minastrith");
                System.out.println("You are moving at " + currentPlace.getName());
                printSeparator(20);
                break;
        }

    }

    //Random encounter for the player and player take a decision
    public static void randomEncounter() {
        printHeading("What do you want about an enemy? Choice one of the following options.\n(1). Go to battle." +
                "\n(2). Take a rest.\n(3). Grab a new Weapon.\n(4). Look Hero's the weapon inventory.");
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
        int lengthOfWeaponsList = currentWeapon.getListLength();
        for (int i=0;i<lengthOfWeaponsList;i++){
            System.out.println(i+1+". "+ currentWeapon.getWeaponAtPosition(i));
        }
        System.out.println("Enter position to add, or enter 0 to exit.");
        int posToAdd=readInt(3)-1;
        if (posToAdd != -1){
            currentHero.addWeaponToInventory(currentWeapon.getWeaponAtPosition(posToAdd));
            currentPlace.removeWeaponFromPlace(currentWeapon.getWeaponAtPosition(posToAdd));
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
            printHeading("Your enemy is " + currentEnemy.getName() + "\nEnemy's hp: " + currentEnemy.getHp() + "\nEnemy's max damage capacity: " + currentEnemy.getDamage());
            printHeading("Your hero's name: " + currentHero.getName() + "\nYour hero's hp: " + currentHero.getHp() + "\nHero's max damage capacity: " + currentHero.getDamage());
            printHeading("Hero's current weapon is " + currentWeapon.getName() + "\nThe weapon damage capacity : " + currentWeapon.getDamage());
            printHeading("Your fighting location is :" + currentPlace.getName() + "\nThe place difficulty is : " + currentPlace.getDifficulties());
            printSeparator(20);
            System.out.println("What's your decision about this enemy." +
                    "\nWhile you were taking to decision, you must be wise and  careful." +
                    "\n(1) Fight,\n(2) Change weapon\n(3) Use Potion for healing,\n(4) Run away.\n(5) Call another Hero for the help.");
            printSeparator(20);
            int battleDecision = readInt(3);
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
        int enemyHP = currentEnemy.getHp();
        System.out.println("Do you want to change your current weapon?\n(1) Yes.\n(2) No.");
        int weaponChange = readInt(2);
        if (weaponChange != 1) {
            //Enemy taken damage by the Hero,and Hero's damage capacity, Hero's weapon and place difficulties this damage.
            int dmgTookEnemy = currentEnemy.getHp() - conditionalEffect - ((currentEnemy.getHp() + currentPlace.getDifficulties()) - (currentHero.getDamage() + currentWeapon.getDamage() + currentPlace.getDifficulties()));

            //Hero taken damage by the Enemy and, Enemy damage capacity and place difficulties this damage
            int dmgTookHero = currentHero.getHp() - conditionalEffect - ((currentHero.getHp() + currentPlace.getDifficulties()) - (currentEnemy.getDamage() + currentPlace.getDifficulties()));

            System.out.println("You took " + dmgTookHero + " damage by " + currentEnemy.getName());
            System.out.println("Enemy took " + dmgTookEnemy + " damage by " + currentHero.getName());

            //setting current enemy's Hp's
            currentEnemy.setHp(currentEnemy.getHp() - dmgTookEnemy);

            //Setting current an hero's Hp's
            currentHero.setHp(currentHero.getHp() - dmgTookHero);

            //If hero's Hp less than 0, hero is died.
            if (currentHero.getHp() <= 0) {
                playerDied();
            }//If enemy's HP is less than 0, Enemy was defeated.
            else if (currentEnemy.getHp() <= 0) {
                printHeading("You defeated " + currentEnemy.getName() + "!\nYou earned " + enemyHP / 10 + " XP from your defeated enemy.");
                currentHero.setHp(currentHero.getHp() + enemyHP / 10);
                //setting Hero's current Hp after fighting current enemy.
                if (currentHero.getHp() > currentHero.getMaxHp()) {
                    currentHero.setHp(currentHero.getMaxHp());
                }
                printHeading("Do you want to fight again.\nDon't forget! You need more Hp for a powerful enemy.");
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
        if (runAwayChance <= currentEnemy.getHp() / 10) {
            printHeading("You ran away from the " + currentEnemy.getName());
        } else {
            printHeading("You didn't manage to run away from the " + currentEnemy.getName());
            currentHero.setHp(currentHero.getHp() - runAwayChance);
            printHeading("You took" + runAwayChance + " damage(s) while you were trying to run away");
            if (currentHero.getHp() <= 0) {
                printHeading("After this attempt you took too much damage,\n");
                playerDied();
            }
        }

    }

    // if any condition player's dead, game will be exit.Game exiting point.
    public static void playerDied() {
        printHeading("You died!");
        printHeading("You had " + currentHero.getHp() + " on your journey. Try to earn more next time.");
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
        System.out.println("Name of Hero: " + currentHero.getName() +
                "\nHero's Hp: " + currentHero.getHp() + "." +
                "\nHero's Max-Hp: " + currentHero.getMaxHp() + "." +
                "\nHero's make a damage : " + currentHero.getDamage() + ".");
        printSeparator(20);
        System.out.println(currentHero.getHeroDescription(currentHero.getName()));
        printSeparator(30);
    }

    //Getting enemy's info
    public static void enemyInfo() {
        printSeparator(30);
        System.out.println("Name of Enemy: " + currentEnemy.getName() +
                "\nHero's Hp: " + currentEnemy.getHp() + "." +
                "\nHero's make a damage : " + currentEnemy.getDamage() + ".");
        printSeparator(20);
        System.out.println(currentEnemy.getEnemyDescription(currentEnemy.getName()));
        printSeparator(30);
    }

    //Getting place info
    public static void placeInfo() {
        printSeparator(20);
        System.out.println("Name of place is : " + currentPlace.getName() + "." +
                "\nDifficulties is : " + currentPlace.getDifficulties());
        printSeparator(20);
        System.out.println(currentPlace.getPlaceDescription(currentPlace.getName()));
        printSeparator(20);
    }

    //the gaming starting point
    public static void gameStartingPoint() {
        printHeading("Hello we are starting a new game. This game basic RPG game." +
                "\nPlease read info and follow the guidelines...");
        createHero();
        createPlace("Shire");
        createWeapon(Weapons.WeaponName.KNIFE);
        createEnemy("Orch");
        System.out.println(currentWeapon.getName());
        System.out.println(Weapons.weaponsList.size());
        gameLoop();
    }


}
