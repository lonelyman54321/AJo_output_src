/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
package com.google.android.play.core.review;

import android.content.Context;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.zzd;
import com.google.android.play.core.review.zzi;

public class ReviewManagerFactory {
    private ReviewManagerFactory() {
    }

    public static ReviewManager create(Context context) {
        Object object = context.getApplicationContext();
        if (object != null) {
            context = object;
        }
        zzi zzi2 = new zzi(context);
        object = new zzd(zzi2);
        return object;
    }
}

