/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjm;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzra;

public abstract class zzjo
implements zzjm {
    public abstract zzqo zza(zzhx var1, zzqo ... var2);

    public final zzqo zzd(zzhx object, zzqo ... zzqoArray) {
        int n3;
        zzqo[] zzqoArray2;
        int n4;
        boolean bl2 = true;
        Preconditions.checkArgument(bl2);
        if (zzqoArray != null) {
            n4 = 1;
        } else {
            n4 = 0;
            zzqoArray2 = null;
        }
        Preconditions.checkArgument(n4 != 0);
        n4 = zzqoArray.length;
        zzqoArray2 = new zzqo[n4];
        for (int i3 = 0; i3 < (n3 = zzqoArray.length); ++i3) {
            zzqo zzqo2 = zzqoArray[i3];
            if (zzqo2 != null) {
                n3 = 1;
            } else {
                n3 = 0;
                zzqo2 = null;
            }
            Preconditions.checkArgument(n3 != 0);
            zzqo2 = zzqoArray[i3];
            zzqs zzqs2 = zzqs.zzb;
            if (zzqo2 != zzqs2) {
                n3 = 1;
            } else {
                n3 = 0;
                zzqo2 = null;
            }
            Preconditions.checkArgument(n3 != 0);
            zzqo2 = zzqoArray[i3];
            zzqs zzqs3 = zzqs.zzc;
            if (zzqo2 != zzqs3) {
                n3 = 1;
            } else {
                n3 = 0;
                zzqo2 = null;
            }
            Preconditions.checkArgument(n3 != 0);
            zzqo2 = zzqoArray[i3];
            zzqoArray2[i3] = zzqo2 = zzra.zzc((zzhx)object, zzqo2);
            Preconditions.checkArgument(bl2);
            zzqo2 = zzqoArray2[i3];
            if (zzqo2 != zzqs2) {
                n3 = 1;
            } else {
                n3 = 0;
                zzqo2 = null;
            }
            Preconditions.checkArgument(n3 != 0);
            zzqo2 = zzqoArray2[i3];
            if (zzqo2 != zzqs3) {
                n3 = 1;
            } else {
                n3 = 0;
                zzqo2 = null;
            }
            Preconditions.checkArgument(n3 != 0);
        }
        if ((object = this.zza((zzhx)object, zzqoArray2)) == null) {
            bl2 = false;
        }
        Preconditions.checkState(bl2);
        return object;
    }
}

