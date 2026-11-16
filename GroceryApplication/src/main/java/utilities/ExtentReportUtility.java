package utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportUtility {
	public static final ExtentReports extentReports = new ExtentReports(); 
	// Static instance of ExtentReports that can be shared across the application

	public synchronized static ExtentReports createExtentReports() {

	    ExtentSparkReporter reporter = new ExtentSparkReporter("./extent-reports/extent-report.html");
	    reporter.config().setReportName("7RMartsSupermarketProject");
	    extentReports.attachReporter(reporter);

	    extentReports.setSystemInfo("Organization", "Obsqura");
	    extentReports.setSystemInfo("Name", "Fathima N"); 
	    // Provides context of the report

	    return extentReports;
	}

}
