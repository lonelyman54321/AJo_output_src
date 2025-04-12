/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.internal.ListenerHolder$Notifier;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.zaab;

final class zaaa
implements ListenerHolder$Notifier {
    final /* synthetic */ ModuleInstallStatusUpdate zaa;

    public zaaa(zaab zaab2, ModuleInstallStatusUpdate moduleInstallStatusUpdate) {
        this.zaa = moduleInstallStatusUpdate;
    }

    public final void onNotifyListenerFailed() {
    }
}

