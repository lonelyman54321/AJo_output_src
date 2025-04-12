/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzlc
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        String string2;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        boolean bl2 = ((Object)object2).length;
        boolean bl3 = 2 != 0;
        if (bl2 == bl3) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        Preconditions.checkArgument(bl2);
        bl2 = object2[0] instanceof zzqz;
        Preconditions.checkArgument(bl2);
        string2 = ((zzqz)object2[0]).zzk();
        boolean bl4 = ((zzhx)object).zzf(string2);
        if (bl4) {
            Object object3 = object2[n3];
            ((zzhx)object).zze(string2, (zzqo)object3);
            return object2[n3];
        }
        object = String.valueOf(string2);
        object = "Attempting to assign to undefined variable ".concat((String)object);
        object2 = new IllegalStateException((String)object);
        throw object2;
    }
}

