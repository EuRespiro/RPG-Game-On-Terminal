package RPGTerminal;

public class Bed {
    public boolean dormindo;

    public void setDormindo(boolean dormindo) {
        dormindo = dormindo;
    }
    public boolean getDormindo() {
        return dormindo;
    }

    public void dormir() {
        setDormindo(true);
    }
    public void acordar() {
        setDormindo(false);
    }
}
