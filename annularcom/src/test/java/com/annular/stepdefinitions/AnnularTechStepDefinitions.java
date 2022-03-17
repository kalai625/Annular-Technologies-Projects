package com.annular.stepdefinitions;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertFalse;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.commands.DragAndDropTo;
import com.annular.core.SessionObject;
import com.annular.pages.HomePage;
import com.annular.util.AppConstants;
import com.annular.util.AnnulartechDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

public class AnnularTechStepDefinitions {
	
	private static final String DragAndDropTo = null;
	private AnnulartechDriver driver;
	private HomePage homePage;	
	
	public AnnularTechStepDefinitions(AnnulartechDriver itautomatnDriver) {
		this.driver = itautomatnDriver;
		homePage = new HomePage(itautomatnDriver);	
	}
	
//	 //Reg Exp:
//	 //1. \"([^\"]*)\"
//	 //2. \"(.*)\
//
//
//  @Then("^user enters \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_username_and_password(String username, String password){
//	 driver.findElement(By.name("username")).sendKeys(username);
//	 driver.findElement(By.name("password")).sendKeys(password);
//	 }
//
//
//  @Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	 public void user_enters_contacts_details(String firstname, String lastname, String position){
//		 driver.findElement(By.id("first_name")).sendKeys(firstname);
//		 driver.findElement(By.id("surname")).sendKeys(lastname);
//		 driver.findElement(By.id("company_position")).sendKeys(position);
//		 driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
//	 }
//
//	 @Then("^user enters deal details$")
//	 public void user_enters_contacts_details(DataTable dealData){
//		 List<List<String>> dealValues =  dealData.raw();
//		 driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0));
//		 driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
//		 driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
//		 driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
//	 }
	
	
	
	
	@Then("user is in leafPage home page")
	public void user_is_in_leaf_Page_homepage(){
	   assertThat(homePage.testLogoImg().isDisplayed());
	   System.out.println(homePage.titleOfCurrentPage().getText());
		System.out.println("Test Leaf logo is displayed");
	}
	     
	    @And("click droppableIcon button")
		public void click_droppableIcon_button()  {
		 homePage.droppableIcon().click();			
			System.out.println("click droppableIcon button");
			 
		}
	    @When("Verify current page is displayed")
	    public void Verify_current_page_is_displayed()  {
			 homePage.titleOfCurrentPage().isDisplayed();		
				System.out.println("Verify current page is displayed");
				 
			}
	    @And("click Draggable button")
		public void click_Draggable_button()  {
			homePage.dragabbleIcon().click();
			assertThat(homePage.titleOfCurrentPage().isDisplayed());
			System.out.println("click Draggable button");
			
		}
	    
	    @Then("Drag the box to the same box dragabble")
	    public void Drag_the_box_to_the_same_box_dragabble() throws InterruptedException  {
	    	Actions actn= new Actions(driver.getDriver().getWebDriver());	    	
	    	actn.dragAndDrop(homePage.drag1(), homePage.drag2()).build().perform();			
			Point dg1 = homePage.drag1().getLocation();
			Point dg2 = homePage.drag2().getLocation();
			System.out.println(dg1);
			System.out.println(dg2);
			
			
//			if(dg1.equals(dg2)) {
//				System.out.println("PASS: Source is dropped to target as expected");
//			}else {
//				System.out.println("FAIL: Source couldn't be dropped to target as expected");
//			}
			
			System.out.println("Drag the box to the same box dragabble");
		}
	    
		
		@And ("Drag the box to the traget position")
		public void Drag_the_box_to_he_traget_position() throws InterruptedException{
			Actions actn= new Actions(driver.getDriver().getWebDriver());
			// actn.moveToElement(homePage.source()).moveToElement(homePage.target()).build().perform();
			actn.dragAndDrop(homePage.target1(), homePage.target2()).build().perform();
			
			assertThat(actn);
			System.out.println("Drag the box to the traget position");
			 
		}   

	@And("click element to Appears button in home page")
	public void click_element_to_Appears_button_in_home_page()  {
		homePage.waitToAppearIcon().click();
		System.out.println(homePage.titleOfCurrentPage().getText());
		System.out.println("Appears button page is open");
		 
	}
	@Then("wait for element to appear")
	public void wait_for_element_to_appear()  {
		homePage.appearnewText().getText();
		System.out.println(homePage.appearnewText().getText());		
		assertThat(homePage.appearnewText().isDisplayed());
		System.out.println(homePage.appearnewText().getText());
		System.out.println(" wait_for_element_to_appear");
		
	}
	
