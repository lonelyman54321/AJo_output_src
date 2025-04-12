/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall.internal;

import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.ListenerHolder$ListenerKey;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.common.api.internal.TaskUtil;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.internal.zaa;
import com.google.android.gms.common.moduleinstall.internal.zay;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.atomic.AtomicReference;

final class zau
extends zaa {
    final /* synthetic */ AtomicReference zaa;
    final /* synthetic */ TaskCompletionSource zab;
    final /* synthetic */ InstallStatusListener zac;
    final /* synthetic */ zay zad;

    public zau(zay zay2, AtomicReference atomicReference, TaskCompletionSource taskCompletionSource, InstallStatusListener installStatusListener) {
        this.zad = zay2;
        this.zaa = atomicReference;
        this.zab = taskCompletionSource;
        this.zac = installStatusListener;
    }

    public final void zad(Status object, ModuleInstallResponse object2) {
        AtomicReference atomicReference;
        if (object2 != null) {
            atomicReference = this.zaa;
            atomicReference.set(object2);
        }
        atomicReference = null;
        TaskCompletionSource taskCompletionSource = this.zab;
        TaskUtil.trySetResultOrApiException((Status)object, null, taskCompletionSource);
        boolean bl2 = ((Status)object).isSuccess();
        if (bl2 && (object2 == null || !(bl2 = ((ModuleInstallResponse)object2).zaa()))) {
            return;
        }
        object = this.zad;
        object2 = ListenerHolders.createListenerKey(this.zac, "InstallStatusListener");
        ((GoogleApi)object).doUnregisterEventListener((ListenerHolder$ListenerKey)object2, 27306);
    }
}

