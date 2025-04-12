/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.graphics.RectF
 *  android.view.View
 *  android.view.View$OnLayoutChangeListener
 */
package com.google.android.material.bottomappbar;

import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import com.google.android.material.R$dimen;
import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.ViewUtils;

class BottomAppBar$Behavior$1
implements View.OnLayoutChangeListener {
    final /* synthetic */ BottomAppBar$Behavior this$0;

    public BottomAppBar$Behavior$1(BottomAppBar$Behavior behavior) {
        this.this$0 = behavior;
    }

    public void onLayoutChange(View view, int n3, int n4, int n7, int n8, int n10, int n14, int n15, int n16) {
        BottomAppBar bottomAppBar = (BottomAppBar)BottomAppBar$Behavior.access$2500(this.this$0).get();
        if (bottomAppBar != null && ((n4 = view instanceof FloatingActionButton) != 0 || (n4 = view instanceof ExtendedFloatingActionButton) != 0)) {
            BottomAppBar$Behavior bottomAppBar$Behavior;
            CoordinatorLayout$e coordinatorLayout$e;
            Object object;
            n4 = view.getHeight();
            n7 = view instanceof FloatingActionButton;
            if (n7 != 0) {
                object = view;
                object = (FloatingActionButton)view;
                coordinatorLayout$e = BottomAppBar$Behavior.access$2600(this.this$0);
                ((FloatingActionButton)object).getMeasuredContentRect((Rect)coordinatorLayout$e);
                coordinatorLayout$e = BottomAppBar$Behavior.access$2600(this.this$0);
                n7 = coordinatorLayout$e.height();
                bottomAppBar.setFabDiameter(n7);
                object = ((FloatingActionButton)object).getShapeAppearanceModel().getTopLeftCornerSize();
                Rect rect = BottomAppBar$Behavior.access$2600(this.this$0);
                bottomAppBar$Behavior = new RectF(rect);
                float f5 = object.getCornerSize((RectF)bottomAppBar$Behavior);
                bottomAppBar.setFabCornerSize(f5);
                n4 = n7;
            }
            coordinatorLayout$e = (CoordinatorLayout$e)view.getLayoutParams();
            bottomAppBar$Behavior = this.this$0;
            n8 = BottomAppBar$Behavior.access$2700(bottomAppBar$Behavior);
            if (n8 == 0) {
                n8 = BottomAppBar.access$400(bottomAppBar);
                if (n8 == (n10 = 1)) {
                    n8 = (view.getMeasuredHeight() - n4) / 2;
                    object = bottomAppBar.getResources();
                    n10 = R$dimen.mtrl_bottomappbar_fab_bottom_margin;
                    n4 = object.getDimensionPixelOffset(n10) - n8;
                    coordinatorLayout$e.bottomMargin = n8 = BottomAppBar.access$2800(bottomAppBar) + n4;
                }
                coordinatorLayout$e.leftMargin = n4 = BottomAppBar.access$2900(bottomAppBar);
                coordinatorLayout$e.rightMargin = n4 = BottomAppBar.access$3000(bottomAppBar);
                int n17 = ViewUtils.isLayoutRtl(view);
                if (n17 != 0) {
                    n17 = coordinatorLayout$e.leftMargin;
                    coordinatorLayout$e.leftMargin = n4 = BottomAppBar.access$3100(bottomAppBar) + n17;
                } else {
                    n17 = coordinatorLayout$e.rightMargin;
                    coordinatorLayout$e.rightMargin = n4 = BottomAppBar.access$3100(bottomAppBar) + n17;
                }
            }
            BottomAppBar.access$1400(bottomAppBar);
            return;
        }
        view.removeOnLayoutChangeListener((View.OnLayoutChangeListener)this);
    }
}

