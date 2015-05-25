import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ParameterMetaData;

public class Main {
  public static void main(String[] args) throws Exception {
    Connection conn = getMySqlConnection();
    // Step-2: identify the stored procedure
    String simpleProc = "{ call simpleuser(?,?) }";
    
    CallableStatement cs = conn.prepareCall(simpleProc);
    // Step-4: register output parameters ...
    cs.registerOutParameter(1, java.sql.Types.VARCHAR);
    cs.registerOutParameter(2, java.sql.Types.VARCHAR);
    cs.execute();
    // Step-6: extract the output parameters
    String param1 = cs.getString(1);
    String param2 = cs.getString(2);
    System.out.println("param1=" + param1);
    System.out.println("param2=" + param2);
    // Step-7: get ParameterMetaData
    ParameterMetaData pmeta = cs.getParameterMetaData();
    if (pmeta == null) {
      System.out.println("Vendor does not support ParameterMetaData");
    } else {
      System.out.println(pmeta.getParameterType(1));
    }
    conn.close();
  }


  public static Connection getMySqlConnection() throws Exception {
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://75.72.139.144:3306/Rolet";
    String username = "remote";
    String password = "San@1987";

    Class.forName(driver);
    Connection conn = DriverManager.getConnection(url, username, password);
    return conn;
  }


}