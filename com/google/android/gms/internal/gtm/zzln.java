/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqz;
import com.google.android.gms.internal.gtm.zzra;

public final class zzln
extends zzjo {
    public static final zzln zza;

    static {
        zzln zzln2;
        zza = zzln2 = new zzln();
    }

    public final zzqo zza(zzhx object, zzqo ... object2) {
        zzqo zzqo2;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = ((zzqo[])object2).length;
        int n7 = 2;
        String string2 = null;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            zzqo2 = null;
        }
        Preconditions.checkArgument(n4 != 0);
        zzqo2 = object2[0];
        object2 = object2[n3];
        Preconditions.checkArgument((zzra.zzi(zzqo2) ^ n3) != 0);
        n7 = zzra.zzi((zzqo)object2);
        Preconditions.checkArgument((n3 ^= n7) != 0);
        object = zzjn.zzd((zzqo)object2);
        n7 = zzqo2 instanceof zzqv;
        string2 = "length";
        if (n7 != 0) {
            Object object3;
            double d2;
            n7 = (int)(string2.equals(object) ? 1 : 0);
            if (n7 != 0) {
                object2 = Boolean.TRUE;
                object = new zzqp((Boolean)object2);
                return object;
            }
            double d5 = zzjn.zzb((zzqo)object2);
            double d7 = d5 - (d2 = Math.floor(d5));
            Object object4 = d7 == 0.0 ? 0 : (d7 > 0.0 ? 1 : -1);
            if (object4 == false && (n7 = (int)(((String)object).equals(object3 = Integer.toString((int)(object4 = (Object)((int)d5)))) ? 1 : 0)) != 0 && object4 >= 0) {
                object3 = zzqo2;
                object3 = ((zzqv)zzqo2).zzk();
                n7 = object3.size();
                if (object4 < n7) {
                    object2 = Boolean.TRUE;
                    object = new zzqp((Boolean)object2);
                    return object;
                }
            }
        } else {
            n7 = zzqo2 instanceof zzqz;
            if (n7 != 0) {
                String string3;
                double d9;
                n7 = (int)(string2.equals(object) ? 1 : 0);
                if (n7 != 0) {
                    object2 = Boolean.TRUE;
                    object = new zzqp((Boolean)object2);
                    return object;
                }
                double d12 = zzjn.zzb((zzqo)object2);
                double d13 = d12 - (d9 = Math.floor(d12));
                Object object5 = d13 == 0.0 ? 0 : (d13 > 0.0 ? 1 : -1);
                if (object5 == false && (n3 = ((String)object).equals(string3 = Integer.toString((int)(object5 = (Object)((int)d12))))) != 0 && object5 >= 0 && object5 < (n3 = ((String)(object = ((zzqz)(zzqo2 = (zzqz)zzqo2)).zzk())).length())) {
                    object2 = Boolean.TRUE;
                    object = new zzqp((Boolean)object2);
                    return object;
                }
                object2 = Boolean.FALSE;
                object = new zzqp((Boolean)object2);
                return object;
            }
        }
        object = zzqo2.zzh((String)object);
        object2 = new zzqp((Boolean)object);
        return object2;
    }
}

