/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzjy;
import com.google.android.gms.internal.measurement.zzmj;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzmi
extends zzmj {
    public zzmi() {
        super(null);
    }

    public final void zza() {
        int n3 = this.zze();
        if (n3 == 0) {
            boolean bl2;
            Object object;
            Map.Entry entry;
            int n4;
            Iterator iterator = null;
            for (n3 = 0; n3 < (n4 = this.zzb()); ++n3) {
                entry = this.zza(n3);
                object = (zzjy)entry.getKey();
                bl2 = object.zze();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
            iterator = this.zzc().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                entry = (Map.Entry)iterator.next();
                object = (zzjy)entry.getKey();
                bl2 = object.zze();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
        }
        super.zza();
    }
}

