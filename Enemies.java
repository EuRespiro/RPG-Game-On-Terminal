package RPGTerminal;

public class Enemies {
    // Atributes
    public static String Name;
    public static int force;
    public static int maxHp;
    public static int hp;
    public static int level;

    // Metods and getters e setters

    public static int getLevel() {
        return level;
    }
    public static void setLevel(int lvl) {
        level = lvl;
    }
    public static void setName(String name) {
        Name = name;
    }
    public static String getName() {
        return Name;
    }

    public static int getForce() {
        return force;
    }
    public static void setForce(int force) {
        force = force;
    }

    public static void setHp(int hp) {
        hp = hp;
    }

    public static void setMaxHp(int maxHp) {
        maxHp = maxHp;
    }

    public static int getHp() {
        return hp;
    }

    public static int getMaxHp() {
        return maxHp;
    }

}
