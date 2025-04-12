/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgzv;
import com.google.android.gms.internal.ads.zzhac;
import java.util.Comparator;

final class zzgzs
implements Comparator {
    public final /* synthetic */ int compare(Object object, Object object2) {
        int n3;
        block1: {
            object = (zzhac)object;
            object2 = (zzhac)object2;
            zzgzv zzgzv2 = ((zzhac)object).zzs();
            zzgzv zzgzv3 = ((zzhac)object2).zzs();
            while ((n3 = zzgzv2.hasNext()) != 0 && (n3 = zzgzv3.hasNext()) != 0) {
                int n4;
                Integer n7;
                Integer n8 = zzgzv2.zza() & 0xFF;
                n3 = n8.compareTo(n7 = Integer.valueOf(n4 = zzgzv3.zza() & 0xFF));
                if (n3 == 0) continue;
                break block1;
            }
            int n10 = ((zzhac)object).zzd();
            object = n10;
            int n14 = ((zzhac)object2).zzd();
            object2 = n14;
            n3 = ((Integer)object).compareTo((Integer)object2);
        }
        return n3;
    }
}

