/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.internal.ads.zzaxd;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzciq;
import java.util.Map;

public final class zzbkq
implements zzblp {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void zza(Object object, Map object2) {
        int n3;
        object = (zzciq)object;
        Object object3 = zzblo.zza;
        object3 = (String)object2.get("tx");
        String string2 = (String)object2.get("ty");
        String string3 = "td";
        object2 = (String)object2.get(string3);
        try {
            n3 = Integer.parseInt((String)object3);
        }
        catch (NumberFormatException numberFormatException) {
            zzm.zzj("Could not parse touch parameters from gmsg.");
            return;
        }
        int n4 = Integer.parseInt(string2);
        int n7 = Integer.parseInt((String)object2);
        object = object.zzI();
        if (object == null) return;
        object = ((zzaxd)object).zzc();
        object.zzl(n3, n4, n7);
    }
}

