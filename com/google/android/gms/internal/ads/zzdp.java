/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdm;
import com.google.android.gms.internal.ads.zzdo;
import com.google.android.gms.internal.ads.zzgbc;
import com.google.android.gms.internal.ads.zzn;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.List;

public final class zzdp {
    public static final zzdp zza;
    public static final zzn zzb;
    private static final String zzc;
    private final zzgbc zzd;

    static {
        zzgbc zzgbc2 = zzgbc.zzm();
        Object object = new zzdp(zzgbc2);
        zza = object;
        zzc = Integer.toString(0, 36);
        zzb = object = new zzdm();
    }

    public zzdp(List list) {
        list = zzgbc.zzk(list);
        this.zzd = list;
    }

    public final boolean equals(Object object) {
        Serializable serializable;
        Class<zzdp> clazz;
        if (this == object) {
            return true;
        }
        if (object != null && (clazz = zzdp.class) == (serializable = object.getClass())) {
            object = (zzdp)object;
            serializable = this.zzd;
            object = ((zzdp)object).zzd;
            return ((zzgbc)serializable).equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return this.zzd.hashCode();
    }

    public final zzgbc zza() {
        return this.zzd;
    }

    public final boolean zzb(int n3) {
        Object object;
        int n4;
        for (int i3 = 0; i3 < (n4 = ((AbstractCollection)(object = this.zzd)).size()); ++i3) {
            object = (zzdo)this.zzd.get(i3);
            boolean bl2 = ((zzdo)object).zzc();
            if (!bl2 || (n4 = ((zzdo)object).zza()) != n3) continue;
            return true;
        }
        return false;
    }
}

