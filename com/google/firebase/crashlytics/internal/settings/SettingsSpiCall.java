/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONObject
 */
package com.google.firebase.crashlytics.internal.settings;

import com.google.firebase.crashlytics.internal.settings.SettingsRequest;
import org.json.JSONObject;

interface SettingsSpiCall {
    public JSONObject invoke(SettingsRequest var1, boolean var2);
}

