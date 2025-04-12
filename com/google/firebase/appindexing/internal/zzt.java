/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.firebase.appindexing.internal;

import android.content.Context;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.appindexing.Action;
import com.google.firebase.appindexing.FirebaseAppIndexingInvalidArgumentException;
import com.google.firebase.appindexing.FirebaseUserActions;
import com.google.firebase.appindexing.internal.zzb;
import com.google.firebase.appindexing.internal.zzc;
import com.google.firebase.appindexing.internal.zzq;
import com.google.firebase.appindexing.internal.zzr;

public final class zzt
extends FirebaseUserActions {
    private final zzr zza;

    public zzt(Context context) {
        zzr zzr2;
        this.zza = zzr2 = new zzr(context);
    }

    private final Task zza(int n3, Action object) {
        int n4 = 1;
        zzc[] zzcArray = new zzc[n4];
        if (object != null) {
            boolean bl2 = object instanceof zzc;
            if (!bl2) {
                FirebaseAppIndexingInvalidArgumentException firebaseAppIndexingInvalidArgumentException = new FirebaseAppIndexingInvalidArgumentException("Custom Action objects are not allowed. Please use the 'Actions' or 'ActionBuilder' class for creating Action objects.");
                return Tasks.forException(firebaseAppIndexingInvalidArgumentException);
            }
            object = (zzc)object;
            bl2 = false;
            zzcArray[0] = object;
            object = ((zzc)object).zza();
            ((zzb)object).zza(n3);
        }
        zzr zzr2 = this.zza;
        object = new zzq(this, zzcArray);
        return zzr2.doWrite((TaskApiCall)object);
    }

    public final Task end(Action action) {
        return this.zza(2, action);
    }

    public final Task start(Action action) {
        return this.zza(1, action);
    }
}

