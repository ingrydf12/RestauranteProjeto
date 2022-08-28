package br.app.conexoa;

import java.sql.*;

public class ModuloConexao {
 //02 - MÉTODO RESPONSÁVEL POR ESTABELECER A CONEXÃO COM O BANCO DE DADOS
public static Connection conector(){ // Criando método com nome de: conector
java.sql.Connection conexao; //variável com nome de: conexao

String driver = "com.mysql.cj.jdbc.Driver"; //chamando o driver
String url="jdbc:mysql://localhost:3306/baratieapp"; //Armazenando informações referente ao banco
String user="root";
String password ="Ingryd1970";
// 03- ESTABELECENDO A CONEXÃO COM O BANCO DE DADOS
try {
Class.forName(driver); //tratamento de conexão ao banco de dados
conexao = DriverManager.getConnection(url, user, password);
return conexao;
} catch (Exception e) {
return null;
}
}
}
    
