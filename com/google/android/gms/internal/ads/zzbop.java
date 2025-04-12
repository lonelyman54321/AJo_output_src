/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzbov;

public final class zzbop
implements Predicate {
    public final /* synthetic */ zzblp zza;

    public /* synthetic */ zzbop(zzblp zzblp2) {
        this.zza = zzblp2;
    }

    public final boolean apply(Object object) {
        boolean bl2 = (object = (zzblp)object) instanceof zzbov;
        if (bl2) {
            zzblp zzblp2 = this.zza;
            boolean bl3 = (object = zzbov.zzb((zzbov)object)).equals(zzblp2);
            if (bl3) {
                return true;
            }
        }
        return false;
    }
}

