/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package com.google.android.gms.internal.auth;

import android.net.Uri;
import com.google.android.gms.internal.auth.zzcv;
import com.google.android.gms.internal.auth.zzcw;
import com.google.android.gms.internal.auth.zzcx;
import com.google.android.gms.internal.auth.zzcy;
import com.google.android.gms.internal.auth.zzdc;
import com.google.android.gms.internal.auth.zzdg;
import com.google.android.gms.internal.auth.zzhu;

public final class zzcz {
    final String zza;
    final Uri zzb;
    final String zzc;
    final String zzd;
    final boolean zze;
    final boolean zzf;
    final boolean zzg;
    final boolean zzh;
    final zzdg zzi;

    public zzcz(Uri uri) {
        this(null, uri, "", "", false, false, false, false, null);
    }

    private zzcz(String string2, Uri object, String string3, String string4, boolean bl2, boolean bl3, boolean bl4, boolean bl5, zzdg zzdg2) {
        this.zza = null;
        this.zzb = object;
        object = "";
        this.zzc = object;
        this.zzd = object;
        this.zze = bl2;
        this.zzf = false;
        this.zzg = bl4;
        this.zzh = false;
        this.zzi = null;
    }

    public final zzcz zza() {
        Uri uri = this.zzb;
        String string2 = this.zzc;
        String string3 = this.zzd;
        boolean bl2 = this.zze;
        zzcz zzcz2 = new zzcz(null, uri, string2, string3, bl2, false, true, false, null);
        return zzcz2;
    }

    public final zzcz zzb() {
        Object object = this.zzc;
        boolean bl2 = ((String)object).isEmpty();
        if (bl2) {
            Uri uri = this.zzb;
            String string2 = this.zzc;
            String string3 = this.zzd;
            boolean bl3 = this.zzg;
            object = new zzcz(null, uri, string2, string3, true, false, bl3, false, null);
            return object;
        }
        object = new IllegalStateException("Cannot set GServices prefix and skip GServices");
        throw object;
    }

    public final zzdc zzc(String string2, double d2) {
        Double d5 = 0.0;
        zzcx zzcx2 = new zzcx(this, string2, d5, true);
        return zzcx2;
    }

    public final zzdc zzd(String string2, long l2) {
        Long l3 = l2;
        zzcv zzcv2 = new zzcv(this, string2, l3, true);
        return zzcv2;
    }

    public final zzdc zze(String string2, boolean bl2) {
        Boolean bl3 = bl2;
        zzcw zzcw2 = new zzcw(this, string2, bl3, true);
        return zzcw2;
    }

    public final zzdc zzf(String object, Object object2, zzhu zzhu2) {
        object = new zzcy(this, "getTokenRefactor__blocked_packages", object2, true, zzhu2, null);
        return object;
    }
}

