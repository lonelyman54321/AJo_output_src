/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Api$AnyClient;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.RegisterListenerMethod;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zaci;
import com.google.android.gms.common.api.internal.zad;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zah
extends zad {
    public final ListenerHolder$ListenerKey zab;

    public zah(ListenerHolder$ListenerKey listenerHolder$ListenerKey, TaskCompletionSource taskCompletionSource) {
        super(4, taskCompletionSource);
        this.zab = listenerHolder$ListenerKey;
    }

    public final boolean zaa(zabq object) {
        boolean bl2;
        object = ((zabq)object).zah();
        ListenerHolder$ListenerKey listenerHolder$ListenerKey = this.zab;
        return (object = (zaci)object.get(listenerHolder$ListenerKey)) != null && (bl2 = ((RegisterListenerMethod)(object = ((zaci)object).zaa)).zab());
    }

    public final Feature[] zab(zabq object) {
        object = ((zabq)object).zah();
        ListenerHolder$ListenerKey listenerHolder$ListenerKey = this.zab;
        if ((object = (zaci)object.get(listenerHolder$ListenerKey)) == null) {
            return null;
        }
        return ((zaci)object).zaa.getRequiredFeatures();
    }

    public final void zac(zabq object) {
        Object object2 = ((zabq)object).zah();
        Object object3 = this.zab;
        if ((object2 = (zaci)object2.remove(object3)) != null) {
            object = ((zabq)object).zaf();
            object3 = this.zaa;
            ((zaci)object2).zab.unregisterListener((Api$AnyClient)object, (TaskCompletionSource)object3);
            ((zaci)object2).zaa.clearListener();
            return;
        }
        object = this.zaa;
        object2 = Boolean.FALSE;
        ((TaskCompletionSource)object).trySetResult(object2);
    }
}

