public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon(WeaponType.SUPER, "Hammer");
        Boss boss = new Boss(100, "Boss", bossWeapon);


        Weapon skeletonWeapon1 = new Weapon(WeaponType.RANGE, "Super Bow");
        Skeleton skeleton1 = new Skeleton(500, "Bones", skeletonWeapon1, 44);

        Weapon skeletonWeapon2 = new Weapon(WeaponType.MELEE, "Super Sword");
        Skeleton skeleton2 = new Skeleton(303, "Skeleton", skeletonWeapon2, 0);

        System.out.println(boss.info());
        System.out.println("");
        System.out.println(skeleton1.info());
        System.out.println("");
        System.out.println(skeleton2.info());
    }
}