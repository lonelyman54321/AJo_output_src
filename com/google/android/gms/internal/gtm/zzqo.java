/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzql;
import com.google.android.gms.internal.gtm.zzqm;
import com.google.android.gms.internal.gtm.zzqs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public abstract class zzqo {
    protected Map zza;

    public abstract String toString();

    public zzjm zza(String string2) {
        string2 = cP.a("Attempting to access Native Method ", string2, " on unsupported type.");
        IllegalStateException illegalStateException = new IllegalStateException(string2);
        throw illegalStateException;
    }

    public zzqo zzb(String object) {
        Map map2 = this.zza;
        object = map2 != null ? (zzqo)map2.get(object) : zzqs.zze;
        return object;
    }

    public abstract Object zzc();

    public final Iterator zzd() {
        Object object = this.zza;
        if (object == null) {
            object = new zzqm(null);
            return object;
        }
        object = object.keySet().iterator();
        zzql zzql2 = new zzql(this, (Iterator)object);
        return zzql2;
    }

    public Iterator zze() {
        zzqm zzqm2 = new zzqm(null);
        return zzqm2;
    }

    public final void zzf(String string2, zzqo zzqo2) {
        HashMap hashMap = this.zza;
        if (hashMap == null) {
            this.zza = hashMap = new HashMap();
        }
        this.zza.put(string2, zzqo2);
    }

    public boolean zzg(String string2) {
        return false;
    }

    public final boolean zzh(String string2) {
        boolean bl2;
        Map map2 = this.zza;
        return map2 != null && (bl2 = map2.containsKey(string2));
    }
}

