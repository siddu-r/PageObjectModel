package utills;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	@Test
	public void generateReport() {
		
		// Start Report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// Start Test
		ExtentTest test = report.startTest("TC008", "To verify IRCTC Registration for the new user sign up");
		
		test.assignAuthor("Sravan");
		
		test.assignCategory("Regression");
		
		// log test steps
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		test.log(LogStatus.PASS, "The application got launcehd with the given url successfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
		
		
	}

}
