/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.crashlytics.internal.model;

import com.google.firebase.crashlytics.internal.DevelopmentPlatformProvider;
import com.google.firebase.crashlytics.internal.model.StaticSessionData$AppData;

final class AutoValue_StaticSessionData_AppData
extends StaticSessionData$AppData {
    private final String appIdentifier;
    private final int deliveryMechanism;
    private final DevelopmentPlatformProvider developmentPlatformProvider;
    private final String installUuid;
    private final String versionCode;
    private final String versionName;

    public AutoValue_StaticSessionData_AppData(String object, String string2, String string3, String string4, int n3, DevelopmentPlatformProvider developmentPlatformProvider) {
        if (object != null) {
            this.appIdentifier = object;
            if (string2 != null) {
                this.versionCode = string2;
                if (string3 != null) {
                    this.versionName = string3;
                    if (string4 != null) {
                        this.installUuid = string4;
                        this.deliveryMechanism = n3;
                        if (developmentPlatformProvider != null) {
                            this.developmentPlatformProvider = developmentPlatformProvider;
                            return;
                        }
                        object = new NullPointerException("Null developmentPlatformProvider");
                        throw object;
                    }
                    object = new NullPointerException("Null installUuid");
                    throw object;
                }
                object = new NullPointerException("Null versionName");
                throw object;
            }
            object = new NullPointerException("Null versionCode");
            throw object;
        }
        object = new NullPointerException("Null appIdentifier");
        throw object;
    }

    public String appIdentifier() {
        return this.appIdentifier;
    }

    public int deliveryMechanism() {
        return this.deliveryMechanism;
    }

    public DevelopmentPlatformProvider developmentPlatformProvider() {
        return this.developmentPlatformProvider;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        boolean n3 = object instanceof StaticSessionData$AppData;
        if (n3) {
            boolean bl3;
            int n4;
            int n7;
            boolean bl4;
            boolean bl5;
            boolean bl6;
            Object object2 = this.appIdentifier;
            String string2 = ((StaticSessionData$AppData)(object = (StaticSessionData$AppData)object)).appIdentifier();
            boolean bl7 = ((String)object2).equals(string2);
            if (!(bl7 && (bl6 = ((String)(object2 = this.versionCode)).equals(string2 = ((StaticSessionData$AppData)object).versionCode())) && (bl5 = ((String)(object2 = this.versionName)).equals(string2 = ((StaticSessionData$AppData)object).versionName())) && (bl4 = ((String)(object2 = this.installUuid)).equals(string2 = ((StaticSessionData$AppData)object).installUuid())) && (n7 = this.deliveryMechanism) == (n4 = ((StaticSessionData$AppData)object).deliveryMechanism()) && (bl3 = (object2 = this.developmentPlatformProvider).equals(object = ((StaticSessionData$AppData)object).developmentPlatformProvider())))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public int hashCode() {
        int n3 = this.appIdentifier.hashCode();
        int n4 = 1000003;
        n3 = (n3 ^ n4) * n4;
        int n7 = this.versionCode.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.versionName.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.installUuid.hashCode();
        n3 = (n3 ^ n7) * n4;
        n7 = this.deliveryMechanism;
        n3 = (n3 ^ n7) * n4;
        n4 = this.developmentPlatformProvider.hashCode();
        return n3 ^ n4;
    }

    public String installUuid() {
        return this.installUuid;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AppData{appIdentifier=");
        Object object = this.appIdentifier;
        stringBuilder.append((String)object);
        stringBuilder.append(", versionCode=");
        object = this.versionCode;
        stringBuilder.append((String)object);
        stringBuilder.append(", versionName=");
        object = this.versionName;
        stringBuilder.append((String)object);
        stringBuilder.append(", installUuid=");
        object = this.installUuid;
        stringBuilder.append((String)object);
        stringBuilder.append(", deliveryMechanism=");
        int n3 = this.deliveryMechanism;
        stringBuilder.append(n3);
        stringBuilder.append(", developmentPlatformProvider=");
        object = this.developmentPlatformProvider;
        stringBuilder.append(object);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    public String versionCode() {
        return this.versionCode;
    }

    public String versionName() {
        return this.versionName;
    }
}

