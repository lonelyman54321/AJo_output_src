/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.ObjectAnimator
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import androidx.transition.h;
import java.io.Serializable;
import java.util.HashMap;

public class ChangeScroll
extends Transition {
    public static final String[] a = new String[]{"android:changeScroll:x", "android:changeScroll:y"};

    public ChangeScroll() {
    }

    public ChangeScroll(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void b(Or3 or3) {
        Serializable serializable = or3.a;
        Integer n3 = or3.b.getScrollX();
        serializable.put("android:changeScroll:x", n3);
        serializable = Integer.valueOf(or3.b.getScrollY());
        or3.a.put("android:changeScroll:y", serializable);
    }

    public final void captureEndValues(Or3 or3) {
        ChangeScroll.b(or3);
    }

    public final void captureStartValues(Or3 or3) {
        ChangeScroll.b(or3);
    }

    public final Animator createAnimator(ViewGroup viewGroup, Or3 object, Or3 animatorArray) {
        viewGroup = null;
        if (object != null && animatorArray != null) {
            View view = animatorArray.b;
            object = ((Or3)object).a;
            Object object2 = "android:changeScroll:x";
            Integer n3 = (Integer)((HashMap)object).get(object2);
            int n4 = n3;
            animatorArray = animatorArray.a;
            object2 = (Integer)animatorArray.get(object2);
            int n7 = (Integer)object2;
            String string2 = "android:changeScroll:y";
            object = (Integer)((HashMap)object).get(string2);
            int n8 = (Integer)object;
            animatorArray = (Integer)animatorArray.get(string2);
            int n10 = animatorArray.intValue();
            if (n4 != n7) {
                view.setScrollX(n4);
                string2 = "scrollX";
                object2 = new int[]{n4, n7};
                object2 = ObjectAnimator.ofInt((Object)view, (String)string2, (int[])object2);
            } else {
                n7 = 0;
                object2 = null;
            }
            if (n8 != n10) {
                view.setScrollY(n8);
                object = new int[]{n8, n10};
                viewGroup = ObjectAnimator.ofInt((Object)view, (String)"scrollY", (int[])object);
            }
            n8 = (int)(h.a ? 1 : 0);
            if (object2 == null) {
                object2 = viewGroup;
            } else if (viewGroup != null) {
                object = new AnimatorSet();
                n10 = 2;
                animatorArray = new Animator[n10];
                view = null;
                animatorArray[0] = object2;
                int n14 = 1;
                animatorArray[n14] = viewGroup;
                object.playTogether(animatorArray);
                object2 = object;
            }
            return object2;
        }
        return null;
    }

    public final String[] getTransitionProperties() {
        return a;
    }

    public final boolean isSeekingSupported() {
        return true;
    }
}

