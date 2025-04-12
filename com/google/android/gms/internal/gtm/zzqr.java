/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzln;
import com.google.android.gms.internal.gtm.zzqo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class zzqr
extends zzqo {
    private static final Map zzb;
    private final zzjm zzc;

    static {
        HashMap<String, zzln> hashMap = new HashMap<String, zzln>();
        zzln zzln2 = zzln.zza;
        hashMap.put("hasOwnProperty", zzln2);
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzqr(zzjm zzjm2) {
        this.zzc = zzjm2;
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzjm zza(String string2) {
        boolean bl2 = this.zzg(string2);
        if (bl2) {
            return (zzjm)zzb.get(string2);
        }
        string2 = cP.a("Native Method ", string2, " is not defined for type InstructionReference.");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    public final Iterator zze() {
        return this.zzd();
    }

    public final boolean zzg(String string2) {
        return zzb.containsKey(string2);
    }

    public final zzjm zzi() {
        return this.zzc;
    }
}

