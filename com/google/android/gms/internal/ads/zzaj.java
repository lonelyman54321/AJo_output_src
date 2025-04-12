/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzas;
import java.util.function.Predicate;

public final class zzaj
implements Predicate {
    public final /* synthetic */ zzal zza;

    public /* synthetic */ zzaj(zzal zzal2) {
        this.zza = zzal2;
    }

    public final boolean test(Object object) {
        object = (zzas)object;
        Object object2 = zzan.zza;
        object = ((zzas)object).zzb;
        object2 = zzal.zzai(this.zza);
        return ((String)object).equals(object2);
    }
}

