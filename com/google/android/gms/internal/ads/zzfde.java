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
import com.google.android.gms.internal.ads.zzctg;
import com.google.android.gms.internal.ads.zzczn;
import com.google.android.gms.internal.ads.zzdca;
import com.google.android.gms.internal.ads.zzdeh;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzfdc;
import com.google.android.gms.internal.ads.zzfdf;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzgfp;

final class zzfde
implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzctg zzd;
    final /* synthetic */ zzfdf zze;

    public zzfde(zzfdf zzfdf2, zzepr zzepr2, zzfmn zzfmn2, zzfmc zzfmc2, zzctg zzctg2) {
        this.zza = zzepr2;
        this.zzb = zzfmn2;
        this.zzc = zzfmc2;
        this.zzd = zzctg2;
        this.zze = zzfdf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Throwable object) {
        Object object2 = this.zzd.zzd().zza((Throwable)object);
        zzfdf zzfdf2 = this.zze;
        synchronized (zzfdf2) {
            Throwable throwable2;
            block6: {
                int n3;
                Object object3;
                Object object4;
                block5: {
                    try {
                        object4 = this.zze;
                        object3 = null;
                        zzfdf.zzl((zzfdf)object4, null);
                        object4 = this.zzd;
                        object4 = ((zzctg)object4).zzf();
                        ((zzczn)object4).zzdB((zze)object2);
                        object4 = zzbep.zzik;
                        object3 = zzba.zzc();
                        object4 = ((zzben)object3).zza((zzbeg)object4);
                        object4 = (Boolean)object4;
                        n3 = ((Boolean)object4).booleanValue();
                        if (n3 == 0) break block5;
                        object4 = this.zze;
                        object4 = zzfdf.zzk((zzfdf)object4);
                        object3 = new zzfdc(this, (zze)object2);
                        object4.execute((Runnable)object3);
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object4 = this.zze;
                object3 = zzfdf.zze((zzfdf)object4);
                object4 = zzfdf.zzf((zzfdf)object4);
                n3 = ((zzdeh)object4).zzc();
                ((zzdca)object3).zzd(n3);
                n3 = ((zze)object2).zza;
                object3 = "BannerAdLoader.onFailure";
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
                    object4 = zzfdf.zzj((zzfdf)object4);
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

