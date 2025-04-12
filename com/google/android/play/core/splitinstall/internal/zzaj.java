/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.splitinstall.internal;

import com.google.android.play.core.splitinstall.internal.zzak;
import com.google.android.play.core.splitinstall.internal.zzam;
import com.google.android.play.core.splitinstall.zzf;
import java.util.List;

final class zzaj
implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ zzf zzb;
    final /* synthetic */ zzak zzc;

    public zzaj(zzak zzak2, List list, zzf zzf2) {
        this.zzc = zzak2;
        this.zza = list;
        this.zzb = zzf2;
    }

    public final void run() {
        Object object;
        Object object2;
        block5: {
            try {
                object2 = this.zzc;
            }
            catch (Exception exception) {
                this.zzb.zzb(-11);
                return;
            }
            object2 = zzak.zza((zzak)object2);
            object = this.zza;
            boolean bl2 = ((zzam)object2).zzb((List)object);
            if (!bl2) break block5;
            object2 = this.zzc;
            object = this.zzb;
            zzak.zzc((zzak)object2, (zzf)object);
            return;
        }
        object2 = this.zzc;
        object = this.zza;
        zzf zzf2 = this.zzb;
        zzak.zzb((zzak)object2, (List)object, zzf2);
    }
}

