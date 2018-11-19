import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
private static String connectionString = "jdbc:derby://localhost:5779/JBDB;create=true";
	
	
	
	//-------------------------����� ����-----------------------------
	public static void buildDB() {
		
		// If JohnBryceDB already exist, there will be an exception.
		// Do nothing in the catch.
		try {
			
			// Create a connection to the database: 
			Connection connection = DriverManager.getConnection(connectionString);
			
		
			
			//����� ������� ���� ������ �����
			String sql = "create table Students (" +
				"id integer not null primary key generated always as identity(start with 1, increment by 1), " +
				"name varchar(50) not null, " +
				"age int not null)";
			
			
			// ������� ����� ����� ������ �� ��� �������
			Statement statement = connection.createStatement();
			
			// ��� �� ������� ��"�
			statement.executeUpdate(sql);
			
			System.out.println("Students table has been created.");			
		}
		catch(Exception ex) {
			 System.out.println(ex.getMessage());
		}
	}
	
	
	//-------------------------����� ������ �����-----------------------------
	public static void insert(String name, int age) throws SQLException {
		
		// Create a connection: 
		Connection connection = DriverManager.getConnection(connectionString);
		
		// Create sql statement: 
		String sql = String.format("insert into Students(name, age) values('%s', %d)", name, age);
		
		// Create object which can execute the above sql and return the new id:
		PreparedStatement preparedStatement = connection.prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS);
		
		// Execute (the insert command):
		preparedStatement.executeUpdate();
		
		// Retrieves any auto-generated keys created as a result of executing this Statement object (returns ResultSet)
		ResultSet resultSet = preparedStatement.getGeneratedKeys();
		
		resultSet.next();
		
		
		int id = resultSet.getInt(1);
		
		//System.out.println("Insert succeeded. New create id: " + id);
	}
		
	
	
	//-------------------------����� ������ ������-----------------------------
	public static void readAll() throws SQLException {
		
		// Create a connection: 
		Connection connection = DriverManager.getConnection(connectionString);
		
		// Create a statement object which can read data: 
		Statement statement = connection.createStatement();
		
		// Create sql statement for reading data: 
		String sql = "select * from Students";
		
		// Execute the query and return an object which contains the data (the table):
		ResultSet resultSet = statement.executeQuery(sql);
		
		
		System.out.println("   id   |   Name    |  age   ");
		System.out.println("--------+-----------+--------");
		//loop over the rows in the ResultSet
		// next() - Moves the cursor forward one row from its current position - returns true if the new current row is valid; false if there are no more rows
		while(resultSet.next()) {
			
			int id = resultSet.getInt("id");
			String name = resultSet.getString("name");
			int age = resultSet.getInt("age");
			
			System.out.println("   " + id + "    |   " + name + "|  " + age);	
		}
	}
	
	
	
	//-------------------------������ ������ �����-----------------------------
	public static void update(int id, String name, int age) throws SQLException {
		
		// Create a connection: 
		Connection connection = DriverManager.getConnection(connectionString);
		
		// Create an update sql statement: 
		String sql = String.format("update Students set name='%s', age=%d where id=%d", name, age, id);
		
		// Create an object for executing the above sql: 
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		preparedStatement.executeUpdate();
		
		System.out.println("Update succeeded.");
	}
	
	
	
	//-------------------------����� ������ ������-----------------------------
	public static void delete(int id) throws SQLException {
		
		// Create a connection: 
		Connection connection = DriverManager.getConnection(connectionString);
		
		// Create sql command for delete one record: 
		String sql = String.format("delete from Students where id=%d", id);
		
		// Create an object for executing the above command: 
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		// Execute: 
		preparedStatement.executeUpdate();
		
		System.out.println("Delete succeeded.");
	}

public static void deleteTable(String table) throws SQLException {
		
		// Create a connection: 
		Connection connection = DriverManager.getConnection(connectionString);
		
		// Create sql command for delete one record: 
		String sql = String.format("drop table "+table);
		
		// Create an object for executing the above command: 
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		
		// Execute: 
		preparedStatement.executeUpdate();
		
		System.out.println("Delete table succeeded.");
	}
	
	public static void main(String[] args) {
		
		try {
			
			// ����� ��'���� ����� �� ������� �� ����
			// ������ ��� ������ �������� ���� �������
			Class.forName("org.apache.derby.jdbc.ClientDriver");
	
			buildDB();
			insert("David   ", 20);
			insert("Dina    ", 32);
			insert("Roni    ", 27);
			insert("Izabelle", 21);
			insert("Nick    ", 22);
			
			readAll();
			
			System.out.println("\n\n\n");
			update(4, "Tom     ", 19);
			
			readAll();
			System.out.println("\n\n\n");
			delete(5);
			
			
			readAll();
			
			deleteTable("Students")	;
			
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		

		
	
	}
}

