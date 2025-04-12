/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzawy;
import com.google.android.gms.internal.ads.zzaye;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbfv;
import com.google.android.gms.internal.ads.zzftk;

final class zzawx
implements Runnable {
    final /* synthetic */ zzawy zza;

    public zzawx(zzawy zzawy2) {
        this.zza = zzawy2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Boolean bl2 = this.zza.zzb;
        if (bl2 != null) {
            return;
        }
        bl2 = zzawy.zza();
        synchronized (bl2) {
            Throwable throwable2;
            boolean bl3;
            Object object;
            boolean bl4;
            Object object2;
            block10: {
                try {
                    object2 = this.zza;
                    object2 = ((zzawy)object2).zzb;
                    if (object2 != null) {
                        return;
                    }
                    bl4 = false;
                    object2 = null;
                    try {
                        object = zzbep.zzcy;
                        object = ((zzbfv)object).zze();
                        object = (Boolean)object;
                        bl3 = (Boolean)object;
                    }
                    catch (IllegalStateException illegalStateException) {
                        bl3 = false;
                        object = null;
                    }
                    if (!bl3) break block10;
                }
                catch (Throwable throwable2) {}
                try {
                    Object object3 = this.zza;
                    object3 = zzawy.zzb((zzawy)object3);
                    object3 = ((zzaye)object3).zza;
                    String string2 = "ADSHIELD";
                    zzawy.zza = object3 = zzftk.zzb((Context)object3, string2, null);
                }
                catch (Throwable throwable3) {}
            }
            bl4 = bl3;
            object = this.zza;
            ((zzawy)object).zzb = object2 = Boolean.valueOf(bl4);
            object2 = zzawy.zza();
            object2.open();
            return;
            throw throwable2;
        }
    }
}

