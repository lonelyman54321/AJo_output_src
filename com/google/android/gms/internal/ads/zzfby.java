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
import com.google.android.gms.internal.ads.zzcrp;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzczn;
import com.google.android.gms.internal.ads.zzdeq;
import com.google.android.gms.internal.ads.zzepr;
import com.google.android.gms.internal.ads.zzfbx;
import com.google.android.gms.internal.ads.zzfca;
import com.google.android.gms.internal.ads.zzfcb;
import com.google.android.gms.internal.ads.zzfcr;
import com.google.android.gms.internal.ads.zzfei;
import com.google.android.gms.internal.ads.zzfil;
import com.google.android.gms.internal.ads.zzfiq;
import com.google.android.gms.internal.ads.zzfmc;
import com.google.android.gms.internal.ads.zzfmg;
import com.google.android.gms.internal.ads.zzfmn;
import com.google.android.gms.internal.ads.zzfmq;
import com.google.android.gms.internal.ads.zzgfp;

final class zzfby
implements zzgfp {
    final /* synthetic */ zzepr zza;
    final /* synthetic */ zzfmn zzb;
    final /* synthetic */ zzfmc zzc;
    final /* synthetic */ zzfca zzd;
    final /* synthetic */ zzfcb zze;

    public zzfby(zzfcb zzfcb2, zzepr zzepr2, zzfmn zzfmn2, zzfmc zzfmc2, zzfca zzfca2) {
        this.zza = zzepr2;
        this.zzb = zzfmn2;
        this.zzc = zzfmc2;
        this.zzd = zzfca2;
        this.zze = zzfcb2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(Throwable object) {
        Object object2 = (zzcrp)zzfcb.zzg(this.zze).zzd();
        Object object3 = null;
        Object object4 = object2 == null ? zzfiq.zzb((Throwable)object, null) : object2.zzb().zza((Throwable)object);
        zzfcb zzfcb2 = this.zze;
        synchronized (zzfcb2) {
            Throwable throwable2;
            block8: {
                int n3;
                Object object5;
                block7: {
                    block6: {
                        try {
                            object5 = this.zze;
                            zzfcb.zzj((zzfcb)object5, null);
                            if (object2 == null) break block6;
                            object2 = object2.zzc();
                            ((zzczn)object2).zzdB((zze)object4);
                            object2 = zzbep.zzil;
                            object3 = zzba.zzc();
                            object2 = ((zzben)object3).zza((zzbeg)object2);
                            object2 = (Boolean)object2;
                            n3 = ((Boolean)object2).booleanValue();
                            if (n3 != 0) {
                                object2 = this.zze;
                                object2 = zzfcb.zzi((zzfcb)object2);
                                object3 = new zzfbx(this, (zze)object4);
                                object2.execute((Runnable)object3);
                            }
                            break block7;
                        }
                        catch (Throwable throwable2) {
                            break block8;
                        }
                    }
                    object2 = this.zze;
                    object2 = zzfcb.zzf((zzfcb)object2);
                    ((zzfcr)object2).zzdB((zze)object4);
                    object2 = this.zze;
                    object3 = this.zzd;
                    object2 = zzfcb.zzd((zzfcb)object2, (zzfei)object3);
                    object2 = object2.zzh();
                    object2 = object2.zzb();
                    object2 = ((zzcvx)object2).zzc();
                    ((zzdeq)object2).zzh();
                }
                n3 = ((zze)object4).zza;
                object3 = "AppOpenAdLoader.onFailure";
                zzfil.zzb(n3, (Throwable)object, (String)object3);
                object2 = this.zza;
                object2.zza();
                object2 = zzbgd.zzc;
                object2 = ((zzbfv)object2).zze();
                object2 = (Boolean)object2;
                n3 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
                object3 = null;
                if (n3 != 0 && (object2 = this.zzb) != null) {
                    ((zzfmn)object2).zzc((zze)object4);
                    object4 = this.zzc;
                    object4.zzi((Throwable)object);
                    object4.zzh(false);
                    ((zzfmn)object2).zza((zzfmc)object4);
                    ((zzfmn)object2).zzi();
                } else {
                    object2 = this.zze;
                    object2 = zzfcb.zzh((zzfcb)object2);
                    object5 = this.zzc;
                    object5.zza((zze)object4);
                    object5.zzi((Throwable)object);
                    object5.zzh(false);
                    object = object5.zzn();
                    ((zzfmq)object2).zzb((zzfmg)object);
                }
                return;
            }
            throw throwable2;
        }
    }
}

