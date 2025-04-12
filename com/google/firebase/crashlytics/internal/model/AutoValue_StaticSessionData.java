/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.model.StaticSessionData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData$DeviceData;
import com.google.firebase.crashlytics.internal.model.StaticSessionData$OsData;

final class AutoValue_StaticSessionData
extends StaticSessionData {
    private final StaticSessionData$AppData appData;
    private final StaticSessionData$DeviceData deviceData;
    private final StaticSessionData$OsData osData;

    public AutoValue_StaticSessionData(StaticSessionData$AppData object, StaticSessionData$OsData staticSessionData$OsData, StaticSessionData$DeviceData staticSessionData$DeviceData) {
        if (object != null) {
            this.appData = object;
            if (staticSessionData$OsData != null) {
                this.osData = staticSessionData$OsData;
                if (staticSessionData$DeviceData != null) {
                    this.deviceData = staticSessionData$DeviceData;
                    return;
                }
                object = new NullPointerException("Null deviceData");
                throw object;
            }
            object = new NullPointerException("Null osData");
            throw object;
        }
        object = new NullPointerException("Null appData");
        throw object;
    }

    public StaticSessionData$AppData appData() {
        return this.appData;
    }

    public StaticSessionData$DeviceData deviceData() {
        return this.deviceData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean bl3 = object instanceof StaticSessionData;
        if (bl3) {
            boolean bl4;
            Object object2 = this.appData;
            Object object3 = ((StaticSessionData)(object = (StaticSessionData)object)).appData();
            bl3 = object2.equals(object3);
            if (!(bl3 && (bl3 = (object2 = this.osData).equals(object3 = ((StaticSessionData)object).osData())) && (bl4 = (object2 = this.deviceData).equals(object = ((StaticSessionData)object).deviceData())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.appData.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.osData.hashCode();
        n3 = (n3 ^ n7) * n4;
        n4 = this.deviceData.hashCode();
        return n3 ^ n4;
    }

    public StaticSessionData$OsData osData() {
        return this.osData;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("StaticSessionData{appData=");
        Object object = this.appData;
        stringBuilder.append(object);
        stringBuilder.append(", osData=");
        object = this.osData;
        stringBuilder.append(object);
        stringBuilder.append(", deviceData=");
        object = this.deviceData;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

