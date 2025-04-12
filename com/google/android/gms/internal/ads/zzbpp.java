/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzben;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzbpn;
import com.google.android.gms.internal.ads.zzbps;
import com.google.android.gms.internal.ads.zzccp;
import com.google.android.gms.internal.ads.zzccu;

final class zzbpp
implements zzccp {
    final /* synthetic */ zzbpn zza;

    public zzbpp(zzbps zzbps2, zzbpn zzbpn2) {
        this.zza = zzbpn2;
    }

    public final void zza() {
        zze.zza("Rejecting reference for JS Engine.");
        Object object = zzbep.zzhO;
        Object object2 = zzba.zzc();
        object = (Boolean)((zzben)object2).zza((zzbeg)object);
        boolean bl2 = (Boolean)object;
        if (bl2) {
            object = this.zza;
            object2 = new IllegalStateException("Unable to create JS engine reference.");
            ((zzccu)object).zzh((Throwable)object2, "SdkJavascriptFactory.createNewReference.FailureCallback");
            return;
        }
        this.zza.zzg();
    }
}

