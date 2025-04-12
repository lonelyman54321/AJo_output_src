/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzqo;
import java.util.HashMap;
import java.util.Map;

public final class zzhx {
    private zzhx zza;
    private Map zzb = null;

    public zzhx() {
        this(null);
    }

    private zzhx(zzhx zzhx2) {
        this.zza = zzhx2;
    }

    public final zzhx zza() {
        zzhx zzhx2 = new zzhx(this);
        return zzhx2;
    }

    public final zzqo zzb(String string2) {
        boolean bl2;
        Object object = this.zzb;
        if (object != null && (bl2 = object.containsKey(string2))) {
            return (zzqo)this.zzb.get(string2);
        }
        object = this.zza;
        if (object != null) {
            return ((zzhx)object).zzb(string2);
        }
        string2 = String.valueOf(string2);
        string2 = "Trying to get a non existent symbol: ".concat(string2);
        object = new IllegalStateException(string2);
        throw object;
    }

    public final void zzc(String string2, zzqo zzqo2) {
        HashMap hashMap = this.zzb;
        if (hashMap == null) {
            this.zzb = hashMap = new HashMap();
        }
        this.zzb.put(string2, zzqo2);
    }

    public final void zzd(String string2) {
        string2 = "gtm.globals.eventName";
        boolean bl2 = this.zzf(string2);
        Preconditions.checkState(bl2);
        Map map2 = this.zzb;
        if (map2 != null && (bl2 = map2.containsKey(string2))) {
            this.zzb.remove(string2);
            return;
        }
        this.zza.zzd(string2);
    }

    public final void zze(String string2, zzqo object) {
        boolean bl2;
        Object object2 = this.zzb;
        if (object2 != null && (bl2 = object2.containsKey(string2))) {
            this.zzb.put(string2, object);
            return;
        }
        object2 = this.zza;
        if (object2 != null) {
            ((zzhx)object2).zze(string2, (zzqo)object);
            return;
        }
        string2 = String.valueOf(string2);
        string2 = "Trying to modify a non existent symbol: ".concat(string2);
        object = new IllegalStateException(string2);
        throw object;
    }

    public final boolean zzf(String string2) {
        boolean bl2;
        Object object = this.zzb;
        if (object != null && (bl2 = object.containsKey(string2))) {
            return true;
        }
        object = this.zza;
        if (object != null) {
            return ((zzhx)object).zzf(string2);
        }
        return false;
    }
}

