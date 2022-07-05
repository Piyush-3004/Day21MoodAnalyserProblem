package com.bz.mvnp.MvnTesting;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {

//	MoodAnalyser moodAnalyserObj = new MoodAnalyser();
	MoodAnalyser moodAnalyserObj = new MoodAnalyser();

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		String mood = new MoodAnalyser("I am in Sad mood").analyseMood();
		Assert.assertEquals("Sad", mood);
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		String mood = new MoodAnalyser("I am in Happy mood").analyseMood();
		Assert.assertEquals("Happy", mood);
	}


}
