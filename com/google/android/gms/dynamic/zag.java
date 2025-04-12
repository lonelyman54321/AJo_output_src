/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamic;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.zah;

final class zag
implements zah {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    public zag(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    public final int zaa() {
        return 5;
    }

    public final void zab(LifecycleDelegate lifecycleDelegate) {
        DeferredLifecycleHelper.zaa(this.zaa).onResume();
    }
}

