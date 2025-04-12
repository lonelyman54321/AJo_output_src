/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.tracker.model;

import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.jio.jioads.network.NetworkTaskListener;
import com.jio.jioads.util.Utility;
import com.jio.jioads.util.j;
import com.jio.jioads.videomodule.s;
import kotlin.jvm.internal.Intrinsics;

public abstract class b {
    public static void a(com.jio.jioads.common.b object, StringBuilder stringBuilder, String string2) {
        object = object.P();
        stringBuilder.append((String)object);
        stringBuilder.append(string2);
        j.a(stringBuilder.toString());
    }

    public static /* synthetic */ void b(NetworkTaskListener networkTaskListener, int n3, Object object) {
        networkTaskListener.onError(n3, object, null);
    }

    public static void c(Utility object, Exception exception, StringBuilder stringBuilder) {
        object = ((Utility)object).printStacktrace(exception);
        stringBuilder.append((String)object);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
    }

    public static void d(s s7, StringBuilder stringBuilder, String string2) {
        ei1_0.a(s7, stringBuilder, string2);
    }

    public static void e(Exception object, StringBuilder stringBuilder) {
        object = yc0_2.b((Throwable)object);
        stringBuilder.append((String)object);
        Intrinsics.checkNotNullParameter(stringBuilder.toString(), "message");
    }

    public static /* synthetic */ void f(Object object) {
        if (object == null) {
            return;
        }
        object = new ClassCastException();
        throw object;
    }

    public static void g(String string2, JioAds$Companion jioAds$Companion) {
        v12.a(string2, "message", jioAds$Companion);
    }
}

