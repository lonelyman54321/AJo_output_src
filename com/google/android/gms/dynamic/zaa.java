/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.dynamic;

import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.dynamic.zah;
import java.util.AbstractCollection;

final class zaa
implements OnDelegateCreatedListener {
    final /* synthetic */ DeferredLifecycleHelper zaa;

    public zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        this.zaa = deferredLifecycleHelper;
    }

    public final void onDelegateCreated(LifecycleDelegate object) {
        boolean bl2;
        Object object2 = this.zaa;
        DeferredLifecycleHelper.zac((DeferredLifecycleHelper)object2, (LifecycleDelegate)object);
        object = ((AbstractCollection)DeferredLifecycleHelper.zab(this.zaa)).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (zah)object.next();
            LifecycleDelegate lifecycleDelegate = DeferredLifecycleHelper.zaa(this.zaa);
            object2.zab(lifecycleDelegate);
        }
        DeferredLifecycleHelper.zab(this.zaa).clear();
        DeferredLifecycleHelper.zad(this.zaa, null);
    }
}

