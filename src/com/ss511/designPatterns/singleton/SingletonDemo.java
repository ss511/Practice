package com.ss511.designPatterns.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger infoLogger = Logger.getLogger();
		
		infoLogger.log("Info");
		
		Logger errorLogger = Logger.getLogger();
		
		errorLogger.log("Error");
		
		System.out.println(infoLogger == errorLogger);
	}

}
