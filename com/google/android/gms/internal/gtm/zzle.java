/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzra;

public final class zzle
extends zzjo {
    public final zzqo zza(zzhx zzhx2, zzqo ... object) {
        zzqo zzqo2;
        boolean bl2 = true;
        Preconditions.checkArgument(bl2);
        boolean bl3 = ((zzqo[])object).length;
        if (bl3 != bl2) {
            bl2 = false;
            zzqo2 = null;
        }
        Preconditions.checkArgument(bl2);
        zzqo2 = object[0];
        bl2 = zzqo2 instanceof zzqv;
        Preconditions.checkArgument(bl2);
        object = ((zzqv)object[0]).zzk().iterator();
        while (bl2 = object.hasNext()) {
            zzqo2 = (zzqo)object.next();
            bl3 = (zzqo2 = zzra.zzc(zzhx2, zzqo2)) instanceof zzqs;
            if (!bl3) continue;
            zzqo zzqo3 = zzqs.zzb;
            if (zzqo2 != zzqo3 && zzqo2 != (zzqo3 = zzqs.zzc)) {
                zzqo3 = zzqo2;
                zzqo3 = (zzqs)zzqo2;
                bl3 = ((zzqs)zzqo3).zzj();
                if (!bl3) continue;
            }
            return zzqo2;
        }
        return zzqs.zze;
    }
}

