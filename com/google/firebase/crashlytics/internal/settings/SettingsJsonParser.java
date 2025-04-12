/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.common.CurrentTimeProvider;
import com.google.firebase.crashlytics.internal.settings.DefaultSettingsJsonTransform;
import com.google.firebase.crashlytics.internal.settings.Settings;
import com.google.firebase.crashlytics.internal.settings.SettingsJsonTransform;
import com.google.firebase.crashlytics.internal.settings.SettingsV3JsonTransform;
import org.json.JSONObject;

public class SettingsJsonParser {
    private final CurrentTimeProvider currentTimeProvider;

    public SettingsJsonParser(CurrentTimeProvider currentTimeProvider) {
        this.currentTimeProvider = currentTimeProvider;
    }

    private static SettingsJsonTransform getJsonTransformForVersion(int n3) {
        int n4 = 3;
        if (n3 != n4) {
            Logger logger = Logger.getLogger();
            StringBuilder stringBuilder = new StringBuilder("Could not determine SettingsJsonTransform for settings version ");
            stringBuilder.append(n3);
            stringBuilder.append(". Using default settings values.");
            Object object = stringBuilder.toString();
            logger.e((String)object);
            object = new DefaultSettingsJsonTransform();
            return object;
        }
        SettingsV3JsonTransform settingsV3JsonTransform = new SettingsV3JsonTransform();
        return settingsV3JsonTransform;
    }

    public Settings parseSettingsJson(JSONObject jSONObject) {
        SettingsJsonTransform settingsJsonTransform = SettingsJsonParser.getJsonTransformForVersion(jSONObject.getInt("settings_version"));
        CurrentTimeProvider currentTimeProvider = this.currentTimeProvider;
        return settingsJsonTransform.buildFromJson(currentTimeProvider, jSONObject);
    }
}

