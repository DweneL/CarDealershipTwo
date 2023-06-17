package com.cardealership;

import javax.sql.DataSource;
import javax.xml.crypto.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VehicleDAO {
    private DataSource dataSource;

    public VehicleDAO(DataSource dataSource) {
        this.dataSource = dataSource;
    }


    public List<Vehicle> getVehicle(){
        List<Vehicle> vehicleList = new ArrayList<>();

        String query = "SELECT * FROM Vehicle";

        try(Connection connection = this.dataSource.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(query)){

            try(ResultSet result = preparedStatement.executeQuery()){

                while(result.next()){
                    Vehicle Cr = new Vehicle(
                            result.getString("VIN"),
                            result.getString("Make"),
                            result.getString("Model"),
                            result.getBoolean("isSold"),
                            result.getString("VehicleType"),
                            result.getString("Color"),
                            result.getInt("Odometer"),
                            result.getInt("price")
                    );
                    vehicleList.add(Cr);
                }

            }

        }catch(SQLException e){
            e.printStackTrace();

        }

    return vehicleList;
    }






}
