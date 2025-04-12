/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.TrafficStats
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzab;
import com.google.android.gms.ads.internal.zza;
import com.google.android.gms.ads.internal.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbfe;
import com.google.android.gms.internal.ads.zzbfs;
import com.google.android.gms.internal.ads.zzchc;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzchl;
import com.google.android.gms.internal.ads.zzchv;
import com.google.android.gms.internal.ads.zzcic;
import com.google.android.gms.internal.ads.zzciw;
import com.google.android.gms.internal.ads.zzcix;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgw;
import com.google.android.gms.internal.ads.zzfhs;
import com.google.android.gms.internal.ads.zzfyw;

public final class zzchm
implements zzfyw {
    public final /* synthetic */ Context zza;
    public final /* synthetic */ zzcix zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ boolean zzd;
    public final /* synthetic */ boolean zze;
    public final /* synthetic */ zzaxd zzf;
    public final /* synthetic */ zzbfs zzg;
    public final /* synthetic */ VersionInfoParcel zzh;
    public final /* synthetic */ zzm zzi;
    public final /* synthetic */ zza zzj;
    public final /* synthetic */ zzbdm zzk;
    public final /* synthetic */ zzfgt zzl;
    public final /* synthetic */ zzfgw zzm;
    public final /* synthetic */ zzfhs zzn;
    public final /* synthetic */ zzegk zzo;

    public /* synthetic */ zzchm(Context context, zzcix zzcix2, String string2, boolean bl2, boolean bl3, zzaxd zzaxd2, zzbfs zzbfs2, VersionInfoParcel versionInfoParcel, zzbfe zzbfe2, zzm zzm2, zza zza2, zzbdm zzbdm2, zzfgt zzfgt2, zzfgw zzfgw2, zzfhs zzfhs2, zzegk zzegk2) {
        this.zza = context;
        this.zzb = zzcix2;
        this.zzc = string2;
        this.zzd = bl2;
        this.zze = bl3;
        this.zzf = zzaxd2;
        this.zzg = zzbfs2;
        this.zzh = versionInfoParcel;
        this.zzi = zzm2;
        this.zzj = zza2;
        this.zzk = zzbdm2;
        this.zzl = zzfgt2;
        this.zzm = zzfgw2;
        this.zzn = zzfhs2;
        this.zzo = zzegk2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object zza() {
        zzchm zzchm2 = this;
        Object object = this.zzb;
        String string2 = this.zzc;
        boolean bl2 = this.zzd;
        zzbdm zzbdm2 = this.zzk;
        boolean bl3 = this.zze;
        zzaxd zzaxd2 = this.zzf;
        Object object2 = this.zzl;
        zzbfs zzbfs2 = this.zzg;
        zzm zzm2 = this.zzi;
        Object object3 = this.zzm;
        Object object4 = this.zza;
        VersionInfoParcel versionInfoParcel = this.zzh;
        Object object5 = this.zzj;
        zzfhs zzfhs2 = this.zzn;
        zzegk zzegk2 = this.zzo;
        int n3 = 264;
        TrafficStats.setThreadStatsTag((int)n3);
        Object object6 = object5;
        try {
            zzciw zzciw2 = new zzciw((Context)object4);
            zzegk zzegk3 = zzegk2;
            zzciw zzciw3 = zzciw2;
            zzfhs zzfhs3 = zzfhs2;
            Object object7 = object5;
            object5 = null;
            Object object8 = object3;
            object3 = object6;
            object6 = object2;
            object2 = zzbdm2;
            Object object9 = object6;
            object6 = object8;
            object8 = zzfhs2;
            object4 = new zzcic(zzciw3, (zzcix)object, string2, bl2, bl3, zzaxd2, zzbfs2, versionInfoParcel, null, zzm2, (zza)object3, zzbdm2, (zzfgt)object9, (zzfgw)object6, zzfhs2);
            Object object10 = object7;
            ((zzchv)object7)((zzchd)object4);
            object4 = zzu.zzq();
            object = zzegk3;
            zzchl zzchl2 = ((zzab)object4).zzc((zzchd)object7, zzbdm2, bl3, zzegk3);
            object7.setWebViewClient(zzchl2);
            zzchc zzchc2 = new zzchc((zzchd)object7);
            object7.setWebChromeClient(zzchc2);
            return object7;
        }
        finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}

