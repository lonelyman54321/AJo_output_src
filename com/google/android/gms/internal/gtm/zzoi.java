/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 */
package com.google.android.gms.internal.gtm;

import android.os.Build;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;

public final class zzoi
implements zzjm {
    public final zzqo zzd(zzhx object, zzqo ... object2) {
        boolean bl2 = false;
        object = null;
        boolean bl3 = object2 != null;
        Preconditions.checkArgument(bl3);
        int n3 = ((zzqo[])object2).length;
        if (n3 == 0) {
            bl2 = true;
        }
        Preconditions.checkArgument(bl2);
        object2 = (double)Build.VERSION.SDK_INT;
        object = new zzqq((Double)object2);
        return object;
    }
}

