package ch1.jdbc;

import ch1.jdbc.entities.Employee;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

public class JdbcTemplateExample {

    private DataSource dataSource;

    public JdbcTemplateExample(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public Employee getEmployeeById(long id) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate.queryForObject("SELECT id, first_name, last_name, salary FROM employees WHERE id=?",
                (resultSet, rowNum) -> {
            Employee employee = new Employee();
            employee.setId(resultSet.getLong("id"));
            employee.setFirstName(resultSet.getString("first_name"));
            employee.setLastName(resultSet.getString("last_name"));
            employee.setSalary(resultSet.getBigDecimal("salary"));
            return employee;
        },
                id);
    }

    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/ch1/jdbc-config.xml");
        JdbcTemplateExample example = applicationContext.getBean(JdbcTemplateExample.class);
        Employee employee = example.getEmployeeById(1);
        System.out.println(employee);
        applicationContext.close();
    }
}
