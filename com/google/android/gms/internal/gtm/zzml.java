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
import com.google.android.gms.internal.gtm.zzra;

public final class zzml
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        zzqs zzqs2;
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
        zzqo zzqo2 = n4 < n8 ? zzqs.zze : object2[n3];
        double d2 = zzjn.zza(zzqo2);
        n3 = (int)d2;
        int n10 = string2.length();
        if (n4 == n7 && (object2 = object2[n8]) != (zzqs2 = zzqs.zze)) {
            object = zzra.zzc((zzhx)object, (zzqo)object2);
            double d5 = zzjn.zza((zzqo)object);
            n10 = (int)d5;
        }
        int n14 = Math.max(n3, 0);
        int n15 = string2.length();
        n14 = Math.min(n14, n15);
        n15 = Math.max(n10, 0);
        n3 = string2.length();
        n15 = Math.min(n15, n3);
        n4 = Math.min(n14, n15);
        n14 = Math.max(n14, n15);
        object = string2.substring(n4, n14);
        zzqo2 = new zzqz((String)object);
        return zzqo2;
    }
}

