package models.aeropuertos;

public class    Pista {
    private int codigo;
    private boolean disponible;

    public Pista(int codigo) {
        this.codigo = codigo;
        this.disponible = true;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
}
