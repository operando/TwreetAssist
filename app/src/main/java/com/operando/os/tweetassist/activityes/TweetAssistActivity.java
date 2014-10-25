package com.operando.os.tweetassist.activityes;

import android.app.Activity;
import android.os.Bundle;

import com.operando.os.tweetassist.constants.PreferenceKey;
import com.operando.os.tweetassist.utils.IntentUtils;
import com.operando.os.tweetassist.utils.PreferenceUtils;

public class TweetAssistActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntentUtils.openTwitter(this, PreferenceUtils.getString(this, PreferenceKey.DEFAULT_TWEET_TEXT));
        finish();
    }
}
