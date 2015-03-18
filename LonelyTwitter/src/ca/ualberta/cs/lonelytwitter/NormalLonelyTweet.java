package ca.ualberta.cs.lonelytwitter;

import java.io.Serializable;
import java.util.Date;

import ca.ualberta.cs.lonelytwitter.model.LonelyTweet;

import android.util.Log;

public class NormalLonelyTweet extends 
LonelyTweet implements Serializable {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text) {
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public String toString()
	{
		String thisIsntEvenMyFinalStringForm = getTweetDate() + " | " + getTweetBody();
		Log.i("tweet", thisIsntEvenMyFinalStringForm);
		return thisIsntEvenMyFinalStringForm;
	}
}
