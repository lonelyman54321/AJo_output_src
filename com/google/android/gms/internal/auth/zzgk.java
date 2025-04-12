/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzeo;
import com.google.android.gms.internal.auth.zzgu;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzgk
extends zzgu {
    public zzgk(int n3) {
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
                object = (zzeo)entry.getKey();
                bl2 = object.zzc();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
            iterator = this.zzc().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                entry = (Map.Entry)iterator.next();
                object = (zzeo)entry.getKey();
                bl2 = object.zzc();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
        }
        super.zza();
    }
}

