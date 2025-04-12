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
import com.google.android.gms.internal.gtm.zzqz;
import com.google.android.gms.internal.gtm.zzra;
import java.util.List;

public final class zzlj
extends zzjo {
    public final zzqo zza(zzhx zzhx2, zzqo ... object) {
        String string2;
        Preconditions.checkNotNull(object);
        boolean bl2 = ((Object)object).length;
        boolean bl3 = 3 != 0;
        boolean bl4 = true;
        boolean bl5 = false;
        zzqs zzqs2 = null;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        Preconditions.checkArgument(bl2);
        bl2 = object[0] instanceof zzqz;
        Preconditions.checkArgument(bl2);
        string2 = ((zzqz)object[0]).zzk();
        boolean bl6 = zzhx2.zzf(string2);
        Preconditions.checkArgument(bl6);
        Object object2 = object[bl4];
        Preconditions.checkNotNull(object2);
        object = object[2];
        bl4 = object instanceof zzqv;
        Preconditions.checkArgument(bl4);
        object = ((zzqv)object).zzk();
        object2 = ((zzqo)object2).zze();
        while (bl4 = object2.hasNext()) {
            zzqo zzqo2 = (zzqo)object2.next();
            zzhx2.zze(string2, zzqo2);
            zzqo2 = zzra.zzf(zzhx2, (List)object);
            zzqs2 = zzqs.zzb;
            if (zzqo2 == zzqs2) break;
            bl5 = ((zzqs)zzqo2).zzj();
            if (!bl5) continue;
            return zzqo2;
        }
        return zzqs.zze;
    }
}

