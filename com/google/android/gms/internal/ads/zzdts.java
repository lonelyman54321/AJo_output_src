/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzbdl;
import com.google.android.gms.internal.ads.zzbdm;
import com.google.android.gms.internal.ads.zzbdo;
import com.google.android.gms.internal.ads.zzbdv$zzb;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzczo;
import com.google.android.gms.internal.ads.zzdaf;
import com.google.android.gms.internal.ads.zzdaz;
import com.google.android.gms.internal.ads.zzdcg;
import com.google.android.gms.internal.ads.zzdes;
import com.google.android.gms.internal.ads.zzdto;
import com.google.android.gms.internal.ads.zzdtp;
import com.google.android.gms.internal.ads.zzdtq;
import com.google.android.gms.internal.ads.zzdtr;
import com.google.android.gms.internal.ads.zzfeo;
import com.google.android.gms.internal.ads.zzfhf;

public final class zzdts
implements zzdcg,
zzdaz,
zzczo,
zzdaf,
zza,
zzdes {
    private final zzbdm zza;
    private boolean zzb = false;

    public zzdts(zzbdm zzbdm2, zzfeo object) {
        this.zza = zzbdm2;
        zzbdo zzbdo2 = zzbdo.zzb;
        zzbdm2.zzb(zzbdo2);
        if (object != null) {
            object = zzbdo.zzI;
            zzbdm2.zzb((zzbdo)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onAdClicked() {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                try {
                    boolean bl2 = this.zzb;
                    if (!bl2) {
                        zzbdm zzbdm2 = this.zza;
                        zzbdo zzbdo2 = zzbdo.zze;
                        zzbdm2.zzb(zzbdo2);
                        this.zzb = bl2 = true;
                        return;
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                zzbdm zzbdm3 = this.zza;
                zzbdo zzbdo3 = zzbdo.zzf;
                zzbdm3.zzb(zzbdo3);
                return;
            }
            throw throwable2;
        }
    }

    public final void zzdB(zze object) {
        int n3 = ((zze)object).zza;
        switch (n3) {
            default: {
                object = this.zza;
                zzbdo zzbdo2 = zzbdo.zzs;
                ((zzbdm)object).zzb(zzbdo2);
                return;
            }
            case 7: {
                object = this.zza;
                zzbdo zzbdo3 = zzbdo.zzz;
                ((zzbdm)object).zzb(zzbdo3);
                return;
            }
            case 6: {
                object = this.zza;
                zzbdo zzbdo4 = zzbdo.zzy;
                ((zzbdm)object).zzb(zzbdo4);
                return;
            }
            case 5: {
                object = this.zza;
                zzbdo zzbdo5 = zzbdo.zzx;
                ((zzbdm)object).zzb(zzbdo5);
                return;
            }
            case 4: {
                object = this.zza;
                zzbdo zzbdo6 = zzbdo.zzw;
                ((zzbdm)object).zzb(zzbdo6);
                return;
            }
            case 3: {
                object = this.zza;
                zzbdo zzbdo7 = zzbdo.zzt;
                ((zzbdm)object).zzb(zzbdo7);
                return;
            }
            case 2: {
                object = this.zza;
                zzbdo zzbdo8 = zzbdo.zzv;
                ((zzbdm)object).zzb(zzbdo8);
                return;
            }
            case 1: 
        }
        object = this.zza;
        zzbdo zzbdo9 = zzbdo.zzu;
        ((zzbdm)object).zzb(zzbdo9);
    }

    public final void zzdn(zzbxu zzbxu2) {
    }

    public final void zzdo(zzfhf zzfhf2) {
        zzdto zzdto2 = new zzdto(zzfhf2);
        this.zza.zzc(zzdto2);
    }

    public final void zzh() {
        zzbdm zzbdm2 = this.zza;
        zzbdo zzbdo2 = zzbdo.zzQ;
        zzbdm2.zzb(zzbdo2);
    }

    public final void zzi(zzbdv$zzb object) {
        Object object2 = new zzdtr((zzbdv$zzb)object);
        this.zza.zzc((zzbdl)object2);
        object = this.zza;
        object2 = zzbdo.zzK;
        ((zzbdm)object).zzb((zzbdo)object2);
    }

    public final void zzj(zzbdv$zzb object) {
        Object object2 = new zzdtp((zzbdv$zzb)object);
        this.zza.zzc((zzbdl)object2);
        object = this.zza;
        object2 = zzbdo.zzJ;
        ((zzbdm)object).zzb((zzbdo)object2);
    }

    public final void zzl(boolean bl2) {
        zzbdo zzbdo2 = bl2 ? zzbdo.zzO : zzbdo.zzP;
        this.zza.zzb(zzbdo2);
    }

    public final void zzm(zzbdv$zzb object) {
        Object object2 = new zzdtq((zzbdv$zzb)object);
        this.zza.zzc((zzbdl)object2);
        object = this.zza;
        object2 = zzbdo.zzL;
        ((zzbdm)object).zzb((zzbdo)object2);
    }

    public final void zzn(boolean bl2) {
        zzbdo zzbdo2 = bl2 ? zzbdo.zzM : zzbdo.zzN;
        this.zza.zzb(zzbdo2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzr() {
        synchronized (this) {
            zzbdm zzbdm2 = this.zza;
            zzbdo zzbdo2 = zzbdo.zzd;
            zzbdm2.zzb(zzbdo2);
            return;
        }
    }

    public final void zzs() {
        zzbdm zzbdm2 = this.zza;
        zzbdo zzbdo2 = zzbdo.zzc;
        zzbdm2.zzb(zzbdo2);
    }
}

