package Unison;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Luis G Ruiz
 */
public class Archivo {

    private File fichero;
    private String contenido;

    public Archivo() {

    }

    public Archivo(File fichero) {
        this.fichero = fichero;
        this.contenido = "";
        leerContenido();
    }

    public void leerContenido() {
        String linea;
        FileReader f;
        BufferedReader b;
        StringBuilder aux = new StringBuilder();
        try {
            f = new FileReader(this.fichero);
            b = new BufferedReader(f);
            try {

                while ((linea = b.readLine()) != null) {
                    aux.append(linea);
                    aux.append("\n");
                }
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.contenido = aux.toString();
    }

    public String getContenido() {
        return contenido;
    }

    public int getLineas() {
        if (this.contenido.equals("")) {
            return 0;
        } else {
            return this.contenido.split("\n").length;
        }
    }

    public int getPalabras() {
        if (this.contenido.equals("")) {
            return 0;
        } else {
            return this.contenido.replace("\n", " ").split("\\s+").length;
        }
    }

    public int getCaracteres() {

        return this.contenido.replaceAll("\\s+", "").replace("\n", "").length();
    }
}
