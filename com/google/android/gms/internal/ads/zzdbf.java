/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.internal.ads.zzbkf;
import com.google.android.gms.internal.ads.zzdbe;
import com.google.android.gms.internal.ads.zzdey;
import com.google.android.gms.internal.ads.zzdez;
import java.util.Set;

public final class zzdbf
extends zzdez
implements zzbkf {
    private final Bundle zzb;

    public zzdbf(Set set) {
        super(set);
        super();
        this.zzb = set;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zza(String object, Bundle bundle) {
        synchronized (this) {
            object = this.zzb;
            object.putAll(bundle);
            object = new zzdbe();
            this.zzq((zzdey)object);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Bundle zzb() {
        synchronized (this) {
            Bundle bundle = this.zzb;
            return new Bundle(bundle);
        }
    }
}

