/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfvd;
import com.google.android.gms.internal.ads.zzfve;
import com.google.android.gms.internal.ads.zzfvf;

public final class zzfvh
extends zzfve {
    private static zzfvh zzc;

    private zzfvh(Context context) {
        super(context, "paidv2_id", "paidv2_creation_time", "PaidV2LifecycleImpl");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final zzfvh zzi(Context object) {
        Class<zzfvh> clazz = zzfvh.class;
        synchronized (clazz) {
            try {
                zzfvh zzfvh2 = zzc;
                if (zzfvh2 != null) return zzc;
                zzc = zzfvh2 = new zzfvh((Context)object);
                return zzc;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfvd zzh(long l2, boolean bl2) {
        Class<zzfvh> clazz = zzfvh.class;
        synchronized (clazz) {
            try {
                boolean bl3 = this.zzo();
                if (bl3) return this.zzb(null, null, l2, bl2);
                return new zzfvd();
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzj() {
        Class<zzfvh> clazz = zzfvh.class;
        synchronized (clazz) {
            Throwable throwable2;
            block4: {
                block3: {
                    Object var2_2 = null;
                    try {
                        boolean bl2 = this.zzg(false);
                        if (!bl2) break block3;
                        this.zzf(false);
                    }
                    catch (Throwable throwable2) {
                        break block4;
                    }
                }
                return;
            }
            throw throwable2;
        }
    }

    public final void zzk() {
        this.zzb.zze("paidv2_publisher_option");
    }

    public final void zzl() {
        this.zzb.zze("paidv2_user_option");
    }

    public final void zzm(boolean bl2) {
        zzfvf zzfvf2 = this.zzb;
        Boolean bl3 = bl2;
        zzfvf2.zzd("paidv2_user_option", bl3);
    }

    public final void zzn(boolean bl2) {
        zzfvf zzfvf2 = this.zzb;
        Boolean bl3 = bl2;
        String string2 = "paidv2_publisher_option";
        zzfvf2.zzd(string2, bl3);
        if (!bl2) {
            this.zzj();
        }
    }

    public final boolean zzo() {
        return this.zzb.zzf("paidv2_publisher_option", true);
    }

    public final boolean zzp() {
        return this.zzb.zzf("paidv2_user_option", true);
    }
}

