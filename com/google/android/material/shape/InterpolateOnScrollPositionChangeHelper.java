/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.ScrollView
 */
package com.google.android.material.shape;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.google.android.material.shape.InterpolateOnScrollPositionChangeHelper$1;
import com.google.android.material.shape.MaterialShapeDrawable;

public class InterpolateOnScrollPositionChangeHelper {
    private final int[] containerLocation;
    private ScrollView containingScrollView;
    private MaterialShapeDrawable materialShapeDrawable;
    private final ViewTreeObserver.OnScrollChangedListener scrollChangedListener;
    private final int[] scrollLocation;
    private View shapedView;

    public InterpolateOnScrollPositionChangeHelper(View view, MaterialShapeDrawable materialShapeDrawable, ScrollView scrollView) {
        int n3 = 2;
        int[] nArray = new int[n3];
        this.scrollLocation = nArray;
        Object object = new int[n3];
        this.containerLocation = object;
        object = new InterpolateOnScrollPositionChangeHelper$1;
        super(this);
        this.scrollChangedListener = (ViewTreeObserver.OnScrollChangedListener)object;
        this.shapedView = view;
        this.materialShapeDrawable = materialShapeDrawable;
        this.containingScrollView = scrollView;
    }

    public void setContainingScrollView(ScrollView scrollView) {
        this.containingScrollView = scrollView;
    }

    public void setMaterialShapeDrawable(MaterialShapeDrawable materialShapeDrawable) {
        this.materialShapeDrawable = materialShapeDrawable;
    }

    public void startListeningForScrollChanges(ViewTreeObserver viewTreeObserver) {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.scrollChangedListener;
        viewTreeObserver.addOnScrollChangedListener(onScrollChangedListener);
    }

    public void stopListeningForScrollChanges(ViewTreeObserver viewTreeObserver) {
        ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = this.scrollChangedListener;
        viewTreeObserver.removeOnScrollChangedListener(onScrollChangedListener);
    }

    public void updateInterpolationForScreenPosition() {
        Object object = this.containingScrollView;
        if (object == null) {
            return;
        }
        int n3 = object.getChildCount();
        if (n3 != 0) {
            object = this.containingScrollView;
            Object object2 = this.scrollLocation;
            object.getLocationInWindow(object2);
            object = this.containingScrollView;
            float f5 = 0.0f;
            object = object.getChildAt(0);
            object2 = this.containerLocation;
            object.getLocationInWindow(object2);
            object = this.shapedView;
            n3 = object.getTop();
            object2 = this.scrollLocation;
            int n4 = 1;
            int n7 = object2[n4];
            n3 -= n7;
            n7 = this.containerLocation[n4];
            n3 += n7;
            object2 = this.shapedView;
            n7 = object2.getHeight();
            Object object3 = this.containingScrollView;
            n4 = object3.getHeight();
            float f6 = 1.0f;
            if (n3 < 0) {
                object3 = this.materialShapeDrawable;
                float f7 = n3;
                f5 = n7;
                f7 = f7 / f5 + f6;
                f7 = Math.min(f6, f7);
                f7 = Math.max(0.0f, f7);
                ((MaterialShapeDrawable)object3).setInterpolation(f7);
                object = this.shapedView;
                object.invalidate();
            } else if ((n3 += n7) > n4) {
                object3 = this.materialShapeDrawable;
                float f8 = n3 -= n4;
                f5 = n7;
                f8 /= f5;
                f8 = f6 - f8;
                f8 = Math.min(f6, f8);
                f8 = Math.max(0.0f, f8);
                ((MaterialShapeDrawable)object3).setInterpolation(f8);
                object = this.shapedView;
                object.invalidate();
            } else {
                object = this.materialShapeDrawable;
                float f11 = ((MaterialShapeDrawable)object).getInterpolation();
                float f12 = f11 - f6;
                n3 = (int)(f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1));
                if (n3 != 0) {
                    this.materialShapeDrawable.setInterpolation(f6);
                    object = this.shapedView;
                    object.invalidate();
                }
            }
            return;
        }
        object = new IllegalStateException("Scroll bar must contain a child to calculate interpolation.");
        throw object;
    }
}

