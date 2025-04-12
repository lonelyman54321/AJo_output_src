/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Looper
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbca;
import com.google.android.gms.internal.ads.zzbcn;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzccc;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcrn;
import com.google.android.gms.internal.ads.zzcuo;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdgm;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfrp;

public final class zzcrz
extends zzcup {
    private final zzchd zzc;
    private final int zzd;
    private final Context zze;
    private final zzcrn zzf;
    private final zzdjp zzg;
    private final zzdgm zzh;
    private final zzczy zzi;
    private final boolean zzj;
    private final zzccc zzk;
    private boolean zzl = false;

    public zzcrz(zzcuo object, Context context, zzchd zzchd2, int n3, zzcrn zzcrn2, zzdjp zzdjp2, zzdgm zzdgm2, zzczy zzczy2, zzccc zzccc2) {
        super((zzcuo)object);
        boolean bl2;
        this.zzc = zzchd2;
        this.zze = context;
        this.zzd = n3;
        this.zzf = zzcrn2;
        this.zzg = zzdjp2;
        this.zzh = zzdgm2;
        this.zzi = zzczy2;
        object = zzbep.zzfs;
        this.zzj = bl2 = ((Boolean)zzba.zzc().zza((zzbeg)object)).booleanValue();
        this.zzk = zzccc2;
    }

    public final int zza() {
        return this.zzd;
    }

    public final void zzb() {
        super.zzb();
        zzchd zzchd2 = this.zzc;
        if (zzchd2 != null) {
            zzchd2.destroy();
        }
    }

    public final void zzc(zzbca zzbca2) {
        zzchd zzchd2 = this.zzc;
        if (zzchd2 != null) {
            zzchd2.zzak(zzbca2);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zzd(Activity object, zzbcn object2, boolean bl2) {
        zzdjo zzdjo22;
        block13: {
            block12: {
                zzccc zzccc2;
                int n3;
                int n4;
                if (object == null) {
                    object = this.zze;
                }
                if ((n4 = this.zzj) != 0) {
                    object2 = this.zzh;
                    ((zzdgm)object2).zzb();
                }
                object2 = zzbep.zzaC;
                Object object3 = zzba.zzc();
                object2 = (Boolean)((zzben)object3).zza((zzbeg)object2);
                n4 = ((Boolean)object2).booleanValue();
                if (n4 != 0) {
                    zzu.zzp();
                    n4 = zzt.zzG((Context)object);
                    if (n4 != 0) {
                        zzm.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                        this.zzi.zzb();
                        object2 = zzbep.zzaD;
                        zzben zzben2 = zzba.zzc();
                        object2 = (Boolean)zzben2.zza((zzbeg)object2);
                        n4 = ((Boolean)object2).booleanValue();
                        if (n4 == 0) return;
                        object = object.getApplicationContext();
                        zzben2 = zzu.zzt().zzb();
                        object2 = new zzfrp((Context)object, (Looper)zzben2);
                        object = this.zza.zzb.zzb.zzb;
                        ((zzfrp)object2).zza((String)object);
                        return;
                    }
                }
                object2 = zzbep.zzlQ;
                object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
                n4 = ((Boolean)object2).booleanValue();
                object3 = null;
                if (n4 != 0 && (object2 = this.zzc) != null && (object2 = object2.zzD()) != null && (n3 = (int)(((zzfgt)object2).zzas ? 1 : 0)) != 0 && (n4 = ((zzfgt)object2).zzat) != (n3 = (zzccc2 = this.zzk).zzb())) {
                    zzm.zzj("The app open consent form has been shown.");
                    object = this.zzi;
                    object2 = zzfiq.zzd(12, "The consent form has already been shown.", null);
                    ((zzczy)object).zza((zze)object2);
                    return;
                }
                n4 = this.zzl;
                if (n4 != 0) {
                    zzm.zzj("App open interstitial ad is already visible.");
                    object2 = this.zzi;
                    n3 = 10;
                    object3 = zzfiq.zzd(n3, null, null);
                    ((zzczy)object2).zza((zze)object3);
                }
                if ((n4 = this.zzl) != 0) return;
                try {
                    object2 = this.zzg;
                }
                catch (zzdjo zzdjo22) {
                    break block13;
                }
                object3 = this.zzi;
                object2.zza(bl2, (Context)object, (zzczy)object3);
                boolean bl3 = this.zzj;
                if (!bl3) break block12;
                object = this.zzh;
                ((zzdgm)object).zza();
            }
            this.zzl = true;
            return;
        }
        object2 = this.zzi;
        ((zzczy)object2).zzc(zzdjo22);
    }

    public final void zze(long l2, int n3) {
        this.zzf.zza(l2, n3);
    }
}

