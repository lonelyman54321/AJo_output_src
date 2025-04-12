/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.consent_sdk;

import com.google.android.gms.internal.consent_sdk.zzcy;
import com.google.android.gms.internal.consent_sdk.zzdd;

final class zzdb
extends zzcy {
    private final zzdd zza;

    public zzdb(zzdd zzdd2, int n3) {
        int n4 = zzdd2.size();
        super(n4, n3);
        this.zza = zzdd2;
    }

    public final Object zza(int n3) {
        return this.zza.get(n3);
    }
}

