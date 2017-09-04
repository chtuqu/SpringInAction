package ch1.jdbc;

import ch1.jdbc.entities.Employee;

import java.sql.*;

public class PlainJdbcExample {

    private static final String url = "jdbc:mysql://localhost:3306/spring_in_action";
    private static final String driverClass = "com.mysql.jdbc.Driver";
    private static final String username = ""; // NOTE: fill me
    private static final String password = ""; // NOTE: fill me

    public Employee getEmployeeById(long id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName(driverClass).newInstance();
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.prepareStatement("SELECT id, first_name, last_name, salary FROM employees WHERE id=?");
            stmt.setLong(1, id);
            rs = stmt.executeQuery();
            Employee employee = null;
            if (rs.next()) {
                employee = new Employee();
                employee.setId(rs.getLong("id"));
                employee.setFirstName(rs.getString("first_name"));
                employee.setLastName(rs.getString("last_name"));
                employee.setSalary(rs.getBigDecimal("salary"));
            }
            return employee;
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            if (rs != null) {
                try {
                    rs.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (stmt != null) {
                try {
                    stmt.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (conn != null) {
                try {
                    conn.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        PlainJdbcExample example = new PlainJdbcExample();
        Employee employee = example.getEmployeeById(1);
        System.out.println(employee);
    }
}
