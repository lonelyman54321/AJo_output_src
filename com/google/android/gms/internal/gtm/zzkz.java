/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzra;

public final class zzkz
implements zzjm {
    public final zzqo zzd(zzhx object, zzqo ... object2) {
        int n3 = 0;
        Object zzqo2 = null;
        int n4 = 1;
        boolean bl2 = object2 != null;
        Preconditions.checkArgument(bl2);
        bl2 = ((Object)object2).length;
        boolean bl3 = 3 != 0;
        bl2 = bl2 == bl3;
        Preconditions.checkArgument(bl2);
        zzqo2 = object2[0];
        zzqo2 = zzra.zzc((zzhx)object, (zzqo)zzqo2);
        n3 = zzjn.zzg((zzqo)zzqo2);
        if (n3 != 0) {
            object2 = object2[n4];
            object = zzra.zzc((zzhx)object, (zzqo)object2);
        } else {
            n3 = 2;
            object2 = object2[n3];
            object = zzra.zzc((zzhx)object, (zzqo)object2);
        }
        boolean bl4 = object instanceof zzqs;
        if (bl4 && object != (object2 = zzqs.zze) && object != (object2 = zzqs.zzd)) {
            object = new IllegalArgumentException("Illegal InternalType passed to Ternary.");
            throw object;
        }
        return (zzqo)object;
    }
}

