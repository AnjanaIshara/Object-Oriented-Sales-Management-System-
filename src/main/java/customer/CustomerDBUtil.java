package customer;

import java.sql.Connection;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;



public class CustomerDBUtil  {
	private static Connection con=null;
	private static Statement stmt=null;
	private static ResultSet rs=null;
	public static List<Customer>validate(String userName, String password){
		
		
		
		ArrayList<Customer> cus=new ArrayList<>();
		
		try {
			
			con=DBConnect.getConnection();
			
			stmt=con.createStatement();
			String sql="SELECT * FROM customer  where username='"+userName+"' and password='"+password+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String phone=rs.getString(4);
				String useru=rs.getString(5);
				String passu=rs.getString(6);
				Customer c=new Customer(id,name,email,phone,useru,passu);
				cus.add(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return cus;
		
	}
	
	public static List<Order> getOrders(String orderid) {
		
		
		ArrayList<Order> cus=new ArrayList<>();
		
		
try {
			
			con=DBConnect.getConnection();
			
			stmt=con.createStatement();
			String sql="SELECT * FROM orders  where id='"+orderid+"'";
			rs=stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id=rs.getInt(1);
				int userid=rs.getInt(2);
				String itemname=rs.getString(3);
				String quantity=rs.getString(4);
				String address=rs.getString(5);
				String price=rs.getString(6);
				
				Order c=new Order(id,userid,itemname,quantity,address,price);
				cus.add(c);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return cus;
		
	}
	public static boolean checkorders(String userid) {
		boolean isSuccess=false;
		
		try {
			con=DBConnect.getConnection();
			stmt=con.createStatement();
			String sql="SELECT * FROM orders";
			int rs=stmt.executeUpdate(sql);
			
			if(rs > 0) {
    			isSuccess = true;
    		} else {
    			isSuccess = false;
    		}

			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	 public static boolean insertcustomer(String name, String email, String phone, String username, String password) {
		 
		 boolean isSuccess=false;
		 
		 
		 try {
			 
			 con=DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "insert into customer values (0,'"+name+"','"+email+"','"+phone+"','"+username+"','"+password+"')";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} else {
	    			isSuccess = false;
	    		}


		 }
		 catch(Exception e){
			 e.printStackTrace();
		 }
		 return isSuccess;
	 }
	 
	 
	 public static boolean insertorder(int userid,String itemname,String quantity, String address) {
		 boolean isSuccess=false;
		 
		 try {
			 			 
			 con=DBConnect.getConnection();
			 stmt = con.createStatement();
			 String sql = "insert into orders values (0,'"+userid+"','"+itemname+"','"+quantity+"','"+address+"','"+"0"+"')";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		} else {
	    			isSuccess = false;
	    		}
			 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		 return isSuccess;
		 
	 }
	 
	 public static List<Customer> getCustomer(String userName) {
			
			ArrayList<Customer> customer = new ArrayList<>();
			
			try {
				
				con = DBConnect.getConnection();
				stmt = con.createStatement();
				String sql = "select * from customer where username='"+userName+"'";
				rs = stmt.executeQuery(sql);
				
				while (rs.next()) {
					int id = rs.getInt(1);
					String name = rs.getString(2);
					String email = rs.getString(3);
					String phone = rs.getString(4);
					String username = rs.getString(5);
					String password = rs.getString(6);
					
					Customer cus = new Customer(id,name,email,phone,username,password);
					customer.add(cus);
				}
				
			} catch (Exception e) {
				
			}
			
			return customer;	
		}
	    
	  public static boolean updatecustomer(String id, String name, String email, String phone, String username, String password) {
		  boolean isSuccess = false;

		  
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "update customer set name='"+name+"',email='"+email+"',phone='"+phone+"',username='"+username+"',password='"+password+"'"
	    				+ "where id='"+id+"'";
	    		int rs = stmt.executeUpdate(sql);
	    		
	    		if(rs > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	  
	  public static List<Customer> getCustomerDetails(String Id) {
	    	
	    	int convertedID = Integer.parseInt(Id);
	    	
	    	ArrayList<Customer> cus = new ArrayList<>();
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "select * from customer where id='"+convertedID+"'";
	    		rs = stmt.executeQuery(sql);
	    		
	    		while(rs.next()) {
	    			int id = rs.getInt(1);
	    			String name = rs.getString(2);
	    			String email = rs.getString(3);
	    			String phone = rs.getString(4);
	    			String username = rs.getString(5);
	    			String password = rs.getString(6);
	    			
	    			Customer c = new Customer(id,name,email,phone,username,password);
	    			cus.add(c);
	    		}
	    		
	    	}
	    	catch(Exception e) {
	    		e.printStackTrace();
	    	}	
	    	return cus;	
	    }
	  public static boolean deleteCustomer(String id) {
		  boolean isSuccess = false;
	    	int convId = Integer.parseInt(id);
	    	
	    	try {
	    		
	    		con = DBConnect.getConnection();
	    		stmt = con.createStatement();
	    		String sql = "delete from customer where id='"+convId+"'";
	    		int r = stmt.executeUpdate(sql);
	    		
	    		if (r > 0) {
	    			isSuccess = true;
	    		}
	    		else {
	    			isSuccess = false;
	    		}
	    		
	    	}
	    	catch (Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	return isSuccess;
	    }
	  

	
}
