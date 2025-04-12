/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfyg;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzgbk
extends Enum
implements Iterator {
    public static final /* enum */ zzgbk zza;
    private static final /* synthetic */ zzgbk[] zzb;

    static {
        zzgbk zzgbk2;
        zza = zzgbk2 = new zzgbk("INSTANCE", 0);
        zzgbk[] zzgbkArray = new zzgbk[]{zzgbk2};
        zzb = zzgbkArray;
    }

    public static zzgbk[] values() {
        return (zzgbk[])zzb.clone();
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        NoSuchElementException noSuchElementException = new NoSuchElementException();
        throw noSuchElementException;
    }

    public final void remove() {
        zzfyg.zzk(false, "no calls to next() since the last call to remove()");
    }
}

