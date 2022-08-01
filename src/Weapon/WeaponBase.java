package Weapon;

public class WeaponBase {

    public enum WeaponName {NARSIL, STING, KNIFE, ORCRIST, ELFBOW, AXE, GLAMDRING, GANDALFSTAFF, ONERING, ELRONDSRING,}

    public WeaponBase(){

    }

    public IWeapon createWeapon(int weaponNumber){
        IWeapon weapon = switch (weaponNumber) {
            case 1 -> new Knife();
            case 2 -> new GandalfStaff();
            case 3 -> new ElrondRing();
            case 4 -> new Glamdring();
            case 5 -> new Orcrist();
            case 6 -> new OneRing();
            case 7 -> new Narsil();
            case 8 -> new Elfbow();
            case 9 -> new Sting();
            case 10 -> new Axe();
            default -> null;
        };
        return weapon;
    }
    public static  String wrapText(String desc){
        int LINE_LENGTH = 0;
        StringBuilder str = new StringBuilder();
        String[] wordList = desc.split(" ");
        for (int i = 0; i < wordList.length; i++) {
            if( LINE_LENGTH <= 10){
                str.append(wordList[i]+" ");
                LINE_LENGTH++;
            }else{
                str.append("\n");
                LINE_LENGTH = 0;
            }
        }
        return   str.toString();
    }
}
