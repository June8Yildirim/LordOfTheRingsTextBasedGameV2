
import Enemy.Enemy;
import Heros.Heros;
import Items.Items;
import Places.Place;
import Weapon.Weapons;

import java.util.ArrayList;
import java.util.Random;

public class CreatingObjects {

    public static Heros currentHero;
    public static Weapons weaponObject;
    public static Enemy currentEnemy;
    public static Place currentPlace;
    public static ArrayList<Enemy> enemyList = new ArrayList<>();
    public static ArrayList<Place> placesList = new ArrayList<>();
    public static ArrayList<Weapons> weaponList = new ArrayList<>();
    public static ArrayList<Heros> herosList = new ArrayList<>();
    public static ArrayList<Items> inventory = new ArrayList<>();

    public static Random random = new Random();


    //Creating random weapon
    public Weapons createWeapon() {
        int input = (random.nextInt(7) + 1);
        switch (input) {
            case 1:
                weaponObject = new Weapons(Weapons.WeaponName.NARSIL, "Narsil", 20);
                break;
            case 2:
                weaponObject = new Weapons(Weapons.WeaponName.AXE, "Axe", 11);
                break;
            case 3:
                weaponObject = new Weapons(Weapons.WeaponName.ELFBOW, "Elfbow", 13);
                break;
            case 4:
                weaponObject = new Weapons(Weapons.WeaponName.KNIFE, "Knife", 5);
            case 5:
                weaponObject = new Weapons(Weapons.WeaponName.STING, "Sting", 10);
                break;
            case 6:
                weaponObject = new Weapons(Weapons.WeaponName.ORCRIST, "Orchrist", 18);
                break;
            case 7:
                weaponObject = new Weapons(Weapons.WeaponName.GLAMDRING, "Glamdring", 10);
                break;
            default:
                System.out.println("Invalid Entry");

        }
        return weaponObject;
    }

    //Creating an Hero
    public Heros createHero(int input) {
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
        return currentHero;
    }

    //    Creating an enemy
    public Enemy createEnemy() {
        int input = (random.nextInt(10) + 1);
        switch (input) {
            case 1:
                currentEnemy = new Enemy(Enemy.EnemyNames.ORCH, "Orch", 8, 30, 1);
                break;
            case 2:
                currentEnemy = new Enemy(Enemy.EnemyNames.GOLLUM, "Gollum", 10, 40, 2);
                break;
            case 3:
                currentEnemy = new Enemy(Enemy.EnemyNames.TROLL, "Troll", 12, 50, 3);
                break;
            case 4:
                currentEnemy = new Enemy(Enemy.EnemyNames.SARUMAN, "Saruman", 20, 120, 7);
                break;
            case 5:
                currentEnemy = new Enemy(Enemy.EnemyNames.SAURON, "Sauron", 25, 140, 20);
                break;
            case 6:
                currentEnemy = new Enemy(Enemy.EnemyNames.GOBLIN, "Goblin", 11, 45, 2);
                break;
            case 7:
                currentEnemy = new Enemy(Enemy.EnemyNames.BALROG, "Balrog", 16, 80, 5);
                break;
            case 8:
                currentEnemy = new Enemy(Enemy.EnemyNames.ANGMAR, "Angmar", 23, 130, 12);
                break;
            case 9:
                currentEnemy = new Enemy(Enemy.EnemyNames.SHELOB, "Shelop", 13, 90, 7);
                break;
            case 10:
                currentEnemy = new Enemy(Enemy.EnemyNames.URUKHAI, "Uruk-Hai", 15, 85, 6);
                break;
            case 11:
                currentEnemy = new Enemy(Enemy.EnemyNames.NAZGUL, "Nazgul", 19, 100, 8);
                break;
            default:
                System.out.println("Invalid Entry");

        }
        return currentEnemy;
    }

    //Creating place list
    public static Place createPlace() {
        int input = (random.nextInt(5) + 1);
        switch (input) {
            case 1:
                currentPlace = new Place(Place.placeName.SHIRE, "Shire", 5);
                break;
            case 2:
                currentPlace = new Place(Place.placeName.MORIA, "Moria", 10);
                break;
            case 3:
                currentPlace = new Place(Place.placeName.HELMSDEEP, "Helms Deep", 13);
                break;
            case 4:
                currentPlace = new Place(Place.placeName.ISENGARD, "Isengard", 8);
                break;
            case 5:
                currentPlace = new Place(Place.placeName.RIVENDELL, "Rivendel", 6);
                break;
            case 6:
                currentPlace = new Place(Place.placeName.MINASTRITH, "Minastrith", 15);
                break;
            default:
                System.out.println("Invalid entry!");
        }

        return currentPlace;

    }

