/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzca;
import com.google.android.gms.internal.clearcut.zzei;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class zzej
extends zzei {
    public zzej(int n3) {
        super(n3, null);
    }

    public final void zzv() {
        int n3 = this.isImmutable();
        if (n3 == 0) {
            boolean bl2;
            Object object;
            Map.Entry entry;
            int n4;
            Iterator iterator = null;
            for (n3 = 0; n3 < (n4 = this.zzdr()); ++n3) {
                entry = this.zzak(n3);
                object = (zzca)entry.getKey();
                bl2 = object.zzaw();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
            iterator = this.zzds().iterator();
            while ((n4 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                entry = (Map.Entry)iterator.next();
                object = (zzca)entry.getKey();
                bl2 = object.zzaw();
                if (!bl2) continue;
                object = Collections.unmodifiableList((List)entry.getValue());
                entry.setValue(object);
            }
        }
        super.zzv();
    }
}