	@And ("verify the Voila Im here Guys is displayed")
	public void verify_the_Voila_Im_here_Guys_is_displayed(){
		System.out.println(homePage.appearnewText().getText());
		System.out.println(homePage.titleOfCurrentPage().getText());
		System.out.println("verify the Voila Im here Guys is displayed");
		 
	}
	@And("click home logo icon")
	public void click_home_logo_icon(){
		homePage.logoTestLeaf().click();
		System.out.println("click home logo icon");
		 
	}
	
	@Then("verify user is in leafPage home page")
	public void verify_user_is_in_leafPage_home_page(){
		System.out.println(homePage.titleOfCurrentPage().getText());
		assertThat(homePage.titleOfCurrentPage().isDisplayed());
		System.out.println("verify user is in leafPage home page");		 
	}
	//*******************************************************************************************************************************
	@And("click hyperlink icon in home page")
	public void click_hyperlink_icon_in_home_page(){
		homePage.hyperLinkIcon().click();
		System.out.println(homePage.titleOfCurrentPage().getText());
		System.out.println("click hyperlink icon in home page");
		 
	}
	@Then("click the go to home button")
	public void click_the_go_to_home_button(){
		homePage.goHome1().click();
		System.out.println(homePage.titleOfCurrentPage().getText());
		System.out.println("click the go to home button");
		
		 
	}
	@Then("Verify home page is display")
	public void Verify_home_page_is_display(){
		System.out.println(homePage.titleOfCurrentPage().getText());		
		System.out.println("Verify home page is display");
		 
	}
	 
	@Then("verify the hperlink page is open")
    public void verify_the_hperlink_page_is_open(){
		String ActualTitle="Play with HyperLinks";
		 do
		    {
		 	 String ExpectedTitle=homePage.titleOfCurrentPage().getText();
				ActualTitle.equals(ExpectedTitle);
				System.out.println(ExpectedTitle);
			   System.out.println("Assertion is =  "+ActualTitle.equals(ExpectedTitle));
		    }while(1==2);
		System.out.println(homePage.titleOfCurrentPage().getText());		
		System.out.println("verify the hperlink page is open");
		 
	}
	@Then("Click the second link find where it is go")
    public void Click_the_second_link_find_where_it_is_go(){		
		homePage.findWhereTo().click();
		System.out.println("Click the second link find where it is go");
		 
	}
	@Then("verify and display the current page name")
    public void verify_and_display_the_current_page_name(){
		System.out.println(homePage.titleOfCurrentPage().getText());		
		System.out.println("verify and display the current page name");		 
	}
  
    @And("navigate the back page")
    public void navigate_the_back_page(){
		driver.getDriver().getWebDriver().navigate().back();
		System.out.println("navigate the back page");
		 
	}
	@Then("click the broken link of third link")
    public void click_the_broken_link_of_third_link(){
		homePage.brokenLink().click();
		
		
		
	}
	@Then("verify the link is broken and display the title of the broken link page")
    public void verify_the_link_is_broken_and_display_the_title_of_the_broken_link_page(){
		String ref=homePage.Error404().getText();
		String ref1=homePage.Error404().toString();		
		System.out.println(ref);
		System.out.println(ref1);
		System.out.println("verify the link is broken and display the title of the broken link page");
				 
	}
    @Then("click home botton intract the same link and different xpath")
    public void click_home_botton_intract_the_same_link_and_different_xpath(){
    	homePage.goHome4().click();
		System.out.println("click home botton intract the same link and different xpath");
		 
	}
	@Then("Click the final link of hyperlink bcz od taking count link")
    public void Click_the_final_link_of_hyperlink_bcz_od_taking_count_link(){
		homePage.countLink().click();		
		System.out.println("Click the final link of hyperlink bcz od taking count link");
				 
	}
	 
	@Then("verify the count of link in current page")
    public void verify_the_count_of_link_in_current_page() throws InterruptedException{
		System.out.println(homePage.titleOfCurrentPage().getText());
		assertThat(homePage.titleOfCurrentPage().isDisplayed());
		Object ref=homePage.countLink().getSize();

		System.out.println("size  "+ref);
		
		System.out.println("verify the count of link in current page");
				 
	}
	//*******************************************************************************************************************************
	
	@Then("click Radio button in home page")
    public void click_Radio_button_in_home_page(){
		homePage.radioButtonIcon().click();
		System.out.println(homePage.titleOfCurrentPage().getText());
		assertThat(homePage.titleOfCurrentPage().isDisplayed());
		
		System.out.println("click Radio button in home page");
	}

