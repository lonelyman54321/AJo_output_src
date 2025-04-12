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

class SettingsV3JsonTransform
implements SettingsJsonTransform {
    private static Settings$FeatureFlagData buildFeatureFlagDataFrom(JSONObject jSONObject) {
        boolean bl2 = jSONObject.optBoolean("collect_reports", true);
        boolean bl3 = jSONObject.optBoolean("collect_anrs", false);
        boolean bl4 = jSONObject.optBoolean("collect_build_ids", false);
        Settings$FeatureFlagData settings$FeatureFlagData = new Settings$FeatureFlagData(bl2, bl3, bl4);
        return settings$FeatureFlagData;
    }

    private static Settings$SessionData buildSessionDataFrom(JSONObject jSONObject) {
        int n3 = jSONObject.optInt("max_custom_exception_events", 8);
        Settings$SessionData settings$SessionData = new Settings$SessionData(n3, 4);
        return settings$SessionData;
    }

    private static long getExpiresAtFrom(CurrentTimeProvider currentTimeProvider, long l2, JSONObject jSONObject) {
        long l3;
        String string2 = "expires_at";
        boolean bl2 = jSONObject.has(string2);
        if (bl2) {
            l3 = jSONObject.optLong(string2);
        } else {
            long l4 = currentTimeProvider.getCurrentTimeMillis();
            long l7 = 1000L;
            l3 = (l2 *= l7) + l4;
        }
        return l3;
    }

    /*
     * Enabled aggressive block sorting
     */
    public Settings buildFromJson(CurrentTimeProvider currentTimeProvider, JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        int n3 = jSONObject.optInt("settings_version", 0);
        int n4 = jSONObject.optInt("cache_duration", 3600);
        double d2 = jSONObject.optDouble("on_demand_upload_rate_per_minute", 10.0);
        double d5 = 1.2;
        double d7 = jSONObject.optDouble("on_demand_backoff_base", d5);
        int n7 = jSONObject.optInt("on_demand_backoff_step_duration_seconds", 60);
        Object object = "session";
        boolean bl2 = jSONObject.has((String)object);
        if (bl2) {
            object = SettingsV3JsonTransform.buildSessionDataFrom(jSONObject.getJSONObject((String)object));
        } else {
            object = new JSONObject();
            object = SettingsV3JsonTransform.buildSessionDataFrom((JSONObject)object);
        }
        Object object2 = object;
        Settings$FeatureFlagData settings$FeatureFlagData = SettingsV3JsonTransform.buildFeatureFlagDataFrom(jSONObject2.getJSONObject("features"));
        long l2 = n4;
        long l3 = SettingsV3JsonTransform.getExpiresAtFrom(currentTimeProvider, l2, jSONObject2);
        return new Settings(l3, (Settings$SessionData)object2, settings$FeatureFlagData, n3, n4, d2, d7, n7);
    }
}

