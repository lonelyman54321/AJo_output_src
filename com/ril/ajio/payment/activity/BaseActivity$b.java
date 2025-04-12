/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.animation.Animation
 *  android.view.animation.Animation$AnimationListener
 */
package com.ril.ajio.payment.activity;

import android.view.View;
import android.view.animation.Animation;
import com.ril.ajio.payment.activity.BaseActivity;

public final class BaseActivity$b
implements Animation.AnimationListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ BaseActivity b;

    public BaseActivity$b(BaseActivity baseActivity, View view) {
        this.b = baseActivity;
        this.a = view;
    }

    public final void onAnimationEnd(Animation object) {
        int n3 = BaseActivity.Y;
        object = this.b;
        n3 = (int)(object.isFinishing() ? 1 : 0);
        if (n3 != 0) {
            return;
        }
        this.a.setVisibility(8);
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }
}

