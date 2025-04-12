/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.tasks;

import android.app.Activity;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.tasks.zzq;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

final class zzv
extends LifecycleCallback {
    private final List zza;

    private zzv(LifecycleFragment arrayList) {
        super((LifecycleFragment)((Object)arrayList));
        this.zza = arrayList = new ArrayList();
        this.mLifecycleFragment.addCallback("TaskOnStopCallback", this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzv zza(Activity object) {
        object = LifecycleCallback.getFragment((Activity)object);
        synchronized (object) {
            Object object2 = "TaskOnStopCallback";
            Class<zzv> clazz = zzv.class;
            try {
                object2 = object.getCallbackOrNull((String)object2, clazz);
                object2 = (zzv)object2;
                if (object2 != null) return object2;
                return new zzv((LifecycleFragment)object);
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onStop() {
        List list = this.zza;
        synchronized (list) {
            try {
                Object object = this.zza;
                object = object.iterator();
                while (true) {
                    boolean bl2;
                    if (!(bl2 = object.hasNext())) {
                        object = this.zza;
                        object.clear();
                        return;
                    }
                    Object object2 = object.next();
                    object2 = (WeakReference)object2;
                    object2 = ((Reference)object2).get();
                    if ((object2 = (zzq)object2) == null) continue;
                    object2.zzc();
                }
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void zzb(zzq zzq2) {
        List list = this.zza;
        synchronized (list) {
            List list2 = this.zza;
            WeakReference<zzq> weakReference = new WeakReference<zzq>(zzq2);
            list2.add(weakReference);
            return;
        }
    }
}

