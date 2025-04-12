/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzmh
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        int n3;
        String string2;
        boolean bl2;
        int n4 = 2;
        int n7 = 1;
        Preconditions.checkArgument(n7 != 0);
        int n8 = ((zzqo[])object2).length;
        int n10 = 3;
        if (n8 > 0 && n8 <= n10) {
            bl2 = true;
        } else {
            bl2 = false;
            string2 = null;
        }
        Preconditions.checkArgument(bl2);
        bl2 = object2[0] instanceof zzqz;
        Preconditions.checkArgument(bl2);
        string2 = ((zzqz)object2[0]).zzk();
        if (n8 == n7) {
            object = new zzqz(string2);
            return object;
        }
        String string3 = zzjn.zzd(object2[n7]);
        object2 = n8 < n10 ? zzqs.zze : object2[n4];
        n8 = string2.indexOf(string3);
        if (n8 == (n3 = -1)) {
            object = new zzqz(string2);
            return object;
        }
        n3 = object2 instanceof zzqr;
        if (n3 != 0) {
            object2 = ((zzqr)object2).zzi();
            zzqz zzqz2 = new zzqz(string3);
            double d2 = n8;
            Object object3 = d2;
            zzqq zzqq2 = new zzqq((Double)object3);
            object3 = new zzqz(string2);
            zzqo[] zzqoArray = new zzqo[n10];
            zzqoArray[0] = zzqz2;
            zzqoArray[n7] = zzqq2;
            zzqoArray[n4] = object3;
            object2 = object2.zzd((zzhx)object, zzqoArray);
        }
        object = zzjn.zzd((zzqo)object2);
        String string4 = string2.substring(0, n8);
        n7 = string3.length() + n8;
        String string5 = string2.substring(n7);
        object = n1.a(string4, (String)object, string5);
        object2 = new zzqz((String)object);
        return object2;
    }
}

