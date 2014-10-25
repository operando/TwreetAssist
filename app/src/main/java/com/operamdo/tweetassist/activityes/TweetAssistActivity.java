package com.operamdo.tweetassist.activityes;

import android.app.Activity;
import android.os.Bundle;

import com.operamdo.tweetassist.utils.IntentUtils;

public class TweetAssistActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        IntentUtils.openTwitter(this, "test");
        finish();
    }
}
