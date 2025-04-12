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
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqz;
import com.google.android.gms.internal.gtm.zzra;

public final class zzlm
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        boolean bl2;
        Object object3;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        boolean bl3 = ((Object)object2).length;
        boolean bl4 = 2 != 0;
        int n4 = 0;
        String string2 = null;
        if (bl3 == bl4) {
            bl3 = true;
        } else {
            bl3 = false;
            object3 = null;
        }
        Preconditions.checkArgument(bl3);
        object3 = object2[0];
        boolean bl5 = object3 instanceof zzqz;
        object2 = object2[n3];
        if (bl5 || !(bl2 = zzra.zzj((zzqo)object3))) {
            n4 = 1;
        }
        Preconditions.checkArgument(n4 != 0);
        Preconditions.checkArgument((zzra.zzi((zzqo)object3) ^ n3) != 0);
        n4 = zzra.zzi((zzqo)object2);
        Preconditions.checkArgument((n3 ^= n4) != 0);
        object = zzjn.zzd((zzqo)object2);
        n4 = object3 instanceof zzqv;
        String string3 = "length";
        if (n4 != 0) {
            double d2;
            Object object4 = object3;
            object4 = (zzqv)object3;
            n4 = (int)(string3.equals(object) ? 1 : 0);
            if (n4 != 0) {
                object2 = (double)((zzqv)object4).zzk().size();
                object = new zzqq((Double)object2);
                return object;
            }
            double d5 = zzjn.zzb((zzqo)object2);
            double d7 = d5 - (d2 = Math.floor(d5));
            Object object5 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object5 == false && (n4 = (int)(((String)object).equals(string2 = Integer.toString((int)(object5 = (Object)((int)d5)))) ? 1 : 0)) != 0 && (object2 = ((zzqv)object4).zzi((int)object5)) != (object4 = zzqs.zze)) {
                return object2;
            }
        } else if (bl5) {
            String string4;
            double d9;
            object3 = (zzqz)object3;
            boolean bl6 = string3.equals(object);
            if (bl6) {
                object2 = (double)((zzqz)object3).zzk().length();
                object = new zzqq((Double)object2);
                return object;
            }
            double d12 = zzjn.zzb((zzqo)object2);
            double d13 = d12 - (d9 = Math.floor(d12));
            Object object6 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
            object = object6 == false && (n3 = ((String)object).equals(string4 = Integer.toString((int)(object6 = (Object)((int)d12))))) != 0 ? ((zzqz)object3).zzi((int)object6) : zzqs.zze;
            return object;
        }
        return ((zzqo)object3).zzb((String)object);
    }
}

