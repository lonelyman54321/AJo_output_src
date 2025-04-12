/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzare;
import com.google.android.gms.internal.ads.zzark;
import com.google.android.gms.internal.ads.zzarn;

final class zzaqu
implements Runnable {
    private final zzare zza;
    private final zzark zzb;
    private final Runnable zzc;

    public zzaqu(zzare zzare2, zzark zzark2, Runnable runnable2) {
        this.zza = zzare2;
        this.zzb = zzark2;
        this.zzc = runnable2;
    }

    public final void run() {
        Object object;
        this.zza.zzw();
        Object object2 = this.zzb;
        boolean bl2 = ((zzark)object2).zzc();
        if (bl2) {
            object = this.zza;
            object2 = ((zzark)object2).zza;
            ((zzare)object).zzo(object2);
        } else {
            object = this.zza;
            object2 = ((zzark)object2).zzc;
            ((zzare)object).zzn((zzarn)object2);
        }
        object2 = this.zzb;
        boolean bl3 = ((zzark)object2).zzd;
        if (bl3) {
            object2 = this.zza;
            object = "intermediate-response";
            ((zzare)object2).zzm((String)object);
        } else {
            object2 = this.zza;
            object = "done";
            ((zzare)object2).zzp((String)object);
        }
        object2 = this.zzc;
        if (object2 != null) {
            object2.run();
        }
    }
}

