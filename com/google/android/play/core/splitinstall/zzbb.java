/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.splitinstall;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.splitinstall.SplitInstallException;
import com.google.android.play.core.splitinstall.internal.zzaf;
import com.google.android.play.core.splitinstall.internal.zzbp;
import com.google.android.play.core.splitinstall.internal.zzu;
import com.google.android.play.core.splitinstall.zzbc;
import java.util.List;

class zzbb
extends zzbp {
    final TaskCompletionSource zza;
    final /* synthetic */ zzbc zzb;

    public zzbb(zzbc zzbc2, TaskCompletionSource taskCompletionSource) {
        this.zzb = zzbc2;
        this.zza = taskCompletionSource;
    }

    public void zzb(int n3, Bundle object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        Integer n4 = n3;
        objectArray = new Object[]{n4};
        ((zzu)object).zzd("onCancelInstall(%d)", objectArray);
    }

    public void zzc(Bundle object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        objectArray = new Object[]{};
        ((zzu)object).zzd("onDeferredInstall", objectArray);
    }

    public void zzd(Bundle object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        objectArray = new Object[]{};
        ((zzu)object).zzd("onDeferredLanguageInstall", objectArray);
    }

    public void zze(Bundle object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        objectArray = new Object[]{};
        ((zzu)object).zzd("onDeferredLanguageUninstall", objectArray);
    }

    public void zzf(Bundle object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        objectArray = new Object[]{};
        ((zzu)object).zzd("onDeferredUninstall", objectArray);
    }

    public void zzg(int n3, Bundle object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        Integer n4 = n3;
        objectArray = new Object[]{n4};
        ((zzu)object).zzd("onGetSession(%d)", objectArray);
    }

    public void zzh(List object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        objectArray = new Object[]{};
        ((zzu)object).zzd("onGetSessionStates", objectArray);
    }

    public void zzi(int n3, Bundle object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        Integer n4 = n3;
        objectArray = new Object[]{n4};
        ((zzu)object).zzd("onStartInstall(%d)", objectArray);
    }

    public final void zzj(int n3, Bundle object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        Integer n4 = n3;
        objectArray = new Object[]{n4};
        ((zzu)object).zzd("onCompleteInstall(%d)", objectArray);
    }

    public final void zzk(Bundle object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        objectArray = new Object[]{};
        ((zzu)object).zzd("onCompleteInstallForAppUpdate", objectArray);
    }

    public final void zzl(Bundle bundle) {
        Object object = this.zzb.zza;
        Object object2 = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)object2);
        int n3 = bundle.getInt("error_code");
        object = zzbc.zzk();
        object2 = n3;
        Object[] objectArray = new Object[]{object2};
        ((zzu)object).zzb("onError(%d)", objectArray);
        object = this.zza;
        object2 = new SplitInstallException(n3);
        ((TaskCompletionSource)object).trySetException((Exception)object2);
    }

    public final void zzm(Bundle object) {
        object = this.zzb.zza;
        Object[] objectArray = this.zza;
        ((zzaf)object).zzu((TaskCompletionSource)objectArray);
        object = zzbc.zzk();
        objectArray = new Object[]{};
        ((zzu)object).zzd("onGetSplitsForAppUpdate", objectArray);
    }
}

