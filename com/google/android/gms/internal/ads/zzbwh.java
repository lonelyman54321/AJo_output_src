/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbwj;

final class zzbwh
implements Thread.UncaughtExceptionHandler {
    final /* synthetic */ Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ zzbwj zzb;

    public zzbwh(zzbwj zzbwj2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
        this.zzb = zzbwj2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void uncaughtException(Thread thread2, Throwable throwable) {
        Object object;
        try {
            object = this.zzb;
            ((zzbwj)object).zzg(thread2, throwable);
        }
        catch (Throwable throwable2) {
            object = "AdMob exception reporter failed reporting the exception.";
            try {
                zzm.zzg((String)object);
            }
            catch (Throwable throwable3) {
                Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza;
                if (uncaughtExceptionHandler == null) {
                    throw throwable3;
                }
                uncaughtExceptionHandler.uncaughtException(thread2, throwable);
                throw throwable3;
            }
        }
        object = this.zza;
        if (object == null) return;
        object.uncaughtException(thread2, throwable);
    }
}

