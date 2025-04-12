/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 */
package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.cloudmessaging.zzt;
import com.google.android.gms.tasks.TaskCompletionSource;

abstract class zzs {
    final int zza;
    final TaskCompletionSource zzb;
    final int zzc;
    final Bundle zzd;

    public zzs(int n3, int n4, Bundle bundle) {
        TaskCompletionSource taskCompletionSource;
        this.zzb = taskCompletionSource = new TaskCompletionSource();
        this.zza = n3;
        this.zzc = n4;
        this.zzd = bundle;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Request { what=");
        int bl2 = this.zzc;
        stringBuilder.append(bl2);
        stringBuilder.append(" id=");
        int n3 = this.zza;
        stringBuilder.append(n3);
        stringBuilder.append(" oneWay=");
        boolean bl3 = this.zzb();
        return Vm.a("}", bl3, stringBuilder);
    }

    public abstract void zza(Bundle var1);

    public abstract boolean zzb();

    public final void zzc(zzt zzt2) {
        String string2 = "MessengerIpcClient";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            this.toString();
            ((Object)zzt2).toString();
        }
        this.zzb.setException(zzt2);
    }

    public final void zzd(Object object) {
        String string2 = "MessengerIpcClient";
        int n3 = 3;
        boolean bl2 = Log.isLoggable((String)string2, (int)n3);
        if (bl2) {
            this.toString();
            String.valueOf(object);
        }
        this.zzb.setResult(object);
    }
}

