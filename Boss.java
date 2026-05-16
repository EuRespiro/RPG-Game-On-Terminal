package RPGTerminal;

public class Boss {
    // Atributes
    public String Name;
    public int force;
    public int maxHp;
    public int hp;
    public int level;

    // Metods and getters e setters

    public int getLevel() {
        return level;
    }
    public void setLevel(int lvl) {
        level = lvl;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getName() {
        return Name;
    }

    public int getForce() {
        return force;
    }
    public void setForce(int force) {
        force = force;
    }

    public void setHp(int hp) {
        hp = hp;
    }

    public void setMaxHp(int maxHp) {
        maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void attack_player() {

    }
}
