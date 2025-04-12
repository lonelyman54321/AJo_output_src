/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.zzaf;
import com.google.android.gms.tagmanager.zzag;
import com.google.android.gms.tagmanager.zzv;

final class zzac
implements zzv {
    final /* synthetic */ zzag zza;

    public /* synthetic */ zzac(zzag zzag2, zzaf zzaf2) {
        this.zza = zzag2;
    }

    public final String zza() {
        return this.zza.zzh();
    }

    public final void zzb() {
        Object object = zzag.zzg(this.zza);
        boolean bl2 = object.zza();
        if (bl2) {
            object = this.zza;
            long l2 = 0L;
            zzag.zzi((zzag)object, l2);
        }
    }

    public final void zzc(String string2) {
        this.zza.zzo(string2);
    }
}

