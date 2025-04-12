/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzmj;
import com.google.android.gms.internal.measurement.zzml;
import com.google.android.gms.internal.measurement.zzmo;
import com.google.android.gms.internal.measurement.zzmp;
import java.util.Iterator;

final class zzmk
extends zzmp {
    private final /* synthetic */ zzmj zza;

    private zzmk(zzmj zzmj2) {
        this.zza = zzmj2;
        super(zzmj2, null);
    }

    public /* synthetic */ zzmk(zzmj zzmj2, zzmo zzmo2) {
        this(zzmj2);
    }

    public final Iterator iterator() {
        zzmj zzmj2 = this.zza;
        zzml zzml2 = new zzml(zzmj2, null);
        return zzml2;
    }
}

