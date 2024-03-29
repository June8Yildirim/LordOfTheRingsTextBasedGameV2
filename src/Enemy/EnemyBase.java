package Enemy;



public class EnemyBase {
    public enum EnemyNames {ANGMAR, BALROG, GOLLUM, TROLL, ORCH, SARUMAN, SAURON, SHELOB, URUKHAI, NAZGUL, GOBLIN}


    public EnemyBase(){

    }
    public IEnemy createEnemy(int heroNumber) {
        IEnemy enemy = switch (heroNumber) {
            case 1 -> new Orch();
            case 2 -> new Gollum();
            case 3 -> new Troll();
            case 4 -> new Saruman();
            case 5 -> new Sauron();
            case 6 -> new Goblin();
            case 7 -> new Balrog();
            case 8 -> new Angmar();
            case 9 -> new Shelob();
            case 10 -> new Uruk_Hai();
            case 11 -> new Nazgul();
            default -> null;
        };
        return enemy;
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
