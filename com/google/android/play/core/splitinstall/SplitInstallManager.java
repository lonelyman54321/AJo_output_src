/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.play.core.splitinstall;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import java.util.List;
import java.util.Set;

public interface SplitInstallManager {
    public Task cancelInstall(int var1);

    public Task deferredInstall(List var1);

    public Task deferredLanguageInstall(List var1);

    public Task deferredLanguageUninstall(List var1);

    public Task deferredUninstall(List var1);

    public Set getInstalledLanguages();

    public Set getInstalledModules();

    public Task getSessionState(int var1);

    public Task getSessionStates();

    public void registerListener(SplitInstallStateUpdatedListener var1);

    public boolean startConfirmationDialogForResult(SplitInstallSessionState var1, I3 var2);

    public boolean startConfirmationDialogForResult(SplitInstallSessionState var1, Activity var2, int var3);

    public boolean startConfirmationDialogForResult(SplitInstallSessionState var1, IntentSenderForResultStarter var2, int var3);

    public Task startInstall(SplitInstallRequest var1);

    public void unregisterListener(SplitInstallStateUpdatedListener var1);

    public void zza(SplitInstallStateUpdatedListener var1);

    public void zzb(SplitInstallStateUpdatedListener var1);
}

