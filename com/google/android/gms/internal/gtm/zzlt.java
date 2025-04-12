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
import com.google.android.gms.internal.gtm.zzra;
import java.util.List;

public final class zzlt
extends zzjo {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final zzqo zza(zzhx object, zzqo ... object2) {
        boolean bl2;
        Object object3;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        int n4 = ((Object)object2).length;
        int n7 = 3;
        int n8 = 0;
        if (n4 == n7) {
            n4 = 1;
        } else {
            n4 = 0;
            object3 = null;
        }
        Preconditions.checkArgument(n4 != 0);
        object3 = object2[n3];
        Preconditions.checkArgument(object3 instanceof zzqv);
        n4 = 2;
        n7 = object2[n4] instanceof zzqv;
        Preconditions.checkArgument(n7 != 0);
        Object object4 = object2[0];
        List list = ((zzqv)object2[n3]).zzk();
        object2 = ((zzqv)object2[n4]).zzk();
        n4 = object2.size();
        int n10 = list.size() + n3;
        if (n4 <= n10) {
            n4 = 1;
        } else {
            n4 = 0;
            object3 = null;
        }
        Preconditions.checkArgument(n4 != 0);
        n4 = 0;
        object3 = null;
        while (n8 < (n10 = list.size())) {
            block11: {
                zzqo zzqo2;
                block10: {
                    if (n4 != 0) break block10;
                    zzqo2 = (zzqo)list.get(n8);
                    n10 = (int)(zzjn.zzh((zzqo)object4, zzqo2 = zzra.zzc((zzhx)object, zzqo2)) ? 1 : 0);
                    if (n10 == 0) break block11;
                }
                zzqo2 = (zzqo)object2.get(n8);
                boolean bl3 = (zzqo2 = zzra.zzc((zzhx)object, zzqo2)) instanceof zzqs;
                if (bl3) {
                    zzqo zzqo3 = zzqs.zzc;
                    if (zzqo2 == zzqo3) return zzqo2;
                    zzqo3 = zzqo2;
                    zzqo3 = (zzqs)zzqo2;
                    bl3 = ((zzqs)zzqo3).zzj();
                    if (bl3) return zzqo2;
                    zzqo3 = zzqs.zzb;
                    if (zzqo2 == zzqo3) return zzqs.zze;
                } else {
                    n4 = 1;
                }
            }
            ++n8;
        }
        n3 = list.size();
        if (n3 >= (n4 = object2.size()) || !(bl2 = (object = zzra.zzc((zzhx)object, (zzqo)(object2 = (zzqo)object2.get(n3 = object2.size() + -1)))) instanceof zzqs)) return zzqs.zze;
        object2 = zzqs.zzc;
        if (object == object2) return (zzqo)object;
        object2 = object;
        object2 = (zzqs)object;
        bl2 = ((zzqs)object2).zzj();
        if (!bl2) return zzqs.zze;
        return (zzqo)object;
    }
}

