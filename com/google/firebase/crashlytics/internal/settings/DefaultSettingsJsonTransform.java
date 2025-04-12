/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.Settings$FeatureFlagData;
import com.google.firebase.crashlytics.internal.settings.Settings$SessionData;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform;
import org.json.JSONObject;

class DefaultSettingsJsonTransform
implements SettingsJsonTransform {
    public static Settings defaultSettings(CurrentTimeProvider object) {
        Settings$SessionData settings$SessionData = new Settings$SessionData(8, 4);
        Settings$FeatureFlagData settings$FeatureFlagData = new Settings$FeatureFlagData(true, false, false);
        long l2 = object.getCurrentTimeMillis();
        long l3 = 3600000;
        long l4 = l2 + l3;
        object = new Settings(l4, settings$SessionData, settings$FeatureFlagData, 0, 3600, 10.0, 1.2, 60);
        return object;
    }

    public Settings buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) {
        return DefaultSettingsJsonTransform.defaultSettings(currentTimeProvider);
    }
}

