package Unison;

import java.io.File;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        int lineas = 0, palabras = 0, caracteres = 0;

        LinkedList <File> txt = new  LinkedList <>();

        for (int i = 1; i<=5; i++) {
            txt.add(new File("C:\\Users\\Latitude\\Documents\\fichero.txt"));

        }

        Archivo archivo = new Archivo (txt.get(0));
        lineas+= archivo.getLineas();
        palabras+= archivo.getPalabras();
        caracteres+= archivo.getCaracteres();

        System.out.println("Lineas: " +lineas+ "\n palabras: " +palabras+ "\n caracteres: " +caracteres);
    }
}
