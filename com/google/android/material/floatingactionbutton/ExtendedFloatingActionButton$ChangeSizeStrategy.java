/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.PropertyValuesHolder
 *  android.text.TextUtils
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import com.google.android.material.R$animator;
import com.google.android.material.animation.MotionSpec;
import com.google.android.material.floatingactionbutton.AnimatorTracker;
import com.google.android.material.floatingactionbutton.BaseMotionStrategy;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$OnChangedCallback;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$Size;

class ExtendedFloatingActionButton$ChangeSizeStrategy
extends BaseMotionStrategy {
    private final boolean extending;
    private final ExtendedFloatingActionButton$Size size;
    final /* synthetic */ ExtendedFloatingActionButton this$0;

    public ExtendedFloatingActionButton$ChangeSizeStrategy(ExtendedFloatingActionButton extendedFloatingActionButton, AnimatorTracker animatorTracker, ExtendedFloatingActionButton$Size extendedFloatingActionButton$Size, boolean bl2) {
        this.this$0 = extendedFloatingActionButton;
        super(extendedFloatingActionButton, animatorTracker);
        this.size = extendedFloatingActionButton$Size;
        this.extending = bl2;
    }

    public AnimatorSet createAnimator() {
        float[] fArray;
        float f5;
        int n3;
        Object object;
        float f6;
        int n4;
        ExtendedFloatingActionButton extendedFloatingActionButton;
        PropertyValuesHolder propertyValuesHolder;
        PropertyValuesHolder[] propertyValuesHolderArray;
        String string2;
        int n7 = 1;
        int n8 = 2;
        MotionSpec motionSpec = this.getCurrentMotionSpec();
        boolean bl2 = motionSpec.hasPropertyValues(string2 = "width");
        if (bl2) {
            propertyValuesHolderArray = motionSpec.getPropertyValues(string2);
            propertyValuesHolder = propertyValuesHolderArray[0];
            extendedFloatingActionButton = this.this$0;
            n4 = extendedFloatingActionButton.getWidth();
            f6 = n4;
            object = this.size;
            n3 = object.getWidth();
            f5 = n3;
            fArray = new float[n8];
            fArray[0] = f6;
            fArray[n7] = f5;
            propertyValuesHolder.setFloatValues(fArray);
            motionSpec.setPropertyValues(string2, propertyValuesHolderArray);
        }
        if (bl2 = motionSpec.hasPropertyValues(string2 = "height")) {
            propertyValuesHolderArray = motionSpec.getPropertyValues(string2);
            propertyValuesHolder = propertyValuesHolderArray[0];
            extendedFloatingActionButton = this.this$0;
            n4 = extendedFloatingActionButton.getHeight();
            f6 = n4;
            object = this.size;
            n3 = object.getHeight();
            f5 = n3;
            fArray = new float[n8];
            fArray[0] = f6;
            fArray[n7] = f5;
            propertyValuesHolder.setFloatValues(fArray);
            motionSpec.setPropertyValues(string2, propertyValuesHolderArray);
        }
        if (bl2 = motionSpec.hasPropertyValues(string2 = "paddingStart")) {
            propertyValuesHolderArray = motionSpec.getPropertyValues(string2);
            propertyValuesHolder = propertyValuesHolderArray[0];
            extendedFloatingActionButton = this.this$0;
            object = ViewCompat.a;
            n4 = extendedFloatingActionButton.getPaddingStart();
            f6 = n4;
            object = this.size;
            n3 = object.getPaddingStart();
            f5 = n3;
            fArray = new float[n8];
            fArray[0] = f6;
            fArray[n7] = f5;
            propertyValuesHolder.setFloatValues(fArray);
            motionSpec.setPropertyValues(string2, propertyValuesHolderArray);
        }
        if (bl2 = motionSpec.hasPropertyValues(string2 = "paddingEnd")) {
            propertyValuesHolderArray = motionSpec.getPropertyValues(string2);
            propertyValuesHolder = propertyValuesHolderArray[0];
            extendedFloatingActionButton = this.this$0;
            object = ViewCompat.a;
            n4 = extendedFloatingActionButton.getPaddingEnd();
            f6 = n4;
            object = this.size;
            n3 = object.getPaddingEnd();
            f5 = n3;
            fArray = new float[n8];
            fArray[0] = f6;
            fArray[n7] = f5;
            propertyValuesHolder.setFloatValues(fArray);
            motionSpec.setPropertyValues(string2, propertyValuesHolderArray);
        }
        if (bl2 = motionSpec.hasPropertyValues(string2 = "labelOpacity")) {
            float f7;
            propertyValuesHolderArray = motionSpec.getPropertyValues(string2);
            boolean bl3 = this.extending;
            n4 = 1065353216;
            f6 = 1.0f;
            n3 = 0;
            f5 = 0.0f;
            object = null;
            if (bl3) {
                f7 = 0.0f;
                fArray = null;
            } else {
                f7 = 1.0f;
            }
            if (!bl3) {
                n4 = 0;
                f6 = 0.0f;
                extendedFloatingActionButton = null;
            }
            propertyValuesHolder = propertyValuesHolderArray[0];
            float[] fArray2 = new float[n8];
            fArray2[0] = f7;
            fArray2[n7] = f6;
            propertyValuesHolder.setFloatValues(fArray2);
            motionSpec.setPropertyValues(string2, propertyValuesHolderArray);
        }
        return super.createAnimator(motionSpec);
    }

    public int getDefaultMotionSpecResource() {
        int n3 = this.extending;
        n3 = n3 != 0 ? R$animator.mtrl_extended_fab_change_size_expand_motion_spec : R$animator.mtrl_extended_fab_change_size_collapse_motion_spec;
        return n3;
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
        int n3 = 0;
        ExtendedFloatingActionButton.access$602(extendedFloatingActionButton, false);
        this.this$0.setHorizontallyScrolling(false);
        extendedFloatingActionButton = this.this$0.getLayoutParams();
        if (extendedFloatingActionButton == null) {
            return;
        }
        ((ViewGroup.LayoutParams)extendedFloatingActionButton).width = n3 = this.size.getLayoutParams().width;
        ((ViewGroup.LayoutParams)extendedFloatingActionButton).height = n3 = this.size.getLayoutParams().height;
    }

    public void onAnimationStart(Animator object) {
        super.onAnimationStart((Animator)object);
        object = this.this$0;
        boolean bl2 = this.extending;
        ExtendedFloatingActionButton.access$502((ExtendedFloatingActionButton)object, bl2);
        object = this.this$0;
        bl2 = true;
        ExtendedFloatingActionButton.access$602((ExtendedFloatingActionButton)object, bl2);
        this.this$0.setHorizontallyScrolling(bl2);
    }

    public void onChange(ExtendedFloatingActionButton$OnChangedCallback extendedFloatingActionButton$OnChangedCallback) {
        if (extendedFloatingActionButton$OnChangedCallback == null) {
            return;
        }
        boolean bl2 = this.extending;
        if (bl2) {
            ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
            extendedFloatingActionButton$OnChangedCallback.onExtended(extendedFloatingActionButton);
        } else {
            ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
            extendedFloatingActionButton$OnChangedCallback.onShrunken(extendedFloatingActionButton);
        }
    }

    public void performNow() {
        int n3;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
        int n4 = this.extending;
        ExtendedFloatingActionButton.access$502(extendedFloatingActionButton, n4 != 0);
        extendedFloatingActionButton = this.this$0.getLayoutParams();
        if (extendedFloatingActionButton == null) {
            return;
        }
        n4 = this.extending;
        if (n4 == 0) {
            ExtendedFloatingActionButton extendedFloatingActionButton2 = this.this$0;
            n3 = ((ViewGroup.LayoutParams)extendedFloatingActionButton).width;
            ExtendedFloatingActionButton.access$302(extendedFloatingActionButton2, n3);
            extendedFloatingActionButton2 = this.this$0;
            n3 = ((ViewGroup.LayoutParams)extendedFloatingActionButton).height;
            ExtendedFloatingActionButton.access$202(extendedFloatingActionButton2, n3);
        }
        ((ViewGroup.LayoutParams)extendedFloatingActionButton).width = n4 = this.size.getLayoutParams().width;
        ((ViewGroup.LayoutParams)extendedFloatingActionButton).height = n4 = this.size.getLayoutParams().height;
        extendedFloatingActionButton = this.this$0;
        n4 = this.size.getPaddingStart();
        n3 = this.this$0.getPaddingTop();
        int n7 = this.size.getPaddingEnd();
        int n8 = this.this$0.getPaddingBottom();
        extendedFloatingActionButton.setPaddingRelative(n4, n3, n7, n8);
        this.this$0.requestLayout();
    }

    public boolean shouldCancel() {
        Object object;
        boolean bl2 = this.extending;
        ExtendedFloatingActionButton extendedFloatingActionButton = this.this$0;
        boolean bl3 = ExtendedFloatingActionButton.access$500(extendedFloatingActionButton);
        if (bl2 != bl3 && (object = this.this$0.getIcon()) != null && !(bl2 = TextUtils.isEmpty((CharSequence)(object = this.this$0.getText())))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

