package testCases;

import java.util.Collections;
import java.util.LinkedList;

import org.testng.annotations.Test;

import pageObjects.RakhiGifts;
import testBase.BaseClass;

public class TS_03_Sorting extends BaseClass{
	
	RakhiGifts Rg;
	@Test(priority=7)
	public void apply_filters() {
		Rg=new RakhiGifts(driver);
		Rg.clicks();
		System.out.println("..................Filters are Applied  ................");
	}
	@Test(priority=8)
	public void isSorted() {
		LinkedList<Integer> final_price=Rg.getPrices(Rg.prices);
		LinkedList<Integer> sortedList = new LinkedList<Integer>(final_price);
	        
	        // Sort the copy
	        Collections.sort(sortedList);

	        // Compare original with sorted
	        if(final_price.equals(sortedList)) {
	        	System.out.println("......Validation of Price from Low To high is Done Succesfully.....");
	        }
	        else {
	        	System.out.println("......Validation of Price from Low To high is UnSuccesful.....");
	        }
	}
}
