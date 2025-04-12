/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.AudioManager
 */
package com.google.android.gms.ads.internal.util;

import android.content.Context;
import android.media.AudioManager;

public final class zzac {
    private boolean zza = false;
    private float zzb = 1.0f;

    public static float zzb(Context context) {
        String string2 = "audio";
        if ((context = (AudioManager)context.getSystemService(string2)) != null) {
            int n3 = 3;
            float f5 = 4.2E-45f;
            int n4 = context.getStreamMaxVolume(n3);
            int n7 = context.getStreamVolume(n3);
            if (n4 != 0) {
                float f6 = n7;
                f5 = n4;
                return f6 / f5;
            }
        }
        return 0.0f;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final boolean zzf() {
        synchronized (this) {
            float f5 = this.zzb;
            float f6 = f5 - 0.0f;
            float f7 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
            return f7 >= 0;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final float zza() {
        synchronized (this) {
            try {
                boolean bl2 = this.zzf();
                if (!bl2) return 1.0f;
                return this.zzb;
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
    public final void zzc(boolean bl2) {
        synchronized (this) {
            this.zza = bl2;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(float f5) {
        synchronized (this) {
            this.zzb = f5;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean zze() {
        synchronized (this) {
            return this.zza;
        }
    }
}

