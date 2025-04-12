/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzbd;
import com.google.android.gms.internal.ads.zzbpt;
import com.google.android.gms.internal.ads.zzbpx;
import com.google.android.gms.internal.ads.zzbpz;
import com.google.android.gms.internal.ads.zzbqa;
import com.google.android.gms.internal.ads.zzbqf;
import com.google.android.gms.internal.ads.zzbqg;
import com.google.android.gms.internal.ads.zzbql;
import com.google.android.gms.internal.ads.zzbqq;
import com.google.android.gms.internal.ads.zzfmq;

public final class zzbqh {
    static final zzbd zza;
    static final zzbd zzb;
    private final zzbpt zzc;

    static {
        zzbd zzbd2 = new zzbqf();
        zza = zzbd2;
        zzbd2 = new zzbqg();
        zzb = zzbd2;
    }

    public zzbqh(Context context, VersionInfoParcel versionInfoParcel, String string2, zzfmq zzfmq2) {
        zzbpt zzbpt2;
        zzbd zzbd2 = zza;
        zzbd zzbd3 = zzb;
        this.zzc = zzbpt2 = new zzbpt(context, versionInfoParcel, string2, zzbd2, zzbd3, zzfmq2);
    }

    public final zzbpx zza(String string2, zzbqa zzbqa2, zzbpz zzbpz2) {
        zzbpt zzbpt2 = this.zzc;
        zzbql zzbql2 = new zzbql(zzbpt2, string2, zzbqa2, zzbpz2);
        return zzbql2;
    }

    public final zzbqq zzb() {
        zzbpt zzbpt2 = this.zzc;
        zzbqq zzbqq2 = new zzbqq(zzbpt2);
        return zzbqq2;
    }
}