	    @And("select yes option in class")
		public void select_yes_option_in_class(){
	    	//1
			WebElement clss1= homePage.classYesRdBtn();
			WebElement clss2= homePage.classYesRdBtn();
			clss1.click();
			System.out.println(clss1.isSelected());
			System.out.println(clss2.isSelected());
	    	
	    	System.out.println("select yes option in class");
		}
	  
	    @And("select default radio button checked option is selected")
		public void select_default_radio_button_checked_option_is_selected(){
	    	//2
			WebElement chk1= homePage.unCheckedRdBtn();
			WebElement chk2= homePage.CheckedRdBtn();
			chk2.click();
			System.out.println(chk1.isSelected());
			System.out.println(chk2.isSelected());
	    	System.out.println("select default radio button checked option is selected");
		}
	    @Then("Age group is selected")
		public void Age_group_is_selected(){
			WebElement ag1= homePage.ageGroupSamll();
			WebElement ag2= homePage.ageGroupMedium();
			WebElement ag3= homePage.ageGroupHigh();
			ag3.click();
			System.out.println(ag1.isSelected());
			System.out.println(ag2.isSelected());
			System.out.println(ag3.isSelected());
	    	System.out.println("Age group is selected ");
	    	
		}
	  //*******************************************************************************************************************************
	    
	    @Then("click Alert icon in home page")
		public void click_Alert_icon_in_home_page(){ 
	    	homePage.alertIcon().click();		    	
	    	System.out.println("click Alert icon in home page");
		}
	    @Then("verify alertpage is displayed")
		public void verify_alertpage_is_displayed(){ 	
	    	System.out.println(homePage.titleOfCurrentPage().getText());
			assertThat(homePage.titleOfCurrentPage().isDisplayed());
	    	System.out.println("verify alertpage is displayed");
		}
	    @And("click Alertbox button")
		public void click_Alertbox_button(){
	    	homePage.alertBox().click();
	    	System.out.println("click Alertbox button");
		}
	    
	    @Then("click confirmbox button")
		public void click_confirmbox_button(){ 	
	    	homePage.confirmBox().click();
	    	System.out.println("click confirmbox button");
		}
	    @Then("handle and accept the popup")
		public void handle_and_accept_the_popup(){ 	
	    	driver.getDriver().getWebDriver().switchTo().alert().accept();
	    	System.out.println("handle and accept the popup");
		}
	    @Then("print the confirmation message")
		public void print_the_confirmation_message(){
	    	String dispVal=homePage.pressOk().getText();
	    	System.out.println(dispVal);
	    	System.out.println("print the confirmation message");
		}
	    @And("click prompt button")
		public void click_prompt_button(){
	    	homePage.promptBox().click();	    	
	    	System.out.println("click prompt button");
		}
	    @Then("print popup text")
		public void print_popup_text(){
	    	
	    	String ref=driver.getDriver().getWebDriver().switchTo().alert().getText();
	    	System.out.println(ref);	
	    	
	    	System.out.println("print popup heading");
		}
	    @Then("give the send key {string} to the promptbox")
		public void give_the_send_key_searchString_to_the_promptbox(String checkname) {
	    	
	    	driver.getDriver().getWebDriver().switchTo().alert().sendKeys(checkname);
	    	System.out.println(checkname);
	    	  	
	    	System.out.println("give the send key <searchString> to the promptbox");
		}
	    @Then("print the confirmation message2")
		public void print_the_confirmation_message2(){
	    	
		    	String dispVal=homePage.pressOk1().getText();
		    	System.out.println(dispVal);
		    	System.out.println("print the confirmation message1");
		} 
	    @And("click line break")
		public void click_line_break(){
	    	homePage.lineBreaks().click();
	    	System.out.println("click line break");	
		}
	    @Then("verify alert message and print")
		public void verify_alert_message_and_print(){
	    	String ref=driver.getDriver().getWebDriver().switchTo().alert().getText();	    	
	    	System.out.println(ref);	
	    	System.out.println("verify alert message and print");	
		}
	    
	    @And("Click Sweet Alert")
		public void Click_Sweet_Alert(){
	    	homePage.sweetAlert().click();
	    	 //Actions actn= new Actions(driver.getDriver().getWebDriver());
	    	//  actn.moveToElement(lineBreaks());
//	    	 driver.findElement(By.xpath(sweetAlert)).click();
//		     System.out.println(driver.findElement(By.xpath("//div[@class='swal-text']")).getText()); 
//		     driver.findElement(By.xpath("//button[contains(text(),'OK')]")).click();
	    	System.out.println("Click Sweet Alert");
		}
	    @Then("Print the message time of alert")
		public void Print_the_message_time_of_alert(){
	    	
	    	
	    	System.out.println(homePage.HappyCodTxt().getText());
	    	homePage.HappycodeOk().click();;
	    	System.out.println("Print the message time of alert");	
		}
	   
	    
	//*******************************************************************************************************************************
	
