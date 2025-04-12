/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.LruCache
 */
package com.google.android.gms.tagmanager;

import android.util.LruCache;
import com.google.android.gms.tagmanager.zzcw;
import com.google.android.gms.tagmanager.zzq;

final class zzcv
extends LruCache {
    final /* synthetic */ zzq zza;

    public zzcv(zzcw zzcw2, int n3, zzq zzq2) {
        this.zza = zzq2;
        super(0x100000);
    }

    public final int sizeOf(Object object, Object object2) {
        return this.zza.zza(object, object2);
    }
}

