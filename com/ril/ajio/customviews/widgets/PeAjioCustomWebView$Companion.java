/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.os.Build$VERSION
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class PeAjioCustomWebView$Companion {
    private PeAjioCustomWebView$Companion() {
    }

    public /* synthetic */ PeAjioCustomWebView$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final Context getFixedContext(Context context) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(context, string2);
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 < n4) {
            string2 = new Configuration();
            context = context.createConfigurationContext((Configuration)string2);
            string2 = "createConfigurationContext(...)";
            Intrinsics.checkNotNullExpressionValue(context, string2);
        }
        return context;
    }
}

