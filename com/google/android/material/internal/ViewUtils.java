/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.Rect
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.inputmethod.InputMethodManager
 */
package com.google.android.material.internal;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$b;
import androidx.core.view.ViewCompat$c;
import com.google.android.material.R$styleable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ViewOverlayApi18;
import com.google.android.material.internal.ViewOverlayImpl;
import com.google.android.material.internal.ViewUtils$1;
import com.google.android.material.internal.ViewUtils$2;
import com.google.android.material.internal.ViewUtils$3;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;
import java.util.ArrayList;
import java.util.List;

public class ViewUtils {
    public static final int EDGE_TO_EDGE_FLAGS = 768;

    private ViewUtils() {
    }

    public static /* synthetic */ void a(View view, boolean bl2) {
        ViewUtils.showKeyboard(view, bl2);
    }

    public static void addOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2) {
        if (view != null) {
            view = view.getViewTreeObserver();
            view.addOnGlobalLayoutListener(onGlobalLayoutListener2);
        }
    }

    public static Rect calculateOffsetRectFromBounds(View view, View view2) {
        int n3 = 2;
        int[] nArray = new int[n3];
        view2.getLocationOnScreen(nArray);
        int n4 = nArray[0];
        int n7 = 1;
        int n8 = nArray[n7];
        Object object = new int[n3];
        view.getLocationOnScreen(object);
        int n10 = object[0];
        n3 = object[n7];
        n4 -= n10;
        n10 = view2.getWidth() + n4;
        int n14 = view2.getHeight() + (n8 -= n3);
        object = new Rect;
        object(n4, n8, n10, n14);
        return object;
    }

    public static Rect calculateRectFromBounds(View view) {
        return ViewUtils.calculateRectFromBounds(view, 0);
    }

    public static Rect calculateRectFromBounds(View view, int n3) {
        int n4 = view.getLeft();
        int n7 = view.getTop() + n3;
        int n8 = view.getRight();
        int n10 = view.getBottom() + n3;
        Rect rect = new Rect(n4, n7, n8, n10);
        return rect;
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet attributeSet, int n3, int n4) {
        ViewUtils.doOnApplyWindowInsets(view, attributeSet, n3, n4, null);
    }

    public static void doOnApplyWindowInsets(View view, AttributeSet object, int n3, int n4, ViewUtils$OnApplyWindowInsetsListener viewUtils$OnApplyWindowInsetsListener) {
        Context context = view.getContext();
        int[] nArray = R$styleable.Insets;
        object = context.obtainStyledAttributes((AttributeSet)object, nArray, n3, n4);
        n3 = R$styleable.Insets_paddingBottomSystemWindowInsets;
        n3 = (int)(object.getBoolean(n3, false) ? 1 : 0);
        int bl2 = R$styleable.Insets_paddingLeftSystemWindowInsets;
        boolean bl3 = object.getBoolean(bl2, false);
        int n7 = R$styleable.Insets_paddingRightSystemWindowInsets;
        n4 = (int)(object.getBoolean(n7, false) ? 1 : 0);
        object.recycle();
        object = new ViewUtils$1(n3 != 0, bl3, n4 != 0, viewUtils$OnApplyWindowInsetsListener);
        ViewUtils.doOnApplyWindowInsets(view, (ViewUtils$OnApplyWindowInsetsListener)object);
    }

    public static void doOnApplyWindowInsets(View view, ViewUtils$OnApplyWindowInsetsListener viewUtils$OnApplyWindowInsetsListener) {
        Object object = ViewCompat.a;
        int n3 = view.getPaddingStart();
        int n4 = view.getPaddingTop();
        int n7 = view.getPaddingEnd();
        int n8 = view.getPaddingBottom();
        ViewUtils$RelativePadding viewUtils$RelativePadding = new ViewUtils$RelativePadding(n3, n4, n7, n8);
        object = new ViewUtils$2(viewUtils$OnApplyWindowInsetsListener, viewUtils$RelativePadding);
        ViewCompat$c.o(view, (T72)object);
        ViewUtils.requestApplyInsetsWhenAttached(view);
    }

    public static float dpToPx(Context context, int n3) {
        context = context.getResources();
        float f5 = n3;
        context = context.getDisplayMetrics();
        return TypedValue.applyDimension((int)1, (float)f5, (DisplayMetrics)context);
    }

    public static Integer getBackgroundColor(View object) {
        if ((object = DrawableUtils.getColorStateListOrNull(object.getBackground())) != null) {
            int n3 = object.getDefaultColor();
            object = n3;
        } else {
            boolean bl2 = false;
            object = null;
        }
        return object;
    }

    public static List getChildren(View view) {
        ArrayList<View> arrayList = new ArrayList<View>();
        int n3 = view instanceof ViewGroup;
        if (n3 != 0) {
            int n4;
            view = (ViewGroup)view;
            for (n3 = 0; n3 < (n4 = view.getChildCount()); ++n3) {
                View view2 = view.getChildAt(n3);
                arrayList.add(view2);
            }
        }
        return arrayList;
    }

    public static ViewGroup getContentView(View view) {
        boolean bl2;
        int n3;
        if (view == null) {
            return null;
        }
        View view2 = view.getRootView();
        ViewGroup viewGroup = (ViewGroup)view2.findViewById(n3 = 0x1020002);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (view2 != view && (bl2 = view2 instanceof ViewGroup)) {
            return (ViewGroup)view2;
        }
        return null;
    }

    public static ViewOverlayImpl getContentViewOverlay(View view) {
        return ViewUtils.getOverlay((View)ViewUtils.getContentView(view));
    }

    private static InputMethodManager getInputMethodManager(View view) {
        return (InputMethodManager)t70.getSystemService(view.getContext(), InputMethodManager.class);
    }

    public static ViewOverlayImpl getOverlay(View view) {
        if (view == null) {
            return null;
        }
        ViewOverlayApi18 viewOverlayApi18 = new ViewOverlayApi18(view);
        return viewOverlayApi18;
    }

    public static float getParentAbsoluteElevation(View view) {
        boolean bl2;
        view = view.getParent();
        float f5 = 0.0f;
        while (bl2 = view instanceof View) {
            View view2 = view;
            view2 = view;
            float f6 = ViewCompat$c.e(view2);
            f5 += f6;
            view = ((ViewParent)view).getParent();
        }
        return f5;
    }

    public static void hideKeyboard(View view) {
        ViewUtils.hideKeyboard(view, true);
    }

    public static void hideKeyboard(View view, boolean bl2) {
        UG3 uG3;
        if (bl2 && (uG3 = ViewCompat.j(view)) != null) {
            uG3.a.b(8);
            return;
        }
        uG3 = ViewUtils.getInputMethodManager(view);
        if (uG3 != null) {
            view = view.getWindowToken();
            uG3.hideSoftInputFromWindow((IBinder)view, 0);
        }
    }

    public static boolean isLayoutRtl(View view) {
        int n3;
        int n4 = view.getLayoutDirection();
        if (n4 != (n3 = 1)) {
            n3 = 0;
        }
        return n3 != 0;
    }

    public static PorterDuff.Mode parseTintMode(int n3, PorterDuff.Mode mode) {
        int n4 = 3;
        if (n3 != n4) {
            n4 = 5;
            if (n3 != n4) {
                n4 = 9;
                if (n3 != n4) {
                    switch (n3) {
                        default: {
                            return mode;
                        }
                        case 16: {
                            return PorterDuff.Mode.ADD;
                        }
                        case 15: {
                            return PorterDuff.Mode.SCREEN;
                        }
                        case 14: 
                    }
                    return PorterDuff.Mode.MULTIPLY;
                }
                return PorterDuff.Mode.SRC_ATOP;
            }
            return PorterDuff.Mode.SRC_IN;
        }
        return PorterDuff.Mode.SRC_OVER;
    }

    public static void removeOnGlobalLayoutListener(View view, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2) {
        if (view != null) {
            view = view.getViewTreeObserver();
            ViewUtils.removeOnGlobalLayoutListener((ViewTreeObserver)view, onGlobalLayoutListener2);
        }
    }

    public static void removeOnGlobalLayoutListener(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2) {
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener2);
    }

    public static void requestApplyInsetsWhenAttached(View view) {
        Object object = ViewCompat.a;
        boolean bl2 = view.isAttachedToWindow();
        if (bl2) {
            ViewCompat$b.c(view);
        } else {
            object = new ViewUtils$3();
            view.addOnAttachStateChangeListener((View.OnAttachStateChangeListener)object);
        }
    }

    public static void requestFocusAndShowKeyboard(View view) {
        ViewUtils.requestFocusAndShowKeyboard(view, true);
    }

    public static void requestFocusAndShowKeyboard(View view, boolean bl2) {
        view.requestFocus();
        ce3_0 ce3_02 = new ce3_0(view, bl2);
        view.post((Runnable)ce3_02);
    }

    public static void setBoundsFromRect(View view, Rect rect) {
        int n3 = rect.left;
        view.setLeft(n3);
        n3 = rect.top;
        view.setTop(n3);
        n3 = rect.right;
        view.setRight(n3);
        int n4 = rect.bottom;
        view.setBottom(n4);
    }

    public static void showKeyboard(View view) {
        ViewUtils.showKeyboard(view, true);
    }

    public static void showKeyboard(View view, boolean bl2) {
        UG3 uG3;
        if (bl2 && (uG3 = ViewCompat.j(view)) != null) {
            uG3.a.h(8);
            return;
        }
        ViewUtils.getInputMethodManager(view).showSoftInput(view, 1);
    }
}

