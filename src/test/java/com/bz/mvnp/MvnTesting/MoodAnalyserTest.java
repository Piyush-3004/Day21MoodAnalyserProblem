package com.bz.mvnp.MvnTesting;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class MoodAnalyserTest {

//	MoodAnalyser moodAnalyserObj = new MoodAnalyser();
	MoodAnalyser moodAnalyserObj = new MoodAnalyser();

	@Test
	public void givenMessage_WhenSad_ShouldReturnSad() {
		try {
			String mood = new MoodAnalyser(null).analyseMood();
			Assert.assertEquals("Sad", mood);
		} catch (MoodAnalyser e) {
			System.out.println(e);
		}
	}

	@Test
	public void givenMessage_WhenHappy_ShouldReturnHappy() {
		try {
			String mood = new MoodAnalyser("I am in Happy mood").analyseMood();
			Assert.assertEquals("Happy", mood);
		} catch (MoodAnalyser e) {
			System.out.println(e);
		}
	}

}
