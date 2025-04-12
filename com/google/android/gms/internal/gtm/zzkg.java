/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzkh;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;

final class zzkg
implements zzjm {
    private zzkg() {
        throw null;
    }

    public /* synthetic */ zzkg(zzkh zzkh2) {
    }

    public final zzqo zzd(zzhx object, zzqo ... object2) {
        object = zzjn.zzd(object2[0]);
        object2 = zzjn.zzd(object2[1]);
        object = (double)((String)object).compareTo((String)object2);
        zzqq zzqq2 = new zzqq((Double)object);
        return zzqq2;
    }
}

