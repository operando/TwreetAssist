package com.operamdo.tweetassist.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

public final class IntentUtils {

    private IntentUtils() {
    }

    public static void openTwitter(Context context) {
        openTwitter(context, "");
    }

    public static void openTwitter(Context context, String text) {
        String url = "http://twitter.com/share?text=" + text;
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
        context.startActivity(intent);
    }
}