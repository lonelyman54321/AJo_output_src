/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.gms.common.api.internal;

import android.app.Activity;
import com.google.android.gms.common.api.internal.zaa;
import com.google.android.gms.common.api.internal.zab;

public abstract class ActivityLifecycleObserver {
    public static final ActivityLifecycleObserver of(Activity object) {
        object = zaa.zaa(object);
        zab zab2 = new zab((zaa)object);
        return zab2;
    }

    public abstract ActivityLifecycleObserver onStopCallOnce(Runnable var1);
}

