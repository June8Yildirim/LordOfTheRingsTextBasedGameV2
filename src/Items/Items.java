package Items;


import Heros.Heros;
import Places.Place;
import Weapon.Weapons;

public class Items {
    private Heros heros;
    private Place place;
    private Weapon.Weapons[] Weapons;

    public Items(Heros heros, Place place, Weapons[] weapons) {
        this.place = place;
        Weapons = weapons;
        this.heros=heros;
    }


}
