/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzqo;
import com.google.android.gms.internal.gtm.zzqq;
import com.google.android.gms.internal.gtm.zzqv;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzqt
implements Iterator {
    final /* synthetic */ zzqv zza;
    private int zzb = 0;

    public zzqt(zzqv zzqv2) {
        this.zza = zzqv2;
    }

    public final boolean hasNext() {
        ArrayList arrayList;
        int n3;
        for (int i3 = this.zzb; i3 < (n3 = (arrayList = zzqv.zzj(this.zza)).size()); ++i3) {
            arrayList = zzqv.zzj(this.zza).get(i3);
            if (arrayList == null) continue;
            return true;
        }
        return false;
    }

    public final void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }

    public final zzqo zza() {
        Object object = this.zza;
        int n3 = this.zzb;
        int n4 = ((ArrayList)(object = zzqv.zzj((zzqv)object))).size();
        if (n3 < n4) {
            Serializable serializable;
            for (n4 = this.zzb; n4 < (n3 = (serializable = zzqv.zzj(this.zza)).size()); ++n4) {
                int n7;
                serializable = zzqv.zzj(this.zza).get(n4);
                if (serializable == null) continue;
                n3 = this.zzb = n4;
                this.zzb = n7 = n3 + 1;
                serializable = Double.valueOf(n3);
                object = new zzqq((Double)serializable);
                return object;
            }
            object = new NoSuchElementException();
            throw object;
        }
        object = new NoSuchElementException();
        throw object;
    }
}

