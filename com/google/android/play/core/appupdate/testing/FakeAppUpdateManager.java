/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.PendingIntent
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build$VERSION
 */
package com.google.android.play.core.appupdate.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.AppUpdateOptions;
import com.google.android.play.core.appupdate.zzc;
import com.google.android.play.core.common.IntentSenderForResultStarter;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FakeAppUpdateManager
implements AppUpdateManager {
    private final zzc zza;
    private final Context zzb;
    private final List zzc;
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private Integer zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    private Integer zzo;

    public FakeAppUpdateManager(Context context) {
        long l2;
        Object object = new ArrayList();
        this.zzc = object;
        this.zzd = 0;
        this.zze = 0;
        this.zzf = false;
        this.zzg = 0;
        this.zzh = null;
        this.zzi = 0;
        this.zzj = l2 = 0L;
        this.zzk = l2;
        this.zzl = false;
        this.zzm = false;
        this.zzn = false;
        this.zza = object = new zzc(context);
        this.zzb = context;
    }

    private static int zza() {
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            return 0x4000000;
        }
        return 0;
    }

    private final int zzb() {
        int n3 = this.zzf;
        if (n3 != 0) {
            int n4;
            n3 = this.zzd;
            if (n3 != 0 && n3 != (n4 = 4) && n3 != (n4 = 5) && n3 != (n4 = 6)) {
                return 3;
            }
            return 2;
        }
        return 1;
    }

    private final void zzc() {
        zzc zzc2 = this.zza;
        int n3 = this.zzd;
        long l2 = this.zzj;
        long l3 = this.zzk;
        int n4 = this.zze;
        String string2 = this.zzb.getPackageName();
        InstallState installState = InstallState.zza(n3, l2, l3, n4, string2);
        zzc2.zzd(installState);
    }

    private final boolean zzd(AppUpdateInfo object, AppUpdateOptions appUpdateOptions) {
        int n3;
        int n4;
        int n7;
        AppUpdateOptions appUpdateOptions2;
        boolean bl2;
        boolean n74 = ((AppUpdateInfo)object).isUpdateTypeAllowed(appUpdateOptions);
        if (!(n74 || (bl2 = (appUpdateOptions2 = AppUpdateOptions.defaultOptions(appUpdateOptions.appUpdateType())).equals(appUpdateOptions)) && (n7 = (int)(((AppUpdateInfo)object).isUpdateTypeAllowed(n4 = appUpdateOptions.appUpdateType()) ? 1 : 0)))) {
            return false;
        }
        n7 = appUpdateOptions.appUpdateType();
        if (n7 == (n3 = 1)) {
            this.zzm = n3;
            this.zzo = object = Integer.valueOf(n3);
        } else {
            this.zzl = n3;
            this.zzo = object = Integer.valueOf(0);
        }
        return n3 != 0;
    }

    public Task completeUpdate() {
        int n3 = this.zze;
        if (n3 != 0) {
            int n4 = this.zze;
            InstallException installException = new InstallException(n4);
            return Tasks.forException(installException);
        }
        n3 = this.zzd;
        int n7 = 11;
        int n8 = 3;
        if (n3 == n7) {
            Integer n10;
            this.zzd = n8;
            this.zzn = true;
            Integer n14 = 0;
            n3 = (int)(n14.equals(n10 = this.zzo) ? 1 : 0);
            if (n3 != 0) {
                this.zzc();
            }
            return Tasks.forResult(null);
        }
        if (n3 == n8) {
            InstallException installException = new InstallException(-8);
            return Tasks.forException(installException);
        }
        InstallException installException = new InstallException(-7);
        return Tasks.forException(installException);
    }

    public void downloadCompletes() {
        int n3 = this.zzd;
        int n4 = 2;
        int n7 = 1;
        if (n3 == n4 || n3 == n7) {
            Integer n8;
            long l2;
            this.zzd = 11;
            this.zzj = l2 = 0L;
            this.zzk = l2;
            Integer n10 = 0;
            n3 = (int)(n10.equals(n8 = this.zzo) ? 1 : 0);
            if (n3 != 0) {
                this.zzc();
                return;
            }
            n10 = n7;
            n3 = (int)(n10.equals(n8 = this.zzo) ? 1 : 0);
            if (n3 != 0) {
                this.completeUpdate();
            }
        }
    }

    public void downloadFails() {
        Integer n3;
        int n4 = this.zzd;
        int n7 = 1;
        if (n4 != n7 && n4 != (n7 = 2)) {
            return;
        }
        this.zzd = 5;
        n4 = 0;
        Integer n8 = 0;
        n7 = (int)(n8.equals(n3 = this.zzo) ? 1 : 0);
        if (n7 != 0) {
            this.zzc();
        }
        this.zzo = null;
        this.zzm = false;
        this.zzd = 0;
    }

    public void downloadStarts() {
        int n3 = this.zzd;
        int n4 = 1;
        if (n3 == n4) {
            Integer n7;
            this.zzd = 2;
            Integer n8 = 0;
            n3 = (int)(n8.equals(n7 = this.zzo) ? 1 : 0);
            if (n3 != 0) {
                this.zzc();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public Task getAppUpdateInfo() {
        Integer n3;
        Context context;
        PendingIntent pendingIntent;
        HashMap hashMap;
        int n4;
        int n7;
        Object object;
        HashMap hashMap2;
        FakeAppUpdateManager fakeAppUpdateManager = this;
        int n8 = this.zze;
        if (n8 != 0) {
            int n10 = this.zze;
            InstallException installException = new InstallException(n10);
            return Tasks.forException(installException);
        }
        n8 = this.zzb();
        int n14 = 2;
        Context context2 = null;
        if (n8 == n14) {
            int n15;
            hashMap2 = this.zzc;
            n14 = 0;
            PendingIntent pendingIntent2 = null;
            Integer n16 = 0;
            n8 = (int)(hashMap2.contains(n16) ? 1 : 0);
            if (n8 != 0) {
                hashMap2 = this.zzb;
                n16 = new Intent();
                n15 = FakeAppUpdateManager.zza();
                hashMap2 = PendingIntent.getBroadcast((Context)hashMap2, (int)0, (Intent)n16, (int)n15);
                n16 = this.zzb;
                object = new Intent();
                n7 = FakeAppUpdateManager.zza();
                n16 = PendingIntent.getBroadcast((Context)n16, (int)0, (Intent)object, (int)n7);
            } else {
                n8 = 0;
                hashMap2 = null;
                n16 = null;
            }
            object = fakeAppUpdateManager.zzc;
            n7 = 1;
            Integer n17 = n7;
            n15 = (int)(object.contains(n17) ? 1 : 0);
            if (n15 != 0) {
                context2 = fakeAppUpdateManager.zzb;
                object = new Intent();
                n7 = FakeAppUpdateManager.zza();
                context2 = PendingIntent.getBroadcast((Context)context2, (int)0, (Intent)object, (int)n7);
                object = fakeAppUpdateManager.zzb;
                n17 = new Intent();
                n4 = FakeAppUpdateManager.zza();
                pendingIntent2 = PendingIntent.getBroadcast((Context)object, (int)0, (Intent)n17, (int)n4);
                hashMap = hashMap2;
                pendingIntent = pendingIntent2;
                context = context2;
            } else {
                hashMap = hashMap2;
                context = null;
                pendingIntent = null;
            }
            n3 = n16;
        } else {
            context = null;
            hashMap = null;
            pendingIntent = null;
            n3 = null;
        }
        object = fakeAppUpdateManager.zzb.getPackageName();
        n7 = fakeAppUpdateManager.zzg;
        n4 = this.zzb();
        int n18 = fakeAppUpdateManager.zzd;
        Integer n19 = fakeAppUpdateManager.zzh;
        int n20 = fakeAppUpdateManager.zzi;
        long l2 = fakeAppUpdateManager.zzj;
        long l3 = fakeAppUpdateManager.zzk;
        hashMap2 = new HashMap();
        return Tasks.forResult(AppUpdateInfo.zzb((String)object, n7, n4, n18, n19, n20, l2, l3, 0L, 0L, context, hashMap, pendingIntent, (PendingIntent)n3, hashMap2));
    }

    public Integer getTypeForUpdateInProgress() {
        return this.zzo;
    }

    public void installCompletes() {
        int n3 = this.zzd;
        int n4 = 3;
        if (n3 == n4) {
            Integer n7;
            long l2;
            this.zzd = 4;
            n3 = 0;
            this.zzf = false;
            this.zzg = 0;
            n4 = 0;
            this.zzh = null;
            this.zzi = 0;
            this.zzj = l2 = 0L;
            this.zzk = l2;
            this.zzm = false;
            this.zzn = false;
            Integer n8 = 0;
            boolean bl2 = n8.equals(n7 = this.zzo);
            if (bl2) {
                this.zzc();
            }
            this.zzo = null;
            this.zzd = 0;
        }
    }

    public void installFails() {
        int n3 = this.zzd;
        int n4 = 3;
        if (n3 == n4) {
            Integer n7;
            this.zzd = 5;
            n3 = 0;
            Integer n8 = 0;
            n4 = (int)(n8.equals(n7 = this.zzo) ? 1 : 0);
            if (n4 != 0) {
                this.zzc();
            }
            n4 = 0;
            n8 = null;
            this.zzo = null;
            this.zzn = false;
            this.zzm = false;
            this.zzd = 0;
        }
    }

    public boolean isConfirmationDialogVisible() {
        return this.zzl;
    }

    public boolean isImmediateFlowVisible() {
        return this.zzm;
    }

    public boolean isInstallSplashScreenVisible() {
        return this.zzn;
    }

    public void registerListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.zza.zzb(installStateUpdatedListener);
    }

    public void setBytesDownloaded(long l2) {
        long l3;
        long l4;
        long l7;
        int n3 = this.zzd;
        int n4 = 2;
        if (n3 == n4 && (l7 = (l4 = l2 - (l3 = this.zzk)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) <= 0) {
            Integer n7;
            this.zzj = l2;
            Integer n8 = 0;
            boolean bl2 = n8.equals(n7 = this.zzo);
            if (bl2) {
                this.zzc();
            }
        }
    }

    public void setClientVersionStalenessDays(Integer n3) {
        boolean bl2 = this.zzf;
        if (bl2) {
            this.zzh = n3;
        }
    }

    public void setInstallErrorCode(int n3) {
        this.zze = n3;
    }

    public void setTotalBytesToDownload(long l2) {
        int n3 = this.zzd;
        int n4 = 2;
        if (n3 == n4) {
            Integer n7;
            this.zzk = l2;
            Integer n8 = 0;
            boolean bl2 = n8.equals(n7 = this.zzo);
            if (bl2) {
                this.zzc();
            }
        }
    }

    public void setUpdateAvailable(int n3) {
        int n4 = 1;
        this.zzf = n4;
        this.zzc.clear();
        List list = this.zzc;
        Integer n7 = 0;
        list.add(n7);
        list = this.zzc;
        Integer n8 = n4;
        list.add(n8);
        this.zzg = n3;
    }

    public void setUpdateAvailable(int n3, int n4) {
        this.zzf = true;
        this.zzc.clear();
        List list = this.zzc;
        Integer n7 = n4;
        list.add(n7);
        this.zzg = n3;
    }

    public void setUpdateNotAvailable() {
        this.zzf = false;
        this.zzh = null;
    }

    public void setUpdatePriority(int n3) {
        boolean bl2 = this.zzf;
        if (bl2) {
            this.zzi = n3;
        }
    }

    public final Task startUpdateFlow(AppUpdateInfo object, Activity activity, AppUpdateOptions appUpdateOptions) {
        boolean bl2 = this.zzd((AppUpdateInfo)object, appUpdateOptions);
        if (bl2) {
            return Tasks.forResult(-1);
        }
        object = new InstallException(-6);
        return Tasks.forException((Exception)object);
    }

    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int n3, Activity activity, int n4) {
        AppUpdateOptions appUpdateOptions = AppUpdateOptions.newBuilder(n3).build();
        return this.zzd(appUpdateInfo, appUpdateOptions);
    }

    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, int n3, IntentSenderForResultStarter intentSenderForResultStarter, int n4) {
        AppUpdateOptions appUpdateOptions = AppUpdateOptions.newBuilder(n3).build();
        return this.zzd(appUpdateInfo, appUpdateOptions);
    }

    public boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, I3 i3, AppUpdateOptions appUpdateOptions) {
        return this.zzd(appUpdateInfo, appUpdateOptions);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, Activity activity, AppUpdateOptions appUpdateOptions, int n3) {
        return this.zzd(appUpdateInfo, appUpdateOptions);
    }

    public final boolean startUpdateFlowForResult(AppUpdateInfo appUpdateInfo, IntentSenderForResultStarter intentSenderForResultStarter, AppUpdateOptions appUpdateOptions, int n3) {
        return this.zzd(appUpdateInfo, appUpdateOptions);
    }

    public void unregisterListener(InstallStateUpdatedListener installStateUpdatedListener) {
        this.zza.zzc(installStateUpdatedListener);
    }

    public void userAcceptsUpdate() {
        boolean bl2 = this.zzl;
        if (bl2 || (bl2 = this.zzm)) {
            Integer n3;
            int n4;
            this.zzl = false;
            this.zzd = n4 = 1;
            Integer n7 = 0;
            bl2 = n7.equals(n3 = this.zzo);
            if (bl2) {
                this.zzc();
            }
        }
    }

    public void userCancelsDownload() {
        Integer n3;
        int n4 = this.zzd;
        int n7 = 1;
        if (n4 != n7 && n4 != (n7 = 2)) {
            return;
        }
        this.zzd = 6;
        n4 = 0;
        Integer n8 = 0;
        n7 = (int)(n8.equals(n3 = this.zzo) ? 1 : 0);
        if (n7 != 0) {
            this.zzc();
        }
        this.zzo = null;
        this.zzm = false;
        this.zzd = 0;
    }

    public void userRejectsUpdate() {
        boolean bl2 = this.zzl;
        if (!bl2 && !(bl2 = this.zzm)) {
            return;
        }
        this.zzl = false;
        this.zzm = false;
        this.zzo = null;
        this.zzd = 0;
    }
}

