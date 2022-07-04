package com.bz.mvnp.MvnTesting;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {

	MoodAnalyser moodAnalyserObj = new MoodAnalyser();

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		String mood = moodAnalyserObj.analyseMood("I am in sad mood");
		Assert.assertEquals("Sad", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		String mood = moodAnalyserObj.analyseMood("I am in any mood");
		Assert.assertEquals("Happy", mood);
	}

}
