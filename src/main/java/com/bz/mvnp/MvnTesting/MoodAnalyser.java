package com.bz.mvnp.MvnTesting;

public class MoodAnalyser {

	String message;
	
	public String analyseMood(String message) {

		try {
			
		if (message.contains("Sad")) {
			return "Sad";
		}
		return "Happy";
		}catch (NullPointerException e) {
			return "Happy";
		}
	
	}
	
}
