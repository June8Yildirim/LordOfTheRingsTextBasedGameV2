package Heros;

public class main {
    public static void main(String[] args) {
        HeroBase hero = new HeroBase();
        IHero h = hero.createHero(5);
        System.out.println(h.getHeroName());
        System.out.println(h.getHeroHp());
        h.setHeroHp(300);
        System.out.println(h.getHeroHp());

    }
}
