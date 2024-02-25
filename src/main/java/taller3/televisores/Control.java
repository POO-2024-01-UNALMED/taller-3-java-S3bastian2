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

    public void canalUp() {
        if (tv.getEstado() && tv.getCanal() < 120) {
            tv.setCanal(tv.getCanal() + 1);
        }
    }

    public void canalDown() {
        if (tv.getEstado() && tv.getCanal() > 1) {
            tv.setCanal(tv.getCanal() - 1);
        }
    }

    public void volumenUp() {
        if (tv.getEstado() && tv.getVolumen() < 7) {
            tv.setVolumen(tv.getVolumen() + 1);
        }
    }

    public void volumenDown() {
        if (tv.getEstado() && tv.getVolumen() > 0) {
            tv.setVolumen(tv.getVolumen() - 1);
        }
    }

    
}
