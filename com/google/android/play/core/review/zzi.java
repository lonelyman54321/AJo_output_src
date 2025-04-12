/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 */
package com.google.android.play.core.review;

import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.internal.zzj;
import com.google.android.play.core.review.internal.zzt;
import com.google.android.play.core.review.internal.zzw;
import com.google.android.play.core.review.zze;
import com.google.android.play.core.review.zzf;

public final class zzi {
    private static final com.google.android.play.core.review.internal.zzi zzb;
    zzt zza;
    private final String zzc;

    static {
        com.google.android.play.core.review.internal.zzi zzi2;
        zzb = zzi2 = new com.google.android.play.core.review.internal.zzi("ReviewService");
    }

    public zzi(Context context) {
        Object object = context.getPackageName();
        this.zzc = object;
        boolean bl2 = zzw.zza(context);
        if (bl2) {
            super("com.google.android.finsky.BIND_IN_APP_REVIEW_SERVICE");
            String string2 = "com.android.vending";
            Intent intent = object.setPackage(string2);
            com.google.android.play.core.review.internal.zzi zzi2 = zzb;
            zze zze2 = new zze();
            String string3 = "com.google.android.finsky.inappreviewservice.InAppReviewService";
            this.zza = object = new zzt(context, zzi2, string3, intent, zze2, null);
        }
    }

    public static /* bridge */ /* synthetic */ com.google.android.play.core.review.internal.zzi zzb() {
        return zzb;
    }

    public static /* bridge */ /* synthetic */ String zzc(zzi zzi2) {
        return zzi2.zzc;
    }

    public final Task zza() {
        Object object = this.zzc;
        Object object2 = zzb;
        int n3 = 1;
        Object object3 = new Object[n3];
        object3[0] = object;
        ((com.google.android.play.core.review.internal.zzi)object2).zzc("requestInAppReview (%s)", object3);
        object = this.zza;
        if (object == null) {
            object = new Object[]{};
            ((com.google.android.play.core.review.internal.zzi)object2).zza("Play Store app is either not installed or not the official version", (Object[])object);
            object = new ReviewException(-1);
            return Tasks.forException((Exception)object);
        }
        object = new TaskCompletionSource();
        object2 = this.zza;
        object3 = new zzf(this, (TaskCompletionSource)object, (TaskCompletionSource)object);
        ((zzt)object2).zzs((zzj)object3, (TaskCompletionSource)object);
        return ((TaskCompletionSource)object).getTask();
    }
}

