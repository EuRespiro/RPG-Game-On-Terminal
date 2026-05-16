package RPGTerminal;

public class Player {
    public static String name;
    public static int force;
    public static int inteligence;
    public static int carism;
    public static int hp;
    public static int maxHp;
    public static int stamina;
    public static int mana;
    public static int maxMana;
    public static int level;
    public static int xp;

    // Getters
    public static int getForce() {
        return force;
    }

    public static int getInteligence() {
        return inteligence;
    }

    public static int getCarism() {
        return carism;
    }

    public static int getHp() {
        return hp;
    }

    public static int getMaxHp() {
        return maxHp;
    }

    public static int getStamina() {
        return stamina;
    }

    public static int getMana() {
        return mana;
    }

    public static int getMaxMana() {
        return maxMana;
    }

    public static String getName() {
        return name;
    }

    public static int getLevel() {
        return level;
    }

    public static int getXp() {
        return xp;
    }

    // Setters
    public static void setForce(int force) {
        Player.force = force;
    }

    public static void setInteligence(int inteligence) {
        Player.inteligence = inteligence;
    }

    public static void setCarism(int carism) {
        Player.carism = carism;
    }

    public static void setHp(int hp) {Player.hp = hp;
    }

    public static void setMaxHp(int maxHp) {
        Player.maxHp = maxHp;
    }

    public static void setStamina(int stamina) {
        Player.stamina = stamina;
    }

    public static void setMana(int mana) {
        Player.mana = mana;
    }

    public static void setMaxMana(int maxMana) {
        Player.maxMana = maxMana;
    }

    public static void setName(String name) {
        Player.name = name;
    }

    public static void setLevel(int level) {
        Player.level = level;
    }

    public static void setXp(int xp) {
        Player.xp = xp;
    }
}