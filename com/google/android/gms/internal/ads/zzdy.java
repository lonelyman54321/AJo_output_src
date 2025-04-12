/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdx;

public final class zzdy
extends Exception {
    public final zzdx zza;

    public zzdy(String string2, zzdx zzdx2) {
        string2 = String.valueOf(zzdx2);
        string2 = "Unhandled input format: ".concat(string2);
        super(string2);
        this.zza = zzdx2;
    }
}

