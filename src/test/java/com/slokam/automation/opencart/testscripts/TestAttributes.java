package com.slokam.automation.opencart.testscripts;

import java.util.List;

import org.testng.annotations.Test;

import com.slokam.automation.opencart.commons.pages.AdminAttributesPage;
import com.slokam.automation.opencart.commons.pages.AdminDashboardPage;
import com.slokam.automation.opencart.commons.pages.AdminLoginPage;
import com.slokam.automation.opencart.commons.pages.AdminStatisticsPage;

public class TestAttributes extends TestBase{

	@Test
	public void verifyAttributes() {
		AdminLoginPage adminLoginPage = new AdminLoginPage(driver);
		adminLoginPage.login(username, password);
		AdminDashboardPage adminDashboardPage=new AdminDashboardPage(driver);
		adminDashboardPage.clickOnAttributes();
		AdminAttributesPage adminAttributesPage = new AdminAttributesPage(driver);
		AdminStatisticsPage adminStatisticsPage=new AdminStatisticsPage(driver);
		adminStatisticsPage.getStatisticsTypes();
		
		
	}
}
