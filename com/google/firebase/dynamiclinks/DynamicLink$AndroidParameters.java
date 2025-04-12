/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks;

import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink$1;

public final class DynamicLink$AndroidParameters {
    public static final String KEY_ANDROID_FALLBACK_LINK = "afl";
    public static final String KEY_ANDROID_MIN_VERSION_CODE = "amv";
    public static final String KEY_ANDROID_PACKAGE_NAME = "apn";
    final Bundle parameters;

    private DynamicLink$AndroidParameters(Bundle bundle) {
        this.parameters = bundle;
    }

    public /* synthetic */ DynamicLink$AndroidParameters(Bundle bundle, DynamicLink$1 dynamicLink$1) {
        this(bundle);
    }
}

