package Test;

import entidades.Auto;
import entidades.Moto;

public class TestAuto {
    public static void main(String[] args) {
        System.out.println("   [...] Test Auto");
        Auto miAuto = new Auto();
        miAuto.color = "Negro";
        miAuto.marca = "Renault";
        miAuto.modelo="Duster";
        miAuto.precio=400000;
        miAuto.puertas=5;
        
        Moto miMoto = new Moto();
        miMoto.color="Rojo";
        miMoto.marca="Yamaha";
        miMoto.modelo="FZ";
        miMoto.precio=50000;
        miMoto.rompeViento=false;
        
        System.out.println("[...] Imprimiendo dato de auto (objeto)");
        System.out.println(miAuto);
        System.out.println("[OK] Imprimiendo dato de auto (objeto)");
        
        System.out.println("[...] Imprimir atributo por atributo");
        System.out.println(miAuto.color + " " + miAuto.marca + " " + miAuto.modelo + " " + miAuto.precio + " " + miAuto.puertas);
        System.out.println("[OK] Imprimir atributo por atributo");
        
        System.out.println("[...] Imprimierdo moto atributo por atributo");
        System.out.println(miMoto.color + " " + miMoto.marca + " " + miMoto.modelo + " " + miMoto.precio + " " + miMoto.rompeViento);
        System.out.println("[OK] Imprimierdo moto atributo por atributo");
        
        System.out.println("[...] Imprimiendo dato de moto (objeto)");
        System.out.println(miMoto);
        System.out.println("[OK] Imprimiendo dato de moto (objeto)");
        
        System.out.println("   [OK]");
    }
}
