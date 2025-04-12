/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzczn;
import com.google.android.gms.internal.ads.zzdjh;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzfer;
import com.google.android.gms.internal.ads.zzfes;
import com.google.android.gms.internal.ads.zzfew;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzgfp;

final class zzfev
implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzdjh zzd;
    final /* synthetic */ zzfew zze;

    public zzfev(zzfew zzfew2, zzepr zzepr2, zzfmn zzfmn2, zzfmc zzfmc2, zzdjh zzdjh2) {
        this.zza = zzepr2;
        this.zzb = zzfmn2;
        this.zzc = zzfmc2;
        this.zzd = zzdjh2;
        this.zze = zzfew2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Throwable object) {
        Object object2 = this.zzd.zza().zza((Throwable)object);
        zzfew zzfew2 = this.zze;
        synchronized (zzfew2) {
            Throwable throwable2;
            block6: {
                int n3;
                Object object3;
                Object object4;
                block5: {
                    try {
                        object4 = this.zze;
                        object3 = null;
                        zzfew.zzg((zzfew)object4, null);
                        object4 = this.zzd;
                        object4 = ((zzdjh)object4).zzb();
                        ((zzczn)object4).zzdB((zze)object2);
                        object4 = zzbep.zzim;
                        object3 = zzba.zzc();
                        object4 = ((zzben)object3).zza((zzbeg)object4);
                        object4 = (Boolean)object4;
                        n3 = ((Boolean)object4).booleanValue();
                        if (n3 == 0) break block5;
                        object4 = this.zze;
                        object4 = zzfew.zzf((zzfew)object4);
                        object3 = new zzfer(this, (zze)object2);
                        object4.execute((Runnable)object3);
                        object4 = this.zze;
                        object4 = zzfew.zzf((zzfew)object4);
                        object3 = new zzfes(this, (zze)object2);
                        object4.execute((Runnable)object3);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                n3 = ((zze)object2).zza;
                object3 = "InterstitialAdLoader.onFailure";
                zzfil.zzb(n3, (Throwable)object, (String)object3);
                object4 = this.zza;
                object4.zza();
                object4 = zzbgd.zzc;
                object4 = ((zzbfv)object4).zze();
                object4 = (Boolean)object4;
                n3 = (int)(((Boolean)object4).booleanValue() ? 1 : 0);
                object3 = null;
                if (n3 != 0 && (object4 = this.zzb) != null) {
                    ((zzfmn)object4).zzc((zze)object2);
                    object2 = this.zzc;
                    object2.zzi((Throwable)object);
                    object2.zzh(false);
                    ((zzfmn)object4).zza((zzfmc)object2);
                    ((zzfmn)object4).zzi();
                } else {
                    object4 = this.zze;
                    object4 = zzfew.zze((zzfew)object4);
                    zzfmc zzfmc2 = this.zzc;
                    zzfmc2.zza((zze)object2);
                    zzfmc2.zzi((Throwable)object);
                    zzfmc2.zzh(false);
                    object = zzfmc2.zzn();
                    ((zzfmq)object4).zzb((zzfmg)object);
                }
                return;
            }
            throw throwable2;
        }
    }
}

