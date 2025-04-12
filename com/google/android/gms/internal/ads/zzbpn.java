/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbpk;
import com.google.android.gms.internal.ads.zzbpl;
import com.google.android.gms.internal.ads.zzbpm;
import com.google.android.gms.internal.ads.zzbps;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzccq;
import com.google.android.gms.internal.ads.zzccr;
import com.google.android.gms.internal.ads.zzccu;

public final class zzbpn
extends zzccu {
    private final Object zza;
    private final zzbps zzb;
    private boolean zzc;

    public zzbpn(zzbps zzbps2) {
        Object object;
        this.zza = object = new Object();
        this.zzb = zzbps2;
    }

    public static /* bridge */ /* synthetic */ zzbps zza(zzbpn zzbpn2) {
        return zzbpn2.zzb;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void zzb() {
        zze.zza("release: Trying to acquire lock");
        Object object = this.zza;
        // MONITORENTER : object
        Object object2 = "release: Lock acquired";
        zze.zza((String)object2);
        boolean bl2 = this.zzc;
        if (bl2) {
            object2 = "release: Lock already released";
            zze.zza((String)object2);
            // MONITOREXIT : object
            return;
        }
        this.zzc = bl2 = true;
        object2 = new zzbpk(this);
        zzccp zzccp2 = new zzccq();
        this.zzj((zzccr)object2, zzccp2);
        object2 = new zzbpl(this);
        zzccp2 = new zzbpm(this);
        this.zzj((zzccr)object2, zzccp2);
        // MONITOREXIT : object
        zze.zza("release: Lock released");
    }
}

