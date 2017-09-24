package com.cg.EnquiryService;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.EnquiryDAO.EnquiryDAOImpl;
import com.cg.EnquiryDAO.IEnquiryDAO;
import com.cg.EnquiryDTO.EnquiryDetails;
import com.cg.EnquiryException.EnquiryException;

public class EnquiryServiceImpl implements IEnquiryService {
IEnquiryDAO dao=null;
	
	public int addEnquiryDetails(EnquiryDetails details) throws  IOException, SQLException, EnquiryException{
		dao=new EnquiryDAOImpl();
		return dao.addEnquiryDetails(details);
		
	}
	

}
