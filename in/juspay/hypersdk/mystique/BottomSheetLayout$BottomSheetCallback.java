/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package in.juspay.hypersdk.mystique;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetBehavior$BottomSheetCallback;
import in.juspay.hypersdk.core.DuiCallback;
import in.juspay.hypersdk.mystique.BottomSheetLayout;

class BottomSheetLayout$BottomSheetCallback
extends BottomSheetBehavior$BottomSheetCallback {
    float bottomShift;
    boolean bottomShiftOverridden = false;
    private DuiCallback duiCallback;
    private float lastReceivedScroll;
    private String stateChangeCallback;
    private String stateSlideCallback;
    final /* synthetic */ BottomSheetLayout this$0;
    float topShift;
    boolean topShiftOverridden = false;

    public BottomSheetLayout$BottomSheetCallback(BottomSheetLayout bottomSheetLayout) {
        this.this$0 = bottomSheetLayout;
    }

    public void onSlide(View object, float f5) {
        CharSequence charSequence;
        this.lastReceivedScroll = f5;
        object = this.duiCallback;
        if (object != null && (charSequence = this.stateSlideCallback) != null) {
            charSequence = new StringBuilder("window.callUICallback('");
            String string2 = this.stateSlideCallback;
            ((StringBuilder)charSequence).append(string2);
            string2 = "','";
            ((StringBuilder)charSequence).append(string2);
            ((StringBuilder)charSequence).append(f5);
            ((StringBuilder)charSequence).append("');");
            String string3 = ((StringBuilder)charSequence).toString();
            object.addJsToWebView(string3);
        }
    }

    public void onStateChanged(View object, int n3) {
        Object object2;
        Object object3;
        int n4 = 2;
        float f5 = 2.8E-45f;
        if (n3 == n4 && (n4 = (int)(BottomSheetLayout.access$000((BottomSheetLayout)((Object)(object3 = this.this$0))) ? 1 : 0)) != 0) {
            float f6;
            Object object4;
            float f7;
            int n7;
            n4 = (int)(this.topShiftOverridden ? 1 : 0);
            if (n4 == 0 || (n4 = (int)(this.bottomShiftOverridden ? 1 : 0)) == 0) {
                object3 = BottomSheetLayout.access$100(this.this$0);
                f5 = ((BottomSheetBehavior)object3).getHalfExpandedRatio();
                object2 = BottomSheetLayout.access$100(this.this$0);
                n7 = ((BottomSheetBehavior)object2).getPeekHeight();
                float f8 = n7;
                f7 = object.getHeight();
                f8 /= f7;
                object4 = this.topShiftOverridden;
                float f11 = 2.0f;
                if (object4 == false) {
                    f7 = f5 / f11;
                    float f12 = 0.5f;
                    this.topShift = f7 += f12;
                }
                if ((object4 = (Object)this.bottomShiftOverridden) == false) {
                    f5 /= f11;
                    this.bottomShift = f5 -= (f8 /= f11);
                }
            }
            if ((n7 = (int)((f6 = (f7 = this.bottomShift) - (f5 = this.lastReceivedScroll)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) > 0) {
                object = BottomSheetLayout.access$100(this.this$0);
                n4 = 4;
                f5 = 5.6E-45f;
                ((BottomSheetBehavior)object).setState(n4);
            } else {
                float f14;
                object4 = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1);
                if (object4 > 0 && (object4 = (f14 = f5 - (f7 = this.topShift)) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1)) < 0) {
                    object = BottomSheetLayout.access$100(this.this$0);
                    n4 = 6;
                    f5 = 8.4E-45f;
                    ((BottomSheetBehavior)object).setState(n4);
                } else {
                    object = BottomSheetLayout.access$100(this.this$0);
                    n4 = 3;
                    f5 = 4.2E-45f;
                    ((BottomSheetBehavior)object).setState(n4);
                }
            }
        }
        if ((object = this.duiCallback) != null && (object3 = this.stateChangeCallback) != null) {
            object3 = new StringBuilder("window.callUICallback('");
            object2 = this.stateChangeCallback;
            ((StringBuilder)object3).append((String)object2);
            object2 = "','";
            ((StringBuilder)object3).append((String)object2);
            ((StringBuilder)object3).append(n3);
            ((StringBuilder)object3).append("');");
            String string2 = ((StringBuilder)object3).toString();
            object.addJsToWebView(string2);
        }
    }

    public void setBottomShift(float f5) {
        this.bottomShiftOverridden = true;
        this.bottomShift = f5;
    }

    public void setDuiCallback(DuiCallback duiCallback) {
        this.duiCallback = duiCallback;
    }

    public void setSlideCallback(String string2) {
        this.stateSlideCallback = string2;
    }

    public void setStateChangeCallback(String string2) {
        this.stateChangeCallback = string2;
    }

    public void setTopShift(float f5) {
        this.topShiftOverridden = true;
        this.topShift = f5;
    }
}

