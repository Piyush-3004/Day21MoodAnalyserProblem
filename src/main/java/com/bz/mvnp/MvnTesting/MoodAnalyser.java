package com.bz.mvnp.MvnTesting;

public class MoodAnalyser {

	String message;
	
	public MoodAnalyser() {
		
	}

	public MoodAnalyser(String message) {
		this.message=message;
	}
	
	public String analyseMood() {
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
