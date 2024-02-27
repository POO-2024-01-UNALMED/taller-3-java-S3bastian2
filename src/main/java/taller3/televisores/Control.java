package taller3.televisores;

public class Control {
    private TV tv;

    public void enlazar(TV tv) {
        setTv(tv);
        tv.setControl(this);
    }

    public TV getTv() {
        return tv;
    }

    public void setTv(TV tv) {
        this.tv = tv;
    }

    public void turnOn() {
        tv.turnOn();
    }

    public void turnOff() {
        tv.turnOff();
    }

    public void canalUp() {
        tv.canalUp();
    }

    public void canalDown() {
        tv.canalDown();
    }

    public void volumenUp() {
        tv.volumenUp();
    }

    public void volumenDown() {
        tv.volumenDown();
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

}
