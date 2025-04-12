/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.overlay.zzy;
import com.google.android.gms.internal.ads.zzbmb;
import com.google.android.gms.internal.ads.zzbok;
import com.google.android.gms.internal.ads.zzdhi;
import java.util.Map;

final class zzblz
implements zzy {
    boolean zza = false;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zza zzc;
    final /* synthetic */ Map zzd;
    final /* synthetic */ Map zze;

    public zzblz(zzbmb zzbmb2, boolean bl2, zza zza2, Map map2, Map map3) {
        this.zzb = bl2;
        this.zzc = zza2;
        this.zzd = map2;
        this.zze = map3;
    }

    public final void zza(boolean bl2) {
        boolean bl3 = this.zza;
        if (!bl3) {
            Object object;
            if (bl2 && (bl3 = this.zzb)) {
                object = (zzdhi)((Object)this.zzc);
                object.zzdG();
            }
            this.zza = bl3 = true;
            object = this.zzd;
            Object object2 = this.zze;
            String string2 = "event_id";
            object2 = (String)object2.get(string2);
            Object object3 = bl2;
            object.put(object2, object3);
            object3 = this.zzc;
            object = this.zzd;
            object3 = (zzbok)object3;
            object2 = "openIntentAsync";
            object3.zzd((String)object2, (Map)object);
        }
    }

    public final void zzb(int n3) {
    }
}

