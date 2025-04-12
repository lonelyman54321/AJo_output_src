/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzabu;
import com.google.android.gms.internal.gtm.zzaeb;
import com.google.android.gms.internal.gtm.zzaef;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzaea
extends zzaef {
    public zzaea() {
        super(null);
    }

    public final void zza() {
        int n3 = this.zzj();
        if (n3 == 0) {
            boolean bl2;
            Object object;
            Map.Entry entry;
            int n4;
            Iterator iterator = null;
            for (n3 = 0; n3 < (n4 = this.zzc()); ++n3) {
                entry = this.zzg(n3);
                object = entry;
                object = (zzabu)((zzaeb)entry).zza();
                bl2 = object.zzg();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
            iterator = this.zzd().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                entry = (Map.Entry)iterator.next();
                object = (zzabu)entry.getKey();
                bl2 = object.zzg();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
        }
        super.zza();
    }
}

