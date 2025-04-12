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
package com.google.android.play.core.review.testing;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;

public class FakeReviewManager
implements ReviewManager {
    private final Context zza;
    private ReviewInfo zzb;
    private int zzc = 0;

    public FakeReviewManager(Context context) {
        this.zza = context;
    }

    public Task launchReviewFlow(Activity object, ReviewInfo reviewInfo) {
        int n3;
        object = this.zzb;
        if (reviewInfo != object) {
            object = new ReviewException(-2);
            return Tasks.forException((Exception)object);
        }
        this.zzc = n3 = this.zzc + 1;
        return Tasks.forResult(null);
    }

    public Task requestReviewFlow() {
        Object object = new Intent();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        n3 = n3 >= n4 ? 0x4000000 : 0;
        object = ReviewInfo.zzc(PendingIntent.getBroadcast((Context)this.zza, (int)0, (Intent)object, (int)n3), false);
        this.zzb = object;
        return Tasks.forResult(object);
    }
}

