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
import com.google.android.play.core.splitinstall.SplitInstallManager;
import com.google.android.play.core.splitinstall.SplitInstallRequest;
import com.google.android.play.core.splitinstall.SplitInstallSessionState;
import com.google.android.play.core.splitinstall.SplitInstallStateUpdatedListener;
import com.google.android.play.core.splitinstall.internal.zzby;
import java.util.List;
import java.util.Set;

final class zzl
implements SplitInstallManager {
    private final zzby zza;
    private final zzby zzb;
    private final zzby zzc;

    public zzl(zzby zzby2, zzby zzby3, zzby zzby4) {
        this.zza = zzby2;
        this.zzb = zzby3;
        this.zzc = zzby4;
    }

    private final SplitInstallManager zzc() {
        Object object = this.zzc.zza();
        object = object != null ? (SplitInstallManager)this.zzb.zza() : (SplitInstallManager)this.zza.zza();
        return object;
    }

    public final Task cancelInstall(int n3) {
        return this.zzc().cancelInstall(n3);
    }

    public final Task deferredInstall(List list) {
        return this.zzc().deferredInstall(list);
    }

    public final Task deferredLanguageInstall(List list) {
        return this.zzc().deferredLanguageInstall(list);
    }

    public final Task deferredLanguageUninstall(List list) {
        return this.zzc().deferredLanguageUninstall(list);
    }

    public final Task deferredUninstall(List list) {
        return this.zzc().deferredUninstall(list);
    }

    public final Set getInstalledLanguages() {
        return this.zzc().getInstalledLanguages();
    }

    public final Set getInstalledModules() {
        return this.zzc().getInstalledModules();
    }

    public final Task getSessionState(int n3) {
        return this.zzc().getSessionState(n3);
    }

    public final Task getSessionStates() {
        return this.zzc().getSessionStates();
    }

    public final void registerListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzc().registerListener(splitInstallStateUpdatedListener);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, I3 i3) {
        return this.zzc().startConfirmationDialogForResult(splitInstallSessionState, i3);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, Activity activity, int n3) {
        return this.zzc().startConfirmationDialogForResult(splitInstallSessionState, activity, n3);
    }

    public final boolean startConfirmationDialogForResult(SplitInstallSessionState splitInstallSessionState, IntentSenderForResultStarter intentSenderForResultStarter, int n3) {
        return this.zzc().startConfirmationDialogForResult(splitInstallSessionState, intentSenderForResultStarter, n3);
    }

    public final Task startInstall(SplitInstallRequest splitInstallRequest) {
        return this.zzc().startInstall(splitInstallRequest);
    }

    public final void unregisterListener(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzc().unregisterListener(splitInstallStateUpdatedListener);
    }

    public final void zza(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzc().zza(splitInstallStateUpdatedListener);
    }

    public final void zzb(SplitInstallStateUpdatedListener splitInstallStateUpdatedListener) {
        this.zzc().zzb(splitInstallStateUpdatedListener);
    }
}

