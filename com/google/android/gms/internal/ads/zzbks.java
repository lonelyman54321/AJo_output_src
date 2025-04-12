/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.internal.ads.zzblo;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzcik;
import com.google.android.gms.internal.ads.zzcir;
import java.util.Map;

public final class zzbks
implements zzblp {
    public final void zza(Object object, Map object2) {
        object = (zzcik)object;
        Object object3 = zzblo.zza;
        object3 = "u";
        if ((object2 = (String)object2.get(object3)) == null) {
            zzm.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        Context context = object.getContext();
        object = ((zzcir)object).zzn().afmaVersion;
        object3 = new zzca(context, (String)object, (String)object2);
        ((zzb)object3).zzb();
    }
}

