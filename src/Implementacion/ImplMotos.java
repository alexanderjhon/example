package Implementacion;
import conexion.ConectaDBSqlite;
import Entidades.Motos;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ImplMotos {
    ConectaDBSqlite mm=new ConectaDBSqlite();
    Motos mot=new Motos();
    
    ArrayList<Motos>listaMotos = new ArrayList<>();
    
    public void agregarMotos(Motos mot){
        try {
            String query="insert into Motos values('"+mot.getProd_id()+"','"+mot.getProd_nombre()+"','"+mot.getProd_precio()+"','"+mot.getProd_marca()+"')";
            Statement st = mm.getConnect().createStatement();
            st.execute(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    public void reporteMotos(){
        try {
            String query="select * from Motos";
            Statement st = mm.getConnect().createStatement();
            ResultSet rs=st.executeQuery(query);
            while(rs.next()){
                Motos mo = new Motos();
                mo.setProd_id(rs.getString(1));
                mo.setProd_nombre(rs.getString(2));
                mo.setProd_precio(rs.getString(3));
                mo.setProd_marca(rs.getString(4));
                listaMotos.add(mo);
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
