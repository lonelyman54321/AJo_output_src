/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.IntentFilter
 */
package com.facebook.internal;

import android.content.Context;
import android.content.IntentFilter;
import com.facebook.internal.BoltsMeasurementEventListener;
import kotlin.jvm.internal.Intrinsics;

public final class BoltsMeasurementEventListener$a {
    public static void a(Context object) {
        boolean bl2;
        BoltsMeasurementEventListener boltsMeasurementEventListener;
        block14: {
            Intrinsics.checkNotNullParameter(object, "context");
            boltsMeasurementEventListener = BoltsMeasurementEventListener.a();
            if (boltsMeasurementEventListener != null) {
                BoltsMeasurementEventListener.a();
                return;
            }
            boltsMeasurementEventListener = new BoltsMeasurementEventListener((Context)object);
            object = BoltsMeasurementEventListener.class;
            bl2 = td0.b(object);
            if (!bl2) {
                bl2 = td0.b((Object)boltsMeasurementEventListener);
                if (bl2) break block14;
                Object object2 = boltsMeasurementEventListener.a;
                object2 = Xv1.a((Context)object2);
                String string2 = "getInstance(applicationContext)";
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                String string3 = "com.parse.bolts.measurement_event";
                string2 = new IntentFilter(string3);
                try {
                    ((Xv1)object2).b(boltsMeasurementEventListener, (IntentFilter)string2);
                }
                catch (Throwable throwable) {
                    try {
                        td0.a((Object)boltsMeasurementEventListener, throwable);
                    }
                    catch (Throwable throwable2) {
                        td0.a(object, throwable2);
                    }
                }
            }
        }
        bl2 = td0.b(object);
        if (!bl2) {
            try {
                BoltsMeasurementEventListener.b = boltsMeasurementEventListener;
            }
            catch (Throwable throwable) {
                td0.a(object, throwable);
            }
        }
        BoltsMeasurementEventListener.a();
    }
}

