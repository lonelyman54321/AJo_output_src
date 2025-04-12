/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzcbs;
import com.google.android.gms.internal.ads.zzcby;
import com.google.android.gms.internal.ads.zzfiy;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjm;
import com.google.android.gms.internal.ads.zzfjt;
import com.google.android.gms.internal.ads.zzfju;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzfke;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayDeque;

public final class zzfjy {
    private final zzfjc zza;
    private final zzfjw zzb;
    private final zzfiy zzc;
    private final ArrayDeque zzd;
    private zzfke zze;
    private int zzf = 1;

    public zzfjy(zzfjc object, zzfiy zzfiy2, zzfjw zzfjw2) {
        this.zza = object;
        this.zzc = zzfiy2;
        this.zzb = zzfjw2;
        object = new ArrayDeque();
        this.zzd = object;
        object = new zzfjt(this);
        zzfiy2.zzb((zzfjt)object);
    }

    public static /* bridge */ /* synthetic */ ArrayDeque zzb(zzfjy zzfjy2) {
        return zzfjy2.zzd;
    }

    public static /* bridge */ /* synthetic */ void zzc(zzfjy zzfjy2, zzfke zzfke2) {
        zzfjy2.zze = null;
    }

    public static /* bridge */ /* synthetic */ void zzd(zzfjy zzfjy2) {
        zzfjy2.zzh();
    }

    public static /* bridge */ /* synthetic */ int zzg(zzfjy zzfjy2) {
        return zzfjy2.zzf;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zzh() {
        synchronized (this) {
            Throwable throwable2;
            block7: {
                boolean bl2;
                Object object;
                Object object2;
                block6: {
                    try {
                        object2 = zzbep.zzgy;
                        object = zzba.zzc();
                        object2 = ((zzben)object).zza((zzbeg)object2);
                        object2 = (Boolean)object2;
                        bl2 = (Boolean)object2;
                        if (!bl2) break block6;
                        object2 = zzu.zzo();
                        object2 = ((zzcby)object2).zzi();
                        bl2 = ((zzcbs)(object2 = object2.zzh())).zzh();
                        if (!bl2) {
                            object2 = this.zzd;
                            ((ArrayDeque)object2).clear();
                            return;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block7;
                    }
                }
                if (bl2 = this.zzi()) {
                    while (!(bl2 = ((ArrayDeque)(object2 = this.zzd)).isEmpty())) {
                        zzfke zzfke2;
                        Object object3;
                        boolean bl3;
                        object2 = this.zzd;
                        object2 = ((ArrayDeque)object2).pollFirst();
                        if ((object2 = (zzfjx)object2) != null && ((object = object2.zza()) == null || !(bl3 = (object = this.zza).zze((zzfjm)(object3 = object2.zza()))))) continue;
                        object = this.zza;
                        object3 = this.zzb;
                        this.zze = zzfke2 = new zzfke((zzfjc)object, (zzfjw)object3, (zzfjx)object2);
                        object = new zzfju(this, (zzfjx)object2);
                        zzfke2.zzd((zzgfp)object);
                        return;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzi() {
        synchronized (this) {
            zzfke zzfke2 = this.zze;
            return zzfke2 == null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zza(zzfjx object) {
        synchronized (this) {
            int n3;
            this.zzf = n3 = 2;
            n3 = (int)(this.zzi() ? 1 : 0);
            if (n3 != 0) {
                return null;
            }
            zzfke zzfke2 = this.zze;
            return zzfke2.zza((zzfjx)object);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zze(zzfjx zzfjx2) {
        synchronized (this) {
            ArrayDeque arrayDeque = this.zzd;
            arrayDeque.add(zzfjx2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ void zzf() {
        synchronized (this) {
            int n3;
            this.zzf = n3 = 1;
            this.zzh();
            return;
        }
    }
}

