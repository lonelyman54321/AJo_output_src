/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzct;
import com.google.android.gms.internal.icing.zzez;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzes
extends zzez {
    public zzes(int n3) {
        super(n3, null);
    }

    public final void zza() {
        int n3 = this.zzb();
        if (n3 == 0) {
            boolean bl2;
            Object object;
            Map.Entry entry;
            int n4;
            Iterator iterator = null;
            for (n3 = 0; n3 < (n4 = this.zzc()); ++n3) {
                entry = this.zzd(n3);
                object = (zzct)entry.getKey();
                bl2 = object.zzc();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
            iterator = this.zze().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                entry = (Map.Entry)iterator.next();
                object = (zzct)entry.getKey();
                bl2 = object.zzc();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
        }
        super.zza();
    }
}

