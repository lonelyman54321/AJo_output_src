/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjl;
import com.google.android.gms.internal.ads.zzfjm;
import com.google.android.gms.internal.ads.zzfjv;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfjx;
import com.google.android.gms.internal.ads.zzfkb;
import com.google.android.gms.internal.ads.zzfkc;
import com.google.android.gms.internal.ads.zzfkd;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgfp;
import com.google.android.gms.internal.ads.zzgft;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class zzfke {
    private final zzfjx zza;
    private final ListenableFuture zzb;
    private boolean zzc = false;
    private boolean zzd = false;

    public zzfke(zzfjc object, zzfjw object2, zzfjx zzfjx2) {
        this.zza = zzfjx2;
        Object object3 = object2.zza(zzfjx2);
        zzfkc zzfkc2 = new zzfkc(this, (zzfjw)object2, (zzfjc)object, zzfjx2);
        object = zzfjx2.zzb();
        object = zzgft.zzn((ListenableFuture)object3, zzfkc2, (Executor)object);
        object3 = new zzfkd(this, (zzfjw)object2);
        object2 = zzfjx2.zzb();
        this.zzb = object = zzgft.zzf((ListenableFuture)object, Exception.class, (zzgfa)object3, (Executor)object2);
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final ListenableFuture zza(zzfjx object) {
        synchronized (this) {
            Throwable throwable2;
            block5: {
                try {
                    boolean bl2 = this.zzd;
                    if (bl2) return null;
                    bl2 = this.zzc;
                    if (!bl2) {
                        Object object2 = this.zza;
                        if ((object2 = object2.zza()) == null) return null;
                        object2 = object.zza();
                        if (object2 == null) return null;
                        object2 = this.zza;
                        boolean bl3 = (object2 = object2.zza()).equals(object = object.zza());
                        if (!bl3) return null;
                        this.zzc = bl3 = true;
                        return this.zzb;
                    }
                }
                catch (Throwable throwable2) {
                    break block5;
                }
                return null;
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ ListenableFuture zzb(zzfjw object, zzfjc zzfjc2, zzfjx zzfjx2, zzfjl zzfjl2) {
        synchronized (this) {
            Throwable throwable2;
            block4: {
                boolean bl2 = true;
                try {
                    this.zzd = bl2;
                    object.zzb(zzfjl2);
                    boolean bl3 = this.zzc;
                    if (!bl3) {
                        object = zzfjx2.zza();
                        zzfjc2.zzd((zzfjm)object, zzfjl2);
                        bl3 = false;
                        object = null;
                        return zzgft.zzh(null);
                    }
                }
                catch (Throwable throwable2) {
                    break block4;
                }
                object = new zzfjv(zzfjl2, zzfjx2);
                return zzgft.zzh(object);
            }
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final /* synthetic */ ListenableFuture zzc(zzfjw zzfjw2, Exception exception) {
        synchronized (this) {
            boolean bl2;
            this.zzd = bl2 = true;
            throw exception;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(zzgfp zzgfp2) {
        synchronized (this) {
            Object object = new zzfkb();
            Object object2 = this.zza;
            object2 = object2.zzb();
            ListenableFuture listenableFuture = this.zzb;
            object = zzgft.zzn(listenableFuture, (zzgfa)object, (Executor)object2);
            object2 = this.zza;
            object2 = object2.zzb();
            zzgft.zzr((ListenableFuture)object, zzgfp2, (Executor)object2);
            return;
        }
    }
}

