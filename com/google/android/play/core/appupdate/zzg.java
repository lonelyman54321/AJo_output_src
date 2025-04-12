/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentSender
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 */
package com.google.android.play.core.appupdate;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.activity.result.IntentSenderRequest;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.zzc;
import com.google.android.play.core.appupdate.zze;
import com.google.android.play.core.appupdate.zzf;
import com.google.android.play.core.appupdate.zzr;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import kotlin.jvm.internal.Intrinsics;

final class zzg
implements AppUpdateManager {
    private final zzr zza;
    private final zzc zzb;
    private final Context zzc;
    private final Handler zzd;

    public zzg(zzr zzr2, zzc zzc2, Context context) {
        Handler handler;
        Looper looper = Looper.getMainLooper();
        this.zzd = handler = new Handler(looper);
        this.zza = zzr2;
        this.zzb = zzc2;
        this.zzc = context;
    }

    public final Task completeUpdate() {
        zzr zzr2 = this.zza;
        String string2 = this.zzc.getPackageName();
        return zzr2.zzd(string2);
    }

    public final Task getAppUpdateInfo() {
        zzr zzr2 = this.zza;
        String string2 = this.zzc.getPackageName();
        return zzr2.zze(string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        synchronized (this) {
            zzc zzc2 = this.zzb;
            zzc2.zzb(installStateUpdatedListener);
            return;
        }
    }

    public final Task startUpdateFlow(AppUpdateInfo object, Activity activity, AppUpdateOptions object2) {
        boolean bl2;
        if (object != null && activity != null && object2 != null && !(bl2 = ((AppUpdateInfo)object).zzd())) {
            bl2 = ((AppUpdateInfo)object).isUpdateTypeAllowed((AppUpdateOptions)object2);
            if (!bl2) {
                object = new InstallException(-6);
                return Tasks.forException((Exception)object);
            }
            ((AppUpdateInfo)object).zzc();
            Intent intent = new Intent((Context)activity, PlayCoreDialogWrapperActivity.class);
            object = ((AppUpdateInfo)object).zza((AppUpdateOptions)object2);
            intent.putExtra("confirmation_intent", (Parcelable)object);
            object = new TaskCompletionSource();
            Handler handler = this.zzd;
            object2 = new zze(this, handler, (TaskCompletionSource)object);
            intent.putExtra("result_receiver", (Parcelable)object2);
            activity.startActivity(intent);
            return ((TaskCompletionSource)object).getTask();
        }
        object = new InstallException(-4);
        return Tasks.forException((Exception)object);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int n3, Activity activity, int n4) {
        AppUpdateOptions appUpdateOptions = AppUpdateOptions.defaultOptions(n3);
        if (activity == null) {
            return false;
        }
        zzf zzf2 = new zzf(this, activity);
        return this.startUpdateFlowForResult(appUpdateInfo, zzf2, appUpdateOptions, n4);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int n3, IntentSenderForResultStarter intentSenderForResultStarter, int n4) {
        AppUpdateOptions appUpdateOptions = AppUpdateOptions.defaultOptions(n3);
        return this.startUpdateFlowForResult(appUpdateInfo, intentSenderForResultStarter, appUpdateOptions, n4);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, I3 i3, AppUpdateOptions object) {
        boolean bl2;
        if (appUpdateInfo != null && i3 != null && object != null && (bl2 = appUpdateInfo.isUpdateTypeAllowed((AppUpdateOptions)object)) && !(bl2 = appUpdateInfo.zzd())) {
            appUpdateInfo.zzc();
            appUpdateInfo = appUpdateInfo.zza((AppUpdateOptions)object).getIntentSender();
            Intrinsics.checkNotNullParameter(appUpdateInfo, "intentSender");
            object = new IntentSenderRequest((IntentSender)appUpdateInfo, null, 0, 0);
            i3.a(object);
            return true;
        }
        return false;
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions, int n3) {
        if (activity == null) {
            return false;
        }
        zzf zzf2 = new zzf(this, activity);
        return this.startUpdateFlowForResult(appUpdateInfo, zzf2, appUpdateOptions, n3);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int n3) {
        boolean bl2;
        if (appUpdateInfo != null && intentSenderForResultStarter != null && appUpdateOptions != null && (bl2 = appUpdateInfo.isUpdateTypeAllowed(appUpdateOptions)) && !(bl2 = appUpdateInfo.zzd())) {
            appUpdateInfo.zzc();
            IntentSender intentSender = appUpdateInfo.zza(appUpdateOptions).getIntentSender();
            intentSenderForResultStarter.startIntentSenderForResult(intentSender, n3, null, 0, 0, 0, null);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        synchronized (this) {
            zzc zzc2 = this.zzb;
            zzc2.zzc(installStateUpdatedListener);
            return;
        }
    }
}

