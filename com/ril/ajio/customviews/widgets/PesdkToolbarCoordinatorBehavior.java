/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources$Theme
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.widgets.PesdkToolbarCoordinatorBehavior$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class PesdkToolbarCoordinatorBehavior
extends CoordinatorLayout$Behavior {
    public static final int $stable = 0;
    public static final PesdkToolbarCoordinatorBehavior$Companion Companion;
    private static final float MAX_SCALE = 0.3f;
    private boolean backBtnDisable;
    private int endMarginLeft;
    private final Context mContext;
    private int marginRight;
    private int startMarginBottom;
    private int startMarginLeft;

    static {
        PesdkToolbarCoordinatorBehavior$Companion pesdkToolbarCoordinatorBehavior$Companion;
        Companion = pesdkToolbarCoordinatorBehavior$Companion = new PesdkToolbarCoordinatorBehavior$Companion(null);
        $stable = 8;
    }

    public PesdkToolbarCoordinatorBehavior(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        this.mContext = context;
    }

    private final int getToolbarHeight() {
        int n3;
        boolean bl2;
        int n4;
        TypedValue typedValue = new TypedValue();
        Resources.Theme theme = this.mContext.getTheme();
        boolean bl3 = theme.resolveAttribute(n4 = 16843499, typedValue, bl2 = true);
        if (bl3) {
            n3 = typedValue.data;
            theme = this.mContext.getResources().getDisplayMetrics();
            n3 = TypedValue.complexToDimensionPixelSize((int)n3, (DisplayMetrics)theme);
        } else {
            n3 = 0;
            typedValue = null;
        }
        return n3;
    }

    private final void shouldInitProperties() {
        int n3 = this.startMarginLeft;
        if (n3 == 0) {
            this.startMarginLeft = n3 = mz3_0.d(16);
        }
        if ((n3 = this.endMarginLeft) == 0) {
            this.endMarginLeft = n3 = mz3_0.d(54);
        }
        n3 = this.startMarginBottom;
        int n4 = 14;
        if (n3 == 0) {
            this.startMarginBottom = n3 = mz3_0.d(n4);
        }
        if ((n3 = this.marginRight) == 0) {
            this.marginRight = n3 = mz3_0.d(n4);
        }
    }

    public final boolean getBackBtnDisable() {
        return this.backBtnDisable;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, LinearLayout linearLayout, View view) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "parent");
        Intrinsics.checkNotNullParameter(linearLayout, "child");
        Intrinsics.checkNotNullParameter(view, "dependency");
        return view instanceof AppBarLayout;
    }

    public boolean onDependentViewChanged(CoordinatorLayout object, LinearLayout linearLayout, View view) {
        int n3;
        String string2 = "parent";
        Intrinsics.checkNotNullParameter(object, string2);
        Intrinsics.checkNotNullParameter(linearLayout, "child");
        Intrinsics.checkNotNullParameter(view, "dependency");
        this.shouldInitProperties();
        object = view;
        int n4 = ((AppBarLayout)view).getTotalScrollRange();
        float f5 = Math.abs(view.getY());
        float f6 = n4;
        n4 = R$id.pesdk_toolbar_title_tv;
        object = (TextView)linearLayout.findViewById(n4);
        boolean bl2 = true;
        float f7 = (float)bl2;
        float f8 = f7 - (f5 /= f6);
        float f11 = 0.3f;
        f8 = f8 * f11 + f7;
        object.setScaleX(f8);
        object.setPivotX(0.0f);
        object.setScaleY(f8);
        object.setPivotY(30.0f);
        f6 = view.getHeight();
        float f12 = view.getY() + f6;
        f6 = linearLayout.getHeight();
        f12 -= f6;
        n4 = this.getToolbarHeight();
        int n7 = linearLayout.getHeight();
        f6 = (float)(n4 - n7) * f5;
        f7 = 2;
        f12 -= (f6 /= f7);
        n4 = this.startMarginBottom;
        f6 = n4;
        f7 = (1.0f - f5) * f6;
        f12 -= f7;
        object = linearLayout.getLayoutParams();
        String string3 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams";
        Intrinsics.checkNotNull(object, string3);
        object = (CoordinatorLayout$e)((Object)object);
        n7 = (int)(this.backBtnDisable ? 1 : 0);
        if (n7 != 0) {
            ((ViewGroup.MarginLayoutParams)object).leftMargin = n3 = this.startMarginLeft;
        } else {
            f7 = this.endMarginLeft;
            n3 = (int)(f5 *= f7);
            n7 = this.startMarginLeft;
            ((ViewGroup.MarginLayoutParams)object).leftMargin = n3 += n7;
        }
        ((ViewGroup.MarginLayoutParams)object).rightMargin = n3 = this.marginRight;
        linearLayout.setLayoutParams((ViewGroup.LayoutParams)object);
        linearLayout.setY(f12);
        return bl2;
    }

    public final void setBackBtnDisable(boolean bl2) {
        this.backBtnDisable = bl2;
    }
}

