/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdey;
import com.google.android.gms.internal.ads.zzdez;
import com.google.android.gms.internal.ads.zzdgb;
import com.google.android.gms.internal.ads.zzdgc;
import com.google.android.gms.internal.ads.zzdgd;
import com.google.android.gms.internal.ads.zzdge;
import com.google.android.gms.internal.ads.zzdgf;
import com.google.android.gms.internal.ads.zzdgg;
import com.google.android.gms.internal.ads.zzdgj;
import java.util.Set;

public final class zzdgh
extends zzdez
implements zzdgj {
    public zzdgh(Set set) {
        super(set);
    }

    public final void zza(String object) {
        object = new zzdgb("MalformedJson");
        this.zzq((zzdey)object);
    }

    public final void zzb(String string2, String string3) {
        zzdge zzdge2 = new zzdge(string2, string3);
        this.zzq(zzdge2);
    }

    public final void zzc(String string2) {
        zzdgd zzdgd2 = new zzdgd(string2);
        this.zzq(zzdgd2);
    }

    public final void zzd(String string2) {
        zzdgf zzdgf2 = new zzdgf(string2);
        this.zzq(zzdgf2);
    }

    public final void zze() {
        zzdgg zzdgg2 = new zzdgg();
        this.zzq(zzdgg2);
    }

    public final void zzf() {
        zzdgc zzdgc2 = new zzdgc();
        this.zzq(zzdgc2);
    }
}

