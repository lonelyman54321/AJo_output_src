/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.zzhm;

final class zzhs
extends WC1 {
    private final /* synthetic */ zzhm zza;

    public zzhs(zzhm zzhm2, int n3) {
        this.zza = zzhm2;
        super(20);
    }

    public final /* synthetic */ Object create(Object object) {
        object = (String)object;
        Preconditions.checkNotEmpty((String)object);
        return zzhm.zza(this.zza, (String)object);
    }
}

