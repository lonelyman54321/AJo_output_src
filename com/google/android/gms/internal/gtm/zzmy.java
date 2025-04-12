/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.gtm.zzhx;
import com.google.android.gms.internal.gtm.zzjo;
import com.google.android.gms.internal.gtm.zzmx;
import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqs;
import com.google.android.gms.internal.gtm.zzqw;
import com.google.android.gms.internal.gtm.zzqx;
import com.google.android.gms.internal.gtm.zzqz;
import com.google.android.gms.internal.gtm.zzra;
import java.util.HashMap;

public final class zzmy
extends zzjo {
    private final zzmx zza;

    public zzmy(zzmx zzmx2) {
        this.zza = zzmx2;
    }

    public final zzqo zza(zzhx iterator, zzqo ... object) {
        Object object2;
        HashMap<Object, Object> hashMap;
        boolean bl2;
        Preconditions.checkNotNull(object);
        boolean bl3 = ((Object)object).length;
        String string2 = null;
        int n3 = 1;
        if (bl3 > false) {
            bl2 = true;
        } else {
            bl2 = false;
            hashMap = null;
        }
        Preconditions.checkArgument(bl2);
        bl2 = object[0] instanceof zzqz;
        Preconditions.checkArgument(bl2);
        string2 = ((zzqz)object[0]).zzk();
        hashMap = new HashMap<Object, Object>();
        boolean bl4 = 2 != 0;
        if (bl3 >= bl4 && (iterator = object[n3]) != (object2 = zzqs.zze)) {
            boolean bl5;
            bl3 = iterator instanceof zzqw;
            Preconditions.checkArgument(bl3);
            iterator = ((zzqw)object[n3]).zzi().entrySet().iterator();
            while (bl5 = iterator.hasNext()) {
                object = iterator.next();
                Preconditions.checkState((object.getValue() instanceof zzqx ^ n3) != 0);
                boolean bl6 = zzra.zzi((zzqo)object.getValue()) ^ n3;
                Preconditions.checkState(bl6);
                object2 = (String)object.getKey();
                object = ((zzqo)object.getValue()).zzc();
                hashMap.put(object2, object);
            }
        }
        return zzra.zzb(this.zza.zza(string2, hashMap));
    }
}

