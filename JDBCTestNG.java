package test;

import java.sql.Connection;

import org.testng.Assert;
import org.testng.annotations.Test;

public class JDBCTestNG {
	  @Test
	  public void test() {

	     
	   Fetch fe= new Fetch();
	  Connection con=fe.fetchData();
	   
	         Assert.assertTrue(con != null, "Connected");
	         
	     }      
	     
	    
  }

