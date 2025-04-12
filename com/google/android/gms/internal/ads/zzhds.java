/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzt;
import com.google.android.gms.internal.ads.zzgzv;
import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhdw;
import com.google.android.gms.internal.ads.zzhdy;
import java.util.NoSuchElementException;

final class zzhds
extends zzgzt {
    final zzhdw zza;
    zzgzv zzb;
    final /* synthetic */ zzhdy zzc;

    public zzhds(zzhdy object) {
        zzhdw zzhdw2;
        this.zzc = object;
        this.zza = zzhdw2 = new zzhdw((zzhac)object, null);
        this.zzb = object = this.zzb();
    }

    private final zzgzv zzb() {
        zzhdw zzhdw2 = this.zza;
        boolean bl2 = zzhdw2.hasNext();
        if (bl2) {
            return zzhdw2.zza().zzs();
        }
        return null;
    }

    public final boolean hasNext() {
        zzgzv zzgzv2 = this.zzb;
        return zzgzv2 != null;
    }

    public final byte zza() {
        Object object = this.zzb;
        if (object != null) {
            byte by2 = object.zza();
            zzgzv zzgzv2 = this.zzb;
            boolean bl2 = zzgzv2.hasNext();
            if (!bl2) {
                this.zzb = zzgzv2 = this.zzb();
            }
            return by2;
        }
        object = new NoSuchElementException();
        throw object;
    }
}

