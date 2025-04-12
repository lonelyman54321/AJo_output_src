/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzln;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class zzqw
extends zzqo {
    private static final Map zzb;
    private boolean zzc = false;

    static {
        HashMap<String, zzln> hashMap = new HashMap<String, zzln>();
        zzln zzln2 = zzln.zza;
        hashMap.put("hasOwnProperty", zzln2);
        zzb = Collections.unmodifiableMap(hashMap);
    }

    public zzqw(Map map2) {
        this.zza = map2 = (Map)Preconditions.checkNotNull(map2);
    }

    public final boolean equals(Object set) {
        block4: {
            boolean bl2;
            block3: {
                block2: {
                    if (this != set) break block2;
                    bl2 = true;
                    break block3;
                }
                boolean bl3 = set instanceof zzqw;
                if (bl3) break block4;
                bl2 = false;
                set = null;
            }
            return bl2;
        }
        Set set2 = this.zza.entrySet();
        set = ((zzqw)((Object)set)).zza.entrySet();
        return ((Object)set2).equals(set);
    }

    public final String toString() {
        return this.zza.toString();
    }

    public final zzjm zza(String string2) {
        boolean bl2 = this.zzg(string2);
        if (bl2) {
            return (zzjm)zzb.get(string2);
        }
        string2 = cP.a("Native Method ", string2, " is not defined for type ListWrapper.");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public final zzqo zzb(String object) {
        if ((object = super.zzb((String)object)) == null) {
            object = zzqs.zze;
        }
        return object;
    }

    public final /* synthetic */ Object zzc() {
        return this.zza;
    }

    public final Iterator zze() {
        return this.zzd();
    }

    public final boolean zzg(String string2) {
        return zzb.containsKey(string2);
    }

    public final Map zzi() {
        return this.zza;
    }

    public final void zzj() {
        this.zzc = true;
    }

    public final boolean zzk() {
        return this.zzc;
    }
}

