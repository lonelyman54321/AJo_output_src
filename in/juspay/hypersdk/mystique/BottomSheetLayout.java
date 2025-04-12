/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.FrameLayout
 */
package in.juspay.hypersdk.mystique;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout$e;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import in.juspay.hypersdk.core.DuiCallback;
import in.juspay.hypersdk.mystique.BottomSheetLayout$BottomSheetCallback;

public class BottomSheetLayout
extends FrameLayout {
    private final BottomSheetBehavior bottomSheetBehavior;
    private final BottomSheetLayout$BottomSheetCallback bottomSheetCallback;
    private boolean enableShift;
    private boolean overridePeakHeight;

    public BottomSheetLayout(Context object) {
        super((Context)object);
        BottomSheetLayout$BottomSheetCallback bottomSheetLayout$BottomSheetCallback;
        boolean bl2;
        this.enableShift = bl2 = true;
        this.overridePeakHeight = bl2;
        super();
        this.bottomSheetBehavior = object;
        this.bottomSheetCallback = bottomSheetLayout$BottomSheetCallback = new BottomSheetLayout$BottomSheetCallback(this);
        ((BottomSheetBehavior)object).addBottomSheetCallback(bottomSheetLayout$BottomSheetCallback);
    }

    public static /* synthetic */ boolean access$000(BottomSheetLayout bottomSheetLayout) {
        return bottomSheetLayout.enableShift;
    }

    public static /* synthetic */ BottomSheetBehavior access$100(BottomSheetLayout bottomSheetLayout) {
        return bottomSheetLayout.bottomSheetBehavior;
    }

    public void onMeasure(int n3, int n4) {
        super.onMeasure(n3, n4);
        n3 = (int)(this.overridePeakHeight ? 1 : 0);
        if (n3 != 0) {
            n3 = this.getMeasuredHeight();
            BottomSheetBehavior bottomSheetBehavior = this.bottomSheetBehavior;
            bottomSheetBehavior.setPeekHeight(n3);
        }
    }

    public void setBottomShift(float f5) {
        this.bottomSheetCallback.setBottomShift(f5);
    }

    public void setEnableShift(boolean bl2) {
        this.enableShift = bl2;
    }

    public void setHalfExpandedRatio(float f5) {
        this.bottomSheetBehavior.setHalfExpandedRatio(f5);
    }

    public void setHideable(boolean bl2) {
        this.bottomSheetBehavior.setHideable(bl2);
    }

    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        boolean bl2 = layoutParams instanceof CoordinatorLayout$e;
        if (bl2) {
            Object object = layoutParams;
            object = (CoordinatorLayout$e)layoutParams;
            BottomSheetBehavior bottomSheetBehavior = this.bottomSheetBehavior;
            ((CoordinatorLayout$e)((Object)object)).b(bottomSheetBehavior);
        }
        super.setLayoutParams(layoutParams);
    }

    public void setPeakHeight(int n3) {
        this.bottomSheetBehavior.setPeekHeight(n3);
        this.overridePeakHeight = false;
    }

    public void setSlideCallback(DuiCallback duiCallback, String string2) {
        this.bottomSheetCallback.setDuiCallback(duiCallback);
        this.bottomSheetCallback.setSlideCallback(string2);
    }

    public void setState(int n3) {
        this.bottomSheetBehavior.setState(n3);
    }

    public void setStateChangeCallback(DuiCallback duiCallback, String string2) {
        this.bottomSheetCallback.setDuiCallback(duiCallback);
        this.bottomSheetCallback.setStateChangeCallback(string2);
    }

    public void setTopShift(float f5) {
        this.bottomSheetCallback.setTopShift(f5);
    }
}

