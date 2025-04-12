/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import com.google.android.gms.internal.ads.zzbdv$zzb;
import com.google.android.gms.internal.ads.zzbdv$zzb$zza;
import com.google.android.gms.internal.ads.zzbdv$zzb$zza$zza;
import com.google.android.gms.internal.ads.zzbdv$zzb$zzd;
import com.google.android.gms.internal.ads.zzbdv$zzb$zze;
import com.google.android.gms.internal.ads.zzbdv$zzc;
import com.google.android.gms.internal.ads.zzbxu;
import com.google.android.gms.internal.ads.zzcvx;
import com.google.android.gms.internal.ads.zzcys;
import com.google.android.gms.internal.ads.zzdzd;
import com.google.android.gms.internal.ads.zzfdm;
import com.google.android.gms.internal.ads.zzfdn;
import com.google.android.gms.internal.ads.zzfdp;
import com.google.android.gms.internal.ads.zzfdr;
import com.google.android.gms.internal.ads.zzfdv;
import com.google.android.gms.internal.ads.zzfdw;
import com.google.android.gms.internal.ads.zzfea;
import com.google.android.gms.internal.ads.zzfeh;
import com.google.android.gms.internal.ads.zzfei;
import com.google.android.gms.internal.ads.zzfej;
import com.google.android.gms.internal.ads.zzfek;
import com.google.android.gms.internal.ads.zzfel;
import com.google.android.gms.internal.ads.zzfhf;
import com.google.android.gms.internal.ads.zzfho;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzfjm;
import com.google.android.gms.internal.ads.zzfjv;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzfjy;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfk;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzfdq
implements zzfek {
    private final zzfek zza;
    private final zzfek zzb;
    private final zzfjy zzc;
    private final String zzd;
    private zzcys zze;
    private final Executor zzf;

    public zzfdq(zzfek zzfek2, zzfek zzfek3, zzfjy zzfjy2, String string2, Executor executor) {
        this.zza = zzfek2;
        this.zzb = zzfek3;
        this.zzc = zzfjy2;
        this.zzd = string2;
        this.zzf = executor;
    }

    private final ListenableFuture zzg(zzfjl object, zzfel object2) {
        Object object3 = ((zzfjl)object).zza;
        this.zze = object3;
        Object object4 = ((zzfjl)object).zzc;
        if (object4 != null) {
            object2 = object3.zzf();
            if (object2 != null) {
                object2 = ((zzfjl)object).zzc.zzo();
                object3 = ((zzfjl)object).zza.zzf();
                object2.zzl((zzfeh)object3);
            }
            return zzgft.zzh(((zzfjl)object).zzc);
        }
        object3 = object3.zzb();
        object4 = ((zzfjl)object).zzb;
        ((zzcvx)object3).zzl((zzfhf)object4);
        object3 = this.zza;
        object = ((zzfjl)object).zza;
        return ((zzfea)object3).zzb((zzfel)object2, null, (zzcys)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzcys zza() {
        synchronized (this) {
            return this.zze;
        }
    }

    public final /* synthetic */ ListenableFuture zzb(zzfel object, zzfdp object2, zzfej zzfej2, zzcys zzcys2, zzfdv object3) {
        if (object3 != null) {
            zzfej zzfej3 = ((zzfdp)object2).zza;
            zzfel zzfel2 = ((zzfdp)object2).zzb;
            zzl zzl2 = ((zzfdp)object2).zzc;
            String string2 = ((zzfdp)object2).zzd;
            Executor executor = ((zzfdp)object2).zze;
            zzw zzw2 = ((zzfdp)object2).zzf;
            zzfjm zzfjm2 = ((zzfdv)object3).zza;
            Object object4 = object2;
            object2 = new zzfdp(zzfej3, zzfel2, zzl2, string2, executor, zzw2, zzfjm2);
            object4 = ((zzfdv)object3).zzc;
            zzfej3 = null;
            if (object4 != null) {
                this.zze = null;
                this.zzc.zze((zzfjx)object2);
                object2 = ((zzfdv)object3).zzc;
                return this.zzg((zzfjl)object2, (zzfel)object);
            }
            object4 = this.zzc.zza((zzfjx)object2);
            if (object4 != null) {
                this.zze = null;
                object = new zzfdm(this);
                object2 = this.zzf;
                return zzgft.zzn((ListenableFuture)object4, (zzgfa)object, (Executor)object2);
            }
            object4 = this.zzc;
            ((zzfjy)object4).zze((zzfjx)object2);
            object = ((zzfel)object).zzb;
            object2 = ((zzfdv)object3).zzb;
            object = object3 = new zzfel((zzfei)object, (zzbxu)object2);
        }
        object = ((zzfea)this.zza).zzb((zzfel)object, zzfej2, zzcys2);
        this.zze = zzcys2;
        return object;
    }

    public final /* synthetic */ ListenableFuture zze(zzfjv object) {
        Object object2;
        if (object != null && (object2 = ((zzfjv)object).zza) != null && (object2 = ((zzfjv)object).zzb) != null) {
            object2 = (zzfdp)object2;
            zzbdv$zzc zzbdv$zzc = zzbdv$zzb.zzd();
            zzbdv$zzb$zza$zza zzbdv$zzb$zza$zza = zzbdv$zzb$zza.zza();
            Object object3 = zzbdv$zzb$zzd.zzb;
            zzbdv$zzb$zza$zza.zzf((zzbdv$zzb$zzd)object3);
            object3 = zzbdv$zzb$zze.zzi();
            zzbdv$zzb$zza$zza.zzh((zzbdv$zzb$zze)object3);
            zzbdv$zzc.zzd(zzbdv$zzb$zza$zza);
            zzbdv$zzc = (zzbdv$zzb)zzbdv$zzc.zzbn();
            ((zzfjv)object).zza.zza.zzb().zzc().zzm((zzbdv$zzb)zzbdv$zzc);
            object = ((zzfjv)object).zza;
            object2 = ((zzfdp)object2).zzb;
            return this.zzg((zzfjl)object, (zzfel)object2);
        }
        object = new zzdzd(1, "Empty prefetch");
        throw object;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zzf(zzfel zzfel2, zzfej zzfej2, zzcys zzcys2) {
        zzfdq zzfdq2 = this;
        Object object = zzfel2;
        zzfej zzfej3 = zzfej2;
        synchronized (this) {
            Throwable throwable2;
            block6: {
                Object object2;
                Object object3;
                try {
                    object3 = zzfel2.zzb;
                    object3 = zzfej2.zza((zzfei)object3);
                    Object object4 = this.zzd;
                    Object object5 = new zzfdr((String)object4);
                    object3.zza((zzfdr)object5);
                    object2 = object3 = object3.zzh();
                    object2 = (zzcys)object3;
                    object2.zzg();
                    object2.zzg();
                    object3 = object2.zzg();
                    object3 = ((zzfho)object3).zzd;
                    object5 = ((zzl)object3).zzs;
                    if (object5 == null && (object3 = ((zzl)object3).zzx) == null) {
                        zzfdp zzfdp2;
                        object3 = object2.zzg();
                        zzl zzl2 = ((zzfho)object3).zzd;
                        String string2 = ((zzfho)object3).zzf;
                        zzw zzw2 = ((zzfho)object3).zzj;
                        Executor executor = this.zzf;
                        Object object6 = zzfdp2;
                        Object object7 = zzfej2;
                        zzfdp2 = new zzfdp(zzfej2, zzfel2, zzl2, string2, executor, zzw2, null);
                        object3 = this.zzb;
                        object3 = (zzfdw)object3;
                        object3 = ((zzfdw)object3).zzb(zzfel2, zzfej2, (zzcys)object2);
                        object6 = zzgfk.zzu((ListenableFuture)object3);
                        object3 = object7;
                        object5 = this;
                        object4 = zzfel2;
                        object7 = new zzfdn(this, zzfel2, zzfdp2, zzfej2, (zzcys)object2);
                        object = this.zzf;
                        return zzgft.zzn((ListenableFuture)object6, (zzgfa)object7, (Executor)object);
                    }
                }
                catch (Throwable throwable2) {
                    break block6;
                }
                {
                    zzfdq2.zze = object2;
                    object3 = zzfdq2.zza;
                    object3 = (zzfea)object3;
                    return ((zzfea)object3).zzb((zzfel)object, zzfej3, (zzcys)object2);
                }
            }
            throw throwable2;
        }
    }
}

