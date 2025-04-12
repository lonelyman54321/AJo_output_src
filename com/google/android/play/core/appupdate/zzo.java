/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.appupdate;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.appupdate.internal.zzg;
import com.google.android.play.core.appupdate.internal.zzm;
import com.google.android.play.core.appupdate.internal.zzx;
import com.google.android.play.core.appupdate.zzr;

class zzo
extends zzg {
    final zzm zza;
    final TaskCompletionSource zzb;
    final /* synthetic */ zzr zzc;

    public zzo(zzr zzr2, zzm zzm2, TaskCompletionSource taskCompletionSource) {
        this.zzc = zzr2;
        this.zza = zzm2;
        this.zzb = taskCompletionSource;
    }

    public void zzb(Bundle object) {
        object = this.zzc.zza;
        Object[] objectArray = this.zzb;
        ((zzx)object).zzu((TaskCompletionSource)objectArray);
        object = this.zza;
        objectArray = new Object[]{};
        ((zzm)object).zzd("onCompleteUpdate", objectArray);
    }

    public void zzc(Bundle object) {
        object = this.zzc.zza;
        Object[] objectArray = this.zzb;
        ((zzx)object).zzu((TaskCompletionSource)objectArray);
        object = this.zza;
        objectArray = new Object[]{};
        ((zzm)object).zzd("onRequestInfo", objectArray);
    }
}

