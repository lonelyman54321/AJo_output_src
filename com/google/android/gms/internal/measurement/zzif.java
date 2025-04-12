/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.android.gms.internal.measurement.zzhx;
import com.google.common.base.Function;

public final class zzif {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final Function zzh;
    private final boolean zzi;

    public zzif(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzif(String string2, Uri uri, String string3, String string4, boolean bl2, boolean bl3, boolean bl4, boolean bl5, Function function) {
        this.zza = string2;
        this.zzb = uri;
        this.zzc = string3;
        this.zzd = string4;
        this.zze = bl2;
        this.zzf = bl3;
        this.zzi = bl4;
        this.zzg = bl5;
        this.zzh = function;
    }

    public final zzhx zza(String string2, double d2) {
        Double d5 = -3.0;
        return zzhx.zza(this, string2, d5, true);
    }

    public final zzhx zza(String string2, long l2) {
        Long l3 = l2;
        return zzhx.zza(this, string2, l3, true);
    }

    public final zzhx zza(String string2, String string3) {
        return zzhx.zza(this, string2, string3, true);
    }

    public final zzhx zza(String string2, boolean bl2) {
        Boolean bl3 = bl2;
        return zzhx.zza(this, string2, bl3, true);
    }

    public final zzif zza() {
        String string2 = this.zza;
        Uri uri = this.zzb;
        String string3 = this.zzc;
        String string4 = this.zzd;
        boolean bl2 = this.zze;
        boolean bl3 = this.zzf;
        boolean bl4 = this.zzg;
        Function function = this.zzh;
        zzif zzif2 = new zzif(string2, uri, string3, string4, bl2, bl3, true, bl4, function);
        return zzif2;
    }

    public final zzif zzb() {
        Object object = this.zzc;
        boolean bl2 = ((String)object).isEmpty();
        if (bl2) {
            Function function = this.zzh;
            if (function == null) {
                String string2 = this.zza;
                Uri uri = this.zzb;
                String string3 = this.zzc;
                String string4 = this.zzd;
                boolean bl3 = this.zzf;
                boolean bl4 = this.zzi;
                boolean bl5 = this.zzg;
                object = new zzif(string2, uri, string3, string4, true, bl3, bl4, bl5, function);
                return object;
            }
            object = new IllegalStateException("Cannot skip gservices both always and conditionally");
            throw object;
        }
        object = new IllegalStateException("Cannot set GServices prefix and skip GServices");
        throw object;
    }
}

