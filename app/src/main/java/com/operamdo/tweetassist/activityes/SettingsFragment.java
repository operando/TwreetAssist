package com.operamdo.tweetassist.activityes;

import android.os.Bundle;
import android.preference.PreferenceFragment;

import com.operamdo.tweetassist.R;


public class SettingsFragment extends PreferenceFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.pref_general);
    }
}