	//annular website
	
	@Then("User is in annulartechnology home page")
	public void isAnnularTechnologyHomePageDisplayed(){
		assertThat(homePage.annulartechLogo().isDisplayed());
	}
	
	@And("click contact in home page")
	public void clkContact(){
		homePage.contactUs().click();
	}
	
	@And("enter name {string}")
	public void enterContName(String name){
		homePage.cusName().sendKeys(AppConstants.contactList.valueOf(name).getContactList());
	}
	
	@And("enter email {string}")
	public void enterContEmail(String email){
		homePage.cusEmail().sendKeys(AppConstants.contactList.valueOf(email).getContactList());
	}
	
	@Then("it should display contact us page")
	public void contactUsPage(){
		assertTrue(homePage.contactUsPge().isDisplayed());
	}
	@And("enter message {string}")
	public void enterMsg(String msg){
		homePage.cusMessage().sendKeys(AppConstants.contactList.valueOf(msg).getContactList());
	}
	
	@And("enter phone number {string}")
	public void enterContPhonNo(String email){
		homePage.cusPhonno().sendKeys(AppConstants.contactList.valueOf(email).getContactList());
	}
	
	@And("enter subject {string}")
	public void enterContsubject(String email){
		homePage.cussubject().sendKeys(AppConstants.contactList.valueOf(email).getContactList());
	}
	
	@And("click submit")
	public void clickSubmit(){
		homePage.cusSubmitBtn().click();
	} 
	
	@And("click submit in home page")
	public void clickSubmithomepag(){
		
		homePage.cusSubmitBtnhomepage().click();
	}
	
	
	@Then("select about in home page")
	public void selecttababout() {
		homePage.aboutusAn().click();
		
	}
	@And("select get free quote in aboutus page")
	public void selectgetfree() {
		homePage.getfreequoteAn().click();
		
	}
	
	@And("select get free quote in home page")
	public void selectgetfreehomepage() {
		homePage.getfreequoteAn().click();
		
	}
	
	@Then("it should display about us page")
	public void aboutUsPage(){
		assertTrue(homePage.aboutUsPge().isDisplayed());
	}
	
	@Then("about us page should display total projects completed")
	public void projectsCompleted(){
		assertTrue(homePage.projectsCompleted().isDisplayed());
	}
	
	@Then("about us page should display happy clients")
	public void happyClients(){
		assertTrue(homePage.happyClients().isDisplayed());
	}
	
	@Then("about us page should year of excellence")
	public void awards(){
		assertTrue(homePage.awards().isDisplayed());
	
	}
	
	@Then("about us page should project executed")
	public void projectexecuted(){
		assertTrue(homePage.Proexecuted().isDisplayed());
	
	} 
	
	@Then("it should display home page")
	public void verifyHomepage(){
		assertTrue(homePage.verifyhomepage().isDisplayed());
	
	} 
	
	@Then("click website designing service in our service")
	public void clickwebsitedesign(){
		
		homePage.clickWebsite().click();
	}
	
	@Then("verify our services are displayed home page")
	public void verifyourservices(){
		assertTrue(homePage.ourServices().isDisplayed());
		
	}
	
	@Then("verify website desinging page dispalyed")
	public void verifwebsitedesign(){
		assertTrue(homePage.verifyWebsite().isDisplayed());
	
	}
	@Then("click analytic service in our service")
	public void clickanalytic(){
		//assertTrue(homePage.clickanalytic().isDisplayed());
		homePage.clickanalytic().click();
	
	}
	@Then("verify analytic page dispalyed")
	public void verifyanalyticpage(){
		assertTrue(homePage.verifyanalytic().isDisplayed());
	
	}
	@Then("click Testing service in our service")
	public void clickTesting(){
		//assertTrue(homePage.clickTesting().isDisplayed());
		homePage.clickTesting().click();
	
	}
	@Then("verify Testing page dispalyed")
	public void verifTestingPage(){
		assertTrue(homePage.verifyTesting().isDisplayed());
	
	}
	
	@Then("validate mandatory {string} displayed for name")
	public void nameisReqd(String text){
		assertEquals(homePage.nameValidation().getText(), AppConstants.expectedRsltList.valueOf(text).getExpectedRsltList());
	}
	
	@Then("validate mandatory {string} displayed for email")
	public void emailisReqd(String text){
		assertEquals(homePage.emailValidation().getText(), AppConstants.expectedRsltList.valueOf(text).getExpectedRsltList());
	}
	
