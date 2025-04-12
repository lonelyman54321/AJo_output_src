/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.hardware.SensorEvent
 */
package com.appsflyer.internal;

import android.hardware.SensorEvent;
import com.appsflyer.internal.AFj1nSDK;

public final class z
implements Runnable {
    public final /* synthetic */ AFj1nSDK a;
    public final /* synthetic */ SensorEvent b;

    public /* synthetic */ z(AFj1nSDK aFj1nSDK, SensorEvent sensorEvent) {
        this.a = aFj1nSDK;
        this.b = sensorEvent;
    }

    public final void run() {
        AFj1nSDK aFj1nSDK = this.a;
        SensorEvent sensorEvent = this.b;
        AFj1nSDK.a(aFj1nSDK, sensorEvent);
    }
}

