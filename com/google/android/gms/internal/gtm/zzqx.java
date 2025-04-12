/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzqo;
import java.util.List;

public final class zzqx
extends zzqo {
    private final String zzb;
    private final List zzc;

    public zzqx(String string2, List list) {
        Preconditions.checkNotNull(string2, "Instruction name must be a string.");
        Preconditions.checkNotNull(list);
        this.zzb = string2;
        this.zzc = list;
    }

    public final String toString() {
        String string2 = this.zzc.toString();
        StringBuilder stringBuilder = new StringBuilder("*");
        String string3 = this.zzb;
        return BW0.b(stringBuilder, string3, ": ", string2);
    }

    public final /* synthetic */ Object zzc() {
        return this.toString();
    }

    public final String zzi() {
        return this.zzb;
    }

    public final List zzj() {
        return this.zzc;
    }
}

