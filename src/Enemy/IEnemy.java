package Enemy;

import Weapon.IWeapon;
import Weapon.WeaponBase;

import java.util.List;

public interface IEnemy {
    public String getEnemyName();
    public int getEnemyDamage();
    public int getEnemyHp();
    public void setEnemyHp(int hp);
    public String getEnemyDesc();
    public List<IWeapon> getEnemyInventory();
    public void addWeaponToEnemy(IWeapon weapon);
    public void removeWeaponToEnemy(IWeapon weapon);
}
