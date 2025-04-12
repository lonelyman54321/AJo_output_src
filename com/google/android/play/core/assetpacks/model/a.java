/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.assetpacks.model;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public final class a {
    private static final Map a;
    private static final Map b;

    static {
        HashMap<Serializable, String> hashMap;
        Serializable serializable;
        a = serializable = new Serializable();
        b = hashMap = new HashMap<Serializable, String>();
        Integer n3 = -1;
        Integer n4 = BW0.a(-2, n3, "The requesting app is unavailable (e.g. unpublished, nonexistent version code).", "The requested pack is not available.", serializable);
        Integer n7 = -3;
        Integer n8 = BW0.a(-4, n7, "The request is invalid.", "The requested download is not found.", serializable);
        Integer n10 = -5;
        Integer n14 = BW0.a(-6, n10, "The Asset Delivery API is not available.", "Network error. Unable to obtain the asset pack details.", serializable);
        Integer n15 = -7;
        Integer n16 = BW0.a(-10, n15, "Download not permitted under current device circumstances (e.g. in background).", "Asset pack download failed due to insufficient storage.", serializable);
        Integer n17 = -11;
        Integer n18 = BW0.a(-12, n17, "The Play Store app is either not installed or not the official version.", "Tried to show the cellular data confirmation but no asset packs are waiting for Wi-Fi.", serializable);
        Integer n19 = -13;
        Integer n20 = BW0.a(-14, n19, "The app is not owned by any user on this device. An app is \"owned\" if it has been acquired from Play.", "Tried to show the confirmation dialog but no asset packs are waiting for user confirmation.", serializable);
        serializable = BW0.a(-100, n20, "The installed app version was not installed by Play.", "Unknown error downloading an asset pack.", serializable);
        hashMap.put(n3, "APP_UNAVAILABLE");
        hashMap.put(n4, "PACK_UNAVAILABLE");
        hashMap.put(n7, "INVALID_REQUEST");
        hashMap.put(n8, "DOWNLOAD_NOT_FOUND");
        hashMap.put(n10, "API_NOT_AVAILABLE");
        hashMap.put(n14, "NETWORK_ERROR");
        hashMap.put(n15, "ACCESS_DENIED");
        hashMap.put(n16, "INSUFFICIENT_STORAGE");
        hashMap.put(n17, "PLAY_STORE_NOT_FOUND");
        hashMap.put(n18, "NETWORK_UNRESTRICTED");
        n4 = n19;
        hashMap.put(n19, "APP_NOT_OWNED");
        hashMap.put(n20, "CONFIRMATION_NOT_REQUIRED");
        n3 = -15;
        hashMap.put(n3, "UNRECOGNIZED_INSTALLATION");
        hashMap.put(serializable, "INTERNAL_ERROR");
    }

    public static String a(int n3) {
        Object object = a;
        Object object2 = n3;
        boolean bl2 = object.containsKey(object2);
        if (!bl2) {
            return "";
        }
        object = (String)object.get(object2);
        object2 = (String)b.get(object2);
        return y02.a((String)object, " (https://developer.android.com/reference/com/google/android/play/core/assetpacks/model/AssetPackErrorCode.html#", (String)object2, ")");
    }
}

