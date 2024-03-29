package Heros;


public class HeroBase {

    public enum HeroName {ARAGORN, LEGOLAS, ELROND, GIMLI, GREYGANDALF, WHITEGANDALF, FRODO, MITHRANDIR, STRIDER, GALADRIEL,}

    public HeroBase(){

    }
    public IHero createHero(int heroNumber) {
        IHero hero = null;
        switch (heroNumber) {
            case 1:
                hero = new Mitrahdir();
                break;
            case 2:
                hero = new Gimli();
                break;
            case 3:
                hero = new Legolas();
                break;
            case 4:
                hero = new Frodo();
                break;
            case 5:
                hero = new Aragorn();
                break;
            case 6:
                hero = new Strider();
                break;
            case 7:
                hero = new GreyGandalf();
                break;
            case 8:
                hero = new WhiteGandalf();
                break;
            case 9:
                hero = new Elrond();
                break;
            case 10:
                hero = new Galadriel();
                break;
            default:
                hero = null;
                break;
        }
        return hero;
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
