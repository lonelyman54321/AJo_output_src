/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzmj
extends zzjo {
    /*
     * Enabled aggressive block sorting
     */
    public final zzqo zza(zzhx object, zzqo ... object2) {
        double d2;
        double d5;
        zzqs zzqs2;
        double d7;
        String string2;
        boolean bl2;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = ((zzqo[])object2).length;
        int n7 = 3;
        if (n4 > 0 && n4 <= n7) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        Preconditions.checkArgument(bl2);
        bl2 = object2[0] instanceof zzqz;
        Preconditions.checkArgument(bl2);
        string2 = ((zzqz)object2[0]).zzk();
        int n8 = 2;
        double d9 = 0.0;
        if (n4 < n8) {
            d7 = d9;
        } else {
            object = object2[n3];
            d7 = zzjn.zza((zzqo)object);
        }
        n3 = string2.length();
        double d12 = n3;
        if (n4 == n7 && (object = object2[n8]) != (zzqs2 = zzqs.zze)) {
            d12 = zzjn.zza((zzqo)object);
        }
        if ((n3 = (int)(d7 == d9 ? 0 : (d7 < d9 ? -1 : 1))) < 0) {
            n3 = string2.length();
            d5 = Math.max((double)n3 + d7, d9);
        } else {
            n3 = string2.length();
            d5 = n3;
            d5 = Math.min(d7, d5);
        }
        n3 = (int)d5;
        double d13 = d12 == d9 ? 0 : (d12 < d9 ? -1 : 1);
        if (d13 < 0) {
            d13 = string2.length();
            d2 = Math.max((double)d13 + d12, d9);
        } else {
            d13 = string2.length();
            d2 = d13;
            d2 = Math.min(d12, d2);
        }
        d13 = (int)d2;
        d13 -= n3;
        d13 = Math.max(0, (int)d13) + n3;
        object = string2.substring(n3, (int)d13);
        return new zzqz((String)object);
    }
}

