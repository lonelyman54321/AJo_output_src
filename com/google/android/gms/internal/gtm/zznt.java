/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzht;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzra;

public final class zznt
extends zzjo {
    private final zzht zza;

    public zznt(zzht zzht2) {
        this.zza = zzht2;
    }

    public final zzqo zza(zzhx zzhx2, zzqo ... zzqoArray) {
        boolean bl2 = true;
        Preconditions.checkArgument(bl2);
        int n3 = zzqoArray.length;
        if (n3 != 0) {
            bl2 = false;
        }
        Preconditions.checkArgument(bl2);
        return zzra.zzb(this.zza.zza().zza());
    }
}

