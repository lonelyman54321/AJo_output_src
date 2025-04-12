/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics;

import com.google.firebase.analytics.FirebaseAnalytics$ConsentStatus;
import com.google.firebase.analytics.FirebaseAnalytics$ConsentType;
import java.util.LinkedHashMap;
import java.util.Map;

public final class ConsentBuilder {
    private FirebaseAnalytics.ConsentStatus zza;
    private FirebaseAnalytics.ConsentStatus zzb;
    private FirebaseAnalytics.ConsentStatus zzc;
    private FirebaseAnalytics.ConsentStatus zzd;

    public final Map asMap() {
        FirebaseAnalytics$ConsentType firebaseAnalytics$ConsentType;
        LinkedHashMap<FirebaseAnalytics$ConsentType, FirebaseAnalytics.ConsentStatus> linkedHashMap = new LinkedHashMap<FirebaseAnalytics$ConsentType, FirebaseAnalytics.ConsentStatus>();
        FirebaseAnalytics.ConsentStatus consentStatus = this.zza;
        if (consentStatus != null) {
            firebaseAnalytics$ConsentType = FirebaseAnalytics$ConsentType.AD_STORAGE;
            linkedHashMap.put(firebaseAnalytics$ConsentType, consentStatus);
        }
        if ((consentStatus = this.zzb) != null) {
            firebaseAnalytics$ConsentType = FirebaseAnalytics$ConsentType.ANALYTICS_STORAGE;
            linkedHashMap.put(firebaseAnalytics$ConsentType, consentStatus);
        }
        if ((consentStatus = this.zzc) != null) {
            firebaseAnalytics$ConsentType = FirebaseAnalytics$ConsentType.AD_USER_DATA;
            linkedHashMap.put(firebaseAnalytics$ConsentType, consentStatus);
        }
        if ((consentStatus = this.zzd) != null) {
            firebaseAnalytics$ConsentType = FirebaseAnalytics$ConsentType.AD_PERSONALIZATION;
            linkedHashMap.put(firebaseAnalytics$ConsentType, consentStatus);
        }
        return linkedHashMap;
    }

    public final FirebaseAnalytics.ConsentStatus getAdPersonalization() {
        return this.zzd;
    }

    public final FirebaseAnalytics.ConsentStatus getAdStorage() {
        return this.zza;
    }

    public final FirebaseAnalytics.ConsentStatus getAdUserData() {
        return this.zzc;
    }

    public final FirebaseAnalytics.ConsentStatus getAnalyticsStorage() {
        return this.zzb;
    }

    public final void setAdPersonalization(FirebaseAnalytics.ConsentStatus consentStatus) {
        this.zzd = consentStatus;
    }

    public final void setAdStorage(FirebaseAnalytics.ConsentStatus consentStatus) {
        this.zza = consentStatus;
    }

    public final void setAdUserData(FirebaseAnalytics.ConsentStatus consentStatus) {
        this.zzc = consentStatus;
    }

    public final void setAnalyticsStorage(FirebaseAnalytics.ConsentStatus consentStatus) {
        this.zzb = consentStatus;
    }
}

