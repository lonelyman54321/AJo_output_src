/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzui;
import com.google.android.gms.internal.gtm.zzur;
import com.google.android.gms.internal.gtm.zzut;
import com.google.android.gms.internal.gtm.zzuu;
import com.google.android.gms.internal.gtm.zzux;
import com.google.android.gms.internal.gtm.zzuy;
import java.util.Set;

public final class zzuz {
    private static final zzuu zza;
    private static final zzut zzb;

    static {
        Object object = new zzux();
        zza = object;
        zzb = object = new zzuy();
    }

    public static zzur zza(Set object) {
        boolean bl2;
        Object object2 = zza;
        zzur zzur2 = new zzur((zzuu)object2, null);
        object = object.iterator();
        while (bl2 = object.hasNext()) {
            object2 = (zzui)object.next();
            zzur2.zzd((zzui)object2);
        }
        return zzur2;
    }
}

