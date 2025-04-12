/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolder$Notifier;
import com.google.android.gms.common.api.internal.zacb;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.concurrent.HandlerExecutor;
import java.util.concurrent.Executor;

public final class ListenerHolder {
    private final Executor zaa;
    private volatile Object zab;
    private volatile ListenerHolder$ListenerKey zac;

    public ListenerHolder(Looper object, Object object2, String string2) {
        HandlerExecutor handlerExecutor = new HandlerExecutor((Looper)object);
        this.zaa = handlerExecutor;
        object = Preconditions.checkNotNull(object2, "Listener must not be null");
        this.zab = object;
        string2 = Preconditions.checkNotEmpty(string2);
        super(object2, string2);
        this.zac = object;
    }

    public ListenerHolder(Executor object, Object object2, String string2) {
        object = (Executor)Preconditions.checkNotNull(object, "Executor must not be null");
        this.zaa = object;
        this.zab = object = Preconditions.checkNotNull(object2, "Listener must not be null");
        string2 = Preconditions.checkNotEmpty(string2);
        this.zac = object = new ListenerHolder$ListenerKey(object2, string2);
    }

    public void clear() {
        this.zab = null;
        this.zac = null;
    }

    public ListenerHolder$ListenerKey getListenerKey() {
        return this.zac;
    }

    public boolean hasListener() {
        Object object = this.zab;
        return object != null;
    }

    public void notifyListener(ListenerHolder$Notifier listenerHolder$Notifier) {
        Preconditions.checkNotNull(listenerHolder$Notifier, "Notifier must not be null");
        zacb zacb2 = new zacb(this, listenerHolder$Notifier);
        this.zaa.execute(zacb2);
    }

    public final void zaa(ListenerHolder$Notifier listenerHolder$Notifier) {
        Object object = this.zab;
        if (object == null) {
            listenerHolder$Notifier.onNotifyListenerFailed();
            return;
        }
        try {
            listenerHolder$Notifier.notifyListener(object);
            return;
        }
        catch (RuntimeException runtimeException) {
            listenerHolder$Notifier.onNotifyListenerFailed();
            throw runtimeException;
        }
    }
}

