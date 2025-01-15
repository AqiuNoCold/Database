package Dao;

import Model.Airport;
import SQL.Conn;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*
 * Airport 数据访问对象
 */
public class AirportDao implements BaseDao<Airport> {
    private static final String INSERT_SQL = "INSERT INTO Airport (AirportID, AirportName) VALUES (?, ?)";
    private static final String UPDATE_SQL = "UPDATE Airport SET AirportName = ? WHERE AirportID = ?";
    private static final String DELETE_SQL = "DELETE FROM Airport WHERE AirportID = ?";
    private static final String SELECT_BY_ID_SQL = "SELECT * FROM Airport WHERE AirportID = ?";
    private static final String SELECT_ALL_SQL = "SELECT * FROM Airport";

    @Override
    public boolean insert(Airport airport) throws SQLException {
        try (Connection conn = Conn.getConnection();
             PreparedStatement ps = conn.prepareStatement(INSERT_SQL)) {
            ps.setString(1, airport.getAirportID());
            ps.setString(2, airport.getAirportName());
            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public boolean update(Airport airport) throws SQLException {
        try (Connection conn = Conn.getConnection();
             PreparedStatement ps = conn.prepareStatement(UPDATE_SQL)) {
            ps.setString(1, airport.getAirportName());
            ps.setString(2, airport.getAirportID());
            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public boolean delete(Object id) throws SQLException {
        try (Connection conn = Conn.getConnection();
             PreparedStatement ps = conn.prepareStatement(DELETE_SQL)) {
            ps.setString(1, (String) id);
            return ps.executeUpdate() > 0;
        }
    }

    @Override
    public Airport findById(Object id) throws SQLException {
        try (Connection conn = Conn.getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_BY_ID_SQL)) {
            ps.setString(1, (String) id);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return new Airport(rs.getString("AirportID"), rs.getString("AirportName"));
                }
            }
        }
        return null;
    }

    @Override
    public List<Airport> findAll() throws SQLException {
        List<Airport> airports = new ArrayList<>();
        try (Connection conn = Conn.getConnection();
             PreparedStatement ps = conn.prepareStatement(SELECT_ALL_SQL);
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                airports.add(new Airport(rs.getString("AirportID"), rs.getString("AirportName")));
            }
        }
        return airports;
    }
}
