/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Log
 */
package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Locale;

public final class zzarq {
    public static final String zza = "Volley";
    public static final boolean zzb = Log.isLoggable((String)"Volley", (int)2);
    private static final String zzc = zzarq.class.getName();

    public static void zza(String string2, Object ... objectArray) {
        zzarq.zze(string2, objectArray);
    }

    public static void zzb(String string2, Object ... objectArray) {
        zzarq.zze(string2, objectArray);
    }

    public static void zzc(Throwable throwable, String string2, Object ... objectArray) {
        zzarq.zze(string2, objectArray);
    }

    public static void zzd(String string2, Object ... objectArray) {
        boolean bl2 = zzb;
        if (bl2) {
            zzarq.zze(string2, objectArray);
        }
    }

    private static String zze(String string2, Object ... object) {
        CharSequence charSequence;
        Object object2;
        block1: {
            int n3;
            object2 = Locale.US;
            string2 = String.format((Locale)object2, string2, (Object[])object);
            object = new Throwable();
            object = ((Throwable)object).fillInStackTrace().getStackTrace();
            for (int i3 = 2; i3 < (n3 = ((Object)object).length); ++i3) {
                String string3 = ((StackTraceElement)object[i3]).getClassName();
                n3 = (int)(string3.equals(charSequence = zzc) ? 1 : 0);
                if (n3 != 0) continue;
                string3 = ((StackTraceElement)object[i3]).getClassName();
                int n4 = string3.lastIndexOf(46) + 1;
                string3 = string3.substring(n4);
                n4 = string3.lastIndexOf(36) + 1;
                string3 = string3.substring(n4);
                object = ((StackTraceElement)object[i3]).getMethodName();
                object2 = ".";
                object = n1.a(string3, (String)object2, (String)object);
                break block1;
            }
            object = "<unknown>";
        }
        object2 = Locale.US;
        long l2 = Thread.currentThread().getId();
        charSequence = new StringBuilder("[");
        ((StringBuilder)charSequence).append(l2);
        ((StringBuilder)charSequence).append("] ");
        ((StringBuilder)charSequence).append((String)object);
        return h30_0.a((StringBuilder)charSequence, ": ", string2);
    }
}

