/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzdm;
import com.google.android.gms.internal.vision.zzee;

final class zzed
extends zzdm {
    private final zzee zza;

    public zzed(zzee zzee2, int n3) {
        int n4 = zzee2.size();
        super(n4, n3);
        this.zza = zzee2;
    }

    public final Object zza(int n3) {
        return this.zza.get(n3);
    }
}

