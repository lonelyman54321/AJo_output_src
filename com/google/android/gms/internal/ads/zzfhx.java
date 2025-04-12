/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.client.zzm;
import com.google.android.gms.ads.internal.zzu;
import com.google.android.gms.internal.ads.zzblp;
import com.google.android.gms.internal.ads.zzcgu;
import com.google.android.gms.internal.ads.zzcig;
import com.google.android.gms.internal.ads.zzefz;
import com.google.android.gms.internal.ads.zzegb;
import com.google.android.gms.internal.ads.zzfgt;
import com.google.android.gms.internal.ads.zzfoe;
import java.util.Map;

public final class zzfhx
implements zzblp {
    public final /* synthetic */ zzfoe zza;
    public final /* synthetic */ zzefz zzb;

    public /* synthetic */ zzfhx(zzfoe zzfoe2, zzefz zzefz2) {
        this.zza = zzfoe2;
        this.zzb = zzefz2;
    }

    public final void zza(Object object, Map object2) {
        zzegb zzegb2;
        object = (zzcgu)object;
        Object object3 = "u";
        Object object4 = object2 = object2.get(object3);
        object4 = (String)object2;
        if (object4 == null) {
            zzm.zzj("URL missing from httpTrack GMSG.");
            return;
        }
        object2 = object.zzD();
        boolean bl2 = ((zzfgt)object2).zzaj;
        if (!bl2) {
            this.zza.zzc((String)object4, null);
            return;
        }
        object2 = this.zzb;
        long l2 = zzu.zzB().currentTimeMillis();
        String string2 = ((zzcig)object).zzR().zzb;
        object3 = zzegb2;
        zzegb2 = new zzegb(l2, string2, (String)object4, 2);
        ((zzefz)((Object)object2)).zzd(zzegb2);
    }
}

