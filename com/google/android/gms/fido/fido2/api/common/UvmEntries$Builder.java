/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.fido.fido2.api.common;

import com.google.android.gms.fido.fido2.api.common.UvmEntries;
import com.google.android.gms.fido.fido2.api.common.UvmEntry;
import com.google.android.gms.internal.fido.zzam;
import java.util.ArrayList;
import java.util.List;

public final class UvmEntries$Builder {
    private final List zza;

    public UvmEntries$Builder() {
        ArrayList arrayList;
        this.zza = arrayList = new ArrayList();
    }

    public UvmEntries$Builder addAll(List list) {
        List list2 = this.zza;
        int n3 = list2.size();
        int n4 = list.size() + n3;
        if (n4 <= (n3 = 3)) {
            n3 = 1;
        } else {
            n3 = 0;
            list2 = null;
        }
        zzam.zzc(n3 != 0);
        this.zza.addAll(list);
        return this;
    }

    public UvmEntries$Builder addUvmEntry(UvmEntry object) {
        int n3;
        List list = this.zza;
        int n4 = list.size();
        if (n4 < (n3 = 3)) {
            this.zza.add(object);
            return this;
        }
        object = new IllegalStateException();
        throw object;
    }

    public UvmEntries build() {
        List list = this.zza;
        UvmEntries uvmEntries = new UvmEntries(list);
        return uvmEntries;
    }
}

