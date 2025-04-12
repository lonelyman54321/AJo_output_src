/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

public class ModuleInstallRequest$Builder {
    private final List zaa;
    private InstallStatusListener zab;
    private Executor zac;

    public ModuleInstallRequest$Builder() {
        ArrayList arrayList;
        this.zaa = arrayList = new ArrayList();
    }

    public ModuleInstallRequest$Builder addApi(OptionalModuleApi optionalModuleApi) {
        this.zaa.add(optionalModuleApi);
        return this;
    }

    public ModuleInstallRequest build() {
        List list = this.zaa;
        InstallStatusListener installStatusListener = this.zab;
        Executor executor = this.zac;
        ModuleInstallRequest moduleInstallRequest = new ModuleInstallRequest(list, installStatusListener, executor, true, null);
        return moduleInstallRequest;
    }

    public ModuleInstallRequest$Builder setListener(InstallStatusListener installStatusListener) {
        return this.setListener(installStatusListener, null);
    }

    public ModuleInstallRequest$Builder setListener(InstallStatusListener installStatusListener, Executor executor) {
        this.zab = installStatusListener;
        this.zac = executor;
        return this;
    }
}

