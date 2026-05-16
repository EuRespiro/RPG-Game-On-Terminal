package RPGTerminal;

public class Guns {
    public String name;
    public int municao;
    public double dano;

    public void setMunicao(int municao) {
        municao = municao;
    }
    public void setName (String name) {
        name = name;
    }

    public void setDano(double dano) {
        dano = dano;
    }

    public int getMunicao() {
        return municao;
    }
    public String getName() {
        return name;
    }

    public double getDano() {
        return dano;
    }
}
