/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.view.View
 */
package com.google.android.material.internal;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.material.internal.MultiViewUpdateListener$Listener;
import com.google.android.material.internal.a;
import com.google.android.material.internal.b;
import com.google.android.material.internal.c;
import com.google.android.material.internal.d;
import java.util.Collection;

public class MultiViewUpdateListener
implements ValueAnimator.AnimatorUpdateListener {
    private final MultiViewUpdateListener$Listener listener;
    private final View[] views;

    public MultiViewUpdateListener(MultiViewUpdateListener$Listener viewArray, Collection collection) {
        this.listener = viewArray;
        viewArray = new View[]{};
        viewArray = collection.toArray(viewArray);
        this.views = viewArray;
    }

    public MultiViewUpdateListener(MultiViewUpdateListener$Listener multiViewUpdateListener$Listener, View ... viewArray) {
        this.listener = multiViewUpdateListener$Listener;
        this.views = viewArray;
    }

    public static /* synthetic */ void a(ValueAnimator valueAnimator, View view) {
        MultiViewUpdateListener.setScale(valueAnimator, view);
    }

    public static MultiViewUpdateListener alphaListener(Collection collection) {
        d d2 = new Object();
        MultiViewUpdateListener multiViewUpdateListener = new MultiViewUpdateListener((MultiViewUpdateListener$Listener)d2, collection);
        return multiViewUpdateListener;
    }

    public static MultiViewUpdateListener alphaListener(View ... viewArray) {
        d d2 = new Object();
        MultiViewUpdateListener multiViewUpdateListener = new MultiViewUpdateListener((MultiViewUpdateListener$Listener)d2, viewArray);
        return multiViewUpdateListener;
    }

    public static /* synthetic */ void b(ValueAnimator valueAnimator, View view) {
        MultiViewUpdateListener.setTranslationY(valueAnimator, view);
    }

    public static /* synthetic */ void c(ValueAnimator valueAnimator, View view) {
        MultiViewUpdateListener.setAlpha(valueAnimator, view);
    }

    public static /* synthetic */ void d(ValueAnimator valueAnimator, View view) {
        MultiViewUpdateListener.setTranslationX(valueAnimator, view);
    }

    public static MultiViewUpdateListener scaleListener(Collection collection) {
        b b2 = new Object();
        MultiViewUpdateListener multiViewUpdateListener = new MultiViewUpdateListener((MultiViewUpdateListener$Listener)b2, collection);
        return multiViewUpdateListener;
    }

    public static MultiViewUpdateListener scaleListener(View ... viewArray) {
        b b2 = new Object();
        MultiViewUpdateListener multiViewUpdateListener = new MultiViewUpdateListener((MultiViewUpdateListener$Listener)b2, viewArray);
        return multiViewUpdateListener;
    }

    private static void setAlpha(ValueAnimator valueAnimator, View view) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        view.setAlpha(f5);
    }

    private static void setScale(ValueAnimator object, View view) {
        object = (Float)object.getAnimatedValue();
        float f5 = ((Float)object).floatValue();
        view.setScaleX(f5);
        float f6 = ((Float)object).floatValue();
        view.setScaleY(f6);
    }

    private static void setTranslationX(ValueAnimator valueAnimator, View view) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        view.setTranslationX(f5);
    }

    private static void setTranslationY(ValueAnimator valueAnimator, View view) {
        float f5 = ((Float)valueAnimator.getAnimatedValue()).floatValue();
        view.setTranslationY(f5);
    }

    public static MultiViewUpdateListener translationXListener(Collection collection) {
        a a2 = new Object();
        MultiViewUpdateListener multiViewUpdateListener = new MultiViewUpdateListener((MultiViewUpdateListener$Listener)a2, collection);
        return multiViewUpdateListener;
    }

    public static MultiViewUpdateListener translationXListener(View ... viewArray) {
        a a2 = new Object();
        MultiViewUpdateListener multiViewUpdateListener = new MultiViewUpdateListener((MultiViewUpdateListener$Listener)a2, viewArray);
        return multiViewUpdateListener;
    }

    public static MultiViewUpdateListener translationYListener(Collection collection) {
        c c2 = new Object();
        MultiViewUpdateListener multiViewUpdateListener = new MultiViewUpdateListener((MultiViewUpdateListener$Listener)c2, collection);
        return multiViewUpdateListener;
    }

    public static MultiViewUpdateListener translationYListener(View ... viewArray) {
        c c2 = new Object();
        MultiViewUpdateListener multiViewUpdateListener = new MultiViewUpdateListener((MultiViewUpdateListener$Listener)c2, viewArray);
        return multiViewUpdateListener;
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
        for (View view : this.views) {
            MultiViewUpdateListener$Listener multiViewUpdateListener$Listener = this.listener;
            multiViewUpdateListener$Listener.onAnimationUpdate(valueAnimator, view);
        }
    }
}

