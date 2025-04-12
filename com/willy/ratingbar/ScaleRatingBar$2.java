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
import com.willy.ratingbar.ScaleRatingBar;

class ScaleRatingBar$2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;
    public final /* synthetic */ PartialView c;
    public final /* synthetic */ float d;
    public final /* synthetic */ ScaleRatingBar e;

    public ScaleRatingBar$2(ScaleRatingBar scaleRatingBar, int n3, double d2, PartialView partialView, float f5) {
        this.e = scaleRatingBar;
        this.a = n3;
        this.b = d2;
        this.c = partialView;
        this.d = f5;
    }

    public final void run() {
        int n3;
        ImageView imageView;
        int n4 = this.a;
        double d2 = n4;
        double d5 = this.b;
        float f5 = this.d;
        PartialView partialView = this.c;
        Object object = d2 == d5 ? 0 : (d2 > d5 ? 1 : -1);
        if (object == false) {
            partialView.c(f5);
        } else {
            partialView.a.setImageLevel(10000);
            imageView = partialView.b;
            n3 = 0;
            imageView.setImageLevel(0);
        }
        float f6 = n4;
        n4 = (int)(f6 == f5 ? 0 : (f6 > f5 ? 1 : -1));
        if (n4 == 0) {
            ScaleRatingBar scaleRatingBar = this.e;
            imageView = scaleRatingBar.getContext();
            n3 = R$anim.scale_up;
            imageView = AnimationUtils.loadAnimation((Context)imageView, (int)n3);
            scaleRatingBar = scaleRatingBar.getContext();
            n3 = R$anim.scale_down;
            scaleRatingBar = AnimationUtils.loadAnimation((Context)scaleRatingBar, (int)n3);
            partialView.startAnimation((Animation)imageView);
            partialView.startAnimation((Animation)scaleRatingBar);
        }
    }
}

