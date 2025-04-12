/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.internal.ads.zzccc;
import com.google.android.gms.internal.ads.zzczo;
import java.util.HashSet;

public final class zzfiw
implements zzczo {
    private final HashSet zza;
    private final Context zzb;
    private final zzccc zzc;

    public zzfiw(Context context, zzccc zzccc2) {
        HashSet hashSet;
        this.zza = hashSet = new HashSet();
        this.zzb = context;
        this.zzc = zzccc2;
    }

    public final Bundle zzb() {
        zzccc zzccc2 = this.zzc;
        Context context = this.zzb;
        return zzccc2.zzn(context, this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzc(HashSet hashSet) {
        synchronized (this) {
            HashSet hashSet2 = this.zza;
            hashSet2.clear();
            hashSet2 = this.zza;
            hashSet2.addAll(hashSet);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzdB(zze object) {
        // MONITORENTER : this
        int n3 = ((zze)object).zza;
        int n4 = 3;
        if (n3 == n4) return;
        object = this.zzc;
        HashSet hashSet = this.zza;
        ((zzccc)object).zzl(hashSet);
        // MONITOREXIT : this
        return;
    }
}

