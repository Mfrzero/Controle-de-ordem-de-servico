/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.infox.dal;

import java.sql.*;
/**
 *
 * @author Matheus
 */
public class ModuloConexao {
    //Método responsavel por estabelecer conexão com o banco
    public static Connection conector(){
        java.sql.Connection conexao = null;
        //a linha abaixo chama o driver
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/dbinfox";
        String user = "root";
        String password = "";
        //Estabelecendo conexão com o banco
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            //linha para esclarecer o erro
            //System.out.println(e);
            return null;
        }
    }
}







































