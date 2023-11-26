/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klinik;
import com.mysql.cj.jdbc.result.ResultSetMetaData;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Database {
    protected Connection connection = null;
    protected Statement statement;
    protected PreparedStatement preparedStatement;
    protected ResultSet resultset;
    private static Connection MySQLConfig;
    private ResultSet resultSet;
    
    
    
    public Database() {
        this.openConnection();
    }
    
    public final void openConnection(){
        try {
            String url = "jdbc:mysql://localhost:3306/klinik_kecantikan";
            String username = "root";
            String password = "";
            
            this.connection = DriverManager.getConnection(url, username, password);
            this.statement = this.connection.createStatement();
            
            System.out.println("database");
        } catch (SQLException ex) {
            this.displayErrors(ex);
        }
    }
    
    public static Connection configDB()throws SQLException{
        try{
            String url = "jdbc:mysql://localhost:3306/kecamatan";
            String user = "root";
            String pass = "";
            
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            MySQLConfig = DriverManager.getConnection(url, user, pass);
            
        }catch(SQLException e){
            System.out.println("Koneksi ke Database Gagal " + e.getMessage());
        }
        
        return MySQLConfig;
    }
   
    public final void closeConnection(){
        try {
            if (this.resultset != null) this.resultset.close();
            if (this.statement != null) this.statement.close();
            if (this.preparedStatement != null) this.preparedStatement.close();
            if (this.connection != null) this.connection.close();
            
            this.resultset = null;
            this.statement = null;
            this.preparedStatement = null;
            this.connection = null;
        } catch (SQLException ex){ 
            this.displayErrors(ex);
        }
    }
    
    public ResultSet executeSelectQuery(String qq) throws SQLException{
        resultset = statement.executeQuery(qq);
        return resultset;
    }
    public void execute(String qq) throws SQLException{
        statement.execute(qq);
    }
    
    public final ArrayList<ArrayList> all(String query) {
            ArrayList<ArrayList> rows = new ArrayList();
            
            try{
                this.statement = this.connection.createStatement();
                this.resultSet = this.statement.executeQuery(query);
                
                while (this.resultSet.next()) {
                    ResultSetMetaData rsMetaData = (ResultSetMetaData) this.resultSet.getMetaData();
                    int columnCount = rsMetaData.getColumnCount();
                    
                    ArrayList<String> columns = new ArrayList();
                    
                    for (int i = 1; i <= columnCount; i++) {
                        columns.add(this.resultSet.getString(i));
                    }
                    rows.add(columns);
                }
            } catch (SQLException e){
                this.displayErrors(e);
            }
            return rows;
            
    }
        
    protected final void displayErrors (SQLException ex) { 
        System.out.println("SQLException: " + ex.getMessage());
        System.out.println("SQLState: " + ex.getSQLState());
        System.out.println("VendorError: " + ex.getErrorCode());
    }
    
    public static void main(String[] args) {
        Database db = new Database();
    }

}
