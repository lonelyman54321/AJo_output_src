/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
package com.google.android.play.core.review;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.internal.zzt;
import com.google.android.play.core.review.zzi;

class zzg
extends com.google.android.play.core.review.internal.zzg {
    final com.google.android.play.core.review.internal.zzi zza;
    final TaskCompletionSource zzb;
    final /* synthetic */ zzi zzc;

    public zzg(zzi zzi2, com.google.android.play.core.review.internal.zzi zzi3, TaskCompletionSource taskCompletionSource) {
        this.zzc = zzi2;
        this.zza = zzi3;
        this.zzb = taskCompletionSource;
    }

    public void zzb(Bundle object) {
        Object[] objectArray;
        object = this.zzc.zza;
        if (object != null) {
            objectArray = this.zzb;
            ((zzt)object).zzu((TaskCompletionSource)objectArray);
        }
        object = this.zza;
        objectArray = new Object[]{};
        ((com.google.android.play.core.review.internal.zzi)object).zzc("onGetLaunchReviewFlowInfo", objectArray);
    }
}

