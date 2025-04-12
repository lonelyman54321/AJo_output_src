/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.ads.internal.util.client;

import android.util.Log;
import com.google.android.gms.internal.ads.zzfyt;

public class zzm {
    protected static final zzfyt zza = zzfyt.zzb(4000);

    public static String zzd(String string2) {
        int n3;
        Object object = Thread.currentThread().getStackTrace();
        int n4 = ((StackTraceElement[])object).length;
        if (n4 >= (n3 = 4)) {
            n4 = 3;
            object = object[n4];
            int n7 = ((StackTraceElement)object).getLineNumber();
            String string3 = " @";
            string2 = LO1.a(n7, string2, string3);
        }
        return string2;
    }

    public static void zze(String object) {
        int n3;
        int n4 = zzm.zzm(3);
        if (n4 != 0 && object != null && (n4 = ((String)object).length()) > (n3 = 4000)) {
            Object object2 = zza;
            object = ((zzfyt)object2).zzd((CharSequence)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (String)object.next();
            }
        }
    }

    public static void zzf(String string2, Throwable throwable) {
        zzm.zzm(3);
    }

    public static void zzg(String object) {
        int n3;
        int n4 = zzm.zzm(6);
        if (n4 != 0 && object != null && (n4 = ((String)object).length()) > (n3 = 4000)) {
            Object object2 = zza;
            object = ((zzfyt)object2).zzd((CharSequence)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (String)object.next();
            }
        }
    }

    public static void zzh(String string2, Throwable throwable) {
        zzm.zzm(6);
    }

    public static void zzi(String object) {
        int n3;
        int n4 = zzm.zzm(4);
        if (n4 != 0 && object != null && (n4 = ((String)object).length()) > (n3 = 4000)) {
            Object object2 = zza;
            object = ((zzfyt)object2).zzd((CharSequence)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (String)object.next();
            }
        }
    }

    public static void zzj(String object) {
        int n3;
        int n4 = zzm.zzm(5);
        if (n4 != 0 && object != null && (n4 = ((String)object).length()) > (n3 = 4000)) {
            Object object2 = zza;
            object = ((zzfyt)object2).zzd((CharSequence)object).iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (String)object.next();
            }
        }
    }

    public static void zzk(String string2, Throwable throwable) {
        zzm.zzm(5);
    }

    public static void zzl(String string2, Throwable throwable) {
        boolean bl2 = zzm.zzm(5);
        if (bl2) {
            if (throwable != null) {
                zzm.zzk(zzm.zzd(string2), throwable);
                return;
            }
            string2 = zzm.zzd(string2);
            zzm.zzj(string2);
        }
    }

    public static boolean zzm(int n3) {
        String string2;
        int n4 = 5;
        return n3 >= n4 || (n3 = (int)(Log.isLoggable((String)(string2 = "Ads"), (int)n3) ? 1 : 0)) != 0;
        {
        }
    }
}

