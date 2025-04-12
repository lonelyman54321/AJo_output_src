/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgeh$zzi;

final class zzggi
extends zzgeh$zzi
implements Runnable {
    private final Runnable zza;

    public zzggi(Runnable runnable2) {
        runnable2.getClass();
        this.zza = runnable2;
    }

    public final void run() {
        Runnable runnable2;
        try {
            runnable2 = this.zza;
        }
        catch (Throwable throwable) {
            this.zzd(throwable);
            throw throwable;
        }
        runnable2.run();
    }

    public final String zza() {
        String string2 = this.zza.toString();
        return cP.a("task=[", string2, "]");
    }
}

