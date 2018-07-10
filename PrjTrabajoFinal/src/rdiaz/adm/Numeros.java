package rdiaz.adm;

import java.util.ArrayList;
import rdiaz.modelo.Estructura;


public class Numeros {
    
    public ArrayList<Estructura> getTablaNumeros(){
        ArrayList<Estructura> tabla = new ArrayList();
        
        Estructura uno = new Estructura(1,1,1,"1");
        Estructura dos = new Estructura(2,10,2,"2");
        Estructura tres = new Estructura(3,11,3,"3");
        Estructura cuatro = new Estructura(4,100,4,"4");
        Estructura cinco = new Estructura(5,101,5,"5");
        Estructura seis = new Estructura(6,110,6,"6");
        Estructura siete = new Estructura(7,111,7,"7");
        Estructura ocho = new Estructura(8,1000,10,"8");
        Estructura nueve = new Estructura(9,1001,11,"9");
        Estructura diez = new Estructura(10,1010,12,"A");
        Estructura once = new Estructura(11,1011,13,"B");
        Estructura doce = new Estructura(12,1100,14,"C");
        Estructura trece = new Estructura(13,1101,15,"D");
        Estructura catorce = new Estructura(14,1110,16,"E");
        Estructura quince = new Estructura(15,1111,17,"F");
        Estructura dieciseis = new Estructura(16,10000,20,"10");
        Estructura diecisiete = new Estructura(17,10001,21,"11");
        Estructura dieciocho = new Estructura(18,10010,22,"12");
        Estructura diecinueve = new Estructura(19,10011,23,"13");
        Estructura veinte = new Estructura(20,10100,24,"14");
       
        tabla.add(uno);
        tabla.add(dos);
        tabla.add(tres);
        tabla.add(cuatro);
        tabla.add(cinco);
        tabla.add(seis);
        tabla.add(siete);
        tabla.add(ocho);
        tabla.add(nueve);
        tabla.add(diez);
        tabla.add(once);
        tabla.add(doce);
        tabla.add(trece);
        tabla.add(catorce);
        tabla.add(quince);
        tabla.add(dieciseis);
        tabla.add(diecisiete);
        tabla.add(dieciocho);
        tabla.add(diecinueve);
        tabla.add(veinte);
        
        return tabla;
    }
}
