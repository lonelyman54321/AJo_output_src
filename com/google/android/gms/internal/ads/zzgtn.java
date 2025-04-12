/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghk;
import com.google.android.gms.internal.ads.zzgtk;
import com.google.android.gms.internal.ads.zzgtp;
import com.google.android.gms.internal.ads.zzgtr;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class zzgtn {
    private ArrayList zza;
    private zzgtk zzb;
    private Integer zzc;

    public zzgtn() {
        Object object = new ArrayList();
        this.zza = object;
        this.zzb = object = zzgtk.zza;
        this.zzc = null;
    }

    public final zzgtn zza(zzghk object, int n3, String string2, String string3) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            zzgtp zzgtp2 = new zzgtp((zzghk)object, n3, string2, string3, null);
            arrayList.add(zzgtp2);
            return this;
        }
        object = new IllegalStateException("addEntry cannot be called after build()");
        throw object;
    }

    public final zzgtn zzb(zzgtk object) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            this.zzb = object;
            return this;
        }
        object = new IllegalStateException("setAnnotations cannot be called after build()");
        throw object;
    }

    public final zzgtn zzc(int n3) {
        ArrayList arrayList = this.zza;
        if (arrayList != null) {
            Integer n4;
            this.zzc = n4 = Integer.valueOf(n3);
            return this;
        }
        IllegalStateException illegalStateException = new IllegalStateException("setPrimaryKeyId cannot be called after build()");
        throw illegalStateException;
    }

    public final zzgtr zzd() {
        Object object = this.zza;
        if (object != null) {
            Integer n3;
            Object object2;
            block3: {
                object = this.zzc;
                if (object != null) {
                    int n4 = (Integer)object;
                    object2 = this.zza;
                    int n7 = object2.size();
                    n3 = null;
                    for (int i3 = 0; i3 < n7; ++i3) {
                        zzgtp zzgtp2 = (zzgtp)object2.get(i3);
                        int n8 = zzgtp2.zza();
                        if (n8 != n4) continue;
                        break block3;
                    }
                    object = new GeneralSecurityException("primary key ID is not present in entries");
                    throw object;
                }
            }
            object2 = this.zzb;
            List list = Collections.unmodifiableList(this.zza);
            n3 = this.zzc;
            object = new zzgtr((zzgtk)object2, list, n3, null);
            this.zza = null;
            return object;
        }
        object = new IllegalStateException("cannot call build() twice");
        throw object;
    }
}

