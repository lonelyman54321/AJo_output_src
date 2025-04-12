/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.graphics.Color
 *  android.util.Property
 */
package com.google.android.material.floatingactionbutton;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.floatingactionbutton.BaseMotionStrategy;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;

class BaseMotionStrategy$1
extends Property {
    final /* synthetic */ BaseMotionStrategy this$0;

    public BaseMotionStrategy$1(BaseMotionStrategy baseMotionStrategy, Class clazz, String string2) {
        this.this$0 = baseMotionStrategy;
        super(clazz, string2);
    }

    public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
        ColorStateList colorStateList = extendedFloatingActionButton.originalTextCsl;
        int[] nArray = extendedFloatingActionButton.getDrawableState();
        int n3 = BaseMotionStrategy.access$000((BaseMotionStrategy)this.this$0).originalTextCsl.getDefaultColor();
        int n4 = Color.alpha((int)colorStateList.getColorForState(nArray, n3));
        float f5 = (float)Color.alpha((int)extendedFloatingActionButton.getCurrentTextColor()) / 255.0f;
        float f6 = n4;
        return Float.valueOf(AnimationUtils.lerp(0.0f, 1.0f, f5 /= f6));
    }

    public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f5) {
        ColorStateList colorStateList = extendedFloatingActionButton.originalTextCsl;
        int[] nArray = extendedFloatingActionButton.getDrawableState();
        ColorStateList colorStateList2 = BaseMotionStrategy.access$000((BaseMotionStrategy)this.this$0).originalTextCsl;
        int n3 = colorStateList2.getDefaultColor();
        int n4 = colorStateList.getColorForState(nArray, n3);
        float f6 = Color.alpha((int)n4);
        float f7 = 255.0f;
        float f8 = f5.floatValue();
        int n7 = (int)(AnimationUtils.lerp(0.0f, f6 /= f7, f8) * f7);
        n3 = Color.red((int)n4);
        int n8 = Color.green((int)n4);
        n4 = Color.blue((int)n4);
        n4 = Color.argb((int)n7, (int)n3, (int)n8, (int)n4);
        colorStateList = ColorStateList.valueOf((int)n4);
        float f11 = f5.floatValue();
        n7 = 1065353216;
        f6 = 1.0f;
        float f12 = f11 - f6;
        Object object = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (object == false) {
            f5 = extendedFloatingActionButton.originalTextCsl;
            extendedFloatingActionButton.silentlyUpdateTextColor((ColorStateList)f5);
        } else {
            extendedFloatingActionButton.silentlyUpdateTextColor(colorStateList);
        }
    }
}

