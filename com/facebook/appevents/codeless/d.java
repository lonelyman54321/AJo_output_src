/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 */
package com.facebook.appevents.codeless;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.facebook.appevents.codeless.d$a;
import kotlin.jvm.internal.Intrinsics;

public final class d
implements SensorEventListener {
    public d$a a;

    public final void onAccuracyChanged(Sensor sensor, int n3) {
        n3 = (int)(td0.b(this) ? 1 : 0);
        if (n3 != 0) {
            return;
        }
        String string2 = "sensor";
        try {
            Intrinsics.checkNotNullParameter(sensor, string2);
            return;
        }
        catch (Throwable throwable) {
            td0.a(this, throwable);
            return;
        }
    }

    public final void onSensorChanged(SensorEvent object) {
        Throwable throwable22;
        block11: {
            block10: {
                boolean bl2 = td0.b(this);
                if (bl2) {
                    return;
                }
                Object object2 = "event";
                try {
                    Intrinsics.checkNotNullParameter(object, (String)object2);
                    object2 = this.a;
                    if (object2 == null) break block10;
                }
                catch (Throwable throwable22) {}
                object = object.values;
                float f5 = 0.0f;
                f5 = (float)object[0];
                int n3 = 1;
                float f6 = Float.MIN_VALUE;
                f6 = (float)object[n3];
                int n4 = 2;
                float f7 = 2.8E-45f;
                reference var9_10 = object[n4];
                n4 = 1092413450;
                f7 = 9.80665f;
                double d2 = f5 /= f7;
                double d5 = f6 /= f7;
                double d7 = (double)(var9_10 /= f7);
                d2 *= d2;
                d5 = d5 * d5 + d2;
                d7 = d7 * d7 + d5;
                d5 = Math.sqrt(d7);
                double d9 = 2.3;
                double d12 = d5 == d9 ? 0 : (d5 > d9 ? 1 : -1);
                if (d12 <= 0) break block10;
                object2 = (rw_0)object2;
                ((rw_0)object2).a();
                break block11;
            }
            return;
        }
        td0.a(this, throwable22);
    }
}

