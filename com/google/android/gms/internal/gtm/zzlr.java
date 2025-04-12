/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;

public final class zzlr
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = ((zzqo[])object2).length;
        if (n4 > n3) {
            n3 = 0;
            object = null;
        }
        Preconditions.checkArgument(n3 != 0);
        object = n4 <= 0 ? zzqs.zze : object2[0];
        object2 = new zzqs((zzqo)object);
        return object2;
    }
}

