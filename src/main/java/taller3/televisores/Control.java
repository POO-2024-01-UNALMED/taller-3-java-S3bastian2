package taller3.televisores;

public class Control {
    private TV tv;

    public Control(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.setEstado(true);
    }

    public void turnOff() {
        tv.setEstado(false);
    }
}
