/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.zzbg;
import com.google.android.gms.measurement.internal.zzbl;

public final class zzgs {
    public String zza;
    public String zzb;
    public Bundle zzc;
    private long zzd;

    public zzgs(String string2, String string3, Bundle bundle, long l2) {
        this.zza = string2;
        this.zzb = string3;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.zzc = bundle;
        this.zzd = l2;
    }

    public static zzgs zza(zzbl zzbl2) {
        String string2 = zzbl2.zza;
        String string3 = zzbl2.zzc;
        Bundle bundle = zzbl2.zzb.zzb();
        long l2 = zzbl2.zzd;
        zzgs zzgs2 = new zzgs(string2, string3, bundle, l2);
        return zzgs2;
    }

    public final String toString() {
        CharSequence charSequence = this.zzb;
        String string2 = this.zza;
        String string3 = String.valueOf(this.zzc);
        charSequence = og_1.a("origin=", (String)charSequence, ",name=", string2, ",params=");
        ((StringBuilder)charSequence).append(string3);
        return ((StringBuilder)charSequence).toString();
    }

    public final zzbl zza() {
        zzbl zzbl2;
        String string2 = this.zza;
        Object object = this.zzc;
        Object object2 = new Bundle(object);
        zzbg zzbg2 = new zzbg((Bundle)object2);
        object = this.zzb;
        long l2 = this.zzd;
        object2 = zzbl2;
        zzbl2 = new zzbl(string2, zzbg2, (String)object, l2);
        return zzbl2;
    }
}

