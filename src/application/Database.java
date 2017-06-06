package application;

import java.sql.*;

public class Database 
{
	private static Connection c = null;
	private static boolean hasData = false;
	private String _username;
	private String _password;
	private String loggedUser;
	
	public Database(){
		try {
			OpenDatabase();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void OpenDatabase() throws SQLException  {
		
	    try {
	      Class.forName("org.sqlite.JDBC");
	      c = DriverManager.getConnection("jdbc:sqlite:users.db");
	    } catch ( Exception e ) {
	      System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	      System.exit(0);
	    }
	    Initialise();
	}

	  
	public void CloseDatabase() throws SQLException{
		c.close();
	}
	
	public static void Initialise() throws SQLException{
		
		if (!hasData){
			hasData = true;
			
			Statement state = c.createStatement();
			ResultSet rs = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name='user';");
			if (!rs.next()){
				System.out.println("Building the user table with prepopulated values");
				Statement state2 = c.createStatement();
				state2.execute("CREATE IF NOT EXISTS TABLE user (id integer," 
				+ "username varchar(60)," + "password varchar(60),"
				+ "primary key(id));");
				
			//inserting some primary data
				PreparedStatement prep = c.prepareStatement("INSERT INTO user values (?,?,?);");
				prep.setString(2, "Chopin");
				prep.setString(3, "pianinko");
				prep.execute();
				
				PreparedStatement prep2 = c.prepareStatement("INSERT INTO user values (?,?,?);");
				prep2.setString(2, "Bach");
				prep2.setString(3, "pianinko");
				prep2.execute();
			}
			
			
		}
		
	}
	
	public void addUser(String username, String password) throws SQLException{
		
		_username=username;
		_password=password;
		
		if (c==null){
			OpenDatabase();
		}
		
		PreparedStatement prep = c.prepareStatement("INSERT INTO user values (?,?,?);");
		prep.setString(2, _username);
		prep.setString(3, _password);
		prep.execute();
		
	}
	
	public String returnPassword(String username) throws SQLException{
		_username = username;
		String validPassword = null;
		
		if(c==null){
			OpenDatabase();
		}
		Statement state = c.createStatement();
		ResultSet rs = state.executeQuery( "SELECT username, password FROM user WHERE username=" + "'" + _username + "'");
		if (rs.next()) {
			validPassword = rs.getString("password");
		}	
		
		
		return validPassword;
	}
	
	public boolean ifUserExists(String username) throws SQLException{
		_username = username;
		boolean existingUser = false;
		
		if(c==null){
			OpenDatabase();
		}
		
		Statement state = c.createStatement();
		ResultSet rs = state.executeQuery( "SELECT username FROM user WHERE username=" + "'" + _username + "'");
		if (rs.next()) {
			existingUser = true;
		}
		
		return existingUser;
	}
	
	public void setLoggedUser(String username){
		loggedUser = username;
		}
	
	public String getLoggedUser(){
		return loggedUser;
	}
}
	
