/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.analytics;

public final class FirebaseAnalytics$ConsentType
extends Enum {
    public static final /* enum */ FirebaseAnalytics$ConsentType AD_PERSONALIZATION;
    public static final /* enum */ FirebaseAnalytics$ConsentType AD_STORAGE;
    public static final /* enum */ FirebaseAnalytics$ConsentType AD_USER_DATA;
    public static final /* enum */ FirebaseAnalytics$ConsentType ANALYTICS_STORAGE;
    private static final /* synthetic */ FirebaseAnalytics$ConsentType[] zza;

    static {
        FirebaseAnalytics$ConsentType firebaseAnalytics$ConsentType;
        FirebaseAnalytics$ConsentType firebaseAnalytics$ConsentType2;
        FirebaseAnalytics$ConsentType firebaseAnalytics$ConsentType3;
        FirebaseAnalytics$ConsentType firebaseAnalytics$ConsentType4;
        AD_STORAGE = firebaseAnalytics$ConsentType4 = new FirebaseAnalytics$ConsentType("AD_STORAGE", 0);
        int n3 = 1;
        ANALYTICS_STORAGE = firebaseAnalytics$ConsentType3 = new FirebaseAnalytics$ConsentType("ANALYTICS_STORAGE", n3);
        int n4 = 2;
        AD_USER_DATA = firebaseAnalytics$ConsentType2 = new FirebaseAnalytics$ConsentType("AD_USER_DATA", n4);
        int n7 = 3;
        AD_PERSONALIZATION = firebaseAnalytics$ConsentType = new FirebaseAnalytics$ConsentType("AD_PERSONALIZATION", n7);
        FirebaseAnalytics$ConsentType[] firebaseAnalytics$ConsentTypeArray = new FirebaseAnalytics$ConsentType[4];
        firebaseAnalytics$ConsentTypeArray[0] = firebaseAnalytics$ConsentType4;
        firebaseAnalytics$ConsentTypeArray[n3] = firebaseAnalytics$ConsentType3;
        firebaseAnalytics$ConsentTypeArray[n4] = firebaseAnalytics$ConsentType2;
        firebaseAnalytics$ConsentTypeArray[n7] = firebaseAnalytics$ConsentType;
        zza = firebaseAnalytics$ConsentTypeArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private FirebaseAnalytics$ConsentType() {
        void var2_-1;
        void var1_-1;
    }

    public static FirebaseAnalytics$ConsentType valueOf(String string2) {
        return Enum.valueOf(FirebaseAnalytics$ConsentType.class, string2);
    }

    public static FirebaseAnalytics$ConsentType[] values() {
        return (FirebaseAnalytics$ConsentType[])zza.clone();
    }
}

