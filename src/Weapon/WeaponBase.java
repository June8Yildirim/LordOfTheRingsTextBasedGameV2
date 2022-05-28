package Weapon;

public class WeaponBase {

    public enum WeaponName {NARSIL, STING, KNIFE, ORCRIST, ELFBOW, AXE, GLAMDRING, GANDALFSTAFF, ONERING, ELRONDSRING,}

    public WeaponBase(){

    }

    public IWeapon createWeapon(int weaponNumber){
        IWeapon weapon = null;
        switch (weaponNumber){
            case 1:
                weapon = new Knife();
                break;
            case 2:
                weapon = new GandalfStaff();
                break;
            case 3:
                weapon =  new ElrondRing();
                break;
            case 4:
                weapon = new Glamdring();
                break;
            case 5:
                weapon = new Orcrist();
                break;
            case 6:
                weapon = new OneRing();
                break;
            case 7:
                weapon = new Narsil();
                break;
            case 8:
                weapon = new Elfbow();
                break;
            case 9:
                weapon = new Sting();
                break;
            case 10:
                weapon = new Axe();
                break;
        }
        return weapon;
    }
}
