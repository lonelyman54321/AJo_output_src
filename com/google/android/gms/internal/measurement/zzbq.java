/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzay;
import com.google.android.gms.internal.measurement.zzh;
import java.util.List;

public final class zzbq
extends zzay {
    public final zzaq zza(String string2, zzh object, List list) {
        boolean bl2;
        if (string2 != null && !(bl2 = string2.isEmpty()) && (bl2 = ((zzh)object).zzb(string2))) {
            zzaq zzaq2 = ((zzh)object).zza(string2);
            boolean bl3 = zzaq2 instanceof zzal;
            if (bl3) {
                return ((zzal)zzaq2).zza((zzh)object, list);
            }
            string2 = cP.a("Function ", string2, " is not defined");
            object = new IllegalArgumentException(string2);
            throw object;
        }
        string2 = kp1_0.c("Command not found: ", string2);
        object = new IllegalArgumentException(string2);
        throw object;
    }
}

