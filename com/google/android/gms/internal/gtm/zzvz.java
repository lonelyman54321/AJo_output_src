/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzvy;
import com.google.android.gms.internal.gtm.zzwa;
import com.google.android.gms.internal.gtm.zzwc;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

final class zzvz
extends AbstractSet {
    final int zza;
    final /* synthetic */ zzwa zzb;

    public zzvz(zzwa zzwa2, int n3) {
        this.zzb = zzwa2;
        this.zza = -1;
    }

    public final boolean contains(Object object) {
        int n3;
        Comparator comparator;
        int n4;
        int n7;
        int n8 = this.zza;
        Object[] objectArray = zzwa.zzc(this.zzb);
        int n10 = Arrays.binarySearch(objectArray, n7 = this.zzb(), n4 = this.zza(), object, comparator = n8 == (n3 = -1) ? zzwa.zza() : zzwc.zzb());
        return n10 >= 0;
    }

    public final Iterator iterator() {
        zzvy zzvy2 = new zzvy(this);
        return zzvy2;
    }

    public final int size() {
        int n3 = this.zza();
        int n4 = this.zzb();
        return n3 - n4;
    }

    public final int zza() {
        int n3 = this.zza;
        int[] nArray = zzwa.zzb(this.zzb);
        return nArray[++n3];
    }

    public final int zzb() {
        int n3 = this.zza;
        int n4 = -1;
        if (n3 == n4) {
            return 0;
        }
        return zzwa.zzb(this.zzb)[0];
    }
}

