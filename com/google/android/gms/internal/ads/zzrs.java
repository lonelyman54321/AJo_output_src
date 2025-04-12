/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.SystemClock
 */
package com.google.android.gms.internal.ads;

import android.os.SystemClock;

final class zzrs {
    private Exception zza;
    private long zzb;

    public zzrs(long l2) {
    }

    public final void zza() {
        this.zza = null;
    }

    public final void zzb(Exception exception) {
        long l2;
        long l3;
        long l4;
        long l7 = SystemClock.elapsedRealtime();
        Exception exception2 = this.zza;
        if (exception2 == null) {
            this.zza = exception;
            this.zzb = l4 = (long)100 + l7;
        }
        if ((l3 = (l2 = l7 - (l4 = this.zzb)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0) {
            Exception exception3 = this.zza;
            if (exception3 != exception) {
                exception3.addSuppressed(exception);
            }
            exception = this.zza;
            this.zza = null;
            throw exception;
        }
    }
}

