/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.os.Bundle
 */
package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.review.zza;
import com.google.android.play.core.review.zzg;
import com.google.android.play.core.review.zzi;

final class zzh
extends zzg {
    public zzh(zzi zzi2, TaskCompletionSource taskCompletionSource, String object) {
        object = new com.google.android.play.core.review.internal.zzi("OnRequestInstallCallback");
        super(zzi2, (com.google.android.play.core.review.internal.zzi)object, taskCompletionSource);
    }

    public final void zzb(Bundle bundle) {
        super.zzb(bundle);
        PendingIntent pendingIntent = (PendingIntent)bundle.get("confirmation_intent");
        boolean bl2 = bundle.getBoolean("is_review_no_op");
        zza zza2 = new zza(pendingIntent, bl2);
        this.zzb.trySetResult(zza2);
    }
}

