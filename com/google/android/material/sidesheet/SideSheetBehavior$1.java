/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.customview.widget.ViewDragHelper$b;
import com.google.android.material.sidesheet.SheetDelegate;
import com.google.android.material.sidesheet.SideSheetBehavior;

class SideSheetBehavior$1
extends ViewDragHelper$b {
    final /* synthetic */ SideSheetBehavior this$0;

    public SideSheetBehavior$1(SideSheetBehavior sideSheetBehavior) {
        this.this$0 = sideSheetBehavior;
    }

    public int clampViewPositionHorizontal(View view, int n3, int n4) {
        int n7 = SideSheetBehavior.access$200(this.this$0).getMinViewPositionHorizontal();
        n4 = SideSheetBehavior.access$200(this.this$0).getMaxViewPositionHorizontal();
        return PK1.b(n3, n7, n4);
    }

    public int clampViewPositionVertical(View view, int n3, int n4) {
        return view.getTop();
    }

    public int getViewHorizontalDragRange(View view) {
        int n3 = SideSheetBehavior.access$700(this.this$0);
        return this.this$0.getInnerMargin() + n3;
    }

    public void onViewDragStateChanged(int n3) {
        SideSheetBehavior sideSheetBehavior;
        int n4 = 1;
        if (n3 == n4 && (n3 = (int)(SideSheetBehavior.access$400(sideSheetBehavior = this.this$0) ? 1 : 0)) != 0) {
            sideSheetBehavior = this.this$0;
            sideSheetBehavior.setStateInternal(n4);
        }
    }

    public void onViewPositionChanged(View view, int n3, int n4, int n7, int n8) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        View view2 = this.this$0.getCoplanarSiblingView();
        if (view2 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams)view2.getLayoutParams()) != null) {
            SheetDelegate sheetDelegate = SideSheetBehavior.access$200(this.this$0);
            int n10 = view.getLeft();
            int n14 = view.getRight();
            sheetDelegate.updateCoplanarSiblingLayoutParams(marginLayoutParams, n10, n14);
            view2.setLayoutParams((ViewGroup.LayoutParams)marginLayoutParams);
        }
        SideSheetBehavior.access$300(this.this$0, view, n3);
    }

    public void onViewReleased(View view, float f5, float f6) {
        int n3 = SideSheetBehavior.access$500(this.this$0, view, f5, f6);
        SideSheetBehavior sideSheetBehavior = this.this$0;
        boolean bl2 = sideSheetBehavior.shouldSkipSmoothAnimation();
        SideSheetBehavior.access$600(sideSheetBehavior, view, n3, bl2);
    }

    public boolean tryCaptureView(View view, int n3) {
        Object object = this.this$0;
        n3 = SideSheetBehavior.access$000((SideSheetBehavior)object);
        boolean bl2 = false;
        int n4 = 1;
        if (n3 == n4) {
            return false;
        }
        object = SideSheetBehavior.access$100(this.this$0);
        if (object != null && (object = SideSheetBehavior.access$100(this.this$0).get()) == view) {
            bl2 = true;
        }
        return bl2;
    }
}

