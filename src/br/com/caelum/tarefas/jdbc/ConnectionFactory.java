package br.com.caelum.tarefas.jdbc;

import java.sql.*;
public class ConnectionFactory {
	public Connection getConnection(){
		System.out.println("Conectando ao Banco de Dados...");
		
		String stringDeConexao="jdbc:mysql://localhost/fj21-tarefas";
		String user="root";
		String pass="";
		
		try{
			Class.forName("com.mysql.jdbc.Driver"); 
			return DriverManager.getConnection(stringDeConexao,user,pass);
		}catch(SQLException | ClassNotFoundException e){
			throw new RuntimeException(e+"\nNAO FOI POSSIVEL CONECTAR NO BANCO DE DADOS");
		}
	}
}