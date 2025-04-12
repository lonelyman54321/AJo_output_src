/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzhbc;
import com.google.android.gms.internal.ads.zzhem;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzhec
extends zzhem {
    public zzhec(int n3) {
        super(n3, null);
    }

    public final void zza() {
        int n3 = this.zzj();
        if (n3 == 0) {
            boolean bl2;
            Object object;
            Map.Entry entry;
            int n4;
            Iterator iterator = null;
            for (n3 = 0; n3 < (n4 = this.zzb()); ++n3) {
                entry = this.zzg(n3);
                object = (zzhbc)entry.getKey();
                bl2 = object.zzg();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
            iterator = this.zzc().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                entry = (Map.Entry)iterator.next();
                object = (zzhbc)entry.getKey();
                bl2 = object.zzg();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
        }
        super.zza();
    }
}

