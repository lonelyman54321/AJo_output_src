/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.install.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class zza {
    private static final Map zza;
    private static final Map zzb;

    static {
        HashMap<Serializable, Object> hashMap;
        Serializable serializable;
        zza = serializable = new Serializable();
        zzb = hashMap = new HashMap<Serializable, Object>();
        Object object = -2;
        Integer n3 = BW0.a(-3, (Integer)object, "An unknown error occurred.", "The API is not available on this device.", serializable);
        Integer n4 = -4;
        Integer n7 = BW0.a(-5, n4, "The request that was sent by the app is malformed.", "The install is unavailable to this user or device.", serializable);
        Integer n8 = -6;
        Integer n10 = BW0.a(-7, n8, "The download/install is not allowed, due to the current device state (e.g. low battery, low disk space, ...).", "The install/update has not been (fully) downloaded yet.", serializable);
        Integer n14 = -8;
        Integer n15 = BW0.a(-9, n14, "The install is already in progress and there is no UI flow to resume.", "The Play Store app is either not installed or not the official version.", serializable);
        Integer n16 = -10;
        serializable = BW0.a(-100, n16, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", "An internal error happened in the Play Store.", serializable);
        hashMap.put((Serializable)object, "ERROR_UNKNOWN");
        hashMap.put(n3, "ERROR_API_NOT_AVAILABLE");
        hashMap.put(n4, "ERROR_INVALID_REQUEST");
        hashMap.put(n7, "ERROR_INSTALL_UNAVAILABLE");
        hashMap.put(n8, "ERROR_INSTALL_NOT_ALLOWED");
        hashMap.put(n10, "ERROR_DOWNLOAD_NOT_PRESENT");
        hashMap.put(n14, "ERROR_INSTALL_IN_PROGRESS");
        object = "ERROR_INTERNAL_ERROR";
        hashMap.put(serializable, object);
        hashMap.put(n15, "ERROR_PLAY_STORE_NOT_FOUND");
        hashMap.put(n16, "ERROR_APP_NOT_OWNED");
        hashMap.put(serializable, object);
    }

    public static String zza(int n3) {
        Map map2;
        boolean bl2;
        Object object = zza;
        Object object2 = n3;
        boolean bl3 = object.containsKey(object2);
        if (bl3 && (bl2 = (map2 = zzb).containsKey(object2))) {
            object = (String)object.get(object2);
            object2 = (String)map2.get(object2);
            return y02.a((String)object, " (https://developer.android.com/reference/com/google/android/play/core/install/model/InstallErrorCode#", (String)object2, ")");
        }
        return "";
    }
}

