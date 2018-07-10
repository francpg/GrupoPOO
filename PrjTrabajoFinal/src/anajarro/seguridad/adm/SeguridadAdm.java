package anajarro.seguridad.adm;

import anajarro.seguridad.vo.Auto;
import java.util.ArrayList;

public class SeguridadAdm {
    
    public Auto validarUsuario(String dni, String clave){
        Auto usu = null;
        AutoAdm usuAdm = new AutoAdm();
        ArrayList<Auto> listaAutos =  usuAdm.getListaAutos();
        
        for (int i = 0; i < listaAutos.size(); i++) {
            Auto usuItem = listaAutos.get(i);
            if(usuItem.getplaca().equalsIgnoreCase(dni) && usuItem.getClave().equalsIgnoreCase(clave)){
                usu = usuItem;
                break;
            }
        }
        return usu;
    }    
    
}
