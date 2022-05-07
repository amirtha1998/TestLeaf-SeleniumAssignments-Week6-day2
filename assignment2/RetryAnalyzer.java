package week6.day2.assignment2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	
	int retryCount = 0;
	public boolean retry(ITestResult result) {
		if(retryCount < 1) {
			retryCount++;
			return true;
		}
		
		return false;
//
//	public boolean retry(ITestResult result) {
//		int count = 0, retry = 2;
//		if (count < retry) {
//			count++;
//			return true;
//		} else
//			return false;

//	}

}
}
