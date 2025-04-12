/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.AutoValue_CrashlyticsReport_Session_Event_Device$1;
import com.google.firebase.crashlytics.internal.model.CrashlyticsReport$Session$Event$Device;

final class AutoValue_CrashlyticsReport_Session_Event_Device
extends CrashlyticsReport$Session$Event$Device {
    private final Double batteryLevel;
    private final int batteryVelocity;
    private final long diskUsed;
    private final int orientation;
    private final boolean proximityOn;
    private final long ramUsed;

    private AutoValue_CrashlyticsReport_Session_Event_Device(Double d2, int n3, boolean bl2, int n4, long l2, long l3) {
        this.batteryLevel = d2;
        this.batteryVelocity = n3;
        this.proximityOn = bl2;
        this.orientation = n4;
        this.ramUsed = l2;
        this.diskUsed = l3;
    }

    public /* synthetic */ AutoValue_CrashlyticsReport_Session_Event_Device(Double d2, int n3, boolean bl2, int n4, long l2, long l3, AutoValue_CrashlyticsReport_Session_Event_Device$1 autoValue_CrashlyticsReport_Session_Event_Device$1) {
        this(d2, n3, bl2, n4, l2, l3);
    }

    public boolean equals(Object object) {
        block4: {
            boolean bl2;
            block6: {
                block5: {
                    long l2;
                    long l3;
                    long l4;
                    long l7;
                    long l8;
                    Double d2;
                    bl2 = true;
                    if (object == this) {
                        return bl2;
                    }
                    int n3 = object instanceof CrashlyticsReport$Session$Event$Device;
                    if (n3 == 0) break block4;
                    object = (CrashlyticsReport$Session$Event$Device)object;
                    Double d5 = this.batteryLevel;
                    if (!(d5 == null ? (d5 = ((CrashlyticsReport$Session$Event$Device)object).getBatteryLevel()) == null : (n3 = d5.equals(d2 = ((CrashlyticsReport$Session$Event$Device)object).getBatteryLevel())) != 0)) break block5;
                    n3 = this.batteryVelocity;
                    int n4 = ((CrashlyticsReport$Session$Event$Device)object).getBatteryVelocity();
                    if (n3 == n4 && (n3 = (int)(this.proximityOn ? 1 : 0)) == (n4 = (int)(((CrashlyticsReport$Session$Event$Device)object).isProximityOn() ? 1 : 0)) && (n3 = this.orientation) == (n4 = ((CrashlyticsReport$Session$Event$Device)object).getOrientation()) && (n3 = (int)((l8 = (l7 = this.ramUsed) - (l4 = ((CrashlyticsReport$Session$Event$Device)object).getRamUsed())) == 0L ? 0 : (l8 < 0L ? -1 : 1))) == 0 && (l3 = (l2 = (l7 = this.diskUsed) - (l4 = ((CrashlyticsReport$Session$Event$Device)object).getDiskUsed())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) == false) break block6;
                }
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public Double getBatteryLevel() {
        return this.batteryLevel;
    }

    public int getBatteryVelocity() {
        return this.batteryVelocity;
    }

    public long getDiskUsed() {
        return this.diskUsed;
    }

    public int getOrientation() {
        return this.orientation;
    }

    public long getRamUsed() {
        return this.ramUsed;
    }

    public int hashCode() {
        int n3;
        Double d2 = this.batteryLevel;
        if (d2 == null) {
            n3 = 0;
            d2 = null;
        } else {
            n3 = d2.hashCode();
        }
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.batteryVelocity;
        n3 = (n3 ^ n7) * n4;
        n7 = (int)(this.proximityOn ? 1 : 0);
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 ^ n7) * n4;
        n7 = this.orientation;
        n3 = (n3 ^ n7) * n4;
        long l2 = this.ramUsed;
        int n8 = 32;
        long l3 = l2 >>> n8;
        int n10 = (int)(l2 ^ l3);
        n3 = (n3 ^ n10) * n4;
        long l4 = this.diskUsed;
        long l7 = l4 >>> n8;
        n7 = (int)(l4 ^ l7);
        return n3 ^ n7;
    }

    public boolean isProximityOn() {
        return this.proximityOn;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("Device{batteryLevel=");
        Double d2 = this.batteryLevel;
        stringBuilder.append(d2);
        stringBuilder.append(", batteryVelocity=");
        int n3 = this.batteryVelocity;
        stringBuilder.append(n3);
        stringBuilder.append(", proximityOn=");
        n3 = (int)(this.proximityOn ? 1 : 0);
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", orientation=");
        n3 = this.orientation;
        stringBuilder.append(n3);
        stringBuilder.append(", ramUsed=");
        long l2 = this.ramUsed;
        stringBuilder.append(l2);
        stringBuilder.append(", diskUsed=");
        l2 = this.diskUsed;
        return jl0_0.b(stringBuilder, l2, "}");
    }
}

