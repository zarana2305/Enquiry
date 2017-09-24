package com.cg.EnquiryUI;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;
import com.cg.EnquiryDTO.EnquiryDetails;
import com.cg.EnquiryException.EnquiryException;
import com.cg.EnquiryService.EnquiryServiceImpl;
import com.cg.EnquiryService.IEnquiryService;

public class EnquiryMainUI 
{
	//static Scanner sc=null;
	static int choice;
	static EnquiryDetails details=null;	//object of DTO (bean)
	static IEnquiryService service=null;//Service layer object
	
	public static void main(String[] args) throws IOException, SQLException, EnquiryException
	{ Scanner sc=new Scanner(System.in);
		System.out.println("Enquiry application\n");
		System.out.println("*************************");
		while(true)
		{
			System.out.println("1.Enter enquiry details ");
			System.out.println("2.get enquiry details ");
			System.out.println("3.get enquiry details by ID");
			System.out.println("4.exit ");
			System.out.println("enter choice");
			choice= sc.nextInt();
			switch(choice) {
			case 1:addEnquiryDetails();
			break;
			case 2:getEnquiryDetails();
			break;
			case 3:getEnquiryDetailsByID();
			break;
			default:System.out.println("WRONG");
			break;
			}
			
		}
	}

	private static void getEnquiryDetailsByID() {
			}

	private static void getEnquiryDetails() {
		
		
	}

	private static void addEnquiryDetails() throws EnquiryException, IOException, SQLException{
		int res=0;
		try {
			Scanner sc=new Scanner(System.in);
		service=new EnquiryServiceImpl();
		System.out.println("Enter first name");
		String fname=sc.next();
		System.out.println("Enter last name");
		String lname=sc.next();
		System.out.println("Enter contact");
		String contact=sc.next();
		System.out.println("Enter domain");
		String domain=sc.next();
		System.out.println("Enter location");
		String location=sc.next();
		
		details=new EnquiryDetails(fname,lname,contact,domain,location);

		res=service.addEnquiryDetails(details);
		System.out.println(res+ "rows inserted");
		
		if(res==1) {System.out.println("value added in db");}
		else {System.out.println("not added");
		}
		}
		catch(EnquiryException e){
			//System.out.println("h");
			throw new EnquiryException("aa");
		}
		
	}
}
