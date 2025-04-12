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
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzra;

public final class zzls
extends zzjo {
    /*
     * WARNING - void declaration
     */
    public final zzqo zza(zzhx zzhx2, zzqo ... object) {
        boolean bl2;
        Object object2;
        Object object3;
        Object object4;
        int n3;
        block15: {
            block14: {
                void var8_15;
                void var8_12;
                n3 = 1;
                Preconditions.checkArgument(n3 != 0);
                boolean bl5 = ((Object)object).length;
                boolean bl4 = 3 != 0;
                if (bl5 == bl4) {
                    bl5 = true;
                } else {
                    bl5 = false;
                    object4 = null;
                }
                Preconditions.checkArgument(bl5);
                object4 = object[0];
                object3 = object[n3];
                int n4 = 2;
                object = object[n4];
                object2 = zzqs.zzd;
                if (object4 != object2) {
                    boolean bl3 = true;
                } else {
                    boolean bl6 = false;
                    object2 = null;
                }
                Preconditions.checkArgument((boolean)var8_12);
                object2 = zzqs.zze;
                if (object4 != object2) {
                    boolean bl7 = true;
                } else {
                    boolean bl8 = false;
                    object2 = null;
                }
                Preconditions.checkArgument((boolean)var8_15);
                Preconditions.checkArgument((zzra.zzi((zzqo)object4) ^ n3) != 0);
                Preconditions.checkArgument((zzra.zzi((zzqo)object3) ^ n3) != 0);
                Preconditions.checkArgument((zzra.zzi((zzqo)object) ^ n3) != 0);
                boolean bl9 = zzra.zzj((zzqo)object4);
                if (bl9) break block14;
                object2 = zzjn.zzd((zzqo)object3);
                bl2 = object4 instanceof zzqw;
                if (!bl2) break block15;
                n3 = (int)(((zzqw)(object4 = (zzqw)object4)).zzk() ? 1 : 0);
                if (n3 == 0) {
                    ((zzqo)object4).zzf((String)object2, (zzqo)object);
                }
            }
            return object;
        }
        bl2 = object4 instanceof zzqv;
        if (bl2) {
            boolean bl10;
            double d2;
            double d5;
            Object object5 = object4;
            object5 = (zzqv)object4;
            String string2 = "length";
            boolean bl11 = string2.equals(object2);
            if (bl11) {
                double d7;
                double d9;
                double d12;
                double d13 = zzjn.zzb((zzqo)object);
                boolean bl12 = Double.isInfinite(d13);
                if (bl12 || (d12 = (d9 = d13 - (d7 = Math.floor(d13))) == 0.0 ? 0 : (d9 > 0.0 ? 1 : -1)) != false) {
                    n3 = 0;
                }
                Preconditions.checkArgument(n3 != 0);
                n3 = (int)d13;
                ((zzqv)object5).zzm(n3);
                return object;
            }
            double d14 = zzjn.zzb((zzqo)object3);
            n3 = (int)(Double.isInfinite(d14) ? 1 : 0);
            if (n3 == 0 && (n3 = (d5 = d14 - (d2 = 0.0)) == 0.0 ? 0 : (d5 > 0.0 ? 1 : -1)) >= 0 && (bl10 = ((String)object2).equals(object3 = Integer.toString(n3 = (int)d14)))) {
                ((zzqv)object5).zzl(n3, (zzqo)object);
                return object;
            }
        }
        ((zzqo)object4).zzf((String)object2, (zzqo)object);
        return object;
    }
}

