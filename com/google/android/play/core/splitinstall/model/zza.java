/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class zza {
    private static final Map zza;
    private static final Map zzb;
    private static final Map zzc;

    static {
        boolean bl2;
        Object object = new HashMap();
        zza = object;
        Object object2 = new HashMap();
        zzb = object2;
        int n3 = -1;
        Object object3 = n3;
        Object object4 = BW0.a(-2, (Integer)object3, "Too many sessions are running for current app, existing sessions must be resolved first.", "A requested module is not available (to this user/device, for the installed apk).", object);
        int n4 = -3;
        Integer n7 = n4;
        Integer n8 = BW0.a(-4, n7, "Request is otherwise invalid.", "Requested session is not found.", object);
        int n10 = -5;
        Integer n14 = n10;
        Integer n15 = BW0.a(-6, n14, "Split Install API is not available.", "Network error: unable to obtain split details.", object);
        int n16 = -7;
        Integer n17 = n16;
        Integer n18 = BW0.a(-8, n17, "Download not permitted under current device circumstances (e.g. in background).", "Requested session contains modules from an existing active session and also new modules.", object);
        int n19 = -9;
        Integer n20 = n19;
        Integer n21 = BW0.a(-10, n20, "Service handling split install has died.", "Install failed due to insufficient storage.", object);
        Integer n22 = -11;
        Integer n24 = BW0.a(-12, n22, "Signature verification error when invoking SplitCompat.", "Error in SplitCompat emulation.", object);
        Integer n25 = -13;
        Integer n26 = n24;
        Integer n27 = n22;
        n22 = BW0.a(-14, n25, "Error in copying files for SplitCompat.", "The Play Store app is either not installed or not the official version.", object);
        int n28 = -15;
        n24 = n28;
        Integer n29 = n22;
        int n30 = -16;
        Integer n32 = n25;
        n22 = BW0.a(n30, n24, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", "The download is too large to start over the current connection.", object);
        int n34 = -100;
        n25 = n34;
        String string2 = "Unknown error processing split install.";
        object.put(n25, string2);
        object2.put(object3, "ACTIVE_SESSIONS_LIMIT_EXCEEDED");
        object2.put(object4, "MODULE_UNAVAILABLE");
        object2.put(n7, "INVALID_REQUEST");
        object2.put(n8, "DOWNLOAD_NOT_FOUND");
        object2.put(n14, "API_NOT_AVAILABLE");
        object2.put(n15, "NETWORK_ERROR");
        object2.put(n17, "ACCESS_DENIED");
        object2.put(n18, "INCOMPATIBLE_WITH_EXISTING_SESSION");
        object2.put(n20, "SERVICE_DIED");
        object2.put(n21, "INSUFFICIENT_STORAGE");
        object3 = n27;
        object2.put(n27, "SPLITCOMPAT_VERIFICATION_ERROR");
        object3 = n26;
        object2.put(n26, "SPLITCOMPAT_EMULATION_ERROR");
        object3 = n32;
        object2.put(n32, "SPLITCOMPAT_COPY_ERROR");
        object3 = n29;
        object2.put(n29, "PLAY_STORE_NOT_FOUND");
        object2.put(n24, "APP_NOT_OWNED");
        object2.put(n22, "DOWNLOAD_TOO_LARGE");
        object2.put(n25, "INTERNAL_ERROR");
        object = new HashMap();
        zzc = object;
        object = object2.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            object3 = zzc;
            object4 = (String)object2.getValue();
            object2 = (Integer)object2.getKey();
            object3.put(object4, object2);
        }
    }

    public static int zza(String string2) {
        Serializable serializable = (Integer)zzc.get(string2);
        if (serializable != null) {
            return serializable;
        }
        string2 = String.valueOf(string2);
        string2 = string2.concat(" is unknown error.");
        serializable = new IllegalArgumentException(string2);
        throw serializable;
    }

    public static String zzb(int n3) {
        Map map2;
        boolean bl2;
        Object object = zza;
        Object object2 = n3;
        boolean bl3 = object.containsKey(object2);
        if (bl3 && (bl2 = (map2 = zzb).containsKey(object2))) {
            object = (String)object.get(object2);
            object2 = (String)map2.get(object2);
            return y02.a((String)object, " (https://developer.android.com/reference/com/google/android/play/core/splitinstall/model/SplitInstallErrorCode.html#", (String)object2, ")");
        }
        return "";
    }
}

