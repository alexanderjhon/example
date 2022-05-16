
package motos;
import Entidades.Motos;
import Implementacion.ImplMotos;

public class Motoss {
    public static void main(String[] args) {
        Motos m1= new Motos();
        m1.setProd_id("1");
        m1.setProd_nombre("Ninja R2");
        m1.setProd_precio("40000");
        m1.setProd_marca("Kawasaki");
        
        Motos m2= new Motos();
        m2.setProd_id("2");
        m2.setProd_nombre("Ninja 650R");
        m2.setProd_precio("480000");
        m2.setProd_marca("Kawasaki");
        
ImplMotos im=new ImplMotos();
        im.agregarMotos(m1);
        im.agregarMotos(m2);
        im.reporteMotos();
        
        
            }
}