/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Parcelable
 */
package com.google.android.play.core.review;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.zzc;
import com.google.android.play.core.review.zzi;

public final class zzd
implements ReviewManager {
    private final zzi zza;
    private final Handler zzb;

    public zzd(zzi zzi2) {
        Handler handler;
        Looper looper = Looper.getMainLooper();
        this.zzb = handler = new Handler(looper);
        this.zza = zzi2;
    }

    public final Task launchReviewFlow(Activity activity, ReviewInfo object) {
        boolean bl2 = ((ReviewInfo)object).zzb();
        if (bl2) {
            return Tasks.forResult(null);
        }
        Intent intent = new Intent((Context)activity, PlayCoreDialogWrapperActivity.class);
        object = ((ReviewInfo)object).zza();
        intent.putExtra("confirmation_intent", (Parcelable)object);
        int n3 = activity.getWindow().getDecorView().getWindowSystemUiVisibility();
        intent.putExtra("window_flags", n3);
        object = new TaskCompletionSource();
        Handler handler = this.zzb;
        zzc zzc2 = new zzc(this, handler, (TaskCompletionSource)object);
        intent.putExtra("result_receiver", (Parcelable)zzc2);
        activity.startActivity(intent);
        return ((TaskCompletionSource)object).getTask();
    }

    public final Task requestReviewFlow() {
        return this.zza.zza();
    }
}

