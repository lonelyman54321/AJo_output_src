/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.gms.common.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.zzc;

final class zzb
implements Runnable {
    final /* synthetic */ LifecycleCallback zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ zzc zzc;

    public zzb(zzc zzc2, LifecycleCallback lifecycleCallback, String string2) {
        this.zza = lifecycleCallback;
        this.zzb = string2;
        this.zzc = zzc2;
    }

    public final void run() {
        int n3;
        Object object = this.zzc;
        int n4 = com.google.android.gms.common.api.internal.zzc.zza((zzc)object);
        if (n4 > 0) {
            LifecycleCallback lifecycleCallback = this.zza;
            Object object2 = com.google.android.gms.common.api.internal.zzc.zzb((zzc)object);
            if (object2 != null) {
                object2 = this.zzb;
                object = com.google.android.gms.common.api.internal.zzc.zzb((zzc)object).getBundle((String)object2);
            } else {
                n3 = 0;
                object = null;
            }
            lifecycleCallback.onCreate((Bundle)object);
        }
        if ((n3 = com.google.android.gms.common.api.internal.zzc.zza((zzc)(object = this.zzc))) >= (n4 = 2)) {
            object = this.zza;
            ((LifecycleCallback)object).onStart();
        }
        if ((n3 = com.google.android.gms.common.api.internal.zzc.zza((zzc)(object = this.zzc))) >= (n4 = 3)) {
            object = this.zza;
            ((LifecycleCallback)object).onResume();
        }
        if ((n3 = com.google.android.gms.common.api.internal.zzc.zza((zzc)(object = this.zzc))) >= (n4 = 4)) {
            object = this.zza;
            ((LifecycleCallback)object).onStop();
        }
        if ((n3 = com.google.android.gms.common.api.internal.zzc.zza((zzc)(object = this.zzc))) >= (n4 = 5)) {
            object = this.zza;
            ((LifecycleCallback)object).onDestroy();
        }
    }
}

