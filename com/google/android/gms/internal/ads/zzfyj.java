/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyh;
import com.google.android.gms.internal.ads.zzfyi;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

final class zzfyj
implements Serializable,
zzfyh {
    private final List zza;

    public /* synthetic */ zzfyj(List list, zzfyi zzfyi2) {
        this.zza = list;
    }

    public final boolean equals(Object object) {
        boolean bl2 = object instanceof zzfyj;
        if (bl2) {
            object = (zzfyj)object;
            List list = this.zza;
            object = ((zzfyj)object).zza;
            return ((Object)list).equals(object);
        }
        return false;
    }

    public final int hashCode() {
        return ((Object)this.zza).hashCode() + 306654252;
    }

    public final String toString() {
        boolean bl2;
        StringBuilder stringBuilder = new StringBuilder("Predicates.and(");
        Iterator iterator = this.zza.iterator();
        char c2 = '\u0001';
        while (bl2 = iterator.hasNext()) {
            Object t3 = iterator.next();
            if (c2 == '\u0000') {
                c2 = ',';
                stringBuilder.append(c2);
            }
            stringBuilder.append(t3);
            c2 = '\u0000';
        }
        stringBuilder.append(')');
        return stringBuilder.toString();
    }

    public final boolean zza(Object object) {
        Object object2;
        int n3;
        for (int i3 = 0; i3 < (n3 = (object2 = this.zza).size()); ++i3) {
            object2 = (zzfyh)this.zza.get(i3);
            n3 = (int)(object2.zza(object) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return true;
    }
}

