/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.ril.ajio.services.NetworkAnalyticsManager;

import android.content.Context;
import android.os.Bundle;
import com.ril.ajio.services.NetworkAnalyticsManager.GoogleAnalyticsEvents$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class GoogleAnalyticsEvents {
    public static final GoogleAnalyticsEvents$Companion Companion;
    public static final String FLOW_FORWARD = "Forward";
    public static final String FLOW_OTHERS = "Others";
    public static final String FLOW_RETURN = "Return";
    public static final String FLOW_SELFCARE = "Selfcare";
    public static final String KEY_ERROR_MESSAGE = "error_message";
    public static final String KEY_ERROR_TYPE = "error_type";
    public static final String KEY_FLOW_TYPE = "flow_type";
    public static final String KEY_IS_BLOCKING = "is_blocking";
    public static final String KEY_NETWORK_TYPE = "network_type";
    public static final String KEY_REQUEST_TIME = "request_time";
    public static final String KEY_REQUEST_TYPE = "request_type";
    public static final String KEY_STATUS_CODE = "status_code";
    private final Context context;

    static {
        GoogleAnalyticsEvents$Companion googleAnalyticsEvents$Companion;
        Companion = googleAnalyticsEvents$Companion = new GoogleAnalyticsEvents$Companion(null);
    }

    public GoogleAnalyticsEvents(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    public final Context getContext() {
        return this.context;
    }

    public final void pushButtonTapEvent(String string2, String string3, String string4, xe xe2) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(string3, "name");
        String string5 = "screenName";
        Intrinsics.checkNotNullParameter(string4, string5);
        if (xe2 != null) {
            string5 = null;
            xe2.pushButtonTapEvent(string2, string3, string4, 0);
        }
    }

    public final void pushEvent(String string2, String string3, Object object, String string4, Bundle bundle, xe xe2) {
        if (xe2 != null) {
            xe2.pushEvent(string2, string3, object, string4, bundle);
        }
    }

    public final void pushServiceErrorEvents(String string2, String string3, String string4, String string5, int n3, xe xe2, Bundle bundle) {
        Intrinsics.checkNotNullParameter(string2, "category");
        Intrinsics.checkNotNullParameter(string3, "action");
        Intrinsics.checkNotNullParameter(string4, "name");
        String string6 = "screenName";
        Intrinsics.checkNotNullParameter(string5, string6);
        if (xe2 != null) {
            xe2.pushServiceErrorEvent(string2, string3, string4, n3, string5, 0, bundle);
        }
    }
}

