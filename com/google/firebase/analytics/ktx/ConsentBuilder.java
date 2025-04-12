/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics.ktx;

import com.google.firebase.analytics.FirebaseAnalytics$ConsentStatus;
import com.google.firebase.analytics.FirebaseAnalytics$ConsentType;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ConsentBuilder {
    private FirebaseAnalytics$ConsentStatus zza;
    private FirebaseAnalytics$ConsentStatus zzb;

    public final Map asMap() {
        FirebaseAnalytics$ConsentType firebaseAnalytics$ConsentType;
        LinkedHashMap<FirebaseAnalytics$ConsentType, FirebaseAnalytics$ConsentStatus> linkedHashMap = new LinkedHashMap<FirebaseAnalytics$ConsentType, FirebaseAnalytics$ConsentStatus>();
        FirebaseAnalytics$ConsentStatus firebaseAnalytics$ConsentStatus = this.zza;
        if (firebaseAnalytics$ConsentStatus != null) {
            firebaseAnalytics$ConsentType = FirebaseAnalytics$ConsentType.AD_STORAGE;
            linkedHashMap.put(firebaseAnalytics$ConsentType, firebaseAnalytics$ConsentStatus);
        }
        if ((firebaseAnalytics$ConsentStatus = this.zzb) != null) {
            firebaseAnalytics$ConsentType = FirebaseAnalytics$ConsentType.ANALYTICS_STORAGE;
            linkedHashMap.put(firebaseAnalytics$ConsentType, firebaseAnalytics$ConsentStatus);
        }
        return linkedHashMap;
    }

    public final FirebaseAnalytics$ConsentStatus getAdStorage() {
        return this.zza;
    }

    public final FirebaseAnalytics$ConsentStatus getAnalyticsStorage() {
        return this.zzb;
    }

    public final void setAdStorage(FirebaseAnalytics$ConsentStatus firebaseAnalytics$ConsentStatus) {
        this.zza = firebaseAnalytics$ConsentStatus;
    }

    public final void setAnalyticsStorage(FirebaseAnalytics$ConsentStatus firebaseAnalytics$ConsentStatus) {
        this.zzb = firebaseAnalytics$ConsentStatus;
    }
}

