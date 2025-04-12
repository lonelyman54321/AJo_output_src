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

public final class zzfvg
extends zzfve {
    private static zzfvg zzc;

    private zzfvg(Context context) {
        super(context, "paidv1_id", "paidv1_creation_time", "PaidV1LifecycleImpl");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final zzfvg zzj(Context object) {
        Class<zzfvg> clazz = zzfvg.class;
        synchronized (clazz) {
            try {
                zzfvg zzfvg2 = zzc;
                if (zzfvg2 != null) return zzc;
                zzc = zzfvg2 = new zzfvg((Context)object);
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
        Class<zzfvg> clazz = zzfvg.class;
        synchronized (clazz) {
            return this.zzb(null, null, l2, bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final zzfvd zzi(String object, String string2, long l2, boolean bl2) {
        Class<zzfvg> clazz = zzfvg.class;
        synchronized (clazz) {
            return this.zzb((String)object, string2, l2, bl2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzk() {
        Class<zzfvg> clazz = zzfvg.class;
        synchronized (clazz) {
            Object var2_2 = null;
            this.zzf(false);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzl() {
        Class<zzfvg> clazz = zzfvg.class;
        synchronized (clazz) {
            boolean bl2 = true;
            this.zzf(bl2);
            return;
        }
    }
}