    public static void placeList() {
        placesList.add(new Place(Place.placeName.SHIRE, "Shire", 5));
        placesList.add(new Place(Place.placeName.MORIA, "Moria", 10));
        placesList.add(new Place(Place.placeName.HELMSDEEP, "Helms Deep", 13));
        placesList.add(new Place(Place.placeName.ISENGARD, "Isengard", 8));
        placesList.add(new Place(Place.placeName.RIVENDELL, "Rivendel", 6));
        placesList.add(new Place(Place.placeName.MINASTRITH, "Minastrith", 15));
    }


    //Creating weapon list
    public static void weaponList() {
        weaponList.add(new Weapons(Weapons.WeaponName.ORCRIST, "Orchrist", 18));
        weaponList.add(new Weapons(Weapons.WeaponName.NARSIL, "Narsil", 20));
        weaponList.add(new Weapons(Weapons.WeaponName.AXE, "Axe", 11));
        weaponList.add(new Weapons(Weapons.WeaponName.ELFBOW, "Elfbow", 13));
        weaponList.add(new Weapons(Weapons.WeaponName.KNIFE, "Knife", 5));
        weaponList.add(new Weapons(Weapons.WeaponName.STING, "Sting", 10));
        weaponList.add(new Weapons(Weapons.WeaponName.GLAMDRING, "Glamdring", 10));

    }
    //Creating hero list
    public static void heroList() {
        herosList.add(new Heros(Heros.HerosName.FRODO, "Frodo", 40, 5));
        herosList.add(new Heros(Heros.HerosName.GIMLI, "Gimli", 70, 8));
        herosList.add(new Heros(Heros.HerosName.LEGOLAS, "Legolas", 80, 12));
        herosList.add(new Heros(Heros.HerosName.STRIDER, "Strider", 80, 13));
        herosList.add(new Heros(Heros.HerosName.ARAGORN, "Aragorn", 90, 18));
        herosList.add(new Heros(Heros.HerosName.MITHRANDIR, "Mithrandir", 90, 16));
        herosList.add(new Heros(Heros.HerosName.GREYGANDALF, "Gandalf the Gray", 100, 20));
        herosList.add(new Heros(Heros.HerosName.WHITEGANDALF, "Gandalf the White", 110, 22));
        herosList.add(new Heros(Heros.HerosName.ELROND, "Elrond", 115, 24));
        herosList.add(new Heros(Heros.HerosName.GALADRIEL, "Galadriel", 120, 25));
    }

    //Creating enemy list
    public static void enemyList() {
        enemyList.add(new Enemy(Enemy.EnemyNames.ORCH, "Orch", 8, 30, 1));
        enemyList.add(new Enemy(Enemy.EnemyNames.GOLLUM, "Gollum", 10, 40, 2));
        enemyList.add(new Enemy(Enemy.EnemyNames.TROLL, "Troll", 12, 50, 3));
        enemyList.add(new Enemy(Enemy.EnemyNames.GOBLIN, "Goblin", 11, 45, 2));
        enemyList.add(new Enemy(Enemy.EnemyNames.BALROG, "Balrog", 16, 80, 5));
        enemyList.add(new Enemy(Enemy.EnemyNames.SHELOB, "Shelop", 13, 90, 7));
        enemyList.add(new Enemy(Enemy.EnemyNames.URUKHAI, "Uruk-Hai", 15, 85, 6));
        enemyList.add(new Enemy(Enemy.EnemyNames.NAZGUL, "Nazgul", 19, 100, 8));
        enemyList.add(new Enemy(Enemy.EnemyNames.SARUMAN, "Saruman", 20, 120, 9));
        enemyList.add(new Enemy(Enemy.EnemyNames.ANGMAR, "Angmar", 23, 130, 12));
        enemyList.add(new Enemy(Enemy.EnemyNames.SAURON, "Sauron", 25, 140, 20));

    }


}
