/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.acorde.dao;

import java.sql.*;
public class ModuloConexao {
    
    //metodo que estabele conexao
    public static Connection conexaoBanco(){
        java.sql.Connection conexao = null;
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/acorde";
        String user = "root";
        String password = "";
        
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
                
    }
}
