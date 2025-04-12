/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 */
package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.internal.ads.zzeyo;
import com.google.android.gms.internal.ads.zzgfa;
import com.google.android.gms.internal.ads.zzgft;
import com.google.android.gms.internal.ads.zzhbi;
import com.google.android.gms.internal.ads.zzhfn;
import com.google.android.gms.internal.ads.zzhfo;
import com.google.android.gms.internal.ads.zzhfp;
import com.google.android.gms.internal.ads.zzhfq;
import com.google.common.util.concurrent.ListenableFuture;

public final class zzeyk
implements zzgfa {
    public final ListenableFuture zza(Object object) {
        object = (nz0_0)object;
        int n3 = 1;
        if (object == null) {
            String string2 = "";
            object = new zzeyo(string2, n3, null);
            object = zzgft.zzh(object);
        } else {
            boolean bl2;
            Object object2 = zzhfq.zzc();
            object = ((nz0_0)object).a.iterator();
            while (bl2 = object.hasNext()) {
                Object object3 = (Lo3)object.next();
                zzhfn zzhfn2 = zzhfo.zzc();
                int n4 = ((Lo3)object3).c;
                zzhfn2.zzc(n4);
                long l2 = ((Lo3)object3).b;
                zzhfn2.zza(l2);
                l2 = ((Lo3)object3).a;
                zzhfn2.zzb(l2);
                object3 = (zzhfo)zzhfn2.zzbn();
                ((zzhfp)object2).zza((zzhfo)object3);
            }
            object = Base64.encodeToString((byte[])((zzhfq)((zzhbi)object2).zzbn()).zzaV(), (int)n3);
            object2 = new zzeyo((String)object, n3, null);
            object = zzgft.zzh(object2);
        }
        return object;
    }
}

