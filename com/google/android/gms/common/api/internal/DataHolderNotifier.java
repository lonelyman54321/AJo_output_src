/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.api.internal.ListenerHolder$Notifier;
import com.google.android.gms.common.data.DataHolder;

public abstract class DataHolderNotifier
implements ListenerHolder$Notifier {
    private final DataHolder zaa;

    public DataHolderNotifier(DataHolder dataHolder) {
        this.zaa = dataHolder;
    }

    public final void notifyListener(Object object) {
        DataHolder dataHolder = this.zaa;
        this.notifyListener(object, dataHolder);
    }

    public abstract void notifyListener(Object var1, DataHolder var2);

    public void onNotifyListenerFailed() {
        DataHolder dataHolder = this.zaa;
        if (dataHolder != null) {
            dataHolder.close();
        }
    }
}

