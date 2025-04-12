/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.slider.BaseSlider;
import com.google.android.material.tooltip.TooltipDrawable;
import java.util.Iterator;

class BaseSlider$2
extends AnimatorListenerAdapter {
    final /* synthetic */ BaseSlider this$0;

    public BaseSlider$2(BaseSlider baseSlider) {
        this.this$0 = baseSlider;
    }

    public void onAnimationEnd(Animator object) {
        boolean bl2;
        super.onAnimationEnd((Animator)object);
        object = ViewUtils.getContentViewOverlay(this.this$0);
        Iterator iterator = BaseSlider.access$000(this.this$0).iterator();
        while (bl2 = iterator.hasNext()) {
            TooltipDrawable tooltipDrawable = (TooltipDrawable)iterator.next();
            object.remove(tooltipDrawable);
        }
    }
}

