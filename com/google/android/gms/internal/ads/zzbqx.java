/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbqw;
import java.util.concurrent.atomic.AtomicBoolean;

public final class zzbqx {
    private static zzbqx zza;
    private final AtomicBoolean zzb;

    public zzbqx() {
        AtomicBoolean atomicBoolean;
        this.zzb = atomicBoolean = new AtomicBoolean(false);
    }

    public static zzbqx zza() {
        zzbqx zzbqx2 = zza;
        if (zzbqx2 == null) {
            zza = zzbqx2 = new zzbqx();
        }
        return zza;
    }

    public final Thread zzb(Context context, String string2) {
        Object object = this.zzb;
        zzbqw zzbqw2 = null;
        boolean bl2 = true;
        boolean bl3 = ((AtomicBoolean)object).compareAndSet(false, bl2);
        if (!bl3) {
            return null;
        }
        zzbqw2 = new zzbqw(this, context, string2);
        object = new Thread(zzbqw2);
        ((Thread)object).start();
        return object;
    }
}

