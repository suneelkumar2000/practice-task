package JDBC_combine_tables;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class primaryData {
	private String mob_no;
	private String name;
	
	public primaryData() {
		
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return mob_no+" "+name;
	}

}

class secondaryData {
	private String mob_no;
	private String address;
	
	public secondaryData() {
		
	}
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String toString() {
		return mob_no+" "+address;
	}
}


class TableResponce{
	public static  List<primaryData> getprimaryData()
	
	{
	List <primaryData> plist= new ArrayList <primaryData>();
	try
	{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","suneel123");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from primaryData");  
		while(rs.next())
		{
			primaryData pd=new primaryData();
			pd.setMob_no(rs.getString("mob_no"));
			pd.setName(rs.getString("name"));
			plist.add(pd);
		}
		con.close();  
	}
	catch(Exception e)
	{ System.out.println(e);
	} return plist;
	}
	public static  List<secondaryData> getsecondaryData()
	{
	List <secondaryData> slist= new ArrayList <secondaryData>();
	try
	{  
		Class.forName("com.mysql.cj.jdbc.Driver");  
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","suneel123");  
		Statement stmt=con.createStatement();  
		ResultSet rs=stmt.executeQuery("select * from secondaryData");  
		while(rs.next())  
		{
			secondaryData sd=new secondaryData();
			sd.setMob_no(rs.getString("mob_no"));
			sd.setAddress(rs.getString("address"));
			slist.add(sd);
		} 
		con.close();  
	}
	catch(Exception e)
	{ System.out.println(e);
	}
	return slist;
	}
}


public class main{
	public static void main(String[]args) {
		Map<String,primaryData>pm=new HashMap<String,primaryData>();
		TableResponce tr = new TableResponce();
		List<primaryData>plist=tr.getprimaryData();
		List<secondaryData>slist=tr.getsecondaryData();
		for (primaryData pd:plist) {
			 if(pd !=null){
				pm.put(pd.getMob_no(),pd);
			 }
		}
		for (secondaryData sd:slist) {
			if(sd !=null){
				primaryData pdd = pm.get(sd.getMob_no());
				System.out.println(pdd.getName()+" "+pdd.getMob_no()+" "+sd.getAddress());
			}
		}
	}
}
