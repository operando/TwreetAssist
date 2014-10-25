package com.operamdo.tweetassist.activityes;

import android.app.Activity;
import android.os.Bundle;

import com.operamdo.tweetassist.constants.PreferenceKey;
import com.operamdo.tweetassist.utils.IntentUtils;
import com.operamdo.tweetassist.utils.PreferenceUtils;

public class TweetAssistActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntentUtils.openTwitter(this, PreferenceUtils.getString(this, PreferenceKey.DEFAULT_TWEET_TEXT));
        finish();
    }
}
