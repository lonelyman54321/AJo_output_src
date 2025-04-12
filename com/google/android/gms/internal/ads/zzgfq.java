/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfxy;
import com.google.android.gms.internal.ads.zzfxz;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzggw;
import com.google.android.gms.internal.ads.zzggx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

final class zzgfq
implements Runnable {
    final Future zza;
    final zzgfp zzb;

    public zzgfq(Future future, zzgfp zzgfp2) {
        this.zza = future;
        this.zzb = zzgfp2;
    }

    public final void run() {
        ExecutionException executionException2;
        block6: {
            Object object = this.zza;
            boolean bl2 = object instanceof zzggw;
            if (bl2 && (object = zzggx.zza((zzggw)object)) != null) {
                this.zzb.zza((Throwable)object);
                return;
            }
            object = this.zza;
            try {
                object = zzgft.zzp((Future)object);
                this.zzb.zzb(object);
                return;
            }
            catch (Throwable throwable) {
            }
            catch (ExecutionException executionException2) {
                break block6;
            }
            this.zzb.zza(throwable);
            return;
        }
        zzgfp zzgfp2 = this.zzb;
        Throwable throwable = executionException2.getCause();
        zzgfp2.zza(throwable);
    }

    public final String toString() {
        zzfxy zzfxy2 = zzfxz.zza(this);
        zzgfp zzgfp2 = this.zzb;
        zzfxy2.zza(zzgfp2);
        return zzfxy2.toString();
    }
}

