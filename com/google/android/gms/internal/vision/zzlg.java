/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zziw;
import com.google.android.gms.internal.vision.zzlh;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzlg
extends zzlh {
    public zzlg(int n3) {
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
                entry = this.zzb(n3);
                object = (zziw)entry.getKey();
                bl2 = object.zzd();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
            iterator = this.zzd().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                entry = (Map.Entry)iterator.next();
                object = (zziw)entry.getKey();
                bl2 = object.zzd();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
        }
        super.zza();
    }
}

