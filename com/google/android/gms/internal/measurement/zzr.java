/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzal;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzu;
import com.google.android.gms.internal.measurement.zzv;
import java.util.List;

public final class zzr
extends zzal {
    private final zzv zzk;

    public zzr(zzv object) {
        super("internal.logger");
        this.zzk = object;
        object = this.zzb;
        boolean bl2 = true;
        zzal zzal2 = new zzu(this, false, bl2);
        String string2 = "log";
        object.put(string2, zzal2);
        object = this.zzb;
        String string3 = "silent";
        super(this, string3);
        object.put(string3, zzal2);
        object = (zzal)this.zzb.get(string3);
        zzal2 = new zzu(this, bl2, bl2);
        ((zzal)object).zza(string2, zzal2);
        object = this.zzb;
        String string4 = "unmonitored";
        super(this, string4);
        object.put(string4, zzal2);
        object = (zzal)this.zzb.get(string4);
        zzal2 = new zzu(this, false, false);
        ((zzal)object).zza(string2, zzal2);
    }

    public static /* bridge */ /* synthetic */ zzv zza(zzr zzr2) {
        return zzr2.zzk;
    }

    public final zzaq zza(zzh zzh2, List list) {
        return zzaq.zzc;
    }
}

