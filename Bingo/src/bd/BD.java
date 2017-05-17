package bd;

import bd.core.*;
import bd.daos.*;

public class BD
{
    public static final MeuPreparedStatement comando;
    public static final Livros livros; //um como esse para cada classe DAO

    static
    {
    	MeuPreparedStatement _comando = null;
     	Livros               _livros  = null; //um como esse para cada classe DAO

    	try
        {
            _comando =
            new MeuPreparedStatement (
            "com.microsoft.sqlserver.jdbc.SQLServerDriver",
            "jdbc:sqlserver://fs5:1433;databasename=bdsqlac19",
            "bdsqlac19", "Iepiy7");

            _livros = new Livros (); //um como esse para cada classe DAO
        }
        catch (Exception erro)
        {
            System.err.println ("Problemas de conexao com o BD");
            erro.printStackTrace();
            System.exit(0); // aborta o programa
        }
        
        comando = _comando;
        livros  = _livros; //um como esse para cada classe DAO
    }
}