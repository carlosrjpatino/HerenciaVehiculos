package Test;

import entidades.Moto;

public class TestMoto {

    public static void main(String[] args) {

        Moto miMoto = new Moto();
        miMoto.color = "Rojo";
        miMoto.marca = "Yamaha";
        miMoto.modelo = "FZ";
        miMoto.precio = 50000;
        miMoto.setRompeViento(false);

        System.out.println("[...] Test Moto");
        System.out.println(miMoto.color + " " + miMoto.marca + " " + miMoto.modelo + " " + miMoto.precio + " " + miMoto.isRompeViento());
        System.out.println("[OK] Imprimierdo moto atributo por atributo");

    }
}
