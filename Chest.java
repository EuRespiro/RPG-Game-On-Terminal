package RPGTerminal;

public class Chest {
    // Atributes
    public boolean aberto;

    // Metods

    public void setAberto(boolean aberto) {
        aberto = aberto;
    }

    public boolean getAberto() {
        return aberto;
    }
    public void abrir() {
        this.setAberto(true);
    }
    public void fechar() {
        this.setAberto(false);
    }
}
