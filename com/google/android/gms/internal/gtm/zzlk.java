/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqx;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzlk
implements zzjm {
    public final zzqo zzd(zzhx object, zzqo ... object2) {
        zzqo zzqo2;
        boolean bl2 = true;
        boolean bl3 = object2 != null;
        Preconditions.checkArgument(bl3);
        bl3 = ((zzqo[])object2).length;
        if (bl3 != bl2) {
            bl2 = false;
            zzqo2 = null;
        }
        Preconditions.checkArgument(bl2);
        zzqo2 = object2[0];
        bl2 = zzqo2 instanceof zzqz;
        Preconditions.checkArgument(bl2);
        object2 = ((zzqz)object2[0]).zzk();
        object = ((zzhx)object).zzb((String)object2);
        boolean bl4 = object instanceof zzqx;
        if (!bl4) {
            bl4 = object instanceof zzqs;
            if (bl4 && object != (object2 = zzqs.zze) && object != (object2 = zzqs.zzd)) {
                object = new IllegalStateException("Illegal InternalType encountered in Get.");
                throw object;
            }
            return (zzqo)object;
        }
        object = new IllegalStateException("Illegal Statement type encountered in Get.");
        throw object;
    }
}

