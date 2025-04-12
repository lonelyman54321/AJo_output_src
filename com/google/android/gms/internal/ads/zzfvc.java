/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.Sensor
 *  android.hardware.SensorEvent
 *  android.hardware.SensorEventListener
 */
package com.google.android.gms.internal.ads;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.google.android.gms.internal.ads.zzfqz;
import com.google.android.gms.internal.ads.zzfuw;
import com.google.android.gms.internal.ads.zzfuy;
import com.google.android.gms.internal.ads.zzfvb;

public abstract class zzfvc
implements SensorEventListener {
    final zzfuw zza;

    public zzfvc(String object, String string2) {
        zzfvb.zza();
        object = zzfqz.zza;
        zzfuy.zza();
        this.zza = object = zzfuy.zza;
    }

    public final void onAccuracyChanged(Sensor sensor, int n3) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        this.zza(sensorEvent);
    }

    public abstract void zza(SensorEvent var1);
}

