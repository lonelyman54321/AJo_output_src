/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzln;
import com.google.android.gms.internal.gtm.zzmp;
import com.google.android.gms.internal.gtm.zzqo;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class zzqp
extends zzqo {
    private static final Map zzb;
    private final Boolean zzc;

    static {
        HashMap<String, zzjo> hashMap = new HashMap<String, zzjo>();
        zzln zzln2 = zzln.zza;
        hashMap.put("hasOwnProperty", zzln2);
        zzmp zzmp2 = new zzmp();
        hashMap.put("toString", zzmp2);
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzqp(Boolean bl2) {
        Preconditions.checkNotNull(bl2);
        this.zzc = bl2;
    }

    public final boolean equals(Object object) {
        block4: {
            boolean bl2;
            block3: {
                block2: {
                    if (this != object) break block2;
                    bl2 = true;
                    break block3;
                }
                boolean bl3 = object instanceof zzqp;
                if (bl3) break block4;
                bl2 = false;
                object = null;
            }
            return bl2;
        }
        object = ((zzqp)object).zzc;
        Boolean bl4 = this.zzc;
        return ((Boolean)object).equals(bl4);
    }

    public final String toString() {
        return this.zzc.toString();
    }

    public final zzjm zza(String string2) {
        boolean bl2 = this.zzg(string2);
        if (bl2) {
            return (zzjm)zzb.get(string2);
        }
        string2 = cP.a("Native Method ", string2, " is not defined for type BooleanWrapper.");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final /* synthetic */ Object zzc() {
        return this.zzc;
    }

    public final boolean zzg(String string2) {
        return zzb.containsKey(string2);
    }

    public final Boolean zzi() {
        return this.zzc;
    }
}

