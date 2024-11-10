package com.sopra.magento.tests;

import org.testng.annotations.Test;

import com.sopra.magento.data.ScenarioContext;
import com.sopra.magento.pages.LandingPage;

public class SetGetDataTest extends RunnerTest{

	LandingPage landingPage;
	@Test
	public void getYogaData() {
		String myvalue=new LandingPage(getDriver()).getYogaCollectionText();
		ScenarioContext con=new ScenarioContext();
		con.setData("mytext", myvalue);
	}
}
