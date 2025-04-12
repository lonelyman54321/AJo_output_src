/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzdp;
import java.util.AbstractCollection;
import java.util.Iterator;

final class zzdx
extends AbstractCollection {
    private final /* synthetic */ zzdp zza;

    public zzdx(zzdp zzdp2) {
        this.zza = zzdp2;
    }

    public final void clear() {
        this.zza.clear();
    }

    public final Iterator iterator() {
        return this.zza.zzg();
    }

    public final int size() {
        return this.zza.size();
    }
}

