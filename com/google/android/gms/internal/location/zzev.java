/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.location;

import com.google.android.gms.internal.location.zzet;
import com.google.android.gms.internal.location.zzex;

final class zzev
extends zzet {
    private final zzex zza;

    public zzev(zzex zzex2, int n3) {
        int n4 = zzex2.size();
        super(n4, n3);
        this.zza = zzex2;
    }

    public final Object zza(int n3) {
        return this.zza.get(n3);
    }
}

