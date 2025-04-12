/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzfiy;
import com.google.android.gms.internal.ads.zzfjc;
import com.google.android.gms.internal.ads.zzfjd;
import com.google.android.gms.internal.ads.zzfjg;
import com.google.android.gms.internal.ads.zzfjj;
import com.google.android.gms.internal.ads.zzfjp;
import com.google.android.gms.internal.ads.zzfjw;
import com.google.android.gms.internal.ads.zzfjy;
import java.util.HashMap;

public final class zzfjq {
    private final HashMap zza;

    public zzfjq() {
        HashMap hashMap;
        this.zza = hashMap = new HashMap();
    }

    public final zzfjp zza(zzfjg zzfjg2, Context object, zzfiy object2, zzfjw zzfjw2) {
        Object object3 = (zzfjp)this.zza.get((Object)zzfjg2);
        if (object3 == null) {
            object = zzfjj.zza(zzfjg2, object);
            object3 = new zzfjd((zzfjj)object);
            object = new zzfjy((zzfjc)object3, (zzfiy)object2, zzfjw2);
            object2 = new zzfjp((zzfjc)object3, (zzfjy)object);
            this.zza.put(zzfjg2, object2);
            return object2;
        }
        return object3;
    }
}

