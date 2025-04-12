/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzui;
import java.util.Comparator;

public final class zzty
implements Comparator {
    public final /* synthetic */ zzui zza;

    public /* synthetic */ zzty(zzui zzui2) {
        this.zza = zzui2;
    }

    public final int compare(Object object, Object object2) {
        zzui zzui2 = this.zza;
        int n3 = zzui2.zza(object2);
        int n4 = zzui2.zza(object);
        return n3 - n4;
    }
}

