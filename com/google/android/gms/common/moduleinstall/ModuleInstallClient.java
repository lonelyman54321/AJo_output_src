/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.common.moduleinstall;

import com.google.android.gms.common.api.HasApiKey;
import com.google.android.gms.common.api.OptionalModuleApi;
import com.google.android.gms.common.moduleinstall.InstallStatusListener;
import com.google.android.gms.common.moduleinstall.ModuleInstallRequest;
import com.google.android.gms.tasks.Task;

public interface ModuleInstallClient
extends HasApiKey {
    public Task areModulesAvailable(OptionalModuleApi ... var1);

    public Task deferredInstall(OptionalModuleApi ... var1);

    public Task getInstallModulesIntent(OptionalModuleApi ... var1);

    public Task installModules(ModuleInstallRequest var1);

    public Task releaseModules(OptionalModuleApi ... var1);

    public Task unregisterListener(InstallStatusListener var1);
}

