package week6.day2.assignment2;


import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer implements IAnnotationTransformer{

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {

//		String groupName = testMethod.getName();
//		System.out.println(groupName);
//
//		if (groupName.equals("editLead")) {
//			annotation.setEnabled(true);
//		}

		annotation.setRetryAnalyzer(RetryAnalyzer.class);

	}
	
	
}
