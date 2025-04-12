/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.Window
 *  android.widget.FrameLayout
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.core.view.f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialog$EdgeToEdgeCallback;

class BottomSheetDialog$1
implements T72 {
    final /* synthetic */ BottomSheetDialog this$0;

    public BottomSheetDialog$1(BottomSheetDialog bottomSheetDialog) {
        this.this$0 = bottomSheetDialog;
    }

    public f onApplyWindowInsets(View object, f f5) {
        BottomSheetDialog$EdgeToEdgeCallback bottomSheetDialog$EdgeToEdgeCallback;
        object = BottomSheetDialog.access$000(this.this$0);
        if (object != null) {
            object = BottomSheetDialog.access$100(this.this$0);
            bottomSheetDialog$EdgeToEdgeCallback = BottomSheetDialog.access$000(this.this$0);
            ((BottomSheetBehavior)object).removeBottomSheetCallback(bottomSheetDialog$EdgeToEdgeCallback);
        }
        if (f5 != null) {
            object = this.this$0;
            FrameLayout frameLayout = BottomSheetDialog.access$200((BottomSheetDialog)object);
            bottomSheetDialog$EdgeToEdgeCallback = new BottomSheetDialog$EdgeToEdgeCallback((View)frameLayout, f5, null);
            BottomSheetDialog.access$002((BottomSheetDialog)object, bottomSheetDialog$EdgeToEdgeCallback);
            object = BottomSheetDialog.access$000(this.this$0);
            bottomSheetDialog$EdgeToEdgeCallback = this.this$0.getWindow();
            ((BottomSheetDialog$EdgeToEdgeCallback)object).setWindow((Window)bottomSheetDialog$EdgeToEdgeCallback);
            object = BottomSheetDialog.access$100(this.this$0);
            bottomSheetDialog$EdgeToEdgeCallback = BottomSheetDialog.access$000(this.this$0);
            ((BottomSheetBehavior)object).addBottomSheetCallback(bottomSheetDialog$EdgeToEdgeCallback);
        }
        return f5;
    }
}

