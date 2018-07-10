package anajarro.seguridad.adm;

import java.util.ArrayList;
import anajarro.seguridad.vo.Auto;


public class AutoAdm {

    
    public ArrayList<Auto> getListaAutos(){
        ArrayList<Auto> listaAutos = new ArrayList();
        
        Auto usu1 = new Auto("4444444","TOYOTA","COROLLA","KOREA");
       
        usu1.setClave("123");
        usu1.setIdPerfil(1);
        
        Auto usu2 = new Auto("22222222","HYUNDAY","ELANTRA","KOREA");
       
        usu2.setClave("123");
        usu2.setIdPerfil(2);
        
        Auto usu3 = new Auto("33333333","HONDA","I3","JAPON");
       
        usu3.setClave("123");
        usu3.setIdPerfil(3);
        
        Auto usu4 = new Auto("44444444","BMW","A5","ALEMANIA");
        
        usu4.setClave("123");
        usu4.setIdPerfil(1);
        
        listaAutos.add(usu1);
        listaAutos.add(usu2);
        listaAutos.add(usu3);
        listaAutos.add(usu4);
        
        return listaAutos;
    }
    
}
