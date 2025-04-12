/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.overlay.zzp;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzk;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbls;
import com.google.android.gms.internal.ads.zzbuz;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdih;
import com.google.android.gms.internal.ads.zzdje;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzegk;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfgy;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;

final class zzejn
implements zzdjp {
    private final Context zza;
    private final VersionInfoParcel zzb;
    private final ListenableFuture zzc;
    private final zzfgt zzd;
    private final zzchd zze;
    private final zzfho zzf;
    private final zzbls zzg;
    private final boolean zzh;
    private final zzegk zzi;

    public zzejn(Context context, VersionInfoParcel versionInfoParcel, ListenableFuture listenableFuture, zzfgt zzfgt2, zzchd zzchd2, zzfho zzfho2, boolean bl2, zzbls zzbls2, zzegk zzegk2) {
        this.zza = context;
        this.zzb = versionInfoParcel;
        this.zzc = listenableFuture;
        this.zzd = zzfgt2;
        this.zze = zzchd2;
        this.zzf = zzfho2;
        this.zzg = zzbls2;
        this.zzh = bl2;
        this.zzi = zzegk2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zza(boolean bl2, Context context, zzczy zzczy2) {
        Object object;
        int n3;
        float f5;
        zzdje zzdje2;
        boolean bl3;
        Object object2;
        zzejn zzejn2 = this;
        Object object3 = (zzdih)zzgft.zzq(this.zzc);
        Object object4 = this.zze;
        boolean bl4 = true;
        object4.zzaq(bl4);
        boolean bl5 = this.zzh;
        boolean bl6 = false;
        if (bl5) {
            object2 = this.zzg;
            bl3 = bl5 = ((zzbls)object2).zze(false);
        } else {
            bl3 = false;
            zzdje2 = null;
        }
        zzu.zzp();
        object2 = zzejn2.zza;
        boolean bl7 = zzejn2.zzh;
        boolean bl8 = zzt.zzI((Context)object2);
        if (bl7) {
            object2 = zzejn2.zzg;
            bl7 = bl5 = ((zzbls)object2).zzd();
        } else {
            bl7 = false;
        }
        bl5 = zzejn2.zzh;
        if (bl5) {
            float f6;
            object2 = zzejn2.zzg;
            f5 = f6 = ((zzbls)object2).zza();
        } else {
            bl5 = false;
            float f7 = 0.0f;
            object2 = null;
            n3 = 0;
            f5 = 0.0f;
        }
        boolean bl9 = zzejn2.zzd.zzP;
        Object object5 = null;
        float f8 = 0.0f / 0.0f;
        object2 = object4;
        bl6 = bl3;
        bl3 = bl8;
        float f11 = f5;
        n3 = -1;
        f5 = f8;
        object4 = new zzk(bl6, bl8, bl7, f11, n3, bl2, bl9, false);
        if (zzczy2 != null) {
            zzczy2.zzf();
        }
        zzu.zzi();
        zzdje2 = ((zzdih)object3).zzh();
        zzchd zzchd2 = zzejn2.zze;
        object3 = zzejn2.zzd;
        VersionInfoParcel versionInfoParcel = zzejn2.zzb;
        n3 = ((zzfgt)object3).zzR;
        String string2 = ((zzfgt)object3).zzC;
        object2 = ((zzfgt)object3).zzt;
        String string3 = ((zzfgy)object2).zzb;
        String string4 = ((zzfgy)object2).zza;
        object2 = zzejn2.zzf;
        boolean bl10 = ((zzfgt)object3).zzaj;
        if (bl10) {
            object3 = zzejn2.zzi;
        } else {
            bl10 = false;
            object3 = null;
        }
        Object object6 = object3;
        object3 = ((zzfho)object2).zzf;
        object2 = object;
        object5 = object4;
        object4 = object;
        object = object3;
        ((AdOverlayInfoParcel)object2)(null, (zzp)zzdje2, null, zzchd2, n3, versionInfoParcel, string2, (zzk)object5, string3, string4, (String)object3, zzczy2, (zzbuz)object6);
        object3 = context;
        zzn.zza(context, (AdOverlayInfoParcel)object2, bl4);
    }
}

