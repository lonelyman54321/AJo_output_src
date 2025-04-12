/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
package com.google.android.material.internal;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

public class DescendantOffsetUtils {
    private static final ThreadLocal matrix;
    private static final ThreadLocal rectF;

    static {
        ThreadLocal threadLocal;
        matrix = threadLocal = new ThreadLocal();
        rectF = threadLocal = new ThreadLocal();
    }

    public static void getDescendantRect(ViewGroup viewGroup, View view, Rect rect) {
        int n3 = view.getWidth();
        int n4 = view.getHeight();
        rect.set(0, 0, n3, n4);
        DescendantOffsetUtils.offsetDescendantRect(viewGroup, view, rect);
    }

    private static void offsetDescendantMatrix(ViewParent viewParent, View view, Matrix matrix) {
        float f5;
        int n3;
        float f6;
        int n4;
        ViewParent viewParent2 = view.getParent();
        boolean bl2 = viewParent2 instanceof View;
        if (bl2 && viewParent2 != viewParent) {
            viewParent2 = (View)viewParent2;
            DescendantOffsetUtils.offsetDescendantMatrix(viewParent, (View)viewParent2, matrix);
            n4 = -viewParent2.getScrollX();
            f6 = n4;
            n3 = -viewParent2.getScrollY();
            f5 = n3;
            matrix.preTranslate(f6, f5);
        }
        f6 = view.getLeft();
        n3 = view.getTop();
        f5 = n3;
        matrix.preTranslate(f6, f5);
        viewParent = view.getMatrix();
        n4 = (int)(viewParent.isIdentity() ? 1 : 0);
        if (n4 == 0) {
            viewParent = view.getMatrix();
            matrix.preConcat((Matrix)viewParent);
        }
    }

    public static void offsetDescendantRect(ViewGroup object, View view, Rect rect) {
        ThreadLocal threadLocal = matrix;
        Matrix matrix = (Matrix)threadLocal.get();
        if (matrix == null) {
            matrix = new Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        DescendantOffsetUtils.offsetDescendantMatrix((ViewParent)object, view, matrix);
        object = rectF;
        view = (RectF)((ThreadLocal)object).get();
        if (view == null) {
            view = new RectF();
            ((ThreadLocal)object).set(view);
        }
        view.set(rect);
        matrix.mapRect((RectF)view);
        float f5 = view.left;
        float f6 = 0.5f;
        int n3 = (int)(f5 + f6);
        int n4 = (int)(view.top + f6);
        int n7 = (int)(view.right + f6);
        int n8 = (int)(view.bottom + f6);
        rect.set(n3, n4, n7, n8);
    }
}

