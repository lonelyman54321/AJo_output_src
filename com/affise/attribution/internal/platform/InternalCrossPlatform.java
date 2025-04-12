/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.affise.attribution.internal.platform;

import android.net.Uri;
import com.affise.attribution.Affise;
import com.affise.attribution.AffiseApi;
import com.affise.attribution.deeplink.DeeplinkManagerImpl;
import com.affise.attribution.internal.platform.InternalSdkPlatform;
import kotlin.jvm.internal.Intrinsics;

public final class InternalCrossPlatform {
    public static final InternalCrossPlatform INSTANCE;

    static {
        InternalCrossPlatform internalCrossPlatform;
        INSTANCE = internalCrossPlatform = new InternalCrossPlatform();
    }

    private InternalCrossPlatform() {
    }

    private final AffiseApi api() {
        return Affise.INSTANCE.getApi$attribution_release();
    }

    public static final void deeplink(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        Object object = INSTANCE.api();
        if (object != null && (object = object.getDeeplinkManager()) != null) {
            string2 = Uri.parse((String)string2);
            String string3 = "parse(url)";
            Intrinsics.checkNotNullExpressionValue(string2, string3);
            ((DeeplinkManagerImpl)object).handleDeeplink((Uri)string2);
        }
    }

    public static final void flutter() {
        InternalSdkPlatform.INSTANCE.flutter();
    }

    public static final void react() {
        InternalSdkPlatform.INSTANCE.react();
    }

    public static final void start() {
        Object object = INSTANCE.api();
        if (object != null && (object = object.getSessionManager()) != null) {
            object.sessionStart();
        }
    }

    public static final void unity() {
        InternalSdkPlatform.INSTANCE.unity();
    }
}

