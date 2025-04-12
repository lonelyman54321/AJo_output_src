/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.zaaa;
import com.google.android.gms.common.moduleinstall.internal.zag;

final class zaab
extends zag {
    private final ListenerHolder zaa;

    public zaab(ListenerHolder listenerHolder) {
        this.zaa = listenerHolder;
    }

    public final void zab(ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        zaaa zaaa2 = new zaaa(this, moduleInstallStatusUpdate);
        this.zaa.notifyListener(zaaa2);
    }
}

