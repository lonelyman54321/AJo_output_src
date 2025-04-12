/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 */
package com.google.android.material.datepicker;

import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.f;
import com.google.android.material.datepicker.MaterialDatePicker;

class MaterialDatePicker$3
implements T72 {
    final /* synthetic */ MaterialDatePicker this$0;
    final /* synthetic */ View val$headerLayout;
    final /* synthetic */ int val$originalHeaderHeight;
    final /* synthetic */ int val$originalPaddingTop;

    public MaterialDatePicker$3(MaterialDatePicker materialDatePicker, int n3, View view, int n4) {
        this.this$0 = materialDatePicker;
        this.val$originalHeaderHeight = n3;
        this.val$headerLayout = view;
        this.val$originalPaddingTop = n4;
    }

    public f onApplyWindowInsets(View object, f f5) {
        int n3;
        View view;
        object = f5.a.f(7);
        int n4 = object.b;
        int n7 = this.val$originalHeaderHeight;
        if (n7 >= 0) {
            view = this.val$headerLayout.getLayoutParams();
            view.height = n3 = this.val$originalHeaderHeight + n4;
            view = this.val$headerLayout;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            view.setLayoutParams(layoutParams);
        }
        view = this.val$headerLayout;
        n3 = view.getPaddingLeft();
        int n8 = this.val$originalPaddingTop + n4;
        n4 = this.val$headerLayout.getPaddingRight();
        int n10 = this.val$headerLayout.getPaddingBottom();
        view.setPadding(n3, n8, n4, n10);
        return f5;
    }
}

