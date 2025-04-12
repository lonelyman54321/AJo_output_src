/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.internal;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zzai;
import java.util.ArrayList;
import java.util.List;

public final class Objects$ToStringHelper {
    private final List zza;
    private final Object zzb;

    public /* synthetic */ Objects$ToStringHelper(Object arrayList, zzai zzai2) {
        Preconditions.checkNotNull(arrayList);
        this.zzb = arrayList;
        this.zza = arrayList = new ArrayList();
    }

    public Objects$ToStringHelper add(String string2, Object object) {
        Preconditions.checkNotNull(string2);
        object = String.valueOf(object);
        string2 = n1.a(string2, "=", (String)object);
        this.zza.add(string2);
        return this;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(100);
        Object object = this.zzb.getClass().getSimpleName();
        stringBuilder.append((String)object);
        stringBuilder.append('{');
        object = this.zza;
        int n3 = object.size();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = (String)this.zza.get(i3);
            stringBuilder.append(string2);
            int n4 = n3 + -1;
            if (i3 >= n4) continue;
            string2 = ", ";
            stringBuilder.append(string2);
        }
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

