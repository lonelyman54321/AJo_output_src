/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbfb;
import com.google.android.gms.internal.ads.zzbfe;
import java.util.HashMap;
import java.util.Map;

public final class zzbfc {
    private final Map zza;
    private final zzbfe zzb;

    public zzbfc(zzbfe hashMap) {
        this.zzb = hashMap;
        this.zza = hashMap = new HashMap();
    }

    public final zzbfe zza() {
        return this.zzb;
    }

    public final void zzb(String string2, zzbfb zzbfb2) {
        this.zza.put(string2, zzbfb2);
    }

    public final void zzc(String string2, String object, long l2) {
        object = (zzbfb)this.zza.get(object);
        String[] stringArray = new String[]{string2};
        if (object != null) {
            zzbfe zzbfe2 = this.zzb;
            zzbfe2.zze((zzbfb)object, l2, stringArray);
        }
        object = this.zza;
        stringArray = new zzbfb(l2, null, null);
        object.put(string2, stringArray);
    }
}

