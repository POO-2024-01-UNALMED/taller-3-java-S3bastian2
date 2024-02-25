package taller3.televisores;

public class TV {
    private Marca marca;
    private int canal;
    private int precio;
    private boolean estado;
    private int volumen;
    private Control control;
    private static int numTV = 0;

    public TV(Marca marca, boolean estado) {
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this. volumen = 1;
        this.precio = 500;
        TV.numTV++;
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

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getCanal() {
        return canal;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setControl(Control control) {
        this.control = control;
    }

    public Control getControl() {
        return control;
    }

    public static int getNumTV() {
        return numTV;
    }

    public void turnOn() {
        estado = true;
        System.out.println("El televisor esta encendido.");
    }

    public void turnOff() {
        estado = false;
        System.out.println("El televisor esta apagado.");
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
