/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhcy;
import java.util.AbstractMap;

final class zzhcz {
    public static final boolean zza(Object object) {
        boolean bl2 = ((zzhcy)(object = (zzhcy)object)).zze();
        return !bl2;
    }

    public static final Object zzb(Object object, Object object2) {
        object = (zzhcy)object;
        boolean bl2 = ((AbstractMap)(object2 = (zzhcy)object2)).isEmpty();
        if (!bl2) {
            bl2 = ((zzhcy)object).zze();
            if (!bl2) {
                object = ((zzhcy)object).zzb();
            }
            ((zzhcy)object).zzd((zzhcy)object2);
        }
        return object;
    }
}

