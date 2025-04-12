/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhac;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhbo;
import com.google.android.gms.internal.ads.zzhdf;
import com.google.android.gms.internal.ads.zzhfr;
import com.google.android.gms.internal.ads.zzhii;
import com.google.android.gms.internal.ads.zzhij;

public final class zzhif
extends zzhbi
implements zzhdf {
    private zzhif() {
        throw null;
    }

    public /* synthetic */ zzhif(zzhfr object) {
        object = zzhij.zze();
        super((zzhbo)object);
    }

    public final zzhif zza(zzhac zzhac2) {
        this.zzbu();
        zzhij.zzh((zzhij)this.zza, zzhac2);
        return this;
    }

    public final zzhif zzb(String string2) {
        this.zzbu();
        zzhij.zzg((zzhij)this.zza, "image/png");
        return this;
    }

    public final zzhif zzc(zzhii zzhii2) {
        this.zzbu();
        zzhij.zzf((zzhij)this.zza, zzhii2);
        return this;
    }
}

