/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 */
package in.juspay.hypersdk.mystique;

import android.animation.ValueAnimator;
import in.juspay.hypersdk.mystique.AccordionLayout;

class AccordionLayout$1
implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ AccordionLayout this$0;

    public AccordionLayout$1(AccordionLayout accordionLayout) {
        this.this$0 = accordionLayout;
    }

    public void onAnimationUpdate(ValueAnimator object) {
        AccordionLayout accordionLayout = this.this$0;
        float f5 = ((Float)object.getAnimatedValue()).floatValue();
        AccordionLayout.access$002(accordionLayout, f5);
        object = this.this$0;
        boolean bl2 = AccordionLayout.access$100((AccordionLayout)((Object)object));
        if (bl2) {
            object = this.this$0;
            AccordionLayout.access$200((AccordionLayout)((Object)object));
        }
        this.this$0.requestLayout();
    }
}

