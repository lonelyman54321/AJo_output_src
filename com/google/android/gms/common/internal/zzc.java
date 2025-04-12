/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.BaseGmsClient;
import java.util.ArrayList;

public abstract class zzc {
    private Object zza;
    private boolean zzb;
    final /* synthetic */ BaseGmsClient zzd;

    public zzc(BaseGmsClient baseGmsClient, Object object) {
        this.zzd = baseGmsClient;
        this.zza = object;
        this.zzb = false;
    }

    public abstract void zza(Object var1);

    public abstract void zzc();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zze() {
        boolean bl3;
        // MONITORENTER : this
        Object object = this.zza;
        boolean bl2 = this.zzb;
        if (bl2) {
            this.toString();
        }
        if (object != null) {
            this.zza(object);
        }
        // MONITORENTER : this
        this.zzb = bl3 = true;
        // MONITOREXIT : this
        this.zzg();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzf() {
        synchronized (this) {
            Object var1_1 = null;
            this.zza = null;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzg() {
        this.zzf();
        ArrayList arrayList = BaseGmsClient.zzf(this.zzd);
        synchronized (arrayList) {
            Object object = this.zzd;
            object = BaseGmsClient.zzf((BaseGmsClient)object);
            ((ArrayList)object).remove(this);
            return;
        }
    }
}

