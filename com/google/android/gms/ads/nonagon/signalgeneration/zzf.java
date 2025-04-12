/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 */
package com.google.android.gms.ads.nonagon.signalgeneration;

import android.util.Pair;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.ads.nonagon.signalgeneration.zze;
import com.google.android.gms.ads.nonagon.signalgeneration.zzg;
import com.google.android.gms.ads.nonagon.signalgeneration.zzp;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzdvh;

public final class zzf
extends QueryInfoGenerationCallback {
    private final zze zza;
    private final zzdvh zzb;
    private final boolean zzc;
    private final int zzd;
    private final long zze;
    private final Boolean zzf;

    public zzf(zze zze2, boolean bl2, int n3, Boolean bl3, zzdvh zzdvh2) {
        long l2;
        this.zza = zze2;
        this.zzc = bl2;
        this.zzd = n3;
        this.zzf = bl3;
        this.zzb = zzdvh2;
        this.zze = l2 = zzu.zzB().currentTimeMillis();
    }

    private static long zza() {
        long l2 = zzu.zzB().currentTimeMillis();
        zzbeg zzbeg2 = zzbep.zzjR;
        return (Long)zzba.zzc().zza(zzbeg2) + l2;
    }

    private final long zzb() {
        long l2 = zzu.zzB().currentTimeMillis();
        long l3 = this.zze;
        return l2 - l3;
    }

    public final void onFailure(String object) {
        Object object2 = new Pair((Object)"sgf_reason", object);
        Pair pair = new Pair((Object)"se", (Object)"query_g");
        String string2 = AdFormat.BANNER.name();
        String string3 = "ad_format";
        Pair pair2 = new Pair((Object)string3, (Object)string2);
        int n3 = 6;
        String string4 = Integer.toString(n3);
        string2 = new Pair((Object)"rtype", (Object)string4);
        string4 = new Pair((Object)"scar", (Object)"true");
        long l2 = this.zzb();
        String string5 = Long.toString(l2);
        Pair pair3 = new Pair((Object)"lat_ms", (Object)string5);
        int n4 = this.zzd;
        String string6 = Integer.toString(n4);
        string5 = new Pair((Object)"sgpc_rn", (Object)string6);
        Object object3 = String.valueOf(this.zzf);
        string6 = new Pair((Object)"sgpc_lsu", object3);
        int n7 = 1;
        int n8 = (int)(this.zzc ? 1 : 0);
        object3 = n7 != n8 ? "0" : "1";
        Pair pair4 = new Pair((Object)"tpc", object3);
        object3 = new Pair[9];
        object3[0] = object2;
        object3[n7] = pair;
        object3[2] = pair2;
        object3[3] = string2;
        object3[4] = string4;
        object3[5] = pair3;
        object3[n3] = string5;
        object3[7] = string6;
        object3[8] = pair4;
        zzp.zzd(this.zzb, null, "sgpcf", object3);
        long l3 = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza();
        n4 = this.zzd;
        string2 = object2;
        string4 = object;
        object2 = new zzg(null, (String)object, l3, n4);
        object = this.zza;
        boolean bl2 = this.zzc;
        ((zze)object).zzf(bl2, (zzg)object2);
    }

    public final void onSuccess(QueryInfo queryInfo) {
        zzf zzf2 = this;
        Object object = new Pair((Object)"se", (Object)"query_g");
        String string2 = AdFormat.BANNER.name();
        String string3 = "ad_format";
        Object object2 = new Pair((Object)string3, (Object)string2);
        int n3 = 6;
        String string4 = Integer.toString(n3);
        string2 = new Pair((Object)"rtype", (Object)string4);
        string4 = new Pair((Object)"scar", (Object)"true");
        long l2 = this.zzb();
        String string5 = Long.toString(l2);
        Pair pair = new Pair((Object)"lat_ms", (Object)string5);
        int n4 = this.zzd;
        String string6 = Integer.toString(n4);
        string5 = new Pair((Object)"sgpc_rn", (Object)string6);
        Object object3 = String.valueOf(this.zzf);
        string6 = new Pair((Object)"sgpc_lsu", object3);
        int n7 = 1;
        int n8 = (int)(this.zzc ? 1 : 0);
        object3 = n7 != n8 ? "0" : "1";
        Pair pair2 = new Pair((Object)"tpc", object3);
        object3 = new Pair[8];
        object3[0] = object;
        object3[n7] = object2;
        object3[2] = string2;
        object3[3] = string4;
        object3[4] = pair;
        object3[5] = string5;
        object3[n3] = string6;
        object3[7] = pair2;
        zzp.zzd(zzf2.zzb, null, "sgpcs", object3);
        long l3 = com.google.android.gms.ads.nonagon.signalgeneration.zzf.zza();
        int n10 = zzf2.zzd;
        pair2 = object;
        object = new zzg(queryInfo, "", l3, n10);
        object2 = zzf2.zza;
        boolean bl2 = zzf2.zzc;
        ((zze)object2).zzf(bl2, (zzg)object);
    }
}

