/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.TextView
 */
package com.ril.ajio.customviews.anim;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$Behavior;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import com.google.android.material.appbar.AppBarLayout;
import com.ril.ajio.R$dimen;
import com.ril.ajio.R$id;
import com.ril.ajio.customviews.anim.CustomCoordinatorBehavior$Companion;
import kotlin.jvm.internal.Intrinsics;

public final class CustomCoordinatorBehavior
extends CoordinatorLayout$Behavior {
    public static final int $stable = 0;
    public static final CustomCoordinatorBehavior$Companion Companion;
    private static final float MAX_SCALE = 0.3f;
    private boolean backBtnDisable;
    private int endMarginLeft;
    private final Context mContext;
    private int marginRight;
    private int startMarginBottom;
    private int startMarginLeft;

    static {
        CustomCoordinatorBehavior$Companion customCoordinatorBehavior$Companion;
        Companion = customCoordinatorBehavior$Companion = new CustomCoordinatorBehavior$Companion(null);
        $stable = 8;
    }

    public CustomCoordinatorBehavior(Context context, int n3) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        this(context, null);
        this.startMarginBottom = n3;
    }

    public CustomCoordinatorBehavior(Context context, AttributeSet attributeSet) {
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
        int n3;
        Resources resources;
        int n4 = this.startMarginLeft;
        if (n4 == 0) {
            resources = this.mContext.getResources();
            n3 = R$dimen.header_view_start_margin_left;
            this.startMarginLeft = n4 = resources.getDimensionPixelOffset(n3);
        }
        if ((n4 = this.endMarginLeft) == 0) {
            resources = this.mContext.getResources();
            n3 = R$dimen.header_view_end_margin_left;
            this.endMarginLeft = n4 = resources.getDimensionPixelOffset(n3);
        }
        if ((n4 = this.startMarginBottom) == 0) {
            resources = this.mContext.getResources();
            n3 = R$dimen.header_view_start_margin_bottom;
            this.startMarginBottom = n4 = resources.getDimensionPixelOffset(n3);
        }
        if ((n4 = this.marginRight) == 0) {
            resources = this.mContext.getResources();
            n3 = R$dimen.header_view_end_margin_right;
            this.marginRight = n4 = resources.getDimensionPixelOffset(n3);
        }
    }

    public final boolean getBackBtnDisable() {
        return this.backBtnDisable;
    }

    public boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, ConstraintLayout constraintLayout, View view) {
        Intrinsics.checkNotNullParameter(coordinatorLayout, "parent");
        Intrinsics.checkNotNullParameter((Object)constraintLayout, "child");
        Intrinsics.checkNotNullParameter(view, "dependency");
        return view instanceof AppBarLayout;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean onDependentViewChanged(CoordinatorLayout object, ConstraintLayout constraintLayout, View object2) {
        Exception exception2;
        block12: {
            int n3;
            boolean bl2;
            float f5;
            block11: {
                float f6;
                int n4;
                String string2 = "parent";
                Intrinsics.checkNotNullParameter(object, string2);
                Intrinsics.checkNotNullParameter((Object)constraintLayout, "child");
                object = "dependency";
                Intrinsics.checkNotNullParameter(object2, (String)object);
                try {
                    this.shouldInitProperties();
                    object = object2;
                    object = (AppBarLayout)object2;
                    n4 = ((AppBarLayout)object).getTotalScrollRange();
                    f6 = object2.getY();
                    f6 = Math.abs(f6);
                }
                catch (Exception exception2) {}
                f5 = n4;
                f6 /= f5;
                n4 = R$id.toolbar_title_tv;
                object = constraintLayout.findViewById(n4);
                object = (TextView)object;
                Intrinsics.checkNotNull(object);
                ai0_2.t((View)object);
                bl2 = true;
                float f7 = (float)bl2;
                float f8 = f7 - f6;
                float f11 = 0.3f;
                f8 = f8 * f11 + f7;
                object.setScaleX(f8);
                int n7 = 0;
                f7 = 0.0f;
                String string3 = null;
                object.setPivotX(0.0f);
                object.setScaleY(f8);
                n7 = 1106247680;
                f7 = 30.0f;
                object.setPivotY(f7);
                n4 = object2.getHeight();
                f5 = n4;
                float f12 = object2.getY();
                f5 += f12;
                int n8 = constraintLayout.getHeight();
                f12 = n8;
                f5 -= f12;
                n8 = this.getToolbarHeight();
                n7 = constraintLayout.getHeight();
                f12 = (float)(n8 -= n7) * f6;
                n7 = 2;
                f7 = n7;
                f5 -= (f12 /= f7);
                n8 = this.startMarginBottom;
                f12 = n8;
                n7 = 1065353216;
                f7 = (1.0f - f6) * f12;
                f5 -= f7;
                object2 = constraintLayout.getLayoutParams();
                string3 = "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams";
                Intrinsics.checkNotNull(object2, string3);
                object2 = (CoordinatorLayout$e)((Object)object2);
                n7 = (int)(this.backBtnDisable ? 1 : 0);
                if (n7 != 0) {
                    object2.leftMargin = n3 = this.startMarginLeft;
                    break block11;
                }
                n7 = this.endMarginLeft;
                f7 = n7;
                n3 = (int)(f6 *= f7);
                n7 = this.startMarginLeft;
                object2.leftMargin = n3 += n7;
                break block12;
            }
            object2.rightMargin = n3 = this.marginRight;
            constraintLayout.setLayoutParams((ViewGroup.LayoutParams)object2);
            constraintLayout.setY(f5);
            return bl2;
        }
        yn3_0.a.e(exception2);
        return false;
    }

    public final void setBackBtnDisable(boolean bl2) {
        this.backBtnDisable = bl2;
    }
}

