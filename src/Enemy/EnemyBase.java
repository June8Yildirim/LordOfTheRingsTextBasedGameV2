package Enemy;



public class EnemyBase {
    public enum EnemyNames {ANGMAR, BALROG, GOLLUM, TROLL, ORCH, SARUMAN, SAURON, SHELOB, URUKHAI, NAZGUL, GOBLIN}


    public EnemyBase(){

    }
    public IEnemy createEnemy(int heroNumber) {
        IEnemy enemy = null;
        switch (heroNumber) {
            case 1:
                enemy = new Orch(EnemyNames.ORCH, "Orch", 8, 30, 1);
                break;
            case 2:
                enemy = new Gollum( EnemyNames.GOLLUM, "Gollum", 10, 40, 2);
                break;
            case 3:
                enemy = new Troll(EnemyNames.TROLL, "Troll", 12, 50, 3);
                break;
            case 4:
                enemy = new Saruman(EnemyNames.SARUMAN, "Saruman", 20, 120, 7);
                break;
            case 5:
                enemy = new Sauron(EnemyNames.SAURON, "Sauron", 25, 140, 20);
                break;
            case 6:
                enemy = new Goblin(EnemyNames.GOBLIN, "Goblin", 11, 45, 2);
                break;
            case 7:
                enemy = new Balrog(EnemyNames.BALROG, "Balrog", 16, 80, 5);
                break;
            case 8:
                enemy = new Angmar(EnemyNames.ANGMAR, "Angmar", 23, 130, 12);
                break;
            case 9:
                enemy = new Shelob(EnemyNames.SHELOB, "Shelop", 13, 90, 7);
                break;
            case 10:
                enemy = new Uruk_Hai(EnemyNames.URUKHAI, "Uruk-Hai", 15, 85, 6);
                break;
                case 11:
                enemy =  new Nazgul(EnemyNames.NAZGUL, "Nazgul", 19, 100, 8);
                break;
            default:
                enemy = null;
                break;
        }
        return enemy;
    }
}
