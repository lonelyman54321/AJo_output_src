/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzbv;
import com.google.android.gms.internal.measurement.zzg;
import com.google.android.gms.internal.measurement.zzh;
import java.util.ArrayList;
import java.util.List;

public abstract class zzay {
    final List zza;

    public zzay() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
    }

    public final zzaq zza(String object) {
        Object object2 = this.zza;
        zzbv zzbv2 = zzg.zza((String)object);
        boolean bl2 = object2.contains((Object)zzbv2);
        if (bl2) {
            object = kp1_0.c("Command not implemented: ", (String)object);
            object2 = new UnsupportedOperationException((String)object);
            throw object2;
        }
        object = new IllegalArgumentException("Command not supported");
        throw object;
    }

    public abstract zzaq zza(String var1, zzh var2, List var3);
}

