package com.bz.mvnp.MvnTesting;

public class MoodAnalyser extends Exception {

	String message;

	public MoodAnalyser() {

	}

	enum ExceptionType {
		NULL, INVALID_ENTRY;

	}

	ExceptionType type;

	public MoodAnalyser(String message) {
		super(message);
		this.message = message;
	}

	public String analyseMood() throws MoodAnalyser {
		try {
			if (message == null)
				throw new MoodAnalyser("Empty Mood");
			if (message.contains("Sad")) {
				return "Sad";
			}
			return "Happy";
		} catch (NullPointerException e) {
			return "Happy";
		}

	}

}
