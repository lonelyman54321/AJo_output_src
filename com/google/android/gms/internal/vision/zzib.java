/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhs;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzid;
import com.google.android.gms.internal.vision.zzii;

final class zzib {
    private final zzii zza;
    private final byte[] zzb;

    private zzib(int n3) {
        Object object = new byte[n3];
        this.zzb = object;
        object = zzii.zza(object);
        this.zza = object;
    }

    public /* synthetic */ zzib(int n3, zzhs zzhs2) {
        this(n3);
    }

    public final zzht zza() {
        this.zza.zzb();
        byte[] byArray = this.zzb;
        zzid zzid2 = new zzid(byArray);
        return zzid2;
    }

    public final zzii zzb() {
        return this.zza;
    }
}

