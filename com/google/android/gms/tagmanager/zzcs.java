/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.tagmanager;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.tagmanager.zzfb;
import java.util.HashMap;
import java.util.Map;

public final class zzcs {
    static final Map zza;
    private static String zzb;

    static {
        HashMap hashMap;
        zza = hashMap = new HashMap();
    }

    public static String zza(String string2, String string3) {
        if (string3 == null) {
            int n3 = string2.length();
            if (n3 > 0) {
                return string2;
            }
            return null;
        }
        string2 = String.valueOf(string2);
        return Uri.parse((String)"http://hostname/?".concat(string2)).getQueryParameter(string3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static String zzb(Context object, String string2) {
        Object object2 = zzb;
        if (object2 != null) return zzcs.zza(zzb, string2);
        object2 = zzcs.class;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            String string3 = zzb;
                            if (string3 != null) return zzcs.zza(zzb, string2);
                            string3 = "gtm_install_referrer";
                            String string4 = null;
                            if ((object = object.getSharedPreferences(string3, 0)) == null) break block3;
                            string3 = "referrer";
                            string4 = "";
                            object = object.getString(string3, string4);
                            zzb = object;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = "";
                    zzb = object;
                }
                return zzcs.zza(zzb, string2);
            }
            throw throwable2;
        }
    }

    public static void zzc(Context context, String string2) {
        int n3;
        String string3 = zzcs.zza(string2, "conv");
        if (string3 != null && (n3 = string3.length()) > 0) {
            zza.put(string3, string2);
            String string4 = "gtm_click_referrers";
            zzfb.zza(context, string4, string3, string2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzd(String string2) {
        Class<zzcs> clazz = zzcs.class;
        synchronized (clazz) {
            zzb = string2;
            return;
        }
    }
}

