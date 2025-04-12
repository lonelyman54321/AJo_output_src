/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzcn;
import com.google.android.gms.internal.clearcut.zzcy;
import com.google.android.gms.internal.clearcut.zzcz;
import com.google.android.gms.internal.clearcut.zzfd;

final class zzdb
extends zzcy {
    private zzdb() {
        super(null);
    }

    public /* synthetic */ zzdb(zzcz zzcz2) {
        this();
    }

    private static zzcn zzc(Object object, long l2) {
        return (zzcn)zzfd.zzo(object, l2);
    }

    public final void zza(Object object, long l2) {
        zzdb.zzc(object, l2).zzv();
    }

    public final void zza(Object object, Object object2, long l2) {
        zzcn zzcn2 = zzdb.zzc(object, l2);
        object2 = zzdb.zzc(object2, l2);
        int n3 = zzcn2.size();
        int n4 = object2.size();
        if (n3 > 0 && n4 > 0) {
            boolean bl2 = zzcn2.zzu();
            if (!bl2) {
                zzcn2 = zzcn2.zzi(n4 += n3);
            }
            zzcn2.addAll(object2);
        }
        if (n3 > 0) {
            object2 = zzcn2;
        }
        zzfd.zza(object, l2, object2);
    }
}

