/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzdn;
import com.google.android.gms.internal.vision.zzef;
import java.io.Serializable;
import java.util.Map;

public class zzeh
extends zzdn
implements Serializable {
    private final transient zzef zza;
    private final transient int zzb;

    public zzeh(zzef zzef2, int n3) {
        this.zza = zzef2;
        this.zzb = n3;
    }

    public final /* synthetic */ Map zza() {
        return this.zza;
    }

    public final boolean zza(Object object) {
        boolean bl2;
        return object != null && (bl2 = super.zza(object));
    }

    public final Map zzb() {
        AssertionError assertionError = new AssertionError((Object)"should never be called");
        throw assertionError;
    }
}

