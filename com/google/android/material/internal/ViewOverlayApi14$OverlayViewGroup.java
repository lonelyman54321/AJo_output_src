/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.graphics.Rect
 *  android.graphics.drawable.Drawable
 *  android.graphics.drawable.Drawable$Callback
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 */
package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.ViewOverlayApi14;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

class ViewOverlayApi14$OverlayViewGroup
extends ViewGroup {
    static Method invalidateChildInParentFastMethod;
    private boolean disposed;
    ArrayList drawables = null;
    ViewGroup hostView;
    View requestingView;
    ViewOverlayApi14 viewOverlay;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static {
        Class[] classArray;
        Object object = ViewGroup.class;
        String string2 = "invalidateChildInParentFast";
        int n3 = 3;
        try {
            classArray = new Class[n3];
        }
        catch (NoSuchMethodException noSuchMethodException) {
            return;
        }
        Class<Integer> clazz = Integer.TYPE;
        int n4 = 0;
        classArray[0] = clazz;
        n4 = 1;
        classArray[n4] = clazz;
        clazz = Rect.class;
        n4 = 2;
        classArray[n4] = clazz;
        object = ((Class)object).getDeclaredMethod(string2, classArray);
        invalidateChildInParentFastMethod = object;
    }

    public ViewOverlayApi14$OverlayViewGroup(Context context, ViewGroup viewGroup, View view, ViewOverlayApi14 viewOverlayApi14) {
        super(context);
        this.hostView = viewGroup;
        this.requestingView = view;
        int n3 = viewGroup.getWidth();
        this.setRight(n3);
        n3 = viewGroup.getHeight();
        this.setBottom(n3);
        viewGroup.addView((View)this);
        this.viewOverlay = viewOverlayApi14;
    }

    private void assertNotDisposed() {
        boolean bl2 = this.disposed;
        if (!bl2) {
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
        throw illegalStateException;
    }

    private void disposeIfEmpty() {
        ArrayList arrayList;
        int n3 = this.getChildCount();
        if (n3 == 0 && ((arrayList = this.drawables) == null || (n3 = arrayList.size()) == 0)) {
            n3 = 1;
            this.disposed = n3;
            arrayList = this.hostView;
            arrayList.removeView((View)this);
        }
    }

    private void getOffset(int[] nArray) {
        int n3 = 2;
        int[] nArray2 = new int[n3];
        int[] nArray3 = new int[n3];
        this.hostView.getLocationOnScreen(nArray2);
        this.requestingView.getLocationOnScreen(nArray3);
        int n4 = nArray3[0];
        int n7 = nArray2[0];
        nArray[0] = n4 -= n7;
        int n8 = 1;
        n3 = nArray3[n8];
        int n10 = nArray2[n8];
        nArray[n8] = n3 -= n10;
    }

    public void add(Drawable drawable2) {
        boolean bl2;
        this.assertNotDisposed();
        Rect rect = this.drawables;
        if (rect == null) {
            this.drawables = rect = new ArrayList();
        }
        if (!(bl2 = (rect = this.drawables).contains(drawable2))) {
            this.drawables.add(drawable2);
            rect = drawable2.getBounds();
            this.invalidate(rect);
            drawable2.setCallback((Drawable.Callback)this);
        }
    }

    public void add(View view) {
        this.assertNotDisposed();
        ViewParent viewParent = view.getParent();
        boolean bl2 = viewParent instanceof ViewGroup;
        if (bl2) {
            Object object;
            viewParent = (ViewGroup)view.getParent();
            if (viewParent != (object = this.hostView) && (object = viewParent.getParent()) != null) {
                object = ViewCompat.a;
                Object object2 = viewParent.isAttachedToWindow();
                if (object2 != 0) {
                    object2 = 2;
                    int[] nArray = new int[object2];
                    object = new int[object2];
                    viewParent.getLocationOnScreen(nArray);
                    this.hostView.getLocationOnScreen((int[])object);
                    int n3 = nArray[0];
                    Object object3 = object[0];
                    ViewCompat.l(n3 -= object3, view);
                    object3 = true;
                    int n4 = nArray[object3];
                    object2 = object[object3];
                    ViewCompat.m(n4 -= object2, view);
                }
            }
            viewParent.removeView(view);
            object = view.getParent();
            if (object != null) {
                viewParent.removeView(view);
            }
        }
        super.addView(view);
    }

    public void dispatchDraw(Canvas canvas) {
        int n3 = 2;
        Object object = new int[n3];
        Object object2 = new int[n3];
        this.hostView.getLocationOnScreen(object);
        this.requestingView.getLocationOnScreen((int[])object2);
        int n4 = 0;
        int n7 = object2[0];
        int n8 = object[0];
        float f5 = n7 - n8;
        n8 = 1;
        n3 = object2[n8];
        int n10 = object[n8];
        float f6 = n3 -= n10;
        canvas.translate(f5, f6);
        object2 = new Rect;
        object = this.requestingView;
        n10 = object.getWidth();
        View view = this.requestingView;
        n7 = view.getHeight();
        object2(0, 0, n10, n7);
        canvas.clipRect((Rect)object2);
        super.dispatchDraw(canvas);
        object2 = this.drawables;
        if (object2 == null) {
            n3 = 0;
            f6 = 0.0f;
            object2 = null;
        } else {
            n3 = ((ArrayList)object2).size();
        }
        while (n4 < n3) {
            object = (Drawable)this.drawables.get(n4);
            object.draw(canvas);
            ++n4;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    public ViewParent invalidateChildInParent(int[] nArray, Rect rect) {
        ViewGroup viewGroup = this.hostView;
        if (viewGroup != null) {
            boolean n3 = false;
            viewGroup = null;
            Object object = nArray[0];
            int n4 = 1;
            int n7 = nArray[n4];
            rect.offset(object, n7);
            Object object2 = this.hostView;
            if (object2 != null) {
                nArray[0] = 0;
                nArray[n4] = 0;
                object2 = new int[2];
                this.getOffset((int[])object2);
                ViewGroup viewGroup2 = object2[0];
                object = object2[n4];
                rect.offset((int)viewGroup2, object);
                return super.invalidateChildInParent(nArray, rect);
            }
            this.invalidate(rect);
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ViewParent invalidateChildInParentFast(int n3, int n4, Rect rect) {
        int n7 = 2;
        Object object = this.hostView;
        if (object == null) return null;
        object = invalidateChildInParentFastMethod;
        if (object == null) return null;
        try {
            object = new int[n7];
            this.getOffset((int[])object);
            object = invalidateChildInParentFastMethod;
            ViewGroup viewGroup = this.hostView;
            Integer n8 = n3;
            Integer n10 = n4;
            int n14 = 3;
            Object[] objectArray = new Object[n14];
            objectArray[0] = n8;
            n3 = 1;
            objectArray[n3] = n10;
            objectArray[n7] = rect;
            ((Method)object).invoke((Object)viewGroup, objectArray);
            return null;
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            return null;
        }
    }

    public void invalidateDrawable(Drawable drawable2) {
        drawable2 = drawable2.getBounds();
        this.invalidate((Rect)drawable2);
    }

    public void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
    }

    public void remove(Drawable drawable2) {
        ArrayList arrayList = this.drawables;
        if (arrayList != null) {
            arrayList.remove(drawable2);
            arrayList = drawable2.getBounds();
            this.invalidate((Rect)arrayList);
            arrayList = null;
            drawable2.setCallback(null);
            this.disposeIfEmpty();
        }
    }

    public void remove(View view) {
        super.removeView(view);
        this.disposeIfEmpty();
    }

    public boolean verifyDrawable(Drawable drawable2) {
        boolean bl2;
        ArrayList arrayList;
        boolean bl3 = super.verifyDrawable(drawable2);
        if (!(bl3 || (arrayList = this.drawables) != null && (bl2 = arrayList.contains(drawable2)))) {
            bl2 = false;
            drawable2 = null;
        } else {
            bl2 = true;
        }
        return bl2;
    }
}

