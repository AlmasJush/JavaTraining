package com.mexk.almas.junit;

import org.junit.*;
import org.junit.experimental.ParallelComputer;
import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

public class TestForWhile {

	public static void main(String[] args) {

		// below two lines of code let the classes run simultaniously 
		Computer c = new ParallelComputer(true, true);
		Result result = JUnitCore.runClasses(c, ParallelFor.class, ParalelWhile.class);
		//Result result = JUnitCore.runClasses(ParallelFor.class);
		System.out.println("Run count " + result.getRunCount());
		System.out.println("Ignore count " + result.getIgnoreCount());
		System.out.println("Failures " + result.getFailureCount());
		System.out.println("Total time " + result.getRunTime());
	}

}
