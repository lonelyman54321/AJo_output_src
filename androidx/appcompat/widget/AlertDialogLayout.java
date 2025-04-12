/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.util.AttributeSet
 *  android.view.Gravity
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 */
package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R$id;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;

public class AlertDialogLayout
extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static int d(View view) {
        int n3;
        int n4 = view.getMinimumHeight();
        if (n4 > 0) {
            return n4;
        }
        n4 = view instanceof ViewGroup;
        if (n4 != 0 && (n4 = (view = (ViewGroup)view).getChildCount()) == (n3 = 1)) {
            return AlertDialogLayout.d(view.getChildAt(0));
        }
        return 0;
    }

    public final void forceUniformWidth(int n3, int n4) {
        int n7 = View.MeasureSpec.makeMeasureSpec((int)this.getMeasuredWidth(), (int)0x40000000);
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            int n8;
            View view = this.getChildAt(i3);
            int n10 = view.getVisibility();
            if (n10 == (n8 = 8)) continue;
            Object object2 = object = view.getLayoutParams();
            object2 = (LinearLayoutCompat$LayoutParams)((Object)object);
            n10 = object2.width;
            n8 = -1;
            if (n10 != n8) continue;
            int n14 = object2.height;
            object2.height = n10 = view.getMeasuredHeight();
            object = this;
            n8 = n7;
            this.measureChildWithMargins(view, n7, 0, n4, 0);
            object2.height = n14;
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onLayout(boolean bl2, int n3, int n4, int n7, int n8) {
        int n10;
        int n14;
        void var4_5;
        int n15;
        int n16 = this.getPaddingLeft();
        var4_5 -= n15;
        n15 = this.getPaddingRight();
        n15 = var4_5 - n15;
        var4_5 -= n16;
        int n17 = this.getPaddingRight();
        var4_5 -= n17;
        n17 = this.getMeasuredHeight();
        int n18 = this.getChildCount();
        int n19 = this.getGravity();
        int n20 = n19 & 0x70;
        n19 &= 0x800007;
        int n21 = 16;
        if (n20 != n21) {
            n21 = 80;
            if (n20 != n21) {
                n14 = this.getPaddingTop();
            } else {
                n20 = this.getPaddingTop() + n10 - n14;
                n14 = n20 - n17;
            }
        } else {
            n20 = this.getPaddingTop();
            n10 = (n10 - n14 - n17) / 2;
            n14 = n10 + n20;
        }
        Drawable drawable2 = this.getDividerDrawable();
        n17 = 0;
        if (drawable2 == null) {
            n10 = 0;
            drawable2 = null;
        } else {
            n10 = drawable2.getIntrinsicHeight();
        }
        while (true) {
            block11: {
                int n22;
                int n24;
                LinearLayoutCompat$LayoutParams linearLayoutCompat$LayoutParams;
                int n25;
                View view;
                block14: {
                    block15: {
                        block12: {
                            block13: {
                                if (n17 >= n18) {
                                    return;
                                }
                                view = this.getChildAt(n17);
                                if (view == null || (n21 = view.getVisibility()) == (n25 = 8)) break block11;
                                n21 = view.getMeasuredWidth();
                                n25 = view.getMeasuredHeight();
                                linearLayoutCompat$LayoutParams = (LinearLayoutCompat$LayoutParams)view.getLayoutParams();
                                n24 = linearLayoutCompat$LayoutParams.gravity;
                                if (n24 < 0) {
                                    n24 = n19;
                                }
                                n22 = this.getLayoutDirection();
                                if ((n24 = Gravity.getAbsoluteGravity((int)n24, (int)n22) & 7) == (n22 = 1)) break block12;
                                n22 = 5;
                                if (n24 == n22) break block13;
                                n24 = linearLayoutCompat$LayoutParams.leftMargin + n16;
                                break block14;
                            }
                            n24 = n15 - n21;
                            n22 = linearLayoutCompat$LayoutParams.rightMargin;
                            break block15;
                        }
                        n24 = (var4_5 - n21) / 2 + n16;
                        n22 = linearLayoutCompat$LayoutParams.leftMargin;
                        n24 += n22;
                        n22 = linearLayoutCompat$LayoutParams.rightMargin;
                    }
                    n24 -= n22;
                }
                n22 = (int)(this.hasDividerBeforeChildAt(n17) ? 1 : 0);
                if (n22 != 0) {
                    n14 += n10;
                }
                n22 = linearLayoutCompat$LayoutParams.topMargin;
                n14 += n22;
                n22 = n14 + n25;
                view.layout(n24, n14, n21 += n24, n22);
                n20 = linearLayoutCompat$LayoutParams.bottomMargin;
                n14 = n25 = n25 + n20 + n14;
            }
            ++n17;
        }
    }

    public final void onMeasure(int n3, int n4) {
        block20: {
            int n7;
            int n8;
            int n10;
            int n14;
            AlertDialogLayout alertDialogLayout = this;
            int n15 = n3;
            int n16 = n4;
            int n17 = this.getChildCount();
            int n18 = 0;
            View view = null;
            int n19 = 0;
            int n20 = 0;
            View view2 = null;
            int n21 = 0;
            View view3 = null;
            int n22 = 0;
            View view4 = null;
            while (true) {
                n14 = 8;
                if (n22 >= n17) break;
                View view5 = alertDialogLayout.getChildAt(n22);
                n10 = view5.getVisibility();
                if (n10 != n14) {
                    n14 = view5.getId();
                    if (n14 == (n10 = R$id.topPanel)) {
                        view = view5;
                    } else {
                        n10 = R$id.buttonPanel;
                        if (n14 == n10) {
                            view2 = view5;
                        } else {
                            n10 = R$id.contentPanel;
                            if (n14 != n10 && n14 != (n10 = R$id.customPanel) || view3 != null) {
                                super.onMeasure(n3, n4);
                                break block20;
                            }
                            view3 = view5;
                        }
                    }
                }
                ++n22;
            }
            n22 = View.MeasureSpec.getMode((int)n4);
            int n24 = View.MeasureSpec.getSize((int)n4);
            n10 = View.MeasureSpec.getMode((int)n3);
            int n25 = this.getPaddingTop();
            int n26 = this.getPaddingBottom() + n25;
            if (view != null) {
                view.measure(n15, 0);
                n25 = view.getMeasuredHeight();
                n26 += n25;
                n18 = view.getMeasuredState();
                n18 = View.combineMeasuredStates((int)0, (int)n18);
            } else {
                n18 = 0;
                view = null;
            }
            if (view2 != null) {
                view2.measure(n15, 0);
                n25 = AlertDialogLayout.d(view2);
                n8 = view2.getMeasuredHeight() - n25;
                n26 += n25;
                n7 = view2.getMeasuredState();
                n18 = View.combineMeasuredStates((int)n18, (int)n7);
            } else {
                n25 = 0;
                n8 = 0;
            }
            if (view3 != null) {
                if (n22 == 0) {
                    n7 = 0;
                } else {
                    n7 = n24 - n26;
                    n7 = View.MeasureSpec.makeMeasureSpec((int)Math.max(0, n7), (int)n22);
                }
                view3.measure(n15, n7);
                n7 = view3.getMeasuredHeight();
                n26 += n7;
                n19 = view3.getMeasuredState();
                n18 = View.combineMeasuredStates((int)n18, (int)n19);
            } else {
                n7 = 0;
            }
            n24 -= n26;
            n19 = 0x40000000;
            if (view2 != null) {
                n26 -= n25;
                if ((n8 = Math.min(n24, n8)) > 0) {
                    n24 -= n8;
                    n25 += n8;
                }
                n25 = View.MeasureSpec.makeMeasureSpec((int)n25, (int)n19);
                view2.measure(n15, n25);
                n25 = view2.getMeasuredHeight();
                n26 += n25;
                n20 = view2.getMeasuredState();
                n18 = View.combineMeasuredStates((int)n18, (int)n20);
            }
            if (view3 != null && n24 > 0) {
                n26 -= n7;
                n20 = View.MeasureSpec.makeMeasureSpec((int)(n7 += n24), (int)n22);
                view3.measure(n15, n20);
                n20 = view3.getMeasuredHeight();
                n26 += n20;
                n20 = view3.getMeasuredState();
                n18 = View.combineMeasuredStates((int)n18, (int)n20);
            }
            view2 = null;
            n21 = 0;
            view3 = null;
            for (n20 = 0; n20 < n17; ++n20) {
                view4 = alertDialogLayout.getChildAt(n20);
                n24 = view4.getVisibility();
                if (n24 == n14) continue;
                n22 = view4.getMeasuredWidth();
                n21 = Math.max(n21, n22);
            }
            n20 = this.getPaddingLeft();
            n22 = this.getPaddingRight() + n20 + n21;
            n15 = View.resolveSizeAndState((int)n22, (int)n15, (int)n18);
            view = null;
            n18 = View.resolveSizeAndState((int)n26, (int)n16, (int)0);
            alertDialogLayout.setMeasuredDimension(n15, n18);
            if (n10 != n19) {
                alertDialogLayout.forceUniformWidth(n17, n16);
            }
        }
    }
}

