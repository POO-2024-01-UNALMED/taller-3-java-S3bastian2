package taller3;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this. volumen = 1;
        this.precio = 500;
    }

    public String estadoToString() {
        if (estado) {
            return "Encendido";
        } else {
            return "Apagado";
        }
    }

    public void setMarca(Marca marca) {
        this.marca = marca; 
    }

    public Marca getMarca() {
        return marca; 
    }

}
