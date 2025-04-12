/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.firebase.dynamiclinks;

import android.os.Bundle;
import com.google.firebase.dynamiclinks.DynamicLink$1;

public final class DynamicLink$ItunesConnectAnalyticsParameters {
    public static final String KEY_ITUNES_CONNECT_AT = "at";
    public static final String KEY_ITUNES_CONNECT_CT = "ct";
    public static final String KEY_ITUNES_CONNECT_PT = "pt";
    final Bundle parameters;

    private DynamicLink$ItunesConnectAnalyticsParameters(Bundle bundle) {
        this.parameters = bundle;
    }

    public /* synthetic */ DynamicLink$ItunesConnectAnalyticsParameters(Bundle bundle, DynamicLink$1 dynamicLink$1) {
        this(bundle);
    }
}

