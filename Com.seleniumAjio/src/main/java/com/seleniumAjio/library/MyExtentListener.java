package com.seleniumAjio.library;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.seleniumAjio.library.Helper;
import com.seleniumAjio.library.WebActionUtil;



	public class MyExtentListener implements ITestListener
	{
		public static ExtentReports report;
		public static ExtentTest logger;
		public ExtentHtmlReporter extent;
		String className;
		public static int iPassCount=0;
		public static int iFailCount=0;
		public static int iSkippedCount=0;
		public static String profile=null;
		public static ArrayList<String> sTestName= new ArrayList<String>();
		public static ArrayList<String> sStatus= new ArrayList<String>();
		public static long totPassedTime=0;
		public static long totFailedTime=0;
		public static long totSkippedTime=0;
		public static long totalTimeTaken=0;
		public static String pass_Time = "0";
		public static String fail_Time = "0";
		public static String skip_Time = "0";
		public static String tot_Time = "0";


		static {
			System.out.println();
			profile = System.getProperty("profile");
			profile = "SanityEndToEnd";
			System.setProperty("profile", profile);
			System.out.println("Running locally " + profile);
		}
		static Map<String, String> reportMailBody = new HashMap<String, String>();
		File pdfReports = new File("C:\\Users\\Desktop\\PDFReports" + "\\sample" + ".pdf");
		public void onTestStart(ITestResult result)
		{
			// TODO Auto-generated method stub
			className = result.getTestClass().getName().toString();
			className = className.substring(className.lastIndexOf(".") + 1, className.length());
			logger=report.createTest(className);
		}
		public void onTestSuccess(ITestResult result)
		{
			iPassCount = iPassCount+1;
			setStatus(result.getName().toString(), "Passed",sTestName,sStatus);
//			for(int i=0;i<sTestName.size();i++){
//				String s1=(String) sTestName.get(i);
//				String s2=(String) sStatus.get(i);
//				reportMailBody.put(s1, s2);
//			}

			long scriptTime=result.getEndMillis() - result.getStartMillis();
			totPassedTime = totPassedTime + scriptTime;
			pass_Time = WebActionUtil.formatDuration(totPassedTime);


			// TODO Auto-generated method stub
			//logger.pass(MarkupHelper.createLabel(className + " case has PASSED", ExtentColor.GREEN));
		}
		public void onTestFailure(ITestResult result)
		{
			logger.fail(MarkupHelper.createLabel(className + " test script has FAILED", ExtentColor.RED));
			// TODO Auto-generated method stub
			iFailCount = iFailCount+1;
			setStatus(result.getTestClass().getRealClass().getSimpleName().toString(), result.getThrowable().getLocalizedMessage(),sTestName,sStatus);
			for(int i=0;i<sTestName.size();i++){
				String s1=(String) sTestName.get(i);
				String s2=(String) sStatus.get(i);
				reportMailBody.put(s1, s2);
			}
			long scriptTime=result.getEndMillis() - result.getStartMillis();
			totFailedTime = totFailedTime + scriptTime;
			fail_Time = WebActionUtil.formatDuration(totFailedTime);
			System.out.println("GetLocalized================= "+ result.getThrowable().getLocalizedMessage());
			System.out.println("To String=================" + result.getThrowable().toString());
			System.out.println("Get Message=================" + result.getThrowable().getMessage());

		}
		public void onTestSkipped(ITestResult result)
		{
			iSkippedCount = iSkippedCount+1;
			setStatus(result.getName(), "Skipped",sTestName,sStatus);
			for(int i=0;i<sTestName.size();i++){
				String s1=(String) sTestName.get(i);
				String s2=(String) sStatus.get(i);
				reportMailBody.put(s1, s2);
			}
			long scriptTime=result.getEndMillis() - result.getStartMillis();
			totSkippedTime = totSkippedTime + scriptTime;
			skip_Time = WebActionUtil.formatDuration(totSkippedTime);
			// TODO Auto-generated method stub
		}
		public void onTestFailedButWithinSuccessPercentage(ITestResult arg0)
		{
			// TODO Auto-generated method stub
		}
		public void onStart(ITestContext context)
		{
			extent= new ExtentHtmlReporter(new File(System.getProperty("user.dir") + "/Reports/ajio.com" + Helper.getCurrentDateTime() + ".html"));
			extent.config().setReportName("ajio.com Report");
			extent.config().setDocumentTitle("ajio Automation Report");
			extent.config().setTheme(Theme.DARK);
			report = new ExtentReports();
			report.attachReporter(extent);
			/*logger = report.createTest("Login");
	logger.info(MarkupHelper.createLabel("Setting up reports and test is getting ready", ExtentColor.AMBER));
	Reporter.log("Setting up reports and test is getting ready", true);


	Reporter.log("Setting Done- Test can be started", true);
	logger.info(MarkupHelper.createLabel("Setting Done- Test can be started", ExtentColor.AMBER));
	// TODO Auto-generated method stub
			 */
		}
		public void onFinish(ITestContext context)
		{
			// TODO Auto-generated method stub

			iPassCount = context.getPassedTests().size();
			iFailCount = context.getFailedTests().size();
			iSkippedCount = context.getSkippedTests().size();
			int iTotal_Executed = iPassCount+iFailCount+iSkippedCount;
			totalTimeTaken=totPassedTime + totFailedTime + totSkippedTime;
			tot_Time = WebActionUtil.formatDuration(totalTimeTaken);
			//sendMail(iPassCount, iFailCount, iSkippedCount, iTotal_Executed, pdfReports,profile);
			report.flush();
		}
		

		public static void setStatus(String sName, String sResult, ArrayList sTestName, ArrayList sStatus) {
			sName = sName.replace("test", "");
			sTestName.add(sName);
			sStatus.add(sResult);

			if (sResult.equals("Passed")) {
				iPassCount = iPassCount + 1;
			} else if (sResult.equals("Failed")) {
				iFailCount = iFailCount + 1;
			} else {
				iSkippedCount = iSkippedCount + 1;
			}
		}
	}



