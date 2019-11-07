/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import com.mycompany.controller.ProductosJpaController;
import com.mycompany.entidades.Productos;
import java.math.BigDecimal;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author andres96
 */
public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Instancia de conexion de la base de datos 
       //crear una instancia para tomar los valores de la cadena de conexion 
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("laboratorio");
        //llmar a la clase controladora 
        ProductosJpaController  pcj = new ProductosJpaController(emf);
        //llenar datos en la base de datos 
        //clase pojos 
        Productos p = new Productos();
        p.setNombre("aceite la favorita");
        p.setPrecio(BigDecimal.valueOf(4.28));
        pcj.create(p);
    }
    
}
