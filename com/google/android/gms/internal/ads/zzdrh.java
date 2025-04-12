/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbyx;
import com.google.android.gms.internal.ads.zzbzr;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcuo;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcvk;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdbf;
import com.google.android.gms.internal.ads.zzdgm;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzdrg;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfhh;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfrp;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class zzdrh
extends zzcup {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdjp zze;
    private final zzdgm zzf;
    private final zzczy zzg;
    private final zzdbf zzh;
    private final zzcvk zzi;
    private final zzbyx zzj;
    private final zzfrp zzk;
    private final zzfhh zzl;
    private boolean zzm = false;

    public zzdrh(zzcuo object, Context object2, zzchd object3, zzdjp zzdjp2, zzdgm zzdgm2, zzczy zzczy2, zzdbf zzdbf2, zzcvk zzcvk2, zzfgt zzfgt2, zzfrp zzfrp2, zzfhh zzfhh2) {
        super((zzcuo)object);
        this.zzc = object2;
        this.zze = zzdjp2;
        object = new WeakReference(object3);
        this.zzd = object;
        this.zzf = zzdgm2;
        this.zzg = zzczy2;
        this.zzh = zzdbf2;
        this.zzi = zzcvk2;
        this.zzk = zzfrp2;
        object2 = zzfgt2.zzm;
        object3 = object2 != null ? object2.zza : "";
        int n3 = object2 != null ? object2.zzb : 1;
        this.zzj = object = new zzbzr((String)object3, n3);
        this.zzl = zzfhh2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void finalize() {
        Throwable throwable2;
        block6: {
            block5: {
                Object object;
                block4: {
                    try {
                        object = this.zzd;
                        object = ((Reference)object).get();
                        object = (zzchd)object;
                        Object object2 = zzbep.zzgU;
                        Object object3 = zzba.zzc();
                        object2 = ((zzben)object3).zza((zzbeg)object2);
                        object2 = (Boolean)object2;
                        boolean bl2 = (Boolean)object2;
                        if (!bl2) break block4;
                        bl2 = this.zzm;
                        if (!bl2 && object != null) {
                            object2 = zzcci.zze;
                            object3 = new zzdrg((zzchd)object);
                            object2.execute((Runnable)object3);
                        }
                        break block5;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                if (object != null) {
                    object.destroy();
                }
            }
            super.finalize();
            return;
        }
        super.finalize();
        throw throwable2;
    }

    public final Bundle zza() {
        return this.zzh.zzb();
    }

    public final zzbyx zzc() {
        return this.zzj;
    }

    public final zzfhh zzd() {
        return this.zzl;
    }

    public final boolean zze() {
        return this.zzi.zzg();
    }

    public final boolean zzf() {
        return this.zzm;
    }

    public final boolean zzg() {
        boolean bl2;
        zzchd zzchd2 = (zzchd)this.zzd.get();
        return zzchd2 != null && !(bl2 = zzchd2.zzaG());
    }

    public final boolean zzh(boolean bl2, Activity object) {
        Object object2 = zzbep.zzaC;
        object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        boolean bl3 = (Boolean)object2;
        if (bl3) {
            zzu.zzp();
            object2 = this.zzc;
            bl3 = zzt.zzG((Context)object2);
            if (bl3) {
                com.google.android.gms.ads.internal.util.client.zzm.zzj("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzg.zzb();
                Object object3 = zzbep.zzaD;
                object = zzba.zzc();
                object3 = (Boolean)((zzben)object).zza((zzbeg)object3);
                bl2 = (Boolean)object3;
                if (bl2) {
                    object3 = this.zzk;
                    object = this.zza.zzb.zzb.zzb;
                    ((zzfrp)object3).zza((String)object);
                }
                return false;
            }
        }
        if (bl3 = this.zzm) {
            com.google.android.gms.ads.internal.util.client.zzm.zzj("The rewarded ad have been showed.");
            zzczy zzczy2 = this.zzg;
            object = zzfiq.zzd(10, null, null);
            zzczy2.zza((zze)object);
            return false;
        }
        this.zzm = bl3 = true;
        Object object4 = this.zzf;
        ((zzdgm)object4).zzb();
        if (object == null) {
            object = this.zzc;
        }
        try {
            object4 = this.zze;
        }
        catch (zzdjo zzdjo2) {
            this.zzg.zzc(zzdjo2);
            return false;
        }
        zzczy zzczy3 = this.zzg;
        object4.zza(bl2, (Context)object, zzczy3);
        zzdgm zzdgm2 = this.zzf;
        zzdgm2.zza();
        return bl3;
    }
}

