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
import com.google.android.gms.internal.gtm.zzqr;
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzks
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        boolean bl2;
        double d2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        boolean bl8;
        zzqz zzqz2;
        boolean bl9;
        boolean bl10;
        Object object3;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        boolean bl22 = ((Object)object2).length;
        boolean bl32 = 2 != 0;
        boolean bl11 = false;
        if (bl22 == bl32) {
            bl22 = true;
        } else {
            bl22 = false;
            object3 = null;
        }
        Preconditions.checkArgument(bl22);
        object3 = object2[0];
        boolean bl12 = object3 instanceof zzqw;
        object2 = object2[n3];
        if (bl12 || (bl10 = object3 instanceof zzqv) || (bl9 = object3 instanceof zzqr)) {
            object3 = zzjn.zzd((zzqo)object3);
            zzqz2 = new zzqz((String)object3);
            object3 = zzqz2;
        }
        if ((bl8 = object2 instanceof zzqw) || (bl7 = object2 instanceof zzqv) || (bl6 = object2 instanceof zzqr)) {
            object2 = zzjn.zzd((zzqo)object2);
            zzqz2 = new zzqz((String)object2);
            object2 = zzqz2;
        }
        if ((bl5 = object3 instanceof zzqz) && (bl4 = object2 instanceof zzqz) || !(bl3 = Double.isNaN(d2 = zzjn.zzb((zzqo)object3))) && !(bl2 = Double.isNaN(d2 = zzjn.zzb((zzqo)object2)))) {
            boolean bl13 = zzjn.zzf((zzqo)object2, (zzqo)object3);
            bl11 = bl13 ^ true;
        }
        object2 = bl11;
        object = new zzqp((Boolean)object2);
        return object;
    }
}

