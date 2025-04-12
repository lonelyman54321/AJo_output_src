/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase;

import com.google.firebase.StartupTime;

final class AutoValue_StartupTime
extends StartupTime {
    private final long elapsedRealtime;
    private final long epochMillis;
    private final long uptimeMillis;

    public AutoValue_StartupTime(long l2, long l3, long l4) {
        this.epochMillis = l2;
        this.elapsedRealtime = l3;
        this.uptimeMillis = l4;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        Object object2 = object instanceof StartupTime;
        if (object2) {
            long l2;
            long l3;
            long l4;
            long l7 = this.epochMillis;
            long l8 = ((StartupTime)(object = (StartupTime)object)).getEpochMillis();
            long l12 = l7 - l8;
            object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object2 || (object2 = (l4 = (l7 = this.elapsedRealtime) - (l8 = ((StartupTime)object).getElapsedRealtime())) == 0L ? 0 : (l4 < 0L ? -1 : 1)) || (l3 = (l2 = (l7 = this.uptimeMillis) - (l8 = ((StartupTime)object).getUptimeMillis())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public long getElapsedRealtime() {
        return this.elapsedRealtime;
    }

    public long getEpochMillis() {
        return this.epochMillis;
    }

    public long getUptimeMillis() {
        return this.uptimeMillis;
    }

    public int hashCode() {
        long l2 = this.epochMillis;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3);
        int n7 = 1000003;
        n4 = (n4 ^ n7) * n7;
        l3 = this.elapsedRealtime;
        long l4 = l3 >>> n3;
        int n8 = (int)(l3 ^ l4);
        n4 = (n4 ^ n8) * n7;
        l3 = this.uptimeMillis;
        return (int)(l3 >>> n3 ^ l3) ^ n4;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("StartupTime{epochMillis=");
        long l2 = this.epochMillis;
        stringBuilder.append(l2);
        stringBuilder.append(", elapsedRealtime=");
        l2 = this.elapsedRealtime;
        stringBuilder.append(l2);
        stringBuilder.append(", uptimeMillis=");
        l2 = this.uptimeMillis;
        return jl0_0.b(stringBuilder, l2, "}");
    }
}

