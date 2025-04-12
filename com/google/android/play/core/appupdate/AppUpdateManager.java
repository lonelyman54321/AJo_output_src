/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.play.core.appupdate;

import android.app.Activity;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallStateUpdatedListener;

public interface AppUpdateManager {
    public Task completeUpdate();

    public Task getAppUpdateInfo();

    public void registerListener(InstallStateUpdatedListener var1);

    public Task startUpdateFlow(AppUpdateInfo var1, Activity var2, AppUpdateOptions var3);

    public boolean startUpdateFlowForResult(AppUpdateInfo var1, int var2, Activity var3, int var4);

    public boolean startUpdateFlowForResult(AppUpdateInfo var1, int var2, IntentSenderForResultStarter var3, int var4);

    public boolean startUpdateFlowForResult(AppUpdateInfo var1, I3 var2, AppUpdateOptions var3);

    public boolean startUpdateFlowForResult(AppUpdateInfo var1, Activity var2, AppUpdateOptions var3, int var4);

    public boolean startUpdateFlowForResult(AppUpdateInfo var1, IntentSenderForResultStarter var2, AppUpdateOptions var3, int var4);

    public void unregisterListener(InstallStateUpdatedListener var1);
}

