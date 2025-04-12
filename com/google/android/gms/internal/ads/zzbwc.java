/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.google.android.gms.internal.ads;

import android.view.View;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

public final class zzbwc {
    private View zza;
    private final Map zzb;

    public zzbwc() {
        HashMap hashMap;
        this.zzb = hashMap = new HashMap();
    }

    public static /* bridge */ /* synthetic */ View zza(zzbwc zzbwc2) {
        return zzbwc2.zza;
    }

    public static /* bridge */ /* synthetic */ Map zzd(zzbwc zzbwc2) {
        return zzbwc2.zzb;
    }

    public final zzbwc zzb(View view) {
        this.zza = view;
        return this;
    }

    public final zzbwc zzc(Map object) {
        boolean bl2;
        Object object2 = this.zzb;
        object2.clear();
        object = object.entrySet().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Map.Entry)object.next();
            View view = (View)object2.getValue();
            if (view == null) continue;
            Map map2 = this.zzb;
            object2 = (String)object2.getKey();
            WeakReference<View> weakReference = new WeakReference<View>(view);
            map2.put(object2, weakReference);
        }
        return this;
    }
}

