/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import android.net.Uri;
import java.util.HashMap;

public final class zzhh {
    private static String zza;

    static {
        new HashMap();
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
        Object object2 = zza;
        if (object2 != null) return zzhh.zza(zza, string2);
        object2 = zzhh.class;
        synchronized (object2) {
            Throwable throwable2;
            block5: {
                block4: {
                    block3: {
                        try {
                            String string3 = zza;
                            if (string3 != null) return zzhh.zza(zza, string2);
                            string3 = "gtm_install_referrer";
                            String string4 = null;
                            if ((object = object.getSharedPreferences(string3, 0)) == null) break block3;
                            string3 = "referrer";
                            string4 = "";
                            object = object.getString(string3, string4);
                            zza = object;
                            break block4;
                        }
                        catch (Throwable throwable2) {
                            break block5;
                        }
                    }
                    object = "";
                    zza = object;
                }
                return zzhh.zza(zza, string2);
            }
            throw throwable2;
        }
    }
}

