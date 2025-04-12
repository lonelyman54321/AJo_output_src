/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzacn;
import com.google.android.gms.internal.gtm.zzaet;
import java.util.List;

final class zzacy {
    public static final List zza(Object object, long l2) {
        zzacn zzacn2 = (zzacn)zzaet.zzf(object, l2);
        int n3 = zzacn2.zzc();
        if (n3 == 0) {
            n3 = zzacn2.size();
            n3 = n3 == 0 ? 10 : (n3 += n3);
            zzacn2 = zzacn2.zzd(n3);
            zzaet.zzs(object, l2, zzacn2);
        }
        return zzacn2;
    }
}

