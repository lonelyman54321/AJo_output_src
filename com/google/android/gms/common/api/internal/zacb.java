/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.api.internal.ListenerHolder$Notifier;

public final class zacb
implements Runnable {
    public final /* synthetic */ ListenerHolder zaa;
    public final /* synthetic */ ListenerHolder$Notifier zab;

    public /* synthetic */ zacb(ListenerHolder listenerHolder, ListenerHolder$Notifier listenerHolder$Notifier) {
        this.zaa = listenerHolder;
        this.zab = listenerHolder$Notifier;
    }

    public final void run() {
        ListenerHolder listenerHolder = this.zaa;
        ListenerHolder$Notifier listenerHolder$Notifier = this.zab;
        listenerHolder.zaa(listenerHolder$Notifier);
    }
}

