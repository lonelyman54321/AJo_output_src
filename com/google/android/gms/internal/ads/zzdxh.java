/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzdgj;

public final class zzdxh
implements zzdgj {
    private final Bundle zza;

    public zzdxh() {
        Bundle bundle;
        this.zza = bundle = new Bundle();
    }

    public final void zza(String string2) {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(String string2, String string3) {
        synchronized (this) {
            string3 = this.zza;
            int n3 = 3;
            string3.putInt(string2, n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(String string2) {
        synchronized (this) {
            Bundle bundle = this.zza;
            int n3 = 1;
            bundle.putInt(string2, n3);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzd(String string2) {
        synchronized (this) {
            Bundle bundle = this.zza;
            int n3 = 2;
            bundle.putInt(string2, n3);
            return;
        }
    }

    public final void zze() {
    }

    public final void zzf() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle zzg() {
        synchronized (this) {
            Bundle bundle = this.zza;
            return new Bundle(bundle);
        }
    }
}

