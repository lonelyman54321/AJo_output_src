/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.dynamite;

import android.content.Context;
import com.google.android.gms.dynamite.DynamiteModule$VersionPolicy$IVersions;

final class zzn
implements DynamiteModule$VersionPolicy$IVersions {
    private final int zza;

    public zzn(int n3, int n4) {
        this.zza = n3;
    }

    public final int zza(Context context, String string2) {
        return this.zza;
    }

    public final int zzb(Context context, String string2, boolean bl2) {
        return 0;
    }
}

