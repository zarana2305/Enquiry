package com.cg.EnquiryDAO;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.EnquiryDTO.EnquiryDetails;
import com.cg.EnquiryException.EnquiryException;

public interface IEnquiryDAO {

	public int addEnquiryDetails(EnquiryDetails details) throws EnquiryException, IOException, SQLException;

}
