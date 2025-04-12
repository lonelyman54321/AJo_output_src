/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.skydoves.balloon;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class Balloon$f
extends Lambda
implements Function0 {
    public static final Balloon$f c;

    static {
        Balloon$f balloon$f;
        c = balloon$f = new Lambda(0);
    }

    public final Object invoke() {
        Looper looper = Looper.getMainLooper();
        Handler handler = new Handler(looper);
        return handler;
    }
}

