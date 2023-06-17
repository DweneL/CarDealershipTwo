package com.cardealership;

import org.apache.commons.dbcp2.BasicDataSource;
import org.junit.jupiter.api.BeforeEach;

import javax.sql.DataSource;

import static org.junit.jupiter.api.Assertions.*;

class VehicleDAOTest {
    private VehicleDAO vehicleDAO;
    private DataSource dataSource;

    @BeforeEach
    public void before() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/zork");
        dataSource.setUsername("root");
        dataSource.setPassword("Dwenegt1");




    }

}