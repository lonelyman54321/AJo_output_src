/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.AnimatorInflater
 *  android.animation.AnimatorSet
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 */
package com.ril.ajio.myaccount.order.orderhistory.tracking;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.ril.ajio.R$animator;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;

public class TrackStepDot
extends FrameLayout {
    public AnimatorSet a;
    public final View b;
    public final View c;

    public TrackStepDot(Context context) {
        this(context, null);
    }

    public TrackStepDot(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TrackStepDot(Context context, AttributeSet attributeSet, int n3) {
        super(context, attributeSet, n3);
        context = this.getContext();
        int n4 = R$layout.track_step_dot;
        View.inflate((Context)context, (int)n4, (ViewGroup)this);
        int n7 = R$id.pulseView;
        context = this.findViewById(n7);
        this.b = context;
        n7 = R$id.dotView;
        context = this.findViewById(n7);
        this.c = context;
        context.setEnabled(false);
    }

    public final void a() {
        boolean bl2;
        AnimatorSet animatorSet = this.a;
        View view = this.b;
        if (animatorSet == null && animatorSet == null) {
            animatorSet = this.getContext();
            int n3 = R$animator.fading_pulse;
            this.a = animatorSet = (AnimatorSet)AnimatorInflater.loadAnimator((Context)animatorSet, (int)n3);
            if (animatorSet != null) {
                animatorSet.setTarget((Object)view);
            }
        }
        if ((animatorSet = this.a) != null && !(bl2 = animatorSet.isStarted())) {
            bl2 = false;
            view.setVisibility(0);
            animatorSet = this.a;
            animatorSet.start();
        }
    }

    public final void onDetachedFromWindow() {
        AnimatorSet animatorSet = this.a;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        super.onDetachedFromWindow();
    }

    public void setActivated(boolean bl2, boolean bl3) {
        super.setActivated(bl2);
        View view = this.c;
        view.setEnabled(bl2);
        view.setActivated(bl2);
        if (bl3) {
            this.a();
        } else {
            AnimatorSet animatorSet = this.a;
            if (animatorSet != null) {
                animatorSet = this.b;
                int n3 = 8;
                animatorSet.setVisibility(n3);
                this.a.removeAllListeners();
                animatorSet = this.a;
                animatorSet.end();
            }
        }
    }

    public void setEnabled(boolean bl2, boolean bl3) {
        super.setEnabled(bl2);
        View view = this.c;
        view.setEnabled(bl2);
        if (!bl3) {
            AnimatorSet animatorSet = this.a;
            if (animatorSet != null) {
                animatorSet = this.b;
                int n3 = 8;
                animatorSet.setVisibility(n3);
                this.a.removeAllListeners();
                animatorSet = this.a;
                animatorSet.end();
            }
        } else {
            this.a();
        }
    }
}

