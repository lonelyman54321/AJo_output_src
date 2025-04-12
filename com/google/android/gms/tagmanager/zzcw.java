/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.LruCache
 */
package com.google.android.gms.tagmanager;

import android.util.LruCache;
import com.google.android.gms.tagmanager.zzcv;
import com.google.android.gms.tagmanager.zzq;

final class zzcw {
    private final LruCache zza;

    public zzcw(int n3, zzq zzq2) {
        zzcv zzcv2 = new zzcv(this, 0x100000, zzq2);
        this.zza = zzcv2;
    }

    public final Object zza(Object object) {
        return this.zza.get(object);
    }

    public final void zzb(Object object, Object object2) {
        this.zza.put(object, object2);
    }
}

