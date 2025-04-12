/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.gtm;

import android.content.Context;
import com.google.android.gms.common.util.CrashUtils;
import com.google.android.gms.internal.gtm.zzhi;

final class zzgp {
    public static void zza(String string2, Context context) {
        zzhi.zza(string2);
        RuntimeException runtimeException = new RuntimeException(string2);
        boolean bl2 = CrashUtils.addDynamiteErrorToDropBox(context, runtimeException);
        if (bl2) {
            zzhi.zzd("Crash reported successfully.");
            return;
        }
        zzhi.zzd("Failed to report crash");
    }

    public static void zzb(String string2, Throwable throwable, Context context) {
        zzhi.zzb(string2, throwable);
        boolean bl2 = CrashUtils.addDynamiteErrorToDropBox(context, throwable);
        if (bl2) {
            zzhi.zzd("Crash reported successfully.");
            return;
        }
        zzhi.zzd("Failed to report crash");
    }

    public static void zzc(String string2, Context context) {
        zzhi.zze(string2);
        RuntimeException runtimeException = new RuntimeException(string2);
        boolean bl2 = CrashUtils.addDynamiteErrorToDropBox(context, runtimeException);
        if (bl2) {
            zzhi.zzd("Crash reported successfully.");
            return;
        }
        zzhi.zzd("Failed to report crash");
    }
}

