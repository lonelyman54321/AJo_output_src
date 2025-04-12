/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.zzaa;
import com.google.android.gms.internal.common.zzak;
import java.util.AbstractCollection;
import java.util.List;

final class zzy {
    private String zza = null;
    private long zzb = -1;
    private zzak zzc;
    private zzak zzd;

    public zzy() {
        zzak zzak2;
        this.zzc = zzak2 = zzak.zzl();
        this.zzd = zzak2 = zzak.zzl();
    }

    public final zzy zza(long l2) {
        this.zzb = l2;
        return this;
    }

    public final zzy zzb(List list) {
        Preconditions.checkNotNull(list);
        list = zzak.zzk(list);
        this.zzd = list;
        return this;
    }

    public final zzy zzc(List list) {
        Preconditions.checkNotNull(list);
        list = zzak.zzk(list);
        this.zzc = list;
        return this;
    }

    public final zzy zzd(String string2) {
        this.zza = string2;
        return this;
    }

    public final zzaa zze() {
        Object object = this.zza;
        if (object != null) {
            long l2 = this.zzb;
            long l3 = 0L;
            long l4 = l2 - l3;
            Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
            if (object2 >= 0) {
                object = this.zzc;
                boolean bl2 = ((AbstractCollection)object).isEmpty();
                if (bl2 && (bl2 = ((AbstractCollection)(object = this.zzd)).isEmpty())) {
                    object = new IllegalStateException("Either orderedTestCerts or orderedProdCerts must have at least one cert");
                    throw object;
                }
                String string2 = this.zza;
                long l7 = this.zzb;
                zzak zzak2 = this.zzc;
                zzak zzak3 = this.zzd;
                object = new zzaa(string2, l7, zzak2, zzak3, null);
                return object;
            }
            object = new IllegalStateException("minimumStampedVersionNumber must be greater than or equal to 0");
            throw object;
        }
        object = new IllegalStateException("packageName must be defined");
        throw object;
    }
}

