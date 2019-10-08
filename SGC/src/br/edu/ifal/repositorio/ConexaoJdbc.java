package br.edu.ifal.repositorio;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoJdbc {
	private Connection con = null;

	private String hostName = null;
	private String userName = null;
	private String password = null;
	private String url = null;
	private String jdbcDriver = null;
	private String dataBaseName = null;
	private String dataBasePrefix = null;
	private String dabaBasePort = null;


	public ConexaoJdbc() {
		super();
		// TODO Auto-generated constructor stub
		
		///"jdbc: mysql:/localhost:3306/sgc";
		  hostName = "localhost";
		  userName = "root";
		  password = "mysql";    
		  jdbcDriver = "org.gjt.mm.mysql.Driver";
		  dataBaseName = "sgc";
		  dataBasePrefix = "jdbc: mysql:/";
		  dabaBasePort = "3306";
		 
		  url = dataBasePrefix + hostName + ":"+dabaBasePort+"/" + dataBaseName + "/";
	}

	public Connection getConnection() {
		  try {
		    if (con == null) {
		      Class.forName(jdbcDriver);
		      con = DriverManager.getConnection(url, userName, password);
		    } else if (con.isClosed()) {
		      con = null;
		      return getConnection();
		    }
		  } catch (ClassNotFoundException e) {
		 
		    //TODO: use um sistema de log apropriado.
		 
		    e.printStackTrace();
		  } catch (SQLException e) {
		 
		    //TODO: use um sistema de log apropriado.
		 
		    e.printStackTrace();
		  }
		  return con;
		}

	public void closeConnection() {
		  if (con != null) {
		    try {
		      con.close();
		    } catch (SQLException e) {
		      //TODO: use um sistema de log apropriado.
		      e.printStackTrace();
		    }
		  }
		}

}
