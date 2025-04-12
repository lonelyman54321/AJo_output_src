/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.animation.TimeInterpolator
 *  android.util.Property
 *  android.view.View
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.i$a;

public final class i {
    public static ObjectAnimator a(View view, Or3 or3, int n3, int n4, float f5, float f6, float f7, float f8, TimeInterpolator timeInterpolator, Transition transition2) {
        float f11;
        float f12;
        Or3 or32 = or3;
        int n7 = 2;
        int n8 = 1;
        float f14 = view.getTranslationX();
        float f15 = view.getTranslationY();
        Object object = or3.b;
        Object object2 = R$id.transition_position;
        if ((object = (Object)((int[])object.getTag(object2))) != null) {
            object2 = object[0] - n3;
            f12 = (float)object2 + f14;
            reference var18_18 = object[n8] - n4;
            f11 = (float)var18_18 + f15;
        } else {
            f12 = f5;
            f11 = f6;
        }
        view.setTranslationX(f12);
        view.setTranslationY(f11);
        float f16 = f12 == f7 ? 0 : (f12 > f7 ? 1 : -1);
        if (f16 == false && (f16 = f11 == f8 ? 0 : (f11 > f8 ? 1 : -1)) == false) {
            return null;
        }
        Property property = View.TRANSLATION_X;
        float[] fArray = new float[n7];
        fArray[0] = f12;
        fArray[n8] = f7;
        PropertyValuesHolder propertyValuesHolder = PropertyValuesHolder.ofFloat((Property)property, (float[])fArray);
        property = View.TRANSLATION_Y;
        fArray = new float[n7];
        fArray[0] = f11;
        fArray[n8] = f8;
        object = PropertyValuesHolder.ofFloat((Property)property, (float[])fArray);
        ObjectAnimator objectAnimator = new PropertyValuesHolder[n7];
        objectAnimator[0] = propertyValuesHolder;
        objectAnimator[n8] = object;
        objectAnimator = ObjectAnimator.ofPropertyValuesHolder((Object)view, (PropertyValuesHolder[])objectAnimator);
        or32 = or32.b;
        i$a i$a = new i$a(view, (View)or32, f14, f15);
        transition2.addListener(i$a);
        objectAnimator.addListener((Animator.AnimatorListener)i$a);
        objectAnimator.setInterpolator(timeInterpolator);
        return objectAnimator;
    }
}

