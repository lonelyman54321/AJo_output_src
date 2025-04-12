/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.provider.Settings$Global
 */
package com.google.android.material.progressindicator;

import android.content.ContentResolver;
import android.provider.Settings;

public class AnimatorDurationScaleProvider {
    private static float defaultSystemAnimatorDurationScale = 1.0f;

    public static void setDefaultSystemAnimatorDurationScale(float f5) {
        defaultSystemAnimatorDurationScale = f5;
    }

    public float getSystemAnimatorDurationScale(ContentResolver contentResolver) {
        return Settings.Global.getFloat((ContentResolver)contentResolver, (String)"animator_duration_scale", (float)1.0f);
    }
}

