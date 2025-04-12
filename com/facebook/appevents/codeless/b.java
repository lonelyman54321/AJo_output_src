/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.SensorManager
 */
package com.facebook.appevents.codeless;

import android.hardware.SensorManager;
import com.facebook.appevents.codeless.ViewIndexer;
import com.facebook.appevents.codeless.d;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public static final b a;
    public static final d b;
    public static SensorManager c;
    public static ViewIndexer d;
    public static String e;
    public static final AtomicBoolean f;
    public static final AtomicBoolean g;
    public static volatile boolean h;

    static {
        Object object = new b();
        a = object;
        b = object = new Object();
        f = object = new AtomicBoolean(true);
        g = object = new AtomicBoolean(false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final String a() {
        Throwable throwable2;
        Class<b> clazz;
        block4: {
            Object object;
            block3: {
                clazz = b.class;
                boolean bl2 = td0.b(clazz);
                if (bl2) {
                    return null;
                }
                try {
                    object = e;
                    if (object != null) break block3;
                    object = UUID.randomUUID();
                    e = object = ((UUID)object).toString();
                }
                catch (Throwable throwable2) {
                    break block4;
                }
            }
            object = e;
            String string2 = "null cannot be cast to non-null type kotlin.String";
            Intrinsics.checkNotNull(object, string2);
            return object;
        }
        td0.a(clazz, throwable2);
        return null;
    }
}

