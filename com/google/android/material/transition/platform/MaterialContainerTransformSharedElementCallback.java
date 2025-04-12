/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.SharedElementCallback
 *  android.content.Context
 *  android.graphics.ColorFilter
 *  android.graphics.Matrix
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.graphics.drawable.Drawable
 *  android.os.Parcelable
 *  android.transition.Transition
 *  android.transition.Transition$TransitionListener
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.Window
 */
package com.google.android.material.transition.platform;

import android.app.Activity;
import android.app.SharedElementCallback;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.transition.Transition;
import android.view.View;
import android.view.Window;
import com.google.android.material.R$id;
import com.google.android.material.internal.ContextUtils;
import com.google.android.material.transition.platform.MaterialContainerTransform;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$1;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$2;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$3;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$ShapeProvider;
import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider;
import com.google.android.material.transition.platform.TransitionUtils;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;

public class MaterialContainerTransformSharedElementCallback
extends SharedElementCallback {
    private static WeakReference capturedSharedElement;
    private boolean entering;
    private Rect returnEndBounds;
    private MaterialContainerTransformSharedElementCallback$ShapeProvider shapeProvider;
    private boolean sharedElementReenterTransitionEnabled;
    private boolean transparentWindowBackgroundEnabled;

    public MaterialContainerTransformSharedElementCallback() {
        boolean bl2;
        this.entering = bl2 = true;
        this.transparentWindowBackgroundEnabled = bl2;
        this.sharedElementReenterTransitionEnabled = false;
        MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider materialContainerTransformSharedElementCallback$ShapeableViewShapeProvider = new MaterialContainerTransformSharedElementCallback$ShapeableViewShapeProvider();
        this.shapeProvider = materialContainerTransformSharedElementCallback$ShapeableViewShapeProvider;
    }

    public static /* synthetic */ void access$000(Window window) {
        MaterialContainerTransformSharedElementCallback.removeWindowBackground(window);
    }

    public static /* synthetic */ void access$100(Window window) {
        MaterialContainerTransformSharedElementCallback.restoreWindowBackground(window);
    }

    public static /* synthetic */ WeakReference access$200() {
        return capturedSharedElement;
    }

    public static /* synthetic */ WeakReference access$202(WeakReference weakReference) {
        capturedSharedElement = weakReference;
        return weakReference;
    }

    private static Drawable getWindowBackground(Window window) {
        return window.getDecorView().getBackground();
    }

    private static void removeWindowBackground(Window window) {
        if ((window = MaterialContainerTransformSharedElementCallback.getWindowBackground(window)) == null) {
            return;
        }
        window = window.mutate();
        hy_0 hy_02 = hy_0.CLEAR;
        ColorFilter colorFilter = by_0.a(0, hy_02);
        window.setColorFilter(colorFilter);
    }

    private static void restoreWindowBackground(Window window) {
        if ((window = MaterialContainerTransformSharedElementCallback.getWindowBackground(window)) == null) {
            return;
        }
        window.mutate().clearColorFilter();
    }

    private void setUpEnterTransform(Window window) {
        Transition transition2 = window.getSharedElementEnterTransition();
        boolean bl2 = transition2 instanceof MaterialContainerTransform;
        if (bl2) {
            MaterialContainerTransformSharedElementCallback$1 materialContainerTransformSharedElementCallback$1;
            transition2 = (MaterialContainerTransform)transition2;
            bl2 = this.sharedElementReenterTransitionEnabled;
            if (!bl2) {
                bl2 = false;
                materialContainerTransformSharedElementCallback$1 = null;
                window.setSharedElementReenterTransition(null);
            }
            if (bl2 = this.transparentWindowBackgroundEnabled) {
                MaterialContainerTransformSharedElementCallback.updateBackgroundFadeDuration(window, (MaterialContainerTransform)transition2);
                materialContainerTransformSharedElementCallback$1 = new MaterialContainerTransformSharedElementCallback$1(this, window);
                transition2.addListener((Transition.TransitionListener)materialContainerTransformSharedElementCallback$1);
            }
        }
    }

    private void setUpReturnTransform(Activity object, Window window) {
        Transition transition2 = window.getSharedElementReturnTransition();
        boolean bl2 = transition2 instanceof MaterialContainerTransform;
        if (bl2) {
            transition2 = (MaterialContainerTransform)transition2;
            bl2 = true;
            transition2.setHoldAtEndEnabled(bl2);
            MaterialContainerTransformSharedElementCallback$2 materialContainerTransformSharedElementCallback$2 = new MaterialContainerTransformSharedElementCallback$2(this, (Activity)object);
            transition2.addListener((Transition.TransitionListener)materialContainerTransformSharedElementCallback$2);
            boolean bl3 = this.transparentWindowBackgroundEnabled;
            if (bl3) {
                MaterialContainerTransformSharedElementCallback.updateBackgroundFadeDuration(window, (MaterialContainerTransform)transition2);
                object = new MaterialContainerTransformSharedElementCallback$3(this, window);
                transition2.addListener((Transition.TransitionListener)object);
            }
        }
    }

    private static void updateBackgroundFadeDuration(Window window, MaterialContainerTransform materialContainerTransform) {
        long l2;
        long l3 = materialContainerTransform.getDuration();
        long l4 = l3 - (l2 = 0L);
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object >= 0) {
            l3 = materialContainerTransform.getDuration();
            window.setTransitionBackgroundFadeDuration(l3);
        }
    }

    public MaterialContainerTransformSharedElementCallback$ShapeProvider getShapeProvider() {
        return this.shapeProvider;
    }

    public boolean isSharedElementReenterTransitionEnabled() {
        return this.sharedElementReenterTransitionEnabled;
    }

    public boolean isTransparentWindowBackgroundEnabled() {
        return this.transparentWindowBackgroundEnabled;
    }

    public Parcelable onCaptureSharedElementSnapshot(View view, Matrix matrix, RectF rectF) {
        WeakReference<View> weakReference;
        capturedSharedElement = weakReference = new WeakReference<View>(view);
        return super.onCaptureSharedElementSnapshot(view, matrix, rectF);
    }

    public View onCreateSnapshotView(Context context, Parcelable object) {
        MaterialContainerTransformSharedElementCallback$ShapeProvider materialContainerTransformSharedElementCallback$ShapeProvider;
        if ((context = super.onCreateSnapshotView(context, (Parcelable)object)) != null && (object = capturedSharedElement) != null && (materialContainerTransformSharedElementCallback$ShapeProvider = this.shapeProvider) != null && (object = (View)((Reference)object).get()) != null && (object = (materialContainerTransformSharedElementCallback$ShapeProvider = this.shapeProvider).provideShape((View)object)) != null) {
            int n3 = R$id.mtrl_motion_snapshot_view;
            context.setTag(n3, object);
        }
        return context;
    }

    public void onMapSharedElements(List list, Map map2) {
        boolean bl2 = list.isEmpty();
        if (!bl2 && !(bl2 = map2.isEmpty())) {
            bl2 = false;
            list = list.get(0);
            if ((list = (View)map2.get(list)) != null && (list = ContextUtils.getActivity(list.getContext())) != null) {
                map2 = list.getWindow();
                bl2 = this.entering;
                if (bl2) {
                    this.setUpEnterTransform((Window)map2);
                } else {
                    this.setUpReturnTransform((Activity)list, (Window)map2);
                }
            }
        }
    }

    public void onSharedElementEnd(List object, List list, List list2) {
        boolean bl2 = list.isEmpty();
        if (!bl2) {
            object = (View)list.get(0);
            int n3 = R$id.mtrl_motion_snapshot_view;
            bl2 = (object = object.getTag(n3)) instanceof View;
            if (bl2) {
                object = (View)list.get(0);
                n3 = R$id.mtrl_motion_snapshot_view;
                object.setTag(n3, null);
            }
        }
        if (!(bl2 = this.entering) && !(bl2 = list.isEmpty())) {
            object = TransitionUtils.getRelativeBoundsRect((View)list.get(0));
            this.returnEndBounds = object;
        }
        this.entering = false;
    }

    public void onSharedElementStart(List list, List list2, List list3) {
        int n3;
        boolean bl2 = list2.isEmpty();
        int n4 = 0;
        Rect rect = null;
        if (!bl2 && !(bl2 = list3.isEmpty())) {
            list = (View)list2.get(0);
            n3 = R$id.mtrl_motion_snapshot_view;
            list3 = list3.get(0);
            list.setTag(n3, list3);
        }
        if (!(bl2 = this.entering) && !(bl2 = list2.isEmpty()) && (list = this.returnEndBounds) != null) {
            list = (View)list2.get(0);
            int n7 = this.returnEndBounds.width();
            int n8 = 0x40000000;
            n7 = View.MeasureSpec.makeMeasureSpec((int)n7, (int)n8);
            rect = this.returnEndBounds;
            n8 = View.MeasureSpec.makeMeasureSpec((int)rect.height(), (int)n8);
            list.measure(n7, n8);
            list2 = this.returnEndBounds;
            n8 = ((Rect)list2).left;
            n4 = ((Rect)list2).top;
            n3 = ((Rect)list2).right;
            n7 = ((Rect)list2).bottom;
            list.layout(n8, n4, n3, n7);
        }
    }

    public void setShapeProvider(MaterialContainerTransformSharedElementCallback$ShapeProvider materialContainerTransformSharedElementCallback$ShapeProvider) {
        this.shapeProvider = materialContainerTransformSharedElementCallback$ShapeProvider;
    }

    public void setSharedElementReenterTransitionEnabled(boolean bl2) {
        this.sharedElementReenterTransitionEnabled = bl2;
    }

    public void setTransparentWindowBackgroundEnabled(boolean bl2) {
        this.transparentWindowBackgroundEnabled = bl2;
    }
}

