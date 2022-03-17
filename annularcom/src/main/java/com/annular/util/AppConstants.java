package com.annular.util;

public class AppConstants {

	public enum searchList {

		itautomation("itautomation.no"), itautomationservices("itautomation no services");

		private String srchList;

		searchList(String srchList) {
			this.srchList = srchList;
		}

		public String getSearchList() {
			return srchList;
		}
	}

	public enum contactList {

		name("kalai"), email("kalai@gmail.com"), message("testautomation - contact us testing"),
		phoneno("0000"), subject("Testautomation"), searchmail("support@annulartechnologies.com"),checkname("TestLeaf");

		private String cntList;

		contactList(String cntList) {
			this.cntList = cntList;
		}

		public String getContactList() {
			return cntList;
		}
		
	}

	public enum expectedRsltList {

		searchmail("support@annulartechnologies.com"), constapi("API Testing"), constfunc("Functional Testing"),
		contReqSuccMsg("Thanks for contacting us! We will be in touch with you soon"),
		constReqFieldErr("The field is required."), projComp("17"), happyclients("5"), awards("2");

		private String expList;

		expectedRsltList(String expList) {
			this.expList = expList;
		}

		public String getExpectedRsltList() {
			return expList;
		}
	}

}
