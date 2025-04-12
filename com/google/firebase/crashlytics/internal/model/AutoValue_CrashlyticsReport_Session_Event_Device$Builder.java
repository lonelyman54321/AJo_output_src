/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device$Builder;

final class AutoValue_CrashlyticsReport_Session_Event_Device$Builder
extends CrashlyticsReport$Session$Event$Device$Builder {
    private Double batteryLevel;
    private int batteryVelocity;
    private long diskUsed;
    private int orientation;
    private boolean proximityOn;
    private long ramUsed;
    private byte set$0;

    public CrashlyticsReport$Session$Event$Device build() {
        int n3 = this.set$0;
        int n4 = 31;
        if (n3 != n4) {
            Object object;
            CharSequence charSequence = new StringBuilder();
            n4 = this.set$0 & 1;
            if (n4 == 0) {
                object = " batteryVelocity";
                charSequence.append((String)object);
            }
            if ((n4 = this.set$0 & 2) == 0) {
                object = " proximityOn";
                charSequence.append((String)object);
            }
            if ((n4 = this.set$0 & 4) == 0) {
                object = " orientation";
                charSequence.append((String)object);
            }
            if ((n4 = this.set$0 & 8) == 0) {
                object = " ramUsed";
                charSequence.append((String)object);
            }
            if ((n4 = this.set$0 & 0x10) == 0) {
                object = " diskUsed";
                charSequence.append((String)object);
            }
            charSequence = Gs.a("Missing required properties:", charSequence);
            object = new IllegalStateException((String)charSequence);
            throw object;
        }
        Double d2 = this.batteryLevel;
        int n7 = this.batteryVelocity;
        boolean bl2 = this.proximityOn;
        int n8 = this.orientation;
        long l2 = this.ramUsed;
        long l3 = this.diskUsed;
        AutoValue_CrashlyticsReport_Session_Event_Device autoValue_CrashlyticsReport_Session_Event_Device = new AutoValue_CrashlyticsReport_Session_Event_Device(d2, n7, bl2, n8, l2, l3, null);
        return autoValue_CrashlyticsReport_Session_Event_Device;
    }

    public CrashlyticsReport$Session$Event$Device$Builder setBatteryLevel(Double d2) {
        this.batteryLevel = d2;
        return this;
    }

    public CrashlyticsReport$Session$Event$Device$Builder setBatteryVelocity(int n3) {
        this.batteryVelocity = n3;
        n3 = (byte)(this.set$0 | 1);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$Event$Device$Builder setDiskUsed(long l2) {
        byte by2;
        this.diskUsed = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 0x10);
        return this;
    }

    public CrashlyticsReport$Session$Event$Device$Builder setOrientation(int n3) {
        this.orientation = n3;
        n3 = (byte)(this.set$0 | 4);
        this.set$0 = (byte)n3;
        return this;
    }

    public CrashlyticsReport$Session$Event$Device$Builder setProximityOn(boolean bl2) {
        byte by2;
        this.proximityOn = bl2;
        this.set$0 = by2 = (byte)(this.set$0 | 2);
        return this;
    }

    public CrashlyticsReport$Session$Event$Device$Builder setRamUsed(long l2) {
        byte by2;
        this.ramUsed = l2;
        this.set$0 = by2 = (byte)(this.set$0 | 8);
        return this;
    }
}

