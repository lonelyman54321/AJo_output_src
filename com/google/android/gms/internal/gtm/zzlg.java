/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqv;
import java.util.ArrayList;

public final class zzlg
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... zzqoArray) {
        int n3;
        boolean bl2 = true;
        Preconditions.checkArgument(bl2);
        ArrayList<zzqo> arrayList = new ArrayList<zzqo>();
        for (int i3 = 0; i3 < (n3 = zzqoArray.length); ++i3) {
            zzqs zzqs2;
            zzqo zzqo2 = zzqoArray[i3];
            boolean bl3 = zzqo2 instanceof zzqs;
            if (!bl3 || zzqo2 == (zzqs2 = zzqs.zze) || zzqo2 == (zzqs2 = zzqs.zzd)) {
                bl3 = true;
            } else {
                bl3 = false;
                zzqs2 = null;
            }
            Preconditions.checkArgument(bl3);
            arrayList.add(zzqo2);
        }
        object = new zzqv(arrayList);
        return object;
    }
}

