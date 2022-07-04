package com.bz.mvnp.MvnTesting;

public class MoodAnalyser {

	String message;


	public MoodAnalyser() {
	}
	public MoodAnalyser(String message) {
		this.message = message;
	}

	
	public String analyseMood() {
		if (message.contains("Sad")) {
			return "Sad";
		}
		return "Happy";
	
	}
	
}
