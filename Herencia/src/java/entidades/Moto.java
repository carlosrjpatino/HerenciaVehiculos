package entidades;

public class Moto extends Vehiculo {

    private boolean rompeViento;

    public String isRompeViento() {
        String rompeVientoSioNo = "";
        if (rompeViento == true) {
            //Devovler SI
            rompeVientoSioNo = "SI";
        } else {
            //Devolver NO
            rompeVientoSioNo = "NO";
        }

        return rompeVientoSioNo;
    }

    public void setRompeViento(boolean rompeViento) {
        this.rompeViento = rompeViento;
    }

}
