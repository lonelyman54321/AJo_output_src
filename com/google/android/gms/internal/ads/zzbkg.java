/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzbkh;
import com.google.android.gms.internal.ads.zzblp;
import java.util.Map;

public final class zzbkg
implements zzblp {
    private final zzbkh zza;

    public zzbkg(zzbkh zzbkh2) {
        this.zza = zzbkh2;
    }

    public final void zza(Object object, Map object2) {
        object = (String)object2.get("name");
        if (object == null) {
            zzm.zzj("App event with no name parameter.");
            return;
        }
        zzbkh zzbkh2 = this.zza;
        object2 = (String)object2.get("info");
        zzbkh2.zzb((String)object, (String)object2);
    }
}

