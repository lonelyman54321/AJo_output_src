/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 */
package com.google.android.material.chip;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.google.android.material.R$string;
import com.google.android.material.chip.Chip;
import java.util.List;

class Chip$ChipTouchHelper
extends HH0 {
    final /* synthetic */ Chip this$0;

    public Chip$ChipTouchHelper(Chip chip, Chip chip2) {
        this.this$0 = chip;
        super((View)chip2);
    }

    public int getVirtualViewAt(float f5, float f6) {
        int n3;
        Chip chip = this.this$0;
        boolean bl2 = Chip.access$100(chip);
        if (bl2 && (n3 = (int)((chip = Chip.access$200(this.this$0)).contains(f5, f6) ? 1 : 0)) != 0) {
            n3 = 1;
            f5 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        return n3;
    }

    public void getVisibleVirtualViews(List list) {
        boolean bl2;
        Object object = 0;
        list.add(object);
        object = this.this$0;
        boolean n3 = Chip.access$100((Chip)object);
        if (n3 && (bl2 = ((Chip)(object = this.this$0)).isCloseIconVisible()) && (object = Chip.access$300(this.this$0)) != null) {
            int n4 = 1;
            object = n4;
            list.add(object);
        }
    }

    public boolean onPerformActionForVirtualView(int n3, int n4, Bundle bundle) {
        int n7 = 16;
        if (n4 == n7) {
            if (n3 == 0) {
                return this.this$0.performClick();
            }
            n4 = 1;
            if (n3 == n4) {
                return this.this$0.performCloseIconClick();
            }
        }
        return false;
    }

    public void onPopulateNodeForHost(C2 c2) {
        boolean bl2 = this.this$0.isCheckable();
        c2.a.setCheckable(bl2);
        bl2 = this.this$0.isClickable();
        AccessibilityNodeInfo accessibilityNodeInfo = c2.a;
        accessibilityNodeInfo.setClickable(bl2);
        CharSequence charSequence = this.this$0.getAccessibilityClassName();
        c2.l(charSequence);
        charSequence = this.this$0.getText();
        int n3 = Build.VERSION.SDK_INT;
        int n4 = 23;
        if (n3 >= n4) {
            c2.s(charSequence);
        } else {
            c2.o(charSequence);
        }
    }

    public void onPopulateNodeForVirtualView(int n3, C2 c2) {
        int n4 = 1;
        Object object = "";
        if (n3 == n4) {
            AccessibilityNodeInfo accessibilityNodeInfo;
            Object object2 = this.this$0.getCloseIconContentDescription();
            if (object2 != null) {
                c2.o((CharSequence)object2);
            } else {
                object2 = this.this$0.getText();
                Context context = this.this$0.getContext();
                int n7 = R$string.mtrl_chip_close_icon_content_description;
                boolean bl2 = TextUtils.isEmpty((CharSequence)object2);
                if (!bl2) {
                    object = object2;
                }
                object2 = new Object[n4];
                n4 = 0;
                accessibilityNodeInfo = null;
                object2[0] = object;
                object2 = context.getString(n7, object2).trim();
                c2.o((CharSequence)object2);
            }
            object2 = Chip.access$500(this.this$0);
            accessibilityNodeInfo = c2.a;
            accessibilityNodeInfo.setBoundsInParent((Rect)object2);
            object2 = C2$a.g;
            c2.b((C2$a)object2);
            object2 = this.this$0;
            n3 = (int)(object2.isEnabled() ? 1 : 0);
            c2 = c2.a;
            c2.setEnabled(n3 != 0);
        } else {
            c2.o((CharSequence)object);
            Rect rect = Chip.access$600();
            c2 = c2.a;
            c2.setBoundsInParent(rect);
        }
    }

    public void onVirtualViewKeyboardFocusChanged(int n3, boolean bl2) {
        int n4 = 1;
        if (n3 == n4) {
            Chip.access$402(this.this$0, bl2);
            Chip chip = this.this$0;
            chip.refreshDrawableState();
        }
    }
}