	@Then("validate mandatory {string} displayed for message")
	public void messageisReqd(String text){
		assertEquals(homePage.messageValidation().getText(), AppConstants.expectedRsltList.valueOf(text).getExpectedRsltList());
	}
	
	@Then("validate who we are is shown in about us")
	public void whoWeAre(){
		homePage.whoAreWe().should(Condition.appears);
		homePage.whoAreWeMsg().should(Condition.appears);		
	}
	
	@Then("validate our mission is shown in about us")
	public void ourMission(){
		homePage.ourMission().shouldBe(Condition.visible);
		homePage.ourMissionMsg().shouldBe(Condition.visible);
	}
	
	@Then("validate what we do is shown in about us")
	public void whatWeDo(){
		assertTrue(homePage.whatWeDo().isDisplayed());
		assertTrue(homePage.whatWeDoMsg().isDisplayed());
	}
	
	@Then("the best quality work should show in why choose us")
	public void bestQualityWork(){
		assertTrue(homePage.bestQualityWorkDisplayed().isDisplayed());
	}
	
	@Then("the support after delivery should show in why choose us")
	public void supportAfterDelivery(){
		
		assertTrue(homePage.supportAfterDelivery().isDisplayed());
		
	}
		
	@Then("the result oriented approach should show in why choose us")
	public void resultOrientedApproach(){
		
		assertTrue(homePage.resultOrientedApproach().isDisplayed());
		
	}
	
	@Then("click recnet post in aboutus page")
	public void clickrecentpost(){
		
		
		homePage.clickRecntPost().click();
		
	}
	
	@Then("verify navigate to blog page")
	public void navigateBlog(){
		
		assertTrue(homePage.blogNavigate().isDisplayed());
		
		
	}
	
	@And("enter name {string} in leave comment")
	public void enterleaveName(String name){
		homePage.LeavName().sendKeys(AppConstants.contactList.valueOf(name).getContactList());
	}
	
	@And("enter email {string} in leave comment")
	public void enterLeavEmail(String email){
		homePage.LeavEmail().sendKeys(AppConstants.contactList.valueOf(email).getContactList());
	}
	
	@And("enter message {string} in leave comment")
	public void enterLeavMsg(String msg){
		homePage.LeavMessage().sendKeys(AppConstants.contactList.valueOf(msg).getContactList());
	}
	
	@And("click submit button in leavecomment")
	public void clicksumbitbutton(){
		homePage.clicksumbitLeav().click();
	}
	
	@And("verify comment is displayed")
	public void verifycomment(){
		
		assertTrue(homePage.verifyleavecomment().isDisplayed());
	}
	
	@Then("verify phone number dispalyed homepage")
	public void verifyphonenumber(){
		
		assertTrue(homePage.verifyPhoneNum().isDisplayed());
	}
	
	@Then("verify email dispalyed home page")
	public void verifyEmaiId(){
		
		assertTrue(homePage.verifyEmailid().isDisplayed());
	}
	@Then("click service page")
	public void clickservicepage(){
		
		homePage.clickServicepge().click();
	}
	@Then("click digital service Learn more")
	public void clickdigitalservice(){
		
		homePage.clickdigitalServicelink().click();
	}
	@Then("click analytic service Learn more")
	public void clickanalyticservice(){
		
		homePage.clickanalyticServicelink().click();
	}
	@Then("click testing service Learn more")
	public void clicktestingservice(){
		
		homePage.clicktestingServicelink().click();
	}
	
    @Then("verify use address displayed contact page")
	public void verifyusaadd(){
		assertTrue(homePage.verifyusaaddres().isDisplayed());
	}
    
	@And("verify india address displayed contact page")
	public void verifyIndiaadd(){
		assertTrue(homePage.verifyindaddres().isDisplayed());
		
	}
	
	@And("select blog in home page")
	public void Selectblog(){
		
		homePage.selectblogpg().click();
	}
	
	
	@And("click read more button")
	public void clickreadmore(){
		
		homePage.clickReadmore().click();
	}
	
	@And("enter mail id {string} in search box")
	public void entersearchmail(String msg){
		homePage.searchMail().sendKeys(AppConstants.contactList.valueOf(msg).getContactList());
	}
	
	@And("click search icon")
	public void clicksearchicon(){
		homePage.Clicksearchicon().click();
	}
	
	
	@And("verify project displayed in blog page")
	public void verifyProject(){
		
		assertTrue(homePage.verifyPrjectdisplay().isDisplayed());
	}
	
	
	@And("verify project not displayed in blog page")
	public void verifynotDisProject(){
		
		assertFalse(homePage.verifyPrjectdisplay().isDisplayed());
	}
	
}