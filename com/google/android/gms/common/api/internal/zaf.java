/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zaci;
import com.google.android.gms.common.api.internal.zad;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zaf
extends zad {
    public final zaci zab;

    public zaf(zaci zaci2, TaskCompletionSource taskCompletionSource) {
        super(3, taskCompletionSource);
        this.zab = zaci2;
    }

    public final boolean zaa(zabq zabq2) {
        return this.zab.zaa.zab();
    }

    public final Feature[] zab(zabq zabq2) {
        return this.zab.zaa.getRequiredFeatures();
    }

    public final void zac(zabq object) {
        Object object2 = this.zab.zaa;
        Object object3 = ((zabq)object).zaf();
        TaskCompletionSource taskCompletionSource = this.zaa;
        ((RegisterListenerMethod)object2).registerListener((Api$AnyClient)object3, taskCompletionSource);
        object2 = this.zab.zaa.getListenerKey();
        if (object2 != null) {
            object = ((zabq)object).zah();
            object3 = this.zab;
            object.put(object2, object3);
        }
    }
}

