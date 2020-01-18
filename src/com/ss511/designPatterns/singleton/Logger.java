package com.ss511.designPatterns.singleton;

public class Logger {
	
	private static Logger logger;
	
	private Logger () {}
	
	public static Logger getLogger () {
		
		if (logger == null) {
			logger = new Logger();
		}
		return logger;
	}
	
	public void log(String logText) {
		System.out.println(logText);
	}
}
