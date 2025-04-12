/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdvb;
import com.google.android.gms.internal.ads.zzdvc;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhf;

public final class zzcrn {
    private final zzdvc zza;
    private final zzfhf zzb;

    public zzcrn(zzdvc zzdvc2, zzfhf zzfhf2) {
        this.zza = zzdvc2;
        this.zzb = zzfhf2;
    }

    public final void zza(long l2, int n3) {
        int n4;
        zzdvb zzdvb2 = this.zza.zza();
        Object object = this.zzb.zzb.zzb;
        zzdvb2.zzd((zzfgw)object);
        String string2 = "ad_closed";
        zzdvb2.zzb("action", string2);
        object = "show_time";
        String string3 = String.valueOf(l2);
        zzdvb2.zzb((String)object, string3);
        string3 = "ad_format";
        String string4 = "app_open_ad";
        zzdvb2.zzb(string3, string4);
        string3 = (n3 += -1) != 0 ? (n3 != (n4 = 1) ? (n3 != (n4 = 2) ? (n3 != (n4 = 3) ? (n3 != (n4 = 4) ? "u" : "ac") : "cb") : "cc") : "bb") : "h";
        zzdvb2.zzb("acr", string3);
        zzdvb2.zzf();
    }
}

