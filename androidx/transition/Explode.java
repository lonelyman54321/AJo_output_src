/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.TimeInterpolator
 *  android.content.Context
 *  android.graphics.Rect
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.animation.AccelerateInterpolator
 *  android.view.animation.DecelerateInterpolator
 */
package androidx.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.transition.R$id;
import androidx.transition.Visibility;
import androidx.transition.i;

public class Explode
extends Visibility {
    public static final DecelerateInterpolator b;
    public static final AccelerateInterpolator c;
    public final int[] a;

    static {
        DecelerateInterpolator decelerateInterpolator;
        b = decelerateInterpolator = new DecelerateInterpolator();
        decelerateInterpolator = new AccelerateInterpolator();
        c = decelerateInterpolator;
    }

    public Explode() {
        Object object = new int[2];
        this.a = object;
        object = new ru_1;
        this.setPropagation((Kr3)object);
    }

    public Explode(Context object, AttributeSet attributeSet) {
        super((Context)object, attributeSet);
        object = new int[2];
        this.a = (int[])object;
        super();
        this.setPropagation((Kr3)object);
    }

    public final void b(View view, Rect rect, int[] nArray) {
        float f5;
        int n3;
        int n4;
        int n7;
        int[] nArray2 = this.a;
        view.getLocationOnScreen(nArray2);
        int n8 = nArray2[0];
        int n10 = 1;
        int n14 = nArray2[n10];
        Rect rect2 = this.getEpicenter();
        if (rect2 == null) {
            n7 = view.getWidth() / 2 + n8;
            float f6 = view.getTranslationX();
            n4 = Math.round(f6) + n7;
            n7 = view.getHeight() / 2 + n14;
            float f7 = view.getTranslationY();
            n3 = Math.round(f7) + n7;
        } else {
            n4 = rect2.centerX();
            n3 = rect2.centerY();
        }
        n7 = rect.centerX();
        int n15 = rect.centerY();
        float f8 = n7 -= n4;
        float f11 = n15 -= n3;
        boolean bl2 = false;
        float f12 = 0.0f;
        float f14 = f8 - 0.0f;
        float f15 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
        if (f15 == false && !(bl2 = (f5 = f11 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1))) {
            double d2 = Math.random();
            double d5 = 2.0;
            f11 = (float)(d2 * d5);
            n7 = 1065353216;
            f8 = 1.0f;
            f11 -= f8;
            d2 = Math.random() * d5;
            f12 = (float)d2;
            float f16 = f12 - f8;
            f8 = f11;
            f11 = f16;
        }
        f12 = f8 * f8;
        f12 = (float)Math.sqrt(f11 * f11 + f12);
        f8 /= f12;
        f11 /= f12;
        n3 -= n14;
        n14 = view.getWidth() - (n4 -= n8);
        n14 = Math.max(n4, n14);
        int n16 = view.getHeight() - n3;
        n16 = Math.max(n3, n16);
        float f17 = n14;
        float f18 = n16;
        f17 *= f17;
        f18 = (float)Math.sqrt(f18 * f18 + f17);
        nArray[0] = n14 = Math.round(f8 * f18);
        nArray[n10] = n16 = Math.round(f18 * f11);
    }

    public final void captureEndValues(Or3 or3) {
        super.captureEndValues(or3);
        this.d(or3);
    }

    public final void captureStartValues(Or3 or3) {
        super.captureStartValues(or3);
        this.d(or3);
    }

    public final void d(Or3 or3) {
        View view = or3.b;
        int[] nArray = this.a;
        view.getLocationOnScreen(nArray);
        int n3 = nArray[0];
        int n4 = nArray[1];
        int n7 = view.getWidth() + n3;
        int n8 = view.getHeight() + n4;
        Rect rect = new Rect(n3, n4, n7, n8);
        or3.a.put("android:explode:screenBounds", rect);
    }

    public final boolean isSeekingSupported() {
        return true;
    }

    public final Animator onAppear(ViewGroup viewGroup, View view, Or3 or3, Or3 or32) {
        if (or32 == null) {
            return null;
        }
        or3 = (Rect)or32.a.get("android:explode:screenBounds");
        float f5 = view.getTranslationX();
        float f6 = view.getTranslationY();
        Object object = this.a;
        this.b((View)viewGroup, (Rect)or3, (int[])object);
        float f7 = object[0];
        float f8 = f5 + f7;
        f7 = object[1];
        float f11 = f6 + f7;
        int n3 = ((Rect)or3).left;
        int n4 = ((Rect)or3).top;
        DecelerateInterpolator decelerateInterpolator = b;
        object = view;
        return i.a(view, or32, n3, n4, f8, f11, f5, f6, (TimeInterpolator)decelerateInterpolator, this);
    }

    public final Animator onDisappear(ViewGroup viewGroup, View view, Or3 or3, Or3 or32) {
        float f5;
        float f6;
        if (or3 == null) {
            return null;
        }
        or32 = (Rect)or3.a.get("android:explode:screenBounds");
        int n3 = ((Rect)or32).left;
        int n4 = ((Rect)or32).top;
        float f7 = view.getTranslationX();
        float f8 = view.getTranslationY();
        Object object = or3.b;
        int n7 = R$id.transition_position;
        object = (int[])object.getTag(n7);
        n7 = 1;
        float f11 = 0.0f;
        if (object != null) {
            View view2 = object[0];
            Object object2 = ((Rect)or32).left;
            object2 = view2 - object2;
            f6 = (float)object2 + f7;
            View view3 = object[n7];
            Object object3 = ((Rect)or32).top;
            object3 = view3 - object3;
            f5 = (float)object3 + f8;
            or32.offsetTo((int)view2, (int)view3);
        } else {
            f6 = f7;
            f5 = f8;
        }
        object = this.a;
        this.b((View)viewGroup, (Rect)or32, (int[])object);
        float f12 = (float)object[0];
        f11 = f6 + f12;
        f12 = (float)object[n7];
        float f14 = f5 + f12;
        AccelerateInterpolator accelerateInterpolator = c;
        object = view;
        return i.a(view, or3, n3, n4, f7, f8, f11, f14, (TimeInterpolator)accelerateInterpolator, this);
    }
}

