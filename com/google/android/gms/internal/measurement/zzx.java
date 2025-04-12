/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzj;
import java.util.List;
import java.util.concurrent.Callable;

public final class zzx
extends zzal {
    private final Callable zzk;

    public zzx(String string2, Callable callable) {
        super(string2);
        this.zzk = callable;
    }

    public final zzaq zza(zzh object, List list) {
        try {
            object = this.zzk;
        }
        catch (Exception exception) {
            return zzaq.zzc;
        }
        object = object.call();
        return zzj.zza(object);
    }
}

