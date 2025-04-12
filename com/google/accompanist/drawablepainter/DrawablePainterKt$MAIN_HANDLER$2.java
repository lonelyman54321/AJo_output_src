/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
package com.google.accompanist.drawablepainter;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

final class DrawablePainterKt$MAIN_HANDLER$2
extends Lambda
implements Function0 {
    public static final DrawablePainterKt$MAIN_HANDLER$2 INSTANCE;

    static {
        DrawablePainterKt$MAIN_HANDLER$2 drawablePainterKt$MAIN_HANDLER$2;
        INSTANCE = drawablePainterKt$MAIN_HANDLER$2 = new DrawablePainterKt$MAIN_HANDLER$2();
    }

    public DrawablePainterKt$MAIN_HANDLER$2() {
        super(0);
    }

    public final Handler invoke() {
        Looper looper = Looper.getMainLooper();
        Handler handler = new Handler(looper);
        return handler;
    }
}

