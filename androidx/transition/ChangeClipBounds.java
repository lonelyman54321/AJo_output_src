/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.ObjectAnimator
 *  android.animation.TypeEvaluator
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.util.Property
 *  android.view.View
 *  android.view.ViewGroup
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.ChangeClipBounds$a;
import androidx.transition.R$id;
import androidx.transition.Transition;
import androidx.transition.Transition$i;
import java.util.HashMap;

public class ChangeClipBounds
extends Transition {
    public static final String[] a;
    public static final Rect b;

    static {
        Rect rect;
        a = new String[]{"android:clipBounds:clip"};
        b = rect = new Rect();
    }

    public ChangeClipBounds() {
    }

    public ChangeClipBounds(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static void b(Or3 object, boolean bl2) {
        Rect rect;
        Object object2;
        int n3;
        Object object3 = ((Or3)object).b;
        int n4 = object3.getVisibility();
        if (n4 == (n3 = 8)) {
            return;
        }
        n4 = 0;
        Rect rect2 = null;
        if (bl2) {
            int n7 = R$id.transition_clip;
            object2 = (Rect)object3.getTag(n7);
        } else {
            boolean bl3 = false;
            object2 = null;
        }
        if (object2 == null) {
            object2 = object3.getClipBounds();
        }
        if (object2 != (rect = b)) {
            rect2 = object2;
        }
        object = ((Or3)object).a;
        object2 = "android:clipBounds:clip";
        ((HashMap)object).put(object2, rect2);
        if (rect2 == null) {
            n4 = object3.getWidth();
            int n8 = object3.getHeight();
            n3 = 0;
            rect = null;
            object2 = new Rect(0, 0, n4, n8);
            object3 = "android:clipBounds:bounds";
            ((HashMap)object).put(object3, object2);
        }
    }

    public final void captureEndValues(Or3 or3) {
        ChangeClipBounds.b(or3, false);
    }

    public final void captureStartValues(Or3 or3) {
        ChangeClipBounds.b(or3, true);
    }

    public final Animator createAnimator(ViewGroup object, Or3 object2, Or3 object3) {
        Object object4;
        boolean bl2;
        String string2;
        boolean bl3;
        object = null;
        if (object2 != null && object3 != null && (bl3 = ((HashMap)(object2 = ((Or3)object2).a)).containsKey(string2 = "android:clipBounds:clip")) && (bl2 = ((HashMap)(object4 = ((Or3)object3).a)).containsKey(string2))) {
            Rect rect = (Rect)((HashMap)object2).get(string2);
            string2 = (Rect)((HashMap)object4).get(string2);
            if (rect == null && string2 == null) {
                return null;
            }
            String string3 = "android:clipBounds:bounds";
            object2 = rect == null ? (Rect)((HashMap)object2).get(string3) : rect;
            boolean bl4 = object2.equals(object4 = string2 == null ? (Rect)((HashMap)object4).get(string3) : string2);
            if (bl4) {
                return null;
            }
            ((Or3)object3).b.setClipBounds(rect);
            string3 = new Rect();
            object = new Object();
            object.a = string3;
            string3 = ((Or3)object3).b;
            eE3$b eE3$b = ee3_0.c;
            int n3 = 2;
            Object[] objectArray = new Rect[n3];
            objectArray[0] = object2;
            int n4 = 1;
            objectArray[n4] = object4;
            object = ObjectAnimator.ofObject((Object)string3, (Property)eE3$b, (TypeEvaluator)object, (Object[])objectArray);
            object2 = ((Or3)object3).b;
            object3 = new ChangeClipBounds$a((View)object2, rect, (Rect)string2);
            object.addListener((Animator.AnimatorListener)object3);
            this.addListener((Transition$i)object3);
        }
        return object;
    }

    public final String[] getTransitionProperties() {
        return a;
    }

    public final boolean isSeekingSupported() {
        return true;
    }
}

