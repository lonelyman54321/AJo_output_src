/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.review.model;

import java.util.HashMap;
import java.util.Map;

public final class zza {
    private static final Map zza;
    private static final Map zzb;

    static {
        HashMap<Integer, String> hashMap;
        HashMap<Integer, String> hashMap2;
        zza = hashMap2 = new HashMap<Integer, String>();
        zzb = hashMap = new HashMap<Integer, String>();
        Integer n3 = -1;
        Integer n4 = BW0.a(-2, n3, "The Play Store app is either not installed or not the official version.", "Call first requestReviewFlow to get the ReviewInfo.", hashMap2);
        Integer n7 = -100;
        hashMap2.put(n7, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap.put(n3, "PLAY_STORE_NOT_FOUND");
        hashMap.put(n4, "INVALID_REQUEST");
        hashMap.put(n7, "INTERNAL_ERROR");
    }

    public static String zza(int n3) {
        Object object = zza;
        Object object2 = n3;
        boolean bl2 = object.containsKey(object2);
        if (!bl2) {
            return "";
        }
        object = (String)object.get(object2);
        object2 = (String)zzb.get(object2);
        return y02.a((String)object, " (https://developer.android.com/reference/com/google/android/play/core/review/model/ReviewErrorCode.html#", (String)object2, ")");
    }
}

