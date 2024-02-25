package taller3.televisores;

public class Control {
    private TV tv;

    public Control(TV tv) {
        this.tv = null;
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

    public void setCanal(int canal) {
        if (tv.getEstado() && canal >= 1 && canal <= 120) {
            tv.setCanal(canal);
        }
    }

    public void setVolumen(int volumen) {
        if (tv.getEstado() && volumen >= 0 && volumen <= 7) {
            tv.setVolumen(volumen);
        }
    }

    public void enlazar(TV televisor) {
        this.tv = televisor;
        if (televisor != null) {
            televisor.setControl(this);
        }
    }
}
