/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.Window
 */
package com.google.android.material.bottomsheet;

import android.view.View;
import android.view.Window;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$c;
import androidx.core.view.f;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback;
import com.google.android.material.bottomsheet.BottomSheetDialog$1;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.EdgeToEdgeUtils;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.shape.MaterialShapeDrawable;

class BottomSheetDialog$EdgeToEdgeCallback
extends BottomSheetBehavior$BottomSheetCallback {
    private final f insetsCompat;
    private final Boolean lightBottomSheet;
    private boolean lightStatusBar;
    private Window window;

    private BottomSheetDialog$EdgeToEdgeCallback(View object, f object2) {
        this.insetsCompat = object2;
        object2 = BottomSheetBehavior.from(object).getMaterialShapeDrawable();
        if (object2 != null) {
            object2 = ((MaterialShapeDrawable)object2).getFillColor();
        } else {
            object2 = ViewCompat.a;
            object2 = ViewCompat$c.c(object);
        }
        if (object2 != null) {
            boolean bl2 = MaterialColors.isColorLight(object2.getDefaultColor());
            object = bl2;
            this.lightBottomSheet = object;
        } else if ((object = ViewUtils.getBackgroundColor(object)) != null) {
            boolean bl3 = MaterialColors.isColorLight(object.intValue());
            object = bl3;
            this.lightBottomSheet = object;
        } else {
            boolean bl4 = false;
            object = null;
            this.lightBottomSheet = null;
        }
    }

    public /* synthetic */ BottomSheetDialog$EdgeToEdgeCallback(View view, f f5, BottomSheetDialog$1 bottomSheetDialog$1) {
        this(view, f5);
    }

    private void setPaddingForPosition(View view) {
        Object object;
        int n3;
        int n4 = view.getTop();
        if (n4 < (n3 = ((f)(object = this.insetsCompat)).d())) {
            Window window = this.window;
            if (window != null) {
                object = this.lightBottomSheet;
                n3 = object == null ? (int)(this.lightStatusBar ? 1 : 0) : (int)(((Boolean)object).booleanValue() ? 1 : 0);
                EdgeToEdgeUtils.setLightStatusBar(window, n3 != 0);
            }
            n4 = view.getPaddingLeft();
            object = this.insetsCompat;
            n3 = ((f)object).d();
            int n7 = view.getTop();
            n3 -= n7;
            n7 = view.getPaddingRight();
            int n8 = view.getPaddingBottom();
            view.setPadding(n4, n3, n7, n8);
        } else {
            n4 = view.getTop();
            if (n4 != 0) {
                Window window = this.window;
                if (window != null) {
                    n3 = (int)(this.lightStatusBar ? 1 : 0);
                    EdgeToEdgeUtils.setLightStatusBar(window, n3 != 0);
                }
                n4 = view.getPaddingLeft();
                n3 = view.getPaddingRight();
                int n10 = view.getPaddingBottom();
                boolean bl2 = false;
                view.setPadding(n4, 0, n3, n10);
            }
        }
    }

    public void onLayout(View view) {
        this.setPaddingForPosition(view);
    }

    public void onSlide(View view, float f5) {
        this.setPaddingForPosition(view);
    }

    public void onStateChanged(View view, int n3) {
        this.setPaddingForPosition(view);
    }

    public void setWindow(Window object) {
        Window window = this.window;
        if (window == object) {
            return;
        }
        this.window = object;
        if (object != null) {
            boolean bl2;
            window = object.getDecorView();
            UG3 uG3 = new UG3((View)window, (Window)object);
            object = uG3.a;
            this.lightStatusBar = bl2 = ((UG3$g)object).d();
        }
    }
}

