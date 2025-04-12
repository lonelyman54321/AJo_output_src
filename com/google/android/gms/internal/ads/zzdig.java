/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzt;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzccc;
import com.google.android.gms.internal.ads.zzcci;
import com.google.android.gms.internal.ads.zzchd;
import com.google.android.gms.internal.ads.zzcuo;
import com.google.android.gms.internal.ads.zzcup;
import com.google.android.gms.internal.ads.zzcvk;
import com.google.android.gms.internal.ads.zzczy;
import com.google.android.gms.internal.ads.zzdgm;
import com.google.android.gms.internal.ads.zzdif;
import com.google.android.gms.internal.ads.zzdjo;
import com.google.android.gms.internal.ads.zzdjp;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfrp;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

public final class zzdig
extends zzcup {
    private final Context zzc;
    private final WeakReference zzd;
    private final zzdgm zze;
    private final zzdjp zzf;
    private final zzcvk zzg;
    private final zzfrp zzh;
    private final zzczy zzi;
    private final zzccc zzj;
    private boolean zzk = false;

    public zzdig(zzcuo weakReference, Context context, zzchd zzchd2, zzdgm zzdgm2, zzdjp zzdjp2, zzcvk zzcvk2, zzfrp zzfrp2, zzczy zzczy2, zzccc zzccc2) {
        super((zzcuo)((Object)weakReference));
        this.zzc = context;
        this.zzd = weakReference = new WeakReference<zzchd>(zzchd2);
        this.zze = zzdgm2;
        this.zzf = zzdjp2;
        this.zzg = zzcvk2;
        this.zzh = zzfrp2;
        this.zzi = zzczy2;
        this.zzj = zzccc2;
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
                        bl2 = this.zzk;
                        if (!bl2 && object != null) {
                            object2 = zzcci.zze;
                            object3 = new zzdif((zzchd)object);
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

    public final boolean zza() {
        return this.zzg.zzg();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zzc(boolean bl2, Activity object) {
        this.zze.zzb();
        Object object2 = zzbep.zzaC;
        object2 = (Boolean)zzba.zzc().zza((zzbeg)object2);
        int n3 = ((Boolean)object2).booleanValue();
        if (n3 != 0) {
            zzu.zzp();
            object2 = this.zzc;
            n3 = zzt.zzG((Context)object2);
            if (n3 != 0) {
                zzm.zzj("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.zzi.zzb();
                Object object3 = zzbep.zzaD;
                object = zzba.zzc();
                object3 = (Boolean)((zzben)object).zza((zzbeg)object3);
                bl2 = (Boolean)object3;
                if (!bl2) return false;
                object3 = this.zzh;
                object = this.zza.zzb.zzb.zzb;
                ((zzfrp)object3).zza((String)object);
                return false;
            }
        }
        object2 = (zzchd)this.zzd.get();
        Object object4 = zzbep.zzlQ;
        object4 = (Boolean)zzba.zzc().zza((zzbeg)object4);
        int n4 = ((Boolean)object4).booleanValue();
        if (n4 != 0 && object2 != null && (object2 = object2.zzD()) != null && (n4 = ((zzfgt)object2).zzas) != 0 && (n3 = ((zzfgt)object2).zzat) != (n4 = ((zzccc)(object4 = this.zzj)).zzb())) {
            zzm.zzj("The interstitial consent form has been shown.");
            zzczy zzczy2 = this.zzi;
            int n7 = 12;
            object2 = "The consent form has already been shown.";
            object = zzfiq.zzd(n7, (String)object2, null);
            zzczy2.zza((zze)object);
            return false;
        }
        n3 = this.zzk;
        if (n3 != 0) {
            zzm.zzj("The interstitial ad has been shown.");
            object2 = this.zzi;
            n4 = 10;
            object4 = zzfiq.zzd(n4, null, null);
            ((zzczy)object2).zza((zze)object4);
        }
        if ((n3 = this.zzk) != 0) return false;
        if (object == null) {
            object = this.zzc;
        }
        try {
            object2 = this.zzf;
            object4 = this.zzi;
            object2.zza(bl2, (Context)object, (zzczy)object4);
            zzdgm zzdgm2 = this.zze;
            zzdgm2.zza();
            this.zzk = bl2 = true;
            return bl2;
        }
        catch (zzdjo zzdjo2) {
            object = this.zzi;
            ((zzczy)object).zzc(zzdjo2);
        }
        return false;
    }
}

