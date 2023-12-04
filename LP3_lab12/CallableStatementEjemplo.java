package actividades;

import java.sql.*;

public class CallableStatementEjemplo {
    public static void main(String[] args) throws Exception{
        
    	
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/empresa","root","root");
    
    	
    	//PROCEDIMIENTO
    	CallableStatement stmt= con.prepareCall("{ call INSERTAREMPLEADO(?,?,?)}");
    //	
	   //	stmt.registerOutParameter(1,Types.INTEGER);
	    //	
	   	
	   	stmt.setString(1,"fred");
	   	stmt.setString(2,"232323232");
	  	stmt.setDouble(3,2300.2);
	   	stmt.execute(); 


//       //FUNCION
//
       CallableStatement stmt2 = con.prepareCall("{? = call SUMANUM(?,?)}");

       stmt2.registerOutParameter(1, Types.INTEGER);
       stmt2.setInt(2, 2);
       stmt2.setInt(3, 5);

       stmt2.execute();

       // Recoge el resultado del primer parámetro de salida
       int output2 = stmt2.getInt(1);
       System.out.println("La suma es "+output2);

       con.close();
    }
    



}
