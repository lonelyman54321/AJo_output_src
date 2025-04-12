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
import com.google.android.gms.internal.gtm.zzqv;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzqz;

public final class zzlx
extends zzjo {
    public final zzqo zza(zzhx object, zzqo ... object2) {
        boolean bl2;
        Object object3;
        int n3 = 1;
        Preconditions.checkArgument(n3 != 0);
        boolean bl3 = ((Object)object2).length;
        boolean bl4 = 2 != 0;
        if (bl3 == bl4) {
            bl3 = true;
        } else {
            bl3 = false;
            object3 = null;
        }
        Preconditions.checkArgument(bl3);
        object3 = object2[0];
        boolean bl5 = object3 instanceof zzqs;
        object = object2[n3];
        if (bl5 && object3 != (object2 = zzqs.zze) && object3 != (object2 = zzqs.zzd) || (bl2 = object instanceof zzqs) && object != (object2 = zzqs.zze) && object != (object2 = zzqs.zzd)) {
            object = new IllegalArgumentException("Illegal InternalType passed to Add.");
            throw object;
        }
        bl2 = object3 instanceof zzqw;
        if (bl2 || (bl2 = object3 instanceof zzqv) || (bl2 = object3 instanceof zzqr)) {
            object3 = zzjn.zzd((zzqo)object3);
            object3 = object2 = new zzqz((String)object3);
        }
        if ((bl2 = object instanceof zzqw) || (bl2 = object instanceof zzqv) || (bl2 = object instanceof zzqr)) {
            object = zzjn.zzd((zzqo)object);
            object = object2 = new zzqz((String)object);
        }
        if (!(bl2 = object3 instanceof zzqz) && !(bl2 = object instanceof zzqz)) {
            object = zzjn.zzc((zzqo)object3, (zzqo)object);
            object2 = new zzqq((Double)object);
            return object2;
        }
        object3 = zzjn.zzd((zzqo)object3);
        object = zzjn.zzd((zzqo)object);
        object3 = String.valueOf(object3);
        object = String.valueOf(object);
        object = ((String)object3).concat((String)object);
        object2 = new zzqz((String)object);
        return object2;
    }
}

