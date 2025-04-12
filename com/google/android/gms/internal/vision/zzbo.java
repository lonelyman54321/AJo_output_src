/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.vision;

import android.net.Uri;
import com.google.android.gms.internal.vision.zzbi;
import com.google.android.gms.internal.vision.zzbp;
import com.google.android.gms.internal.vision.zzcw;

public final class zzbo {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzcw zzi;

    public zzbo(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzbo(String string2, Uri uri, String string3, String string4, boolean bl2, boolean bl3, boolean bl4, boolean bl5, zzcw zzcw2) {
        this.zza = string2;
        this.zzb = uri;
        this.zzc = string3;
        this.zzd = string4;
        this.zze = bl2;
        this.zzf = bl3;
        this.zzg = bl4;
        this.zzh = bl5;
        this.zzi = zzcw2;
    }

    public final zzbi zza(String string2, Object object, zzbp zzbp2) {
        return zzbi.zza(this, string2, object, zzbp2, true);
    }

    public final zzbo zza(String object) {
        boolean bl2 = this.zze;
        if (!bl2) {
            String string2 = this.zza;
            Uri uri = this.zzb;
            String string3 = this.zzd;
            boolean bl3 = this.zzf;
            boolean bl4 = this.zzg;
            boolean bl5 = this.zzh;
            zzcw zzcw2 = this.zzi;
            zzbo zzbo2 = new zzbo(string2, uri, (String)object, string3, bl2, bl3, bl4, bl5, zzcw2);
            return zzbo2;
        }
        object = new IllegalStateException("Cannot set GServices prefix and skip GServices");
        throw object;
    }
}

