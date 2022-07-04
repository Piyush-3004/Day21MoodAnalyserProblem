package com.bz.mvnp.MvnTesting;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {

//	MoodAnalyser moodAnalyserObj = new MoodAnalyser();
	MoodAnalyser moodAnalyserObj = new MoodAnalyser();

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		String mood = moodAnalyserObj.analyseMood("I am in Sad mood");
		Assert.assertEquals("Sad", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		String mood = moodAnalyserObj.analyseMood(null);
		Assert.assertEquals("Happy", mood);
	}


}
