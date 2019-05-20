package Test;

import entidades.Auto;
import entidades.Moto;

public class TestAuto {

    public static void main(String[] args) {
        System.out.println("   [...] Test Auto");
        Auto miAuto = new Auto();
        miAuto.color = "Negro";
        miAuto.marca = "Renault";
        miAuto.modelo = "Duster";
        miAuto.precio = 400000;
        miAuto.puertas = 5;

        System.out.println("[...] Imprimir atributo por atributo");
        System.out.println(miAuto.color + " " + miAuto.marca + " " + miAuto.modelo + " " + miAuto.precio + " " + miAuto.puertas);
        System.out.println("[OK] Imprimir atributo por atributo");

        System.out.println("   [OK]");
    }
}
