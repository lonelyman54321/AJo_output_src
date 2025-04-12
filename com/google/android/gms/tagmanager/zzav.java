/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.zzar;
import com.google.android.gms.tagmanager.zzaz;
import java.util.List;

final class zzav
implements Runnable {
    final /* synthetic */ zzar zza;
    final /* synthetic */ zzaz zzb;

    public zzav(zzaz zzaz2, zzar zzar2) {
        this.zza = zzar2;
        this.zzb = zzaz2;
    }

    public final void run() {
        Object object = this.zzb;
        zzar zzar2 = this.zza;
        object = zzaz.zzf((zzaz)object);
        zzar2.zza((List)object);
    }
}

