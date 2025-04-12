/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import java.net.URLEncoder;

final class zzfs {
    public static String zza(String string2) {
        return URLEncoder.encode(string2, "UTF-8").replaceAll("\\+", "%20");
    }
}

