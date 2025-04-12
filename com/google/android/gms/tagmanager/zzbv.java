/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
package com.google.android.gms.tagmanager;

import android.text.TextUtils;

final class zzbv {
    private final long zza;
    private final long zzb;
    private String zzc;

    public zzbv(long l2, long l3, long l4) {
        this.zza = l2;
        this.zzb = l4;
    }

    public final long zza() {
        return this.zzb;
    }

    public final long zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzc;
    }

    public final void zzd(String string2) {
        String string3;
        boolean bl2;
        if (string2 != null && !(bl2 = TextUtils.isEmpty((CharSequence)(string3 = string2.trim())))) {
            this.zzc = string2;
        }
    }
}

