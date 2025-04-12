/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 */
package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.ads.zzfj;
import java.net.UnknownHostException;

public final class zzfk {
    private static final Object zza;
    private static final zzfj zzb;

    static {
        Object object;
        zza = object = new Object();
        zzb = zzfj.zza;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public static String zza(String string2, Throwable object) {
        Object object2;
        Object object3;
        block7: {
            if (object == null) {
                object = null;
            } else {
                object3 = zza;
                // MONITORENTER : object3
                for (object2 = object; object2 != null; object2 = ((Throwable)object2).getCause()) {
                    boolean bl2 = object2 instanceof UnknownHostException;
                    if (!bl2) continue;
                    object = "UnknownHostException (no network)";
                    // MONITOREXIT : object3
                    break block7;
                }
                object = Log.getStackTraceString((Throwable)object);
                object = ((String)object).trim();
                object2 = "\t";
                String string3 = "    ";
                object = ((String)object).replace((CharSequence)object2, string3);
                // MONITOREXIT : object3
            }
        }
        boolean bl3 = TextUtils.isEmpty((CharSequence)object);
        if (bl3) return string2;
        object = ((String)object).replace("\n", "\n  ");
        object3 = "\n  ";
        object2 = "\n";
        return y02.a(string2, (String)object3, (String)object, (String)object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzb(String object, String string2) {
        object = zza;
        synchronized (object) {
            zzfk.zza(string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzc(String object, String string2) {
        object = zza;
        synchronized (object) {
            zzfk.zza(string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzd(String object, String string2, Throwable throwable) {
        object = zza;
        synchronized (object) {
            zzfk.zza(string2, throwable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zze(String object, String string2) {
        object = zza;
        synchronized (object) {
            zzfk.zza(string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzf(String object, String string2) {
        object = zza;
        synchronized (object) {
            zzfk.zza(string2, null);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void zzg(String object, String string2, Throwable throwable) {
        object = zza;
        synchronized (object) {
            zzfk.zza(string2, throwable);
            return;
        }
    }
}

