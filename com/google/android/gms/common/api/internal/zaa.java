/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import java.util.ArrayList;
import java.util.List;

final class zaa
extends LifecycleCallback {
    private List zaa;

    private zaa(LifecycleFragment arrayList) {
        super((LifecycleFragment)((Object)arrayList));
        this.zaa = arrayList = new ArrayList();
        this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static /* bridge */ /* synthetic */ zaa zaa(Activity activity) {
        synchronized (activity) {
            try {
                LifecycleFragment lifecycleFragment = LifecycleCallback.getFragment(activity);
                Object object = "LifecycleObserverOnStop";
                Class<zaa> clazz = zaa.class;
                object = lifecycleFragment.getCallbackOrNull((String)object, clazz);
                object = (zaa)object;
                if (object != null) return object;
                return new zaa(lifecycleFragment);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public static /* bridge */ /* synthetic */ void zab(zaa zaa2, Runnable runnable2) {
        zaa2.zac(runnable2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private final void zac(Runnable runnable2) {
        synchronized (this) {
            List list = this.zaa;
            list.add(runnable2);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onStop() {
        Object object;
        Object object2;
        synchronized (this) {
            object2 = this.zaa;
            object = new ArrayList();
            this.zaa = object;
        }
        object2 = object2.iterator();
        boolean bl2;
        while (bl2 = object2.hasNext()) {
            object = (Runnable)object2.next();
            object.run();
        }
        return;
    }
}

