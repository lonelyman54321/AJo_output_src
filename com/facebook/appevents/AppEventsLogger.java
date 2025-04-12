/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.facebook.appevents;

import android.content.Context;
import com.facebook.appevents.g;
import kotlin.jvm.internal.Intrinsics;

public final class AppEventsLogger {
    public final g a;

    public AppEventsLogger(Context context) {
        g g3;
        this.a = g3 = new g(context, null);
    }

    public static final AppEventsLogger newLogger(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        AppEventsLogger appEventsLogger = new AppEventsLogger(context);
        return appEventsLogger;
    }
}

