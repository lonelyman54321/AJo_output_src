/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzack;
import com.google.android.gms.internal.gtm.zzacl;
import com.google.android.gms.internal.gtm.zzam;
import java.util.AbstractList;

public final class zzacm
extends AbstractList {
    private final zzack zza;

    public zzacm(zzack zzack2, zzacl zzacl2) {
        this.zza = zzack2;
    }

    public final Object get(int n3) {
        zzack zzack2 = this.zza;
        zzam zzam2 = zzam.zzb(n3 = zzack2.zze(n3));
        if (zzam2 == null) {
            zzam2 = zzam.zza;
        }
        return zzam2;
    }

    public final int size() {
        return this.zza.size();
    }
}

