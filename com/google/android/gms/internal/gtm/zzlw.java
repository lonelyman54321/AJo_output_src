/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzjn;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqp;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzra;
import java.util.List;

public final class zzlw
implements zzjm {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final zzqo zzd(zzhx zzhx2, zzqo ... zzqoArray) {
        zzqs zzqs2;
        Object object;
        int n3;
        int n4 = 1;
        if (zzqoArray != null) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        Preconditions.checkArgument(n3 != 0);
        n3 = zzqoArray.length;
        int n7 = 4;
        if (n3 == n7) {
            n3 = 1;
        } else {
            n3 = 0;
            object = null;
        }
        Preconditions.checkArgument(n3 != 0);
        n3 = 3;
        object = zzqoArray[n3];
        object = zzra.zzc(zzhx2, (zzqo)object);
        Preconditions.checkArgument(object instanceof zzqv);
        object = ((zzqv)object).zzk();
        Object object2 = zzqoArray[2];
        boolean bl2 = object2 instanceof zzqp;
        Preconditions.checkArgument(bl2);
        object2 = ((zzqp)object2).zzi();
        n7 = (int)(((Boolean)object2).booleanValue() ? 1 : 0);
        if (n7 != 0) {
            object2 = zzra.zzf(zzhx2, (List)object);
            if (object2 == (zzqs2 = zzqs.zzb)) return zzqs.zze;
            bl2 = ((zzqs)object2).zzj();
            if (bl2) {
                return object2;
            }
        }
        while (true) {
            object2 = zzqoArray[0];
            n7 = (int)(zzjn.zzg((zzqo)(object2 = zzra.zzc(zzhx2, (zzqo)object2))) ? 1 : 0);
            if (n7 == 0 || (object2 = zzra.zzf(zzhx2, (List)object)) == (zzqs2 = zzqs.zzb)) return zzqs.zze;
            bl2 = ((zzqs)object2).zzj();
            if (bl2) {
                return object2;
            }
            object2 = zzqoArray[n4];
            zzra.zzc(zzhx2, (zzqo)object2);
        }
    }
}

