/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzalq;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzev;
import java.util.List;

public final class zzalp {
    public static void zza(zzalq object, zzalu zzalu2, zzev zzev2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = object.zza()); ++i3) {
            long l2 = object.zzb(i3);
            List list = object.zzc(l2);
            n3 = (int)(list.isEmpty() ? 1 : 0);
            if (n3 != 0) continue;
            n3 = object.zza() + -1;
            if (i3 != n3) {
                n3 = i3 + 1;
                long l3 = object.zzb(n3);
                long l4 = object.zzb(i3);
                long l7 = (l4 = l3 - l4) - (l3 = 0L);
                Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                if (object2 <= 0) continue;
                zzaln zzaln2 = new zzaln(list, l2, l4);
                zzev2.zza(zzaln2);
                continue;
            }
            object = new IllegalStateException();
            throw object;
        }
    }
}

