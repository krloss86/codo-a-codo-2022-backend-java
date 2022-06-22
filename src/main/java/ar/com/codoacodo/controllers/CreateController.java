package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.sql.Connection;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/*HERENCIA*/
//Create Controller es hijo de :
public class CreateController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// recibe los datos del front
		
		// en req viene los datos que manda el formulario html
		//clave=valor
			
		String nombre = req.getParameter("nombre");
		String precio = req.getParameter("precio");//convetir en Float
		String fechaCreacion = "";//damos nostros
		String imagen = req.getParameter("imagen");
		String codigo = req.getParameter("codigo");
		
		// pedir una Conexion: AdministradorDeConexion.getConection()
		Connection con = AdministradorDeConexiones.getConnection();
		if(con != null) { 
			// insert en la db > SQL: INSERT INTO....
			String sql = "INSERT INTO PRODUCTO (nombre, precio,fecha_creacion,imagen,codigo) ";
			sql += "VALUES('"+nombre+"',"+precio+",CURDATE(),'"+imagen+"','"+codigo+"')";
			
			//
		}
		
		
	}
}
