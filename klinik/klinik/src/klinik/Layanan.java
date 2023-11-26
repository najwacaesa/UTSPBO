/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package klinik;

import java.sql.*;
import java.sql.SQLException;
import java.sql.Statement;

public class Layanan extends Database{
    public String ID;
    public String nama;
    public String harga;
    public String status;
    public String durasi;     
    public String kategori;
    
    public String getID() {
        return this.ID;
    }
    
    
    public boolean create() {
        boolean operationSuccessful = false;

        try {
            openConnection();

            String sql = "INSERT INTO layanan VALUES (?, ?, ?, ?, ?, ?)";
            preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, ID);
            preparedStatement.setString(2, nama);
            preparedStatement.setString(3, harga);
            preparedStatement.setString(4, status);
            preparedStatement.setString(5, durasi);
            preparedStatement.setString(6, kategori);
            
            
            int rowsAffected = this.preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                operationSuccessful = true;
            }

        } catch (SQLException ex) {
            displayErrors(ex); // Handle the exception appropriately (log or rethrow)
        } finally {
            closeConnection();
        }

        return operationSuccessful;
    }


public boolean update() {
    boolean isOperationSuccess = false;

    try {
        this.openConnection();

        String sql = "UPDATE layanan SET ID = ?, Nama = ?, Harga = ?, Status = ?, Durasi = ?, Kategori = ?  WHERE ID = ?";
            preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            preparedStatement.setString(1, ID);
            preparedStatement.setString(2, nama);
            preparedStatement.setString(3, harga);
            preparedStatement.setString(4, status);
            preparedStatement.setString(5, durasi);
            preparedStatement.setString(6, kategori);
            preparedStatement.setString(7, ID);
            
            int rowsAffected = this.preparedStatement.executeUpdate();
            if (rowsAffected > 0) {
                isOperationSuccess = true;
            }

        } catch (SQLException ex) {
            displayErrors(ex); // Handle the exception appropriately (log or rethrow)
        } finally {
            closeConnection();
        }

        return isOperationSuccess;
}

    public boolean delete() {
        boolean isOperationSuccess = false;

        try {
            this.openConnection();

            String sql = "DELETE FROM layanan WHERE ID = ?";
            this.preparedStatement = this.connection.prepareStatement(sql);
            this.preparedStatement.setString(1, this.ID);

            int result = this.preparedStatement.executeUpdate();

            isOperationSuccess = result > 0;
        } catch (SQLException ex) {
            this.displayErrors(ex);
        } finally {
            this.closeConnection();
        }

        return isOperationSuccess;
    }

}



