/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.fido;

import com.google.android.gms.internal.fido.zzao;
import com.google.android.gms.internal.fido.zzat;

final class zzar
extends zzao {
    private final zzat zza;

    public zzar(zzat zzat2, int n3) {
        int n4 = zzat2.size();
        super(n4, n3);
        this.zza = zzat2;
    }

    public final Object zza(int n3) {
        return this.zza.get(n3);
    }
}

