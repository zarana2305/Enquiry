package com.cg.EnquiryDAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.cg.EnquiryDBUtil.EnquiryDBUtil;
import com.cg.EnquiryDTO.EnquiryDetails;
import com.cg.EnquiryException.EnquiryException;

public class EnquiryDAOImpl implements IEnquiryDAO {

	
	public int addEnquiryDetails(EnquiryDetails details) throws EnquiryException {
		int result=0;
		Connection conn=null;
		try {
				conn=EnquiryDBUtil.getConnection();
				System.out.println(conn);			//to check whether the condition is established or not
				String ins="insert into enq values(se.nextval,?,?,?,?,?)";
				PreparedStatement ps=conn.prepareStatement(ins);
				ps.setString(1,details.getFname());
				ps.setString(2,details.getLname());
				ps.setString(3,details.getContact());
				ps.setString(4,details.getDomain());
				ps.setString(5,details.getLocation());
				
				result=ps.executeUpdate();
				System.out.println(result);
			}
			catch(IOException e) {
				e.printStackTrace();
			}
			catch(SQLException a) {
				throw new EnquiryException(a.getMessage());
			}
		
		
		return result;
		
	}

}
