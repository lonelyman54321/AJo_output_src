/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzak;
import com.google.android.gms.internal.measurement.zzan;
import com.google.android.gms.internal.measurement.zzaq;
import com.google.android.gms.internal.measurement.zzas;
import com.google.android.gms.internal.measurement.zzh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public abstract class zzal
implements zzak,
zzaq {
    protected final String zza;
    protected final Map zzb;

    public zzal(String string2) {
        HashMap hashMap;
        this.zzb = hashMap = new HashMap();
        this.zza = string2;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        boolean bl2 = object instanceof zzal;
        if (!bl2) {
            return false;
        }
        object = (zzal)object;
        String string2 = this.zza;
        if (string2 != null) {
            object = ((zzal)object).zza;
            return string2.equals(object);
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.zza;
        if (string2 != null) {
            return string2.hashCode();
        }
        return 0;
    }

    public abstract zzaq zza(zzh var1, List var2);

    public final zzaq zza(String string2) {
        Map map2 = this.zzb;
        boolean bl2 = map2.containsKey(string2);
        if (bl2) {
            return (zzaq)this.zzb.get(string2);
        }
        return zzaq.zzc;
    }

    public final zzaq zza(String object, zzh object2, List list) {
        Object object3 = "toString";
        boolean bl2 = ((String)object3).equals(object);
        if (bl2) {
            object2 = this.zza;
            object = new zzas((String)object2);
            return object;
        }
        object3 = new zzas((String)object);
        return zzan.zza(this, (zzaq)object3, (zzh)object2, list);
    }

    public final String zza() {
        return this.zza;
    }

    public final void zza(String string2, zzaq zzaq2) {
        if (zzaq2 == null) {
            this.zzb.remove(string2);
            return;
        }
        this.zzb.put(string2, zzaq2);
    }

    public zzaq zzc() {
        return this;
    }

    public final boolean zzc(String string2) {
        return this.zzb.containsKey(string2);
    }

    public final Boolean zzd() {
        return Boolean.TRUE;
    }

    public final Double zze() {
        return 0.0 / 0.0;
    }

    public final String zzf() {
        return this.zza;
    }

    public final Iterator zzh() {
        return zzan.zza(this.zzb);
    }
}

