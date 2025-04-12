/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zah;

final class zab
implements zah {
    final /* synthetic */ Activity zaa;
    final /* synthetic */ Bundle zab;
    final /* synthetic */ Bundle zac;
    final /* synthetic */ DeferredLifecycleHelper zad;

    public zab(DeferredLifecycleHelper deferredLifecycleHelper, Activity activity, Bundle bundle, Bundle bundle2) {
        this.zad = deferredLifecycleHelper;
        this.zaa = activity;
        this.zab = bundle;
        this.zac = bundle2;
    }

    public final int zaa() {
        return 0;
    }

    public final void zab(LifecycleDelegate lifecycleDelegate) {
        lifecycleDelegate = DeferredLifecycleHelper.zaa(this.zad);
        Activity activity = this.zaa;
        Bundle bundle = this.zab;
        Bundle bundle2 = this.zac;
        lifecycleDelegate.onInflate(activity, bundle, bundle2);
    }
}

