package com.cg.EnquiryService;

import java.io.IOException;
import java.sql.SQLException;

import com.cg.EnquiryDTO.EnquiryDetails;
import com.cg.EnquiryException.EnquiryException;

public interface IEnquiryService {

	
	public int addEnquiryDetails(EnquiryDetails details) throws EnquiryException, IOException, SQLException;

}
