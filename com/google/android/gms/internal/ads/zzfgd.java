/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzbgd;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzczn;
import com.google.android.gms.internal.ads.zzdeq;
import com.google.android.gms.internal.ads.zzdrm;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzfei;
import com.google.android.gms.internal.ads.zzffw;
import com.google.android.gms.internal.ads.zzfgb;
import com.google.android.gms.internal.ads.zzfgf;
import com.google.android.gms.internal.ads.zzfgg;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzgfp;

final class zzfgd
implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzfgf zzd;
    final /* synthetic */ zzfgg zze;

    public zzfgd(zzfgg zzfgg2, zzepr zzepr2, zzfmn zzfmn2, zzfmc zzfmc2, zzfgf zzfgf2) {
        this.zza = zzepr2;
        this.zzb = zzfmn2;
        this.zzc = zzfmc2;
        this.zzd = zzfgf2;
        this.zze = zzfgg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Throwable object) {
        Object object2 = (zzdrm)zzfgg.zze(this.zze).zzd();
        Object object3 = object2 == null ? zzfiq.zzb((Throwable)object, null) : ((zzdrm)object2).zzb().zza((Throwable)object);
        zzfgg zzfgg2 = this.zze;
        synchronized (zzfgg2) {
            Throwable throwable2;
            block7: {
                Object object4;
                block6: {
                    if (object2 != null) {
                        try {
                            object2 = ((zzdrm)object2).zza();
                            ((zzczn)object2).zzdB((zze)object3);
                            object2 = this.zze;
                            object2 = zzfgg.zzh((zzfgg)object2);
                            object4 = new zzfgb(this, (zze)object3);
                            object2.execute((Runnable)object4);
                            break block6;
                        }
                        catch (Throwable throwable2) {
                            break block7;
                        }
                    }
                    object2 = this.zze;
                    object2 = zzfgg.zzf((zzfgg)object2);
                    ((zzffw)object2).zzdB((zze)object3);
                    object2 = this.zze;
                    object4 = this.zzd;
                    object2 = zzfgg.zzd((zzfgg)object2, (zzfei)object4);
                    object2 = object2.zze();
                    object2 = ((zzdrm)object2).zzb();
                    object2 = ((zzcvx)object2).zzc();
                    ((zzdeq)object2).zzh();
                }
                int n3 = ((zze)object3).zza;
                object4 = "RewardedAdLoader.onFailure";
                zzfil.zzb(n3, (Throwable)object, (String)object4);
                object2 = this.zza;
                object2.zza();
                object2 = zzbgd.zzc;
                object2 = ((zzbfv)object2).zze();
                object2 = (Boolean)object2;
                n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                object4 = null;
                if (n3 != 0 && (object2 = this.zzb) != null) {
                    ((zzfmn)object2).zzc((zze)object3);
                    object3 = this.zzc;
                    object3.zzi((Throwable)object);
                    object3.zzh(false);
                    ((zzfmn)object2).zza((zzfmc)object3);
                    ((zzfmn)object2).zzi();
                } else {
                    object2 = this.zze;
                    object2 = zzfgg.zzg((zzfgg)object2);
                    zzfmc zzfmc2 = this.zzc;
                    zzfmc2.zza((zze)object3);
                    zzfmc2.zzi((Throwable)object);
                    zzfmc2.zzh(false);
                    object = zzfmc2.zzn();
                    ((zzfmq)object2).zzb((zzfmg)object);
                }
                return;
            }
            throw throwable2;
        }
    }
}

