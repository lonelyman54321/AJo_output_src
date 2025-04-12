/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzht;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzra;
import java.util.Map;

public final class zzoa
extends zzjo {
    private final zzht zza;

    public zzoa(zzht zzht2) {
        this.zza = zzht2;
    }

    public final zzqo zza(zzhx zzhx2, zzqo ... zzqoArray) {
        Map map2;
        boolean bl2;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = zzqoArray.length;
        Object object = null;
        if (n4 > 0) {
            bl2 = true;
        } else {
            bl2 = false;
            map2 = null;
        }
        Preconditions.checkArgument(bl2);
        object = zzjn.zzd(zzqoArray[0]);
        map2 = this.zza.zza().zzd();
        object = map2.get(object);
        if (object == null && n4 > n3) {
            object = zzqoArray[n3];
        }
        return zzra.zzb(object);
    }
}

