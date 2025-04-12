/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.view.ViewGroup$MarginLayoutParams
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f;
import androidx.core.view.f$k;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.internal.ViewUtils$OnApplyWindowInsetsListener;
import com.google.android.material.internal.ViewUtils$RelativePadding;

class BottomSheetBehavior$4
implements ViewUtils$OnApplyWindowInsetsListener {
    final /* synthetic */ BottomSheetBehavior this$0;
    final /* synthetic */ boolean val$shouldHandleGestureInsets;

    public BottomSheetBehavior$4(BottomSheetBehavior bottomSheetBehavior, boolean bl2) {
        this.this$0 = bottomSheetBehavior;
        this.val$shouldHandleGestureInsets = bl2;
    }

    public f onApplyWindowInsets(View object, f f5, ViewUtils$RelativePadding viewUtils$RelativePadding) {
        int n3;
        int n4;
        Object object2 = f5.a;
        int n7 = 7;
        object2 = ((f$k)object2).f(n7);
        Object object3 = f5.a;
        object3 = ((f$k)object3).f(32);
        BottomSheetBehavior bottomSheetBehavior = this.this$0;
        int n8 = ((ei1)object2).b;
        BottomSheetBehavior.access$302(bottomSheetBehavior, n8);
        int n10 = ViewUtils.isLayoutRtl(object);
        n8 = object.getPaddingBottom();
        int n14 = object.getPaddingLeft();
        int n15 = object.getPaddingRight();
        BottomSheetBehavior bottomSheetBehavior2 = this.this$0;
        int n16 = BottomSheetBehavior.access$400(bottomSheetBehavior2);
        if (n16 != 0) {
            BottomSheetBehavior bottomSheetBehavior3 = this.this$0;
            n16 = f5.a();
            BottomSheetBehavior.access$502(bottomSheetBehavior3, n16);
            n8 = viewUtils$RelativePadding.bottom;
            bottomSheetBehavior2 = this.this$0;
            n16 = BottomSheetBehavior.access$500(bottomSheetBehavior2);
            n8 += n16;
        }
        bottomSheetBehavior2 = this.this$0;
        n16 = (int)(BottomSheetBehavior.access$600(bottomSheetBehavior2) ? 1 : 0);
        int n17 = ((ei1)object2).a;
        if (n16 != 0) {
            n14 = n10 != 0 ? viewUtils$RelativePadding.end : viewUtils$RelativePadding.start;
            n14 += n17;
        }
        bottomSheetBehavior2 = this.this$0;
        n16 = (int)(BottomSheetBehavior.access$700(bottomSheetBehavior2) ? 1 : 0);
        int n18 = ((ei1)object2).c;
        if (n16 != 0) {
            n4 = n10 != 0 ? viewUtils$RelativePadding.start : viewUtils$RelativePadding.end;
            n15 = n4 + n18;
        }
        viewUtils$RelativePadding = (ViewGroup.MarginLayoutParams)object.getLayoutParams();
        bottomSheetBehavior = this.this$0;
        n10 = BottomSheetBehavior.access$800(bottomSheetBehavior);
        n16 = 0;
        bottomSheetBehavior2 = null;
        int n19 = 1;
        if (n10 != 0 && (n10 = ((ViewGroup.MarginLayoutParams)viewUtils$RelativePadding).leftMargin) != n17) {
            ((ViewGroup.MarginLayoutParams)viewUtils$RelativePadding).leftMargin = n17;
            n10 = 1;
        } else {
            n10 = 0;
            bottomSheetBehavior = null;
        }
        BottomSheetBehavior bottomSheetBehavior4 = this.this$0;
        n17 = (int)(BottomSheetBehavior.access$900(bottomSheetBehavior4) ? 1 : 0);
        if (n17 != 0 && (n17 = ((ViewGroup.MarginLayoutParams)viewUtils$RelativePadding).rightMargin) != n18) {
            ((ViewGroup.MarginLayoutParams)viewUtils$RelativePadding).rightMargin = n18;
            n10 = 1;
        }
        if ((n17 = (int)(BottomSheetBehavior.access$1000(bottomSheetBehavior4 = this.this$0) ? 1 : 0)) != 0 && (n17 = ((ViewGroup.MarginLayoutParams)viewUtils$RelativePadding).topMargin) != (n3 = ((ei1)object2).b)) {
            ((ViewGroup.MarginLayoutParams)viewUtils$RelativePadding).topMargin = n3;
        } else {
            n19 = n10;
        }
        if (n19 != 0) {
            object.setLayoutParams((ViewGroup.LayoutParams)viewUtils$RelativePadding);
        }
        n4 = object.getPaddingTop();
        object.setPadding(n14, n4, n15, n8);
        boolean bl2 = this.val$shouldHandleGestureInsets;
        if (bl2) {
            object = this.this$0;
            n4 = ((ei1)object3).d;
            BottomSheetBehavior.access$1102((BottomSheetBehavior)object, n4);
        }
        if ((bl2 = BottomSheetBehavior.access$400((BottomSheetBehavior)(object = this.this$0))) || (bl2 = this.val$shouldHandleGestureInsets)) {
            object = this.this$0;
            BottomSheetBehavior.access$1200((BottomSheetBehavior)object, false);
        }
        return f5;
    }
}

