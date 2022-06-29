package ar.com.codoacodo.controllers;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ar.com.codoacodo.connection.AdministradorDeConexiones;
import ar.com.codoacodo.dto.Producto;

@WebServlet("/api/ListadoController")
public class ListadoController extends HttpServlet {
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String sql = "SELECT * FROM PRODUCTO";
		
		//conexion OK
		Connection con = AdministradorDeConexiones.getConnection();
		
		try {
			//statement 
			Statement st = con.createStatement();
			
			//resultset
			ResultSet rs = st.executeQuery(sql);
			
			List<Producto> listado = new ArrayList<>();
			
			while(rs.next()) {//¿mientras tenga datos?
				// rs > sacando los datos
				Long idProducto = rs.getLong(1);//tomar la primer columna
				String nombre = rs.getString(2);
				Float precio = rs.getFloat(3);
				Date fecha = rs.getDate(4);
				String imagen = rs.getString(5);
				String codigo = rs.getString(6);
				
				//campos crear un objeto????
				Producto prodFromDb = new Producto(idProducto,nombre,precio,fecha,imagen,codigo);
				
				//cargo el producto en listado
				listado.add(prodFromDb);
			}
			
			//ir a otra pagina y ademas pasarle datos				
			req.setAttribute("listado", listado);
			
			getServletContext().getRequestDispatcher("/listado.jsp").forward(req, resp);
			
			//cierre de conexion
			con.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}

