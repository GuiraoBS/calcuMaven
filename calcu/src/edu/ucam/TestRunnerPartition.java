package edu.ucam;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestRunnerPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result result = JUnitCore.runClasses(TestPartition1.class, TestPartition2.class);
		for (org.junit.runner.notification.Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
			System.out.println(result.wasSuccessful());
	}

}
