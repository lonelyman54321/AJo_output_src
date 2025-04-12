/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzab;
import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;
import java.util.Map;

public final class zzy
extends zzal {
    public zzy() {
        super("internal.platform");
        Map map2 = this.zzb;
        String string2 = "getVersion";
        zzab zzab2 = new zzab(this, string2);
        map2.put(string2, zzab2);
    }

    public final zzaq zza(zzh zzh2, List list) {
        return zzaq.zzc;
    }
}

