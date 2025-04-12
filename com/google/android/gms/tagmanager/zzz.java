/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.Container;
import com.google.android.gms.tagmanager.zzag;

final class zzz {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzag zzb;
    private Long zzc;

    public zzz(zzag zzag2, boolean bl2) {
        this.zza = bl2;
        this.zzb = zzag2;
    }

    public final boolean zza(Container object) {
        boolean bl2 = this.zza;
        boolean bl3 = true;
        if (bl2) {
            long l2;
            long l3;
            long l4;
            long l7 = ((Container)object).getLastRefreshTime();
            object = this.zzc;
            if (object == null) {
                l4 = zzag.zzf(this.zzb).zza();
                this.zzc = object = Long.valueOf(l4);
            }
            if ((l3 = (l2 = (l4 = this.zzc + l7) - (l7 = (object = zzag.zzc(this.zzb)).currentTimeMillis())) == 0L ? 0 : (l2 < 0L ? -1 : 1)) >= 0) {
                return bl3;
            }
            return false;
        }
        boolean bl4 = ((Container)object).isDefault();
        if (!bl4) {
            return bl3;
        }
        return false;
    }
}

