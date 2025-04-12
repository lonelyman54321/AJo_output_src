/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks;

import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink$1;

public final class DynamicLink$IosParameters {
    public static final String KEY_IOS_APP_STORE_ID = "isi";
    public static final String KEY_IOS_BUNDLE_ID = "ibi";
    public static final String KEY_IOS_CUSTOM_SCHEME = "ius";
    public static final String KEY_IOS_FALLBACK_LINK = "ifl";
    public static final String KEY_IOS_MINIMUM_VERSION = "imv";
    public static final String KEY_IPAD_BUNDLE_ID = "ipbi";
    public static final String KEY_IPAD_FALLBACK_LINK = "ipfl";
    final Bundle parameters;

    private DynamicLink$IosParameters(Bundle bundle) {
        this.parameters = bundle;
    }

    public /* synthetic */ DynamicLink$IosParameters(Bundle bundle, DynamicLink$1 dynamicLink$1) {
        this(bundle);
    }
}

