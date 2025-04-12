/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.stats;

import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

public abstract class StatsEvent
extends AbstractSafeParcelable
implements ReflectedParcelable {
    public final String toString() {
        long l2 = this.zzb();
        int n3 = this.zza();
        String string2 = this.zzc();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(l2);
        stringBuilder.append("\t");
        stringBuilder.append(n3);
        stringBuilder.append("\t-1");
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    public abstract int zza();

    public abstract long zzb();

    public abstract String zzc();
}

