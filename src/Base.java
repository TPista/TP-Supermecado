import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

public class Base {
	Statement stmt;
	String sql;
	Connection conn;
	public Base() throws SQLException, ClassNotFoundException {
		conn = null;
		stmt = null;
		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost/biblio";//poner el nombre de la base de datos
		String USER = "root";
		
		 String PASS = ""; // insert the password to SQL server
	Class.forName(JDBC_DRIVER);
	conn = DriverManager.getConnection(DB_URL, USER, PASS);
	stmt = conn.createStatement();
	String sql = "drop table if exists libros";
	stmt.executeUpdate(sql);
	sql = "create table libros (titulo varchar(60),autor varchar(60),paginas varchar(10),isbn varchar(50),año varchar(10),editorial varchar(60), genero varchar(15) )";//Creo la tabla libros
	stmt.executeUpdate(sql);
	
	}	
	public void mostrarTabla() throws SQLException
	{
	sql = "select * from libros";
	ResultSet datos = stmt.executeQuery(sql);
	while (datos.next())
	{//Los datos.getint los puse asi para ver q onda pero eran strings
		System.out.println(datos.getString(1)+" "+ datos.getString(2)+" "+datos.getInt(3)+ " "+ datos.getInt(4)+" "+datos.getInt(5)+ " "+ datos.getString(6)+" "+datos.getString(7));
	}
	}
	
	public void altaLibros() throws SQLException
	{
		String x = JOptionPane.showInputDialog("ingese libro: ");
		while (!x.equals(""))
		{
		sql = "insert into libros (titulo,autor,paginas,isbn,año,editorial,genero) values ( "+x+")"; 
		stmt.executeUpdate(sql);
		x = JOptionPane.showInputDialog("ingese libro: ");//Escribir de la siguiente forma: 'hola','aventura'
		//Cuando apriete enter sin ingresar nada se termina
		}
	}
	public void cerrarConexion() throws SQLException
	{
		conn.close();
	}
	
	}
