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

public final class zzjx
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        Preconditions.checkNotNull(object2);
        boolean bl2 = ((zzqo[])object2).length;
        boolean bl3 = false;
        boolean bl4 = true;
        if (bl2 != bl4) {
            bl4 = false;
        }
        Preconditions.checkArgument(bl4);
        bl2 = object2[0] instanceof zzqv;
        Preconditions.checkArgument(bl2);
        object = ((zzqv)object2[0]).zzk();
        object2 = zzqs.zze;
        bl3 = object.isEmpty();
        if (!bl3) {
            int n3 = object.size() + -1;
            return (zzqo)object.remove(n3);
        }
        return object2;
    }
}

