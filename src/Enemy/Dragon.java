package Enemy;

import Weapon.IWeapon;

import java.util.List;

public class Dragon implements IEnemy{
    @Override
    public String getEnemyName() {
        return null;
    }

    @Override
    public int getEnemyDamage() {
        return 0;
    }

    @Override
    public int getEnemyHp() {
        return 0;
    }

    @Override
    public void setEnemyHp(int hp) {

    }

    @Override
    public String getEnemyDesc() {
        return null;
    }

    @Override
    public List<IWeapon> getEnemyInventory() {
        return null;
    }

}
