/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.animation.Animation
 *  android.view.animation.AnimationUtils
 *  android.widget.ImageView
 */
package com.willy.ratingbar;

import android.content.Context;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import com.willy.ratingbar.PartialView;
import com.willy.ratingbar.R$anim;
import com.willy.ratingbar.RotationRatingBar;

class RotationRatingBar$2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;
    public final /* synthetic */ PartialView c;
    public final /* synthetic */ float d;
    public final /* synthetic */ RotationRatingBar e;

    public RotationRatingBar$2(RotationRatingBar rotationRatingBar, int n3, double d2, PartialView partialView, float f5) {
        this.e = rotationRatingBar;
        this.a = n3;
        this.b = d2;
        this.c = partialView;
        this.d = f5;
    }

    public final void run() {
        int n3 = this.a;
        double d2 = n3;
        double d5 = this.b;
        float f5 = this.d;
        PartialView partialView = this.c;
        Object object = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (object == false) {
            partialView.c(f5);
        } else {
            partialView.a.setImageLevel(10000);
            ImageView imageView = partialView.b;
            imageView.setImageLevel(0);
        }
        float f6 = n3;
        n3 = (int)(f6 == f5 ? 0 : (f6 > f5 ? 1 : -1));
        if (n3 == 0) {
            Context context = this.e.getContext();
            int n4 = R$anim.rotation;
            context = AnimationUtils.loadAnimation((Context)context, (int)n4);
            partialView.startAnimation((Animation)context);
        }
    }
}

