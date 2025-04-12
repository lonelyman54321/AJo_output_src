/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzblp;
import java.util.Map;

final class zzbli
implements zzblp {
    public final void zza(Object object, Map map2) {
        object = String.valueOf((String)map2.get("string"));
        zzm.zzi("Received log message: ".concat((String)object));
    }
}

