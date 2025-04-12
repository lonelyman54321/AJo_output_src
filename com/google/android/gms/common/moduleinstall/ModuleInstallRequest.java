/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest$Builder;
import com.google.android.gms.common.moduleinstall.zac;
import java.util.List;
import java.util.concurrent.Executor;

public final class ModuleInstallRequest {
    private final List zaa;
    private final InstallStatusListener zab;
    private final Executor zac;

    public /* synthetic */ ModuleInstallRequest(List list, InstallStatusListener installStatusListener, Executor executor, boolean bl2, zac object) {
        String string2 = "APIs must not be null.";
        Preconditions.checkNotNull(list, string2);
        bl2 = list.isEmpty() ^ true;
        object = "APIs must not be empty.";
        Preconditions.checkArgument(bl2, object);
        if (executor != null) {
            string2 = "Listener must not be null when listener executor is set.";
            Preconditions.checkNotNull(installStatusListener, string2);
        }
        this.zaa = list;
        this.zab = installStatusListener;
        this.zac = executor;
    }

    public static ModuleInstallRequest$Builder newBuilder() {
        ModuleInstallRequest$Builder moduleInstallRequest$Builder = new ModuleInstallRequest$Builder();
        return moduleInstallRequest$Builder;
    }

    public List getApis() {
        return this.zaa;
    }

    public InstallStatusListener getListener() {
        return this.zab;
    }

    public Executor getListenerExecutor() {
        return this.zac;
    }
}

